/* Time Travel Trading
 * Format: Web Service
 * Input accepted: 2 part - stock code and series of times with prices
 * e.g. input 1: AAPL
 * 	input 2: 1462558650,2024.26
 *		 1462645050,2022.18
 *		 1462731450,2020.44
 *		 1463163450,2068.08
 * 
 * output (to log file) [name,buytime,selltime]: 
 *		 AAPL,1462731450,1463163450
 *
 * Note: output will require searching an ordered list for two values which
 * have the greatest difference between them (small to large)
 * Will have to figure out a sorting algorithm to use. Mergesort? Quicksort?
 * Figure out one that is easily implementable and decently efficient and 
 * implement it. Have a second on hand to implement if time allows. 
 * 
 * Possible uses for cURL: output to file on local machine
 * 			   download files from ftp server
			   upload files to ftp server
 */
