package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evxn extends eyfq implements eyht {
    public evxn() {
        super(evxu.a);
    }

    public final void a(evzk evzkVar) {
        copyOnWrite();
        evxu evxuVar = (evxu) this.instance;
        evzn evznVar = (evzn) evzkVar.build();
        evxu evxuVar2 = evxu.a;
        evznVar.getClass();
        eygr eygrVar = evxuVar.k;
        if (!eygrVar.c()) {
            evxuVar.k = eyfy.mutableCopy(eygrVar);
        }
        evxuVar.k.add(evznVar);
    }

    public final void b(evxi evxiVar) {
        copyOnWrite();
        evxu evxuVar = (evxu) this.instance;
        evxu evxuVar2 = evxu.a;
        evxiVar.getClass();
        evxuVar.a();
        evxuVar.h.add(evxiVar);
    }
}
