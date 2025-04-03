package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cosx {
    public static final /* synthetic */ cosw a(cosv cosvVar) {
        eyfy build = cosvVar.build();
        build.getClass();
        return (cosw) build;
    }

    public static final void b(cost costVar, cosv cosvVar) {
        costVar.getClass();
        cosvVar.copyOnWrite();
        cosw coswVar = (cosw) cosvVar.instance;
        cosw coswVar2 = cosw.a;
        coswVar.d = costVar;
        coswVar.b |= 1;
    }

    public static final /* synthetic */ void c(Iterable iterable, cosv cosvVar) {
        iterable.getClass();
        cosvVar.copyOnWrite();
        cosw coswVar = (cosw) cosvVar.instance;
        cosw coswVar2 = cosw.a;
        eygr eygrVar = coswVar.c;
        if (!eygrVar.c()) {
            coswVar.c = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, coswVar.c);
    }
}
