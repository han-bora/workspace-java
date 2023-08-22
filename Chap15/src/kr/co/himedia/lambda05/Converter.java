package kr.co.himedia.lambda05;

public interface Converter<F, T> {

	T convert(F from);
}
