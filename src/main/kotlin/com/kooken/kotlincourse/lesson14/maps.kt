package com.kooken.kotlincourse.lesson14

fun main () {

    // Task 1
    val testExecutionTimes = mapOf(
        "testA" to 2.5,
        "testB" to 3.0,
        "testC" to 1.5
    )

    val averageTime = testExecutionTimes.values.average()
    println("Average test execution time: %.2f seconds".format(averageTime))

    // Task 2

    val testMetadata = mapOf(
        "testA" to "metadata for test A",
        "testB" to "metadata for test B",
        "testC" to "metadata for test C"
    )

    println("All test methods: ${testMetadata.keys}")

    // Task 3

    val testResults = mutableMapOf<String, Boolean>(
        "testA" to true,
        "testB" to false,
        "testC" to true
    )

    val newTestName = "testD"
    val newTestResult = true
    testResults[newTestName] = newTestResult
    println("Added new test: $newTestName with result: $newTestResult")

    // Task 4

    val successfulTestsCount = testResults.count { it.value }
    println("Number of successful tests: $successfulTestsCount")

    // Task 5

    val bugTracking = mutableMapOf<String, String>(
        "bug1" to "Bug description 1",
        "bug2" to "Bug description 2",
        "fixed_bug" to "Fixed bug description"
    )

    bugTracking.remove("fixed_bug")
    println("Updated bug tracking: $bugTracking")

    // Task 6

    val webPageTestResults = mapOf(
        "https://example.com" to "200 OK",
        "https://testsite.com" to "404 Not Found",
        "https://anotherpage.com" to "500 Internal Server Error"
    )

    webPageTestResults.forEach { (url, status) ->
        println("Page: $url, Status: $status")
    }

    // Task 7

    val responseTimes = mapOf(
        "serviceA" to 250,
        "serviceB" to 150,
        "serviceC" to 350
    )

    val threshold = 200
    val slowServices = responseTimes.filter { it.value > threshold }
    println("Services exceeding threshold of $threshold ms: $slowServices")

    // Task 8

    val apiTestResults = mapOf(
        "/api/endpointA" to "200 OK",
        "/api/endpointB" to "404 Not Found",
        "/api/endpointC" to "200 OK"
    )

    val specifiedEndpoint = "/api/endpointD"
    val status = apiTestResults[specifiedEndpoint] ?: "Not tested"
    println("Response status for $specifiedEndpoint: $status")

    // Task 9

    val testEnvConfigurations = mapOf(
        "browserType" to "Chrome",
        "os" to "Windows",
        "version" to "1.0.0"
    )

    val browserType = testEnvConfigurations["browserType"] ?: error("Browser type must not be null")
    println("Browser type: $browserType")

    // Task 10

    val versionData = mapOf(
        "version" to "1.0.0",
        "releaseDate" to "2023-01-01"
    )

    val newVersionData = versionData.toMutableMap()
    newVersionData["version"] = "1.1.0"
    println("Updated version data: $newVersionData")

    // Task 11

    val deviceSettings = mapOf(
        "iPhone 14" to mapOf("resolution" to "1284x2778", "os" to "iOS 16"),
        "Samsung Galaxy S21" to mapOf("resolution" to "1080x2400", "os" to "Android 12"),
        "Google Pixel 6" to mapOf("resolution" to "1080x2400", "os" to "Android 12")
    )

    fun getDeviceSettings(model: String): Map<String, String> {
        return deviceSettings[model] ?: mapOf("resolution" to "default", "os" to "default")
    }

    val specificModel = "iPhone 14"
    println("Settings for $specificModel: ${getDeviceSettings(specificModel)}")

    // Task 12

    val testErrors = mapOf(
        404 to "Not Found",
        500 to "Internal Server Error",
        403 to "Forbidden"
    )

    val errorCodeToCheck = 500
    val errorExists = testErrors.containsKey(errorCodeToCheck)
    println("Error code $errorCodeToCheck exists: $errorExists")

    // Task 13

    val testScenarios = mapOf(
        "Test1_v1" to "Passed",
        "Test2_v1" to "Failed",
        "Test3_v2" to "Skipped",
        "Test4_v1" to "Passed"
    )

    val versionToFilter = "v1"
    val filteredScenarios = testScenarios.filterKeys { it.endsWith(versionToFilter) }
    println("Filtered scenarios for version $versionToFilter: $filteredScenarios")

    // Task 14

    val functionalModules = mapOf(
        "User Authentication" to "Passed",
        "Payment Processing" to "Failed",
        "Data Analytics" to "Passed"
    )

    val hasFailedModules = functionalModules.values.any { it == "Failed" }
    println("There are modules with failed testing: $hasFailedModules")

    // Task 15

    val testEnvSettings = mutableMapOf(
        "timeout" to "30s",
        "retryAttempts" to "3"
    )

    val additionalSettings = mapOf(
        "baseUrl" to "https://api.example.com",
        "headers" to "Authorization: Bearer token"
    )

    testEnvSettings.putAll(additionalSettings)
    println("Updated test environment settings: $testEnvSettings")

    // Task 16

    val bugData1 = mapOf(
        101 to "Null Pointer Exception",
        102 to "Array Index Out of Bounds"
    )

    val bugData2 = mapOf(
        103 to "Database Connection Failed",
        104 to "Timeout Exception"
    )

    val mergedBugData = bugData1 + bugData2
    println("Merged Bug Data: $mergedBugData")

    // Task 17

    val temporaryData = mutableMapOf(
        "test1" to "Passed",
        "test2" to "Failed",
        "test3" to "Skipped"
    )

    temporaryData.clear()
    println("Temporary data after clearing: $temporaryData")

    // Task 18

    val automatedTestResults = mapOf(
        "test1" to "Passed",
        "test2" to "Failed",
        "test3" to "Skipped",
        "test4" to "Passed"
    )

    val filteredResults = automatedTestResults.filter { it.value != "Skipped" }
    println("Filtered Test Results (excluding skipped): $filteredResults")

    // Task 19

    val testConfigurations = mutableMapOf(
        "timeout" to "30s",
        "retries" to "3",
        "obsoleteSetting1" to "value1",
        "obsoleteSetting2" to "value2"
    )

    val obsoleteConfigurations = setOf("obsoleteSetting1", "obsoleteSetting2")

    testConfigurations.keys.removeAll(obsoleteConfigurations)
    println("Updated Test Configurations: $testConfigurations")

    // Task 20

    val testReportResults = mapOf(
        "TestID_001" to "Passed",
        "TestID_002" to "Failed",
        "TestID_003" to "Skipped",
        "TestID_004" to "Passed"
    )

    val testReport = testReportResults.map { "${it.key}: ${it.value}" }
    println("Test Report: $testReport")

    // Task 21

    val lastTestResults = mutableMapOf(
        "test1" to "Passed",
        "test2" to "Failed"
    )

    val archivedResults = lastTestResults.toMap()
    println("Archived Test Results: $archivedResults")

    // Task 22

    val testExecutionData = mapOf(
        "TestID_001" to 120,
        "TestID_002" to 90,
        "TestID_003" to 150
    )

    val transformedExecutionData = testExecutionData.mapKeys { getNameById(it.key) }
    println("Transformed Execution Data: $transformedExecutionData")

    // Task 23

    val performanceEstimates = mutableMapOf(
        "v1.0" to 100,
        "v1.1" to 120,
        "v1.2" to 140
    )

    performanceEstimates.replaceAll { _, estimate -> (estimate * 1.1).toInt() }
    println("Updated Performance Estimates: $performanceEstimates")

    // Task 24

    val compilationErrors = mapOf<String, String>()
    val isCompilationErrorsEmpty = compilationErrors.isEmpty()
    println("Compilation errors are empty: $isCompilationErrorsEmpty")

    // Task 25

    val loadTestingResults = mapOf(
        "LoadTest1" to "Passed",
        "LoadTest2" to "Failed"
    )

    val isLoadTestingResultsNotEmpty = loadTestingResults.isNotEmpty()
    println("Load testing results are not empty: $isLoadTestingResultsNotEmpty")

    // Task 26

    val automatedTestsResults = mapOf(
        "TestA" to "Passed",
        "TestB" to "Failed",
        "TestC" to "Passed"
    )

    val allTestsPassed = automatedTestsResults.values.all { it == "Passed" }
    println("All automated tests passed: $allTestsPassed")

    // Task 27

    val hasErrorTest = automatedTestResults.values.any { it == "Failed" }
    println("There is at least one test with an error: $hasErrorTest")

    // Task 28

    val serviceTestingResults = mapOf(
        "OptionalFeatureTest" to "Failed",
        "CriticalFeatureTest" to "Passed",
        "OptionalUIComponentTest" to "Failed"
    )

    val filteredServiceResults = serviceTestingResults.filter { (key, value) ->
        value == "Failed" && key.contains("optional", ignoreCase = true)
    }
    println("Filtered Service Testing Results: $filteredServiceResults")
}

