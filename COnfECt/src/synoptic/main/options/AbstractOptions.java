package synoptic.main.options;

import java.util.List;

/**
 * <p>
 * The common options for all Synoptic projects. Generally, this should not be
 * created manually. Instead, parse command line options using PerfumeOptions or
 * SynopticOptions, and then call toAbstractOptions() on that object.
 * </p>
 * <p>
 * This class cannot be a superclass of PerfumeOptions and SynopticOptions
 * containing options common to both of them because plume-lib doesn't support
 * inheritance.
 * </p>
 */
public class AbstractOptions {

    /**
     * The instance of either SynopticOptions or PerfumeOptions from which plume
     * methods can be called and from which this options object was created
     */
    public static Options plumeOpts = null;

    // ////////////////////////////
    // General options
    // ////////////////////////////

    static final String helpStr = "-h Print short usage message";
    public boolean help = true;

    static final String allHelpStr = "-H Print extended usage message (includes debugging options)";
    public boolean allHelp = false;

    static final String versionStr = "-V Print the current synoptic repo changeset";
    public boolean version = false;

    // ////////////////////////////
    // Execution Options
    // ////////////////////////////

    static final String logLvlQuietStr = "-q Be quiet, do not print much information";
    public boolean logLvlQuiet = false;

    static final String logLvlVerboseStr = "-v Print detailed information during execution";
    public boolean logLvlVerbose = false;

    static final String randomSeedStr = "Use a specific random seed for pseudo-random number generator";
    public Long randomSeed = null;

    static final String separateVTimeIndexSetsStr = "Vector time index sets for partitioning the graph by system node type, e.g. '1,2;3,4'";
    public static String separateVTimeIndexSets = null;

    static final String multipleRelationsStr = "Mine multiple relations from the trace graph";
    public boolean multipleRelations = false;

    static final String stateProcessingStr = "Enable state processing";
    public boolean stateProcessing = false;

    static final String testGenerationStr = "-t Enable abstract test generation";
    public boolean testGeneration = false;

    static final String supportCountThresholdStr = "filter all invariants that have support values greater than the threshold";
    public int supportCountThreshold = 0;

    static final String ignoreIntrByInvsStr = "Ignore IntrBy invariants. Synoptic currently doesn't support IntrBy Invariants.";
    public boolean ignoreIntrByInvs = true;

    static final String ignoreNFbyInvsStr = "Ignore NFby invariants";
    public boolean ignoreNFbyInvs = false;

    // Extended Perfume option
    static final String termOnIntermediateModelStr = "-t Terminate on intermediate model output";
    public boolean termOnIntermediateModel = false;

    // ////////////////////////////
    // Parser Options
    // ////////////////////////////

    static final String separatorRegExpStr = "-s Partitions separator reg-exp: log lines below and above the matching line are placed into different partitions";
    public static String separatorRegExp = null;

    public static final String regExpDefault = "(?<TYPE>.*)";
    static final String regExpsStr = "-r Parser reg-exp: extracts event type and event time from a log line";
    public List<String> regExps = null;

    static final String partitionRegExpStr = "-m Partitions mapping reg-exp: maps a log line to a partition";
    public static final String partitionRegExpDefault = "\\k<FILE>";
    public static String partitionRegExp = partitionRegExpDefault;

    static final String ignoreNonMatchingLinesStr = "-i Ignore lines that do not match any of the passed regular expressions";
    public boolean ignoreNonMatchingLines = false;

    // Whether to run Perfume (true), or Synoptic (false)
    public boolean usePerformanceInfo = false;

    // Whether to only run the k-tails algorithm, not Synoptic or Perfume
    static final String onlyRunKTailsStr = "Whether to only run the k-tails algorithm, not Synoptic or Perfume";
    public boolean onlyRunKTails = true;

    static final String traceNormalizationStr = "Independently normalize each trace";
    public boolean traceNormalization = false;

    static final String keepOrderStr = "Keep events in log order and do not sort by supplied resource values";
    public boolean keepOrder = false;

    static final String recoverFromParseErrorsStr = "Ignore parser warnings and attempt to recover from parse errors if possible";
    public boolean recoverFromParseErrors = false;

    static final String debugParseStr = "Debug the parser by printing field values extracted from the log and then terminate.";
    public boolean debugParse = false;

    static final String dateFormatStr = "Format of the dates contained in the log (required by DATETIME)";
    public String dateFormat = "dd/MMM/yyyy:HH:mm:ss";

    // ////////////////////////////
    // Input options
    // ////////////////////////////

    static final String argsFilenameStr = "-c Command line arguments input filename";
    public static String argsFilename = null;

    static final String inputDeltaStr = "Interpret the supplied time values as delta values instead of absolute values";
    public static boolean inputDelta = false;

    // Extended Perfume option
    static final String modelFileStr = "The file containing the Perfume model";
    public String modelFile = null;

    static final String refinementFileStr = "The file containing refinement instructions for the Perfume model";
    public String refinementFile = null;

    static final String intermediateInPathStr = "The location to output intermediate models";
    public String intermediateInPath = null;

    // ////////////////////////////
    // Output options
    // ////////////////////////////
    static final String outputSupportCountsStr = "Output support counts along with mined invariants";
    public boolean outputSupportCount = false;

    static final String outputPathPrefixStr = "-o Output path prefix for generating Graphviz dot files graphics";
    public static String outputPathPrefix = null;

    static final String outputInvariantsToFileStr = "Output invariants to a file";
    public boolean outputInvariantsToFile = false;

    static final String noModelOutputStr = "Do not output the final model unless a format is explicitly requested";
    public boolean noModelOutput = false;

    static final String exportAsGMLStr = "Export models as GML and not DOT files";
    public boolean exportAsGML = false;

    static final String outputLTSStr = "Output the final model in the LTS format";
    public boolean outputLTS = false;

    static final String dotExecutablePathStr = "-d Path to the Graphviz dot command executable to use";
    public static String dotExecutablePath = null;

    static final String outputProbLabelsStr = "Output transition probabilities on the graph's edge labels";
    public boolean outputProbLabels = true;

    static final String outputCountLabelsStr = "Output transition counts on the graph's edge labels";
    public boolean outputCountLabels = false;

    static final String showMedianStr = "Show median metric value on edges in addition to min and max";
    public boolean showMedian = false;

    static final String showTerminalNodeStr = "Show TERMINAL node in generated graphs.";
    public boolean showTerminalNode = true;

    static final String showInitialNodeStr = "Show INITIAL node in generated graphs.";
    public boolean showInitialNode = true;

    static final String outputJSONStr = "-j Output the final model as a JSON object";
    public boolean outputJSON = false;

    // Extended Perfume option
    static final String intermediateOutPathStr = "The location to output intermediate models";
    public String intermediateOutPath = null;

    // ////////////////////////////
    // Verbosity Options
    // ////////////////////////////

    static final String dumpInvariantsStr = "Dump complete list of mined invariant to stdout";
    public boolean dumpInvariants = false;

    static final String dumpTraceGraphDotFileStr = "Dump the DOT file for the trace graph to file <outputPathPrefix>.tracegraph.dot";
    public boolean dumpTraceGraphDotFile = false;

    static final String dumpTraceGraphPngFileStr = "Dump the PNG of the trace graph to file <outputPathPrefix>.tracegraph.dot.png";
    public boolean dumpTraceGraphPngFile = false;

    static final String dumpInitialPartitionGraphStr = "Dump the initial condensed partition graph";
    public boolean dumpInitialPartitionGraph = false;

    static final String dumpIntermediateStagesStr = "Dump dot files from intermediate Synoptic stages to files of form outputPathPrefix.stage-S.round-R.dot";
    public boolean dumpIntermediateStages = false;

    // ////////////////////////////
    // Debugging Options
    // ////////////////////////////

    static final String logLvlExtraVerboseStr = "Print extra detailed information during execution";
    public boolean logLvlExtraVerbose = false;

    static final String ignoreInvsOverETypeSetStr = "Ignore invariants that include event types from the following set (use ';' to separate event types).";
    public static String ignoreInvsOverETypeSet = null;

    static final String useTransitiveClosureMiningStr = "Use the transitive closure invariant mining algorithm (usually slower)";
    public boolean useTransitiveClosureMining = false;

    static final String mineNeverConcurrentWithInvStr = "Mine the NeverConcurrentWith invariant (only changes behavior for PO traces with useTransitiveClosureMining=false)";
    public boolean mineNeverConcurrentWithInv = true;

    static final String onlyMineInvariantsStr = "Mine invariants and then quit.";
    public boolean onlyMineInvariants = false;

    static final String noCoarseningStr = "Do not perform the coarsening stage";
    public boolean noCoarsening = false;

    static final String doBenchmarkingStr = "Perform benchmarking and output benchmark information";
    public boolean doBenchmarking = false;

    static final String internCommonStringsStr = "Intern commonly occurring strings, such as event types, as a memory-usage optimization";
    public boolean internCommonStrings = true;

    static final String runTestsStr = "Run all tests in synoptic.tests.units, and then terminate.";
    public boolean runTests = false;

    static final String runAllTestsStr = "Run all tests in synoptic.tests, and then terminate.";
    public boolean runAllTests = false;

    static final String performExtraChecksStr = "Perform extra correctness checks at the expense of cpu and memory usage.";
    public boolean performExtraChecks = false;

    static final String noRefinementStr = "Do not perform refinement";
    public boolean noRefinement = false;

    /**
     * Prints help for all option groups, including unpublicized ones.
     */
    public void printLongHelp() {
        if (plumeOpts instanceof PerfumeOptions) {
            ((PerfumeOptions) plumeOpts).printLongHelp();
        } else if (plumeOpts instanceof SynopticOptions) {
            ((SynopticOptions) plumeOpts).printLongHelp();
        }
    }
}
