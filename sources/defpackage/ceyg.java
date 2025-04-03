package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceyg {
    public static final /* synthetic */ ceyi a(ceyh ceyhVar) {
        eyfy build = ceyhVar.build();
        build.getClass();
        return (ceyi) build;
    }

    public static final /* synthetic */ void b(String str, ceyh ceyhVar) {
        str.getClass();
        ceyhVar.copyOnWrite();
        ceyi ceyiVar = (ceyi) ceyhVar.instance;
        ceyi ceyiVar2 = ceyi.a;
        eygr eygrVar = ceyiVar.b;
        if (!eygrVar.c()) {
            ceyiVar.b = eyfy.mutableCopy(eygrVar);
        }
        ceyiVar.b.add(str);
    }

    public static final void c(ceyh ceyhVar) {
        DesugarCollections.unmodifiableList(((ceyi) ceyhVar.instance).b).getClass();
    }
}
