package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esha {
    public static final /* synthetic */ esgz a(esgy esgyVar) {
        eyfy build = esgyVar.build();
        build.getClass();
        return (esgz) build;
    }

    public static final /* synthetic */ void b(Iterable iterable, esgy esgyVar) {
        esgyVar.copyOnWrite();
        esgz esgzVar = (esgz) esgyVar.instance;
        esgz esgzVar2 = esgz.a;
        eygr eygrVar = esgzVar.b;
        if (!eygrVar.c()) {
            esgzVar.b = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, esgzVar.b);
    }

    public static final void c(int i, esgy esgyVar) {
        esgyVar.copyOnWrite();
        esgz esgzVar = (esgz) esgyVar.instance;
        esgz esgzVar2 = esgz.a;
        esgzVar.c = etdr.b(i);
    }
}