/*
Task 1
Given a dictionary with the name and execution time of each automated test in seconds.
Determine the average test execution time.
 */

/*
Task 2
There is a dictionary with metadata of automated tests, where the keys are the names of test methods and the values
are a string with metadata. Print a list of all test methods.
 */

/*
Task 3
Add a new test and its result to the mutable dictionary with test pass data.
 */

/*
Task 4
Count the number of successful tests in the dictionary with results.
 */

/*
Task 5
Delete the entry about the bug that was fixed from the mutable dictionary with bug tracking.
 */

/*
Task 6
For a dictionary with web page test results (key is page URL, value is response status), print a message about the page
and its test status.
 */

/*
Task 7
Find only those services whose response time exceeds a given threshold in the dictionary with the name and response time.
 */


/*
Task 8
The dictionary stores API test results (key is endpoint, value is response status in a string).
For the specified endpoint, find the response status; if the endpoint is missing, assume that it was not tested.
 */

/*
Task 9
From the dictionary containing test environment configurations (key is the name of the configuration parameter),
get the value for "browserType". The response cannot be null.
 */


/*
Task 10
Create a copy of the immutable dictionary with version data for the software under test to add a new version.
 */

/*
Task 11
Using a dictionary with test settings for different mobile devices (key — device model), get settings for a
specific model or return default settings.
 */

