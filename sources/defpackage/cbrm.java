package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbrm {
    public static final ensn a = new ensn("result_uri", String.class, false, false);
    public static final ensn b = new ensn("raw_query", String.class, false, false);
    public static final ensn c = new ensn("free_text", String.class, false, false);
    public static final ensn d = new ensn("star_filter", Boolean.class, false, false);
    public static final ensn e = new ensn("conversation_list_filter", Boolean.class, false, false);
    public static final ensn f = new ensn("participant_lookup_id", String.class, false, false);
    public static final ensn g = new ensn("class_name", String.class, false, false);
    public static final ensn h;
    public static final ensn i;
    public static final ensn j;
    public static final ensn k;
    public static final ensn l;
    public static final ensn m;
    public static final ensn n;

    static {
        new ensn("status_message", String.class, false, false);
        h = new ensn("table_type", Integer.class, false, false);
        i = new ensn("operation", String.class, false, false);
        j = new ensn("outcome", String.class, false, false);
        k = new ensn("item_id", String.class, false, false);
        l = new ensn("item_counts", Integer.class, false, false);
        m = new ensn("window_start", Long.class, false, false);
        n = new ensn("window_end", Long.class, false, false);
        new ensn("delta_for_db", Integer.class, false, false);
        new ensn("delta_for_icing", Integer.class, false, false);
        new ensn("is_result_success", Boolean.class, false, false);
        new ensn("is_done", Boolean.class, false, false);
    }
}
