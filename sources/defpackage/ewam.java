package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewam extends eyfq implements eyht {
    public ewam() {
        super(ewan.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ewan ewanVar = (ewan) this.instance;
        ewan ewanVar2 = ewan.a;
        eygi eygiVar = ewanVar.c;
        if (!eygiVar.c()) {
            ewanVar.c = eyfy.mutableCopy(eygiVar);
        }
        eydl.addAll(iterable, ewanVar.c);
    }
}
