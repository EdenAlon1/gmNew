package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evzo extends eyfq implements eyht {
    public evzo() {
        super(evzr.a);
    }

    public final void a(evzk evzkVar) {
        copyOnWrite();
        evzr evzrVar = (evzr) this.instance;
        evzn evznVar = (evzn) evzkVar.build();
        evzr evzrVar2 = evzr.a;
        evznVar.getClass();
        eygr eygrVar = evzrVar.m;
        if (!eygrVar.c()) {
            evzrVar.m = eyfy.mutableCopy(eygrVar);
        }
        evzrVar.m.add(evznVar);
    }

    public final void b(evzk evzkVar) {
        copyOnWrite();
        evzr evzrVar = (evzr) this.instance;
        evzn evznVar = (evzn) evzkVar.build();
        evzr evzrVar2 = evzr.a;
        evznVar.getClass();
        eygr eygrVar = evzrVar.l;
        if (!eygrVar.c()) {
            evzrVar.l = eyfy.mutableCopy(eygrVar);
        }
        evzrVar.l.add(evznVar);
    }
}
