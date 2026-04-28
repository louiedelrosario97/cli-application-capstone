
// ---------------------------------- LedgerManager --------------------------------------
// DONE: Create LedgerManager class
// DONE: Declare FILE_NAME constant
// DONE: Declare transactions ArrayList
// DONE: Build constructor that calls loadTransactions()
// DONE: loadTransactions() — reads CSV line by line, .split "|", creates Transaction objects
// TODO: addTransaction() —  BufferedWriter with (transaction_history.csv, true)
// TODO: getAll() — return full transactions list
// TODO: getDeposits() — return transactions where all inputs must be > 0
// TODO: getPayments() — return transactions where all inputs must be < 0
// TODO: getMonthToDate() — return transactions matching current month and year
// TODO: getPreviousMonth() — same but for last month using .minusMonths(1)
// TODO: getYearToDate() — return transactions matching current year
// TODO: getPreviousYear() — return transactions where year == current year - 1
// TODO: searchByVendor() — return transactions matching vendor name, use equalsIgnoreCase()


// ------------------------------------- Main ---------------------------------------------
// TODO: Fix bug — menu shows "E) Exit" but switch listens for "X"
// TODO: Create a LedgerManagement object at the top of the class
// TODO: deposit() — prompt description, vendor, amount — use LocalDate/LocalTime — save via addTransaction()
// TODO: payment() — same as deposit() but amount stored as negative
// TODO: ledgerScreen() — while loop with menu, switch calls displayTransactions() or reportsScreen()
// TODO: reportsScreen() — while loop with menu, switch calls matching filter methods
// TODO: displayTransactions() — print header row, loop backwards, print each transaction


// ---------------------------------- Transaction ---------------------------------------------
// DONE: Created Transaction class
// DONE: Declared all five data members
// DONE: Generate constructors, getters, and setters
// DONE: Added toString()