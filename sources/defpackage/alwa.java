package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alwa {
    private static final cskc a = cskc.g("BugleUsageStatistics", "UsageStatisticsStatus");
    private final ffbr b;

    public alwa(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    public final void a() {
        a.m("Clearcut loggings are disabled.");
    }

    public final boolean b() {
        return ((csxu) this.b.b()).i("bugle_enable_analytics", true);
    }
}
