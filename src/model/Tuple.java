package model;

public class Tuple<T>{
	private T m_first;
	private T m_second;

	public Tuple(T first, T second) {
		m_first = first;
		m_second = second;
	}

	public T getFirst() {
		return m_first;
	}
	public void setFirst(T first) {
		m_first = first;
	}

	public T getSecond() {
		return m_second;
	}
	public void setSecond(T second) {
		m_second = second;
	}
}
