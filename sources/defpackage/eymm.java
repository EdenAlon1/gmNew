package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eymm extends eyfq implements eyht {
    public eymm() {
        super(eymr.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        eymr eymrVar = (eymr) this.instance;
        eymr eymrVar2 = eymr.a;
        eygr eygrVar = eymrVar.b;
        if (!eygrVar.c()) {
            eymrVar.b = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, eymrVar.b);
    }
}