/*
Task 12
Check if the dictionary with test errors (code and description) contains a certain error code.
 */

/*
Task 13
You are given an immutable dictionary, where the keys are the identifiers of test scenarios in the format
"TestID_Version", and the values are the execution statuses of these tests ("Passed", "Failed", "Skipped").
Filter the dictionary, leaving only those scenarios whose identifiers correspond to a certain version of tests.
 */

/*
Task 14
You have a dictionary, where the keys are the names of the functional modules of the application, and the values
are the results of their testing. Check if there are modules with failed testing.
 */

/*
Task 15
Add settings from another dictionary to the mutable dictionary with test environment settings.
 */

/*
Task 16
Merge two immutable dictionaries with bug data.
 */

/*
Task 17
Clear the mutable dictionary with temporary data from the last automated test run.
 */

/*
Task 18
Exclude cases where tests were skipped (have the “skipped” status) from the automated test report.
 */

/*
Task 19
Remove a set of obsolete configurations from the dictionary with test configurations.
 */

/*
Task 20
Create a test report by converting the dictionary with test results (key - test ID, value - result)
to a list of strings of the format "Test ID: result".
 */

/*
Task 21
Convert the mutable dictionary with the last test results to an immutable one for archiving.
 */

/*
Task 22
Transform the dictionary containing the test ID and test execution time data by replacing the test
IDs with their names (the name can be obtained by calling a fake method, for example getNameById(id: String))
 */

fun getNameById(id: String): String {
    return when (id) {
        "TestID_001" -> "Login Test"
        "TestID_002" -> "Payment Test"
        "TestID_003" -> "Profile Update Test"
        else -> "Unknown Test"
    }
}

/*
Task 23
For the dictionary with performance estimates for different versions of the application, increase each estimate
by 10% to account for the new testing conditions.
 */

/*
Task 24
Check if the dictionary with test compilation errors is empty.
 */

/*
Task 25
Make sure that the dictionary with load testing results is not empty.
 */

/*
Task 26
Check if all automated tests in the dictionary with results passed.
 */

/*
Task 27
Determine if the dictionary with test results contains at least one test with an error.
 */

/*
Task 28
Filter the dictionary with service testing results, leaving only those tests that failed and contain “optional” in the
name.
 */