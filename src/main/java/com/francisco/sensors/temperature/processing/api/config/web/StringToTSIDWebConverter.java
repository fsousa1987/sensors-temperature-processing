package com.francisco.sensors.temperature.processing.api.config.web;

import io.hypersistence.tsid.TSID;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;

public class StringToTSIDWebConverter implements Converter<String, TSID> {

	@Override
	public TSID convert(@NonNull String source) {
		return TSID.from(source);
	}

}
