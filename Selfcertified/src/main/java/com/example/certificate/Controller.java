package com.example.certificate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {


		@RequestMapping(value = "/contractor", method = RequestMethod.GET)
		public String firstPage() {

			return "Welcome to Egiants";
		}

	}