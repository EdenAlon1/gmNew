package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cubm {
    public static final /* synthetic */ cubl a(cubk cubkVar) {
        eyfy build = cubkVar.build();
        build.getClass();
        return (cubl) build;
    }

    public static final /* synthetic */ void b(erew erewVar, cubk cubkVar) {
        erewVar.getClass();
        cubkVar.copyOnWrite();
        cubl cublVar = (cubl) cubkVar.instance;
        eygj eygjVar = cubl.a;
        eygi eygiVar = cublVar.g;
        if (!eygiVar.c()) {
            cublVar.g = eyfy.mutableCopy(eygiVar);
        }
        cublVar.g.h(erewVar.a());
    }

    public static final /* synthetic */ void c(cubk cubkVar) {
        cubkVar.copyOnWrite();
        cubl cublVar = (cubl) cubkVar.instance;
        eygj eygjVar = cubl.a;
        eygr eygrVar = cublVar.d;
        if (!eygrVar.c()) {
            cublVar.d = eyfy.mutableCopy(eygrVar);
        }
        cublVar.d.add("US");
    }

    public static final /* synthetic */ void d(cubk cubkVar) {
        new eygk(((cubl) cubkVar.instance).g, cubl.b);
    }

    public static final void e(cubk cubkVar) {
        DesugarCollections.unmodifiableList(((cubl) cubkVar.instance).d).getClass();
    }
}
