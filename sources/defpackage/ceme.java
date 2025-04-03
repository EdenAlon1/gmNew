package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceme {
    public static final /* synthetic */ cemd a(cemc cemcVar) {
        eyfy build = cemcVar.build();
        build.getClass();
        return (cemd) build;
    }

    public static final void b(int i, cemc cemcVar) {
        cemcVar.copyOnWrite();
        cemd cemdVar = (cemd) cemcVar.instance;
        cemd cemdVar2 = cemd.a;
        cemdVar.b = i;
    }

    public static final void c(String str, cemc cemcVar) {
        str.getClass();
        cemcVar.copyOnWrite();
        cemd cemdVar = (cemd) cemcVar.instance;
        cemd cemdVar2 = cemd.a;
        cemdVar.c = str;
    }

    public static final void d(long j, cemc cemcVar) {
        cemcVar.copyOnWrite();
        cemd cemdVar = (cemd) cemcVar.instance;
        cemd cemdVar2 = cemd.a;
        cemdVar.d = j;
    }

    public static final /* synthetic */ void e(Iterable iterable, cemc cemcVar) {
        cemcVar.copyOnWrite();
        cemd cemdVar = (cemd) cemcVar.instance;
        cemd cemdVar2 = cemd.a;
        eygr eygrVar = cemdVar.e;
        if (!eygrVar.c()) {
            cemdVar.e = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, cemdVar.e);
    }

    public static final void f(cemc cemcVar) {
        DesugarCollections.unmodifiableList(((cemd) cemcVar.instance).e).getClass();
    }
}
