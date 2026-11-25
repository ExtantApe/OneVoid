rootProject.name = "OneVoid"

// Test-only stand-in for Waycave 0.8.0's hand-over API. Never shipped.
include("waycave-standin")
project(":waycave-standin").projectDir = file("test/standin")
