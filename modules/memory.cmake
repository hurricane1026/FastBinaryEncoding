if(NOT memory)

  # Module definition
  set(memory "${CMAKE_CURRENT_SOURCE_DIR}/memory" PARENT_SCOPE)
  add_subdirectory(memory)

endif()
