package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eael {
    public final eaek a;
    public final int b;
    public final String c;
    public final String d = null;
    public final Throwable e;

    public eael(eaek eaekVar, int i, String str, String str2, Throwable th) {
        this.a = eaekVar;
        this.b = i;
        this.c = str;
        this.e = th;
    }

    public static eael a(eaek eaekVar, Throwable th) {
        return new eael(eaekVar, -1, th.getMessage(), null, th);
    }
}
