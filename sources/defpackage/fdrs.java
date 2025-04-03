package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdrs implements fdrq {
    public static final edax a;
    public static final edax b;
    public static final edax c;

    static {
        enpd enpdVar = enpd.a;
        enpx enpxVar = new enpx("CLIENT_LOGGING_PROD");
        a = edbk.g("45352879", new edbj() { // from class: fdrr
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (fbcq) eyfy.parseFrom(fbcq.a, (byte[]) obj);
            }
        }, "CAASNXByaW1lcy9mZWRlcmF0ZWRfcXVlcnkvJVBBQ0tBR0VfTkFNRSUvZGlyZWN0b3J5X3BhdGhzGiEvcHJpbWVzL2FuYWx5dGljc19kaXJlY3RvcnlfcGF0aHM", "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        b = edbk.g("45352881", new edbj() { // from class: fdrr
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (fbcq) eyfy.parseFrom(fbcq.a, (byte[]) obj);
            }
        }, "CAASOHByaW1lcy9mZWRlcmF0ZWRfcXVlcnkvJVBBQ0tBR0VfTkFNRSUvZXhjZXB0aW9uX21lc3NhZ2VzGiQvcHJpbWVzL2FuYWx5dGljc19leGNlcHRpb25fbWVzc2FnZXM", "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        c = edbk.g("45352880", new edbj() { // from class: fdrr
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (fbcq) eyfy.parseFrom(fbcq.a, (byte[]) obj);
            }
        }, "CAASL3ByaW1lcy9mZWRlcmF0ZWRfcXVlcnkvJVBBQ0tBR0VfTkFNRSUvcnBjX3BhdGhzGhsvcHJpbWVzL2FuYWx5dGljc19ycGNfcGF0aHM", "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
    }

    @Override // defpackage.fdrq
    public final fbcq a(Context context) {
        return (fbcq) a.a(context);
    }

    @Override // defpackage.fdrq
    public final fbcq b(Context context) {
        return (fbcq) b.a(context);
    }

    @Override // defpackage.fdrq
    public final fbcq c(Context context) {
        return (fbcq) c.a(context);
    }
}
