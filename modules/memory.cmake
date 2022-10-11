if(NOT memory_path)

  # Module definition
  set(memory_path "${CMAKE_CURRENT_SOURCE_DIR}/memory" PARENT_SCOPE)
  add_subdirectory(memory)

endif()
