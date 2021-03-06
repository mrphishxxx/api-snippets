require_relative 'base_language_executor'

module LanguageExecutor
  class CurlLanguageExecutor < BaseLanguageExecutor
    private

    def execute(file)
      execute_with_suppressed_output("sh #{file}")
    end
  end
end