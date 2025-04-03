package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fivg extends eyfq implements eyht {
    public fivg() {
        super(fivh.a);
    }

    public final void a(eyee eyeeVar) {
        copyOnWrite();
        fivh fivhVar = (fivh) this.instance;
        fivh fivhVar2 = fivh.a;
        eyeeVar.getClass();
        eygr eygrVar = fivhVar.b;
        if (!eygrVar.c()) {
            fivhVar.b = eyfy.mutableCopy(eygrVar);
        }
        fivhVar.b.add(eyeeVar);
    }
}
