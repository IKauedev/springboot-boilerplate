package com.spring.boilerplate.springboot.utils;

import java.util.Locale;

public final class ProjectConstants {
    public static final String DEFAULT_ENCODING = "UTF-8";
    public static final Locale TURKISH_LOCALE = new Locale.Builder().setLanguage("tr").setRegion("TR").build();

    private ProjectConstants() {
        throw new UnsupportedOperationException();
    }
}
