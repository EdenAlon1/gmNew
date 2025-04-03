package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgy {
    public static final /* synthetic */ abgx a(abgv abgvVar) {
        eyfy build = abgvVar.build();
        build.getClass();
        return (abgx) build;
    }

    public static final void b(String str, abgv abgvVar) {
        str.getClass();
        abgvVar.copyOnWrite();
        abgx abgxVar = (abgx) abgvVar.instance;
        abgx abgxVar2 = abgx.a;
        abgxVar.b |= 4;
        abgxVar.e = str;
    }

    public static final void c(String str, abgv abgvVar) {
        abgvVar.copyOnWrite();
        abgx abgxVar = (abgx) abgvVar.instance;
        abgx abgxVar2 = abgx.a;
        abgxVar.b |= 2;
        abgxVar.d = str;
    }

    public static final void d(int i, abgv abgvVar) {
        abgvVar.copyOnWrite();
        abgx abgxVar = (abgx) abgvVar.instance;
        abgx abgxVar2 = abgx.a;
        abgxVar.c = i - 2;
        abgxVar.b |= 1;
    }
}
