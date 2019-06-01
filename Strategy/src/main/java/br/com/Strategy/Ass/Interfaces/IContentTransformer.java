package br.com.Strategy.Ass.Interfaces;

import java.util.stream.Stream;

public interface IContentTransformer {
	
	public <T> Stream<T> converterQualidade() throws Exception;
}
