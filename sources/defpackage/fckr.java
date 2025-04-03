package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fckr extends eyfq implements eyht {
    public fckr() {
        super(fcks.a);
    }

    public final void a(int i) {
        copyOnWrite();
        fcks fcksVar = (fcks) this.instance;
        fcks fcksVar2 = fcks.a;
        eygi eygiVar = fcksVar.b;
        if (!eygiVar.c()) {
            fcksVar.b = eyfy.mutableCopy(eygiVar);
        }
        fcksVar.b.h(i);
    }
}
