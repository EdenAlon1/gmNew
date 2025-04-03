package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cidb {
    private static final cfup b = cfvl.c(cfvl.b, "ditto_max_percent_of_max_message_size", 0.8d);
    public static final cfup a = cfvl.e(cfvl.b, "ditto_server_max_message_size_bytes", 204800);

    public static int a() {
        return (int) (((Double) b.e()).doubleValue() * ((Integer) a.e()).intValue());
    }
}
