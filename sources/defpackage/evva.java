package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evva extends eyfq implements eyht {
    public evva() {
        super(evvr.a);
    }

    public final void a(int i) {
        copyOnWrite();
        evvr evvrVar = (evvr) this.instance;
        evvr evvrVar2 = evvr.a;
        eygi eygiVar = evvrVar.l;
        if (!eygiVar.c()) {
            evvrVar.l = eyfy.mutableCopy(eygiVar);
        }
        evvrVar.l.h(i - 1);
    }
}
