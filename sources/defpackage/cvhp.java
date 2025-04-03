package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvhp {
    public static final cfva a = cfvl.l(cfvl.b, "conversation_page_loading_time_in_millis", 45000);
    public static final cfva b;
    public final ffbr c;
    public final debk d;
    private final ffbr e;

    static {
        cfvl.k(cfvl.b, "conversation_fetch_batch_size", 20);
        cfvl.k(cfvl.b, "conversation_load_page_size", 6);
        cfvl.k(cfvl.b, "conversation_load_initial_load_factor", 3);
        cfvl.k(cfvl.b, "conversation_load_timeout_seconds", 5);
        cfvl.k(cfvl.b, "conversation_updates_cache_timeout_millis", 5000);
        cfvl.i(cfvl.b, "enable_load_message_from_start", true);
        cfvl.i(cfvl.b, "enable_loading_state_view_metrics", true);
        cfvl.n(cfvl.b, "enable_single_inbox_v1_for_all", false);
        cfvl.n(cfvl.b, "log_conversation_list_load_latency", true);
        cfvl.n(cfvl.b, "show_watch_conversations_on_eos", true);
        cfvl.n(cfvl.b, "enable_app_interactive_log", true);
        b = cfvl.n(cfvl.b, "remove_invalid_delete_message", true);
        cfvl.n(cfvl.b, "enable_scroll_to_top_click_logging", true);
        cfvl.n(cfvl.b, "enable_app_prerequisites_dialog_logging", true);
    }

    public cvhp(@asxb ffbr ffbrVar, ffbr ffbrVar2, debk debkVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.e = ffbrVar;
        this.c = ffbrVar2;
        this.d = debkVar;
    }

    public final Boolean a() {
        return (Boolean) this.e.b();
    }
}
