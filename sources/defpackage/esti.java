package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esti {
    public static final fcad a(fcfo fcfoVar, Iterable iterable) {
        fcac fcacVar = (fcac) fcad.a.createBuilder();
        fcacVar.getClass();
        fcfoVar.getClass();
        fcacVar.copyOnWrite();
        fcad fcadVar = (fcad) fcacVar.instance;
        fcadVar.c = fcfoVar;
        fcadVar.b |= 1;
        DesugarCollections.unmodifiableList(fcadVar.d).getClass();
        fcacVar.a(iterable);
        fcacVar.copyOnWrite();
        ((fcad) fcacVar.instance).e = true;
        eyfy build = fcacVar.build();
        build.getClass();
        return (fcad) build;
    }
}
