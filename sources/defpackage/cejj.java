package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cejj extends eyfq implements eyht {
    public cejj() {
        super(cejk.b);
    }

    public final void a(cejo cejoVar) {
        copyOnWrite();
        cejk cejkVar = (cejk) this.instance;
        eygj eygjVar = cejk.a;
        cejoVar.getClass();
        eygi eygiVar = cejkVar.k;
        if (!eygiVar.c()) {
            cejkVar.k = eyfy.mutableCopy(eygiVar);
        }
        cejkVar.k.h(cejoVar.g);
    }
}
