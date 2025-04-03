package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cefd {
    public static final /* synthetic */ cejh a(cejc cejcVar) {
        eyfy build = cejcVar.build();
        build.getClass();
        return (cejh) build;
    }

    public static final void b(int i, cejc cejcVar) {
        cejcVar.copyOnWrite();
        cejh cejhVar = (cejh) cejcVar.instance;
        cejh cejhVar2 = cejh.a;
        cejhVar.b |= 1;
        cejhVar.c = i;
    }

    public static final void c(String str, cejc cejcVar) {
        str.getClass();
        cejcVar.copyOnWrite();
        cejh cejhVar = (cejh) cejcVar.instance;
        cejh cejhVar2 = cejh.a;
        cejhVar.b |= 2;
        cejhVar.d = str;
    }
}
