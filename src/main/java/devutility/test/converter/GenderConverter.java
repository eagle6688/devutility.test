package devutility.test.converter;

import devutility.internal.data.converter.Converter;
import devutility.test.constant.Gender;

public class GenderConverter implements Converter<String, Gender> {
	@Override
	public Gender convert(String value) {
		return Gender.parse(value);
	}
}