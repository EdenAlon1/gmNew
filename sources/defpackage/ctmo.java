package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctmo {
    public static final cfva a = cfvl.e(cfvl.b, "smart_cache_file_ttl", 28);
    public static final cfva b = cfvl.i(cfvl.b, "enable_model_based_reranker", false);
    public static final cfup c = cfvl.h(cfvl.b, "model_based_reranker_config", "");
    public static final cfva d = cfvl.e(cfvl.b, "model_based_reranker_fallback_strategy", 1);
    public static final cfva e = cfvl.e(cfvl.b, "reranker_max_suggestions_per_impression", 4);
    public static final cfva f = cfvl.e(cfvl.b, "reranker_filter_strategy", 0);
    public static final cfva g = cfvl.c(cfvl.b, "reranker_filter_threshold", eobe.a);
    public static final cfva h = cfvl.i(cfvl.b, "reranker_enable_type_sorting", false);
    public static final cfva i = cfvl.i(cfvl.b, "reranker_enable_rerank_by_score", true);
    public static final cfva j = cfvl.e(cfvl.b, "reranker_target_impression_size", 0);
    public static final cfva k = cfvl.e(cfvl.b, "reranker_model_type", 1);
    public static final cfup l = cfvl.h(cfvl.b, "in_apk_multitask_config", "");
    public static final cfva m = cfvl.c(cfvl.b, "p2p_conversations_suggestions_hobbes_emp_prob_factor", -0.35d);
    public static final cfva n = cfvl.c(cfvl.b, "p2p_conversations_suggestions_hobbes_confidence_threshold", 0.038d);
    public static final cfva o = cfvl.c(cfvl.b, "p2p_conversations_suggestions_hobbes_diversification_distance_threshold", 0.25d);
    public static final cfup p = cfvl.h(cfvl.b, "p2p_suggestion_model_based_providers_config_file_specs_with_backoff", "");
    static final cfup q = cfvl.i(cfvl.b, "enable_model_based_provider_backoff", false);
    static final emyl r = cfvl.w("enable_model_based_provider_backoff_merged");
    static final cfup s = cfvl.h(cfvl.b, "base_model_role", "BASE");
    static final emyl t = cfvl.x(191287092, "enable_preferred_suggestion_score");
    static final emyl u = cfvl.w("enable_max_suggestions_per_type_and_tag");
    static final cfuz v = cfvl.s(cfvl.b, "reranker_exempt_types_list", new emyl() { // from class: ctmn
        @Override // defpackage.emyl
        public final Object get() {
            cfva cfvaVar = ctmo.a;
            return ctli.b.toByteArray();
        }
    });
}
