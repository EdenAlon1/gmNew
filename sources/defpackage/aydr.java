package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aydr extends eyfq implements eyht {
    public aydr() {
        super(ayds.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ayds aydsVar = (ayds) this.instance;
        ayds aydsVar2 = ayds.a;
        eygr eygrVar = aydsVar.d;
        if (!eygrVar.c()) {
            aydsVar.d = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, aydsVar.d);
    }
}
