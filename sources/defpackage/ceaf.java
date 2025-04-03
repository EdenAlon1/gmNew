package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceaf extends eyfq implements eyht {
    public ceaf() {
        super(ceal.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Iterable iterable) {
        copyOnWrite();
        ceal cealVar = (ceal) this.instance;
        eygj eygjVar = ceal.a;
        eygi eygiVar = cealVar.g;
        if (!eygiVar.c()) {
            cealVar.g = eyfy.mutableCopy(eygiVar);
        }
        enqv it = ((engw) iterable).iterator();
        while (it.hasNext()) {
            cealVar.g.h(((ceaj) it.next()).m);
        }
    }
}
