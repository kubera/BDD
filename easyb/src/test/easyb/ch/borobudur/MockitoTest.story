import static org.mockito.Mockito.*


scenario "stubbing in mockito works", {
  given "a mocked object", {
    mockedList = mock(LinkedList.class)
  }
  when "it is stubbed", {
    when(mockedList.get(0)).thenReturn("first")
    when(mockedList.get(1)).thenThrow(new RuntimeException())
  }
  then "verifications should work", {
    mockedList.get(0).shouldBe "first"
    ensureThrows(RuntimeException) {
      mockedList.get(1)
    }
    mockedList.get(9).shouldBe null
  }
}
