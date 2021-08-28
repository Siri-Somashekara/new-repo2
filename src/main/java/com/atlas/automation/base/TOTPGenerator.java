package com.atlas.automation.base;

import org.jboss.aerogear.security.otp.Totp;

public class TOTPGenerator extends BaseClass{
	 public static String getTwoFactorCode(){
		        //To generate the authentication code
		        Totp totp = new Totp(prop.getProperty("secretkey")); // 2FA secret key
		        String twoFactorCode = totp.now(); //Generated 2FA code here
		        return twoFactorCode;
		    }
		}
