package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emjq extends eyfq implements eyht {
    public emjq() {
        super(emkd.b);
    }

    public final void a(fbri fbriVar) {
        copyOnWrite();
        emkd emkdVar = (emkd) this.instance;
        eygj eygjVar = emkd.a;
        fbriVar.getClass();
        eygi eygiVar = emkdVar.f;
        if (!eygiVar.c()) {
            emkdVar.f = eyfy.mutableCopy(eygiVar);
        }
        emkdVar.f.h(fbriVar.a());
    }
}
