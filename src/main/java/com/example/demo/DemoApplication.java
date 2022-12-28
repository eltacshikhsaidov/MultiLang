package com.example.demo;

import com.example.demo.codes.ExceptionCode;
import com.example.demo.response.RespStatus;
import com.example.demo.response.RespStatusList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.example.demo.util.Translator.translate;
import static java.util.Objects.isNull;


@SpringBootApplication
@RestController
public class DemoApplication {
	@GetMapping(value = "/account")
	public RespStatusList getAccountById(@RequestParam(name = "accountId", required = false) Integer accountId) {
		RespStatusList response = new RespStatusList();
		if (isNull(accountId)) {
			response.setStatus(
					new RespStatus(
							ExceptionCode.ACCOUNT_NOT_FOUND,
							translate("account_not_found")
					)
			);
			return response;
		}

		response.setStatus(
				new RespStatus(
						ExceptionCode.SUCCESS,
						translate("success")
				)
		);
		return response;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}


