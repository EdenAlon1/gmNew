package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erus extends eyfq implements eyht {
    public erus() {
        super(erut.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        erut erutVar = (erut) this.instance;
        erut erutVar2 = erut.a;
        eygr eygrVar = erutVar.c;
        if (!eygrVar.c()) {
            erutVar.c = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, erutVar.c);
    }
}
