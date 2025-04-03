package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckxp extends eyfq implements eyht {
    public ckxp() {
        super(ckxq.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ckxq ckxqVar = (ckxq) this.instance;
        ckxq ckxqVar2 = ckxq.a;
        eygr eygrVar = ckxqVar.f;
        if (!eygrVar.c()) {
            ckxqVar.f = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, ckxqVar.f);
    }
}
