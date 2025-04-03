package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyve extends eyfq implements eyht {
    public eyve() {
        super(eyvg.a);
    }

    public final void a(String str) {
        copyOnWrite();
        eyvg eyvgVar = (eyvg) this.instance;
        eyvg eyvgVar2 = eyvg.a;
        eygr eygrVar = eyvgVar.h;
        if (!eygrVar.c()) {
            eyvgVar.h = eyfy.mutableCopy(eygrVar);
        }
        eyvgVar.h.add(str);
    }
}
