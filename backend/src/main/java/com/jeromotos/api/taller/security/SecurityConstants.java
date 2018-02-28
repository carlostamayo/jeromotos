/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jeromotos.api.taller.security;

/**
 *
 * @author jose
 */

public class SecurityConstants {
   public static final String SECRET = "A3U7K 9DQPL 63VZI HH7Y1 CFR50";
   public static final long EXPIRATION_TIME = 864_000_000;
   public static final String TOKEN_PREFIX = "Bearer";
   public static final String HEADER_STRING = "Authorization";
   public static final String SIGN_UP_URL = "/users/sign-up";
}
