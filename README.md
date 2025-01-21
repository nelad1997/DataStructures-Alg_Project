Project Overview

In this project, I developed a dynamic data structure tailored for managing and evaluating competitors in an Olympic selection race. The primary focus was on creating an efficient, robust, and user-friendly system that supports the dynamic addition, deletion, and querying of race data for runners.

Key Goals

Efficiency: Ensure that all operations, such as adding a runner, updating race times, or calculating statistics, are performed with optimal time complexity.

Accuracy: Maintain precise records of race data and ensure correctness in all calculations, including handling edge cases like ties or missing data.

Scalability: Design a structure capable of handling a large number of runners and races without performance degradation.

Code Quality: Write clean, modular, and well-documented code that adheres to industry best practices.

Implementation Highlights

The project was implemented primarily in two core classes:

Race.java

Dynamic Initialization: Implemented using init() to initialize trees for managing runners and their metrics (minimum and average times).

Core Functionality:

Add Runner: Ensures unique runners are added efficiently using a TwoThreeTree for ID management and MinTree/AVGTree for metric tracking.

Add/Remove Runs: Handles dynamic updates to a runner's metrics with recalculations for minimum and average times.

Metric Queries: Retrieves fastest runners based on average or minimum times, leveraging tree-based structures for quick access.

Ranking: Implements methods like getRankAvg and getRankMin to rank runners dynamically based on their performance metrics.

Runner.java

Encapsulation: Stores key attributes like runnerID, AvgTime, and a tree for run times (TimeTree).

Dynamic Updates:

addRun: Efficiently adds new run times and recalculates averages dynamically.

getMinTime: Quickly retrieves the smallest run time using the root of the TimeTree.

calculateAverage and calculateAverageAfterDelete: Ensure accurate average calculation during additions and deletions of run times.

Challenges Faced

Balancing performance and code clarity: Strived to write efficient code without compromising readability.

Handling diverse input scenarios: Ensured that the system could gracefully handle edge cases and invalid actions by throwing appropriate exceptions.

Testing for correctness: Developed comprehensive test cases to validate all operations under various conditions.

Lessons Learned

This project deepened my understanding of dynamic data structures and their practical applications in real-world scenarios. It also highlighted the importance of planning and designing for scalability and maintainability from the outset.
