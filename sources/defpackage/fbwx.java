package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbwx extends eyfq implements eyht {
    public fbwx() {
        super(fbwy.b);
    }

    public final void a(fbrm fbrmVar) {
        copyOnWrite();
        fbwy fbwyVar = (fbwy) this.instance;
        eygj eygjVar = fbwy.a;
        eygi eygiVar = fbwyVar.h;
        if (!eygiVar.c()) {
            fbwyVar.h = eyfy.mutableCopy(eygiVar);
        }
        fbwyVar.h.h(fbrmVar.a());
    }
}
