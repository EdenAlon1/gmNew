package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtep extends eyfq implements eyht {
    public dtep() {
        super(dteq.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        dteq dteqVar = (dteq) this.instance;
        dteq dteqVar2 = dteq.a;
        eygi eygiVar = dteqVar.b;
        if (!eygiVar.c()) {
            dteqVar.b = eyfy.mutableCopy(eygiVar);
        }
        eydl.addAll(iterable, dteqVar.b);
    }
}
