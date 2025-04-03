package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faic extends eyfq implements eyht {
    public faic() {
        super(faid.a);
    }

    public final void a(faik faikVar) {
        copyOnWrite();
        faid faidVar = (faid) this.instance;
        faid faidVar2 = faid.a;
        faikVar.getClass();
        eygr eygrVar = faidVar.b;
        if (!eygrVar.c()) {
            faidVar.b = eyfy.mutableCopy(eygrVar);
        }
        faidVar.b.add(faikVar);
    }
}
