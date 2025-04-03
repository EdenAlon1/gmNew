package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdst implements fdsq {
    public static final edax a;
    public static final edax b;
    public static final edax c;

    static {
        enpd enpdVar = enpd.a;
        enpx enpxVar = new enpx("CLIENT_LOGGING_PROD");
        a = edbk.f("45408304", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        b = edbk.g("40", new edbj() { // from class: fdsr
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (ecnd) eyfy.parseFrom(ecnd.a, (byte[]) obj);
            }
        }, "Ci1jb20uZ29vZ2xlLmFuZHJvaWQucHJpbWVzLWphbmstJVBBQ0tBR0VfTkFNRSUSIwgCEh9KPCVFVkVOVF9OQU1FJT4jbWlzc2VkQXBwRnJhbWVzEh8IAxIbSjwlRVZFTlRfTkFNRSU+I3RvdGFsRnJhbWVzEiYIBRIiSjwlRVZFTlRfTkFNRSU+I21heEZyYW1lVGltZU1pbGxpcw", "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        c = edbk.g("13", new edbj() { // from class: fdss
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (fgpf) eyfy.parseFrom(fgpf.a, (byte[]) obj);
            }
        }, "EAAYAg", "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
    }

    @Override // defpackage.fdsq
    public final ecnd a(Context context) {
        return (ecnd) b.a(context);
    }

    @Override // defpackage.fdsq
    public final fgpf b(Context context) {
        return (fgpf) c.a(context);
    }

    @Override // defpackage.fdsq
    public final boolean c(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }
}
