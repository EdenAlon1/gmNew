package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evxh extends eyfq implements eyht {
    public evxh() {
        super(evxi.a);
    }

    public final void a(evzk evzkVar) {
        copyOnWrite();
        evxi evxiVar = (evxi) this.instance;
        evzn evznVar = (evzn) evzkVar.build();
        evxi evxiVar2 = evxi.a;
        evznVar.getClass();
        eygr eygrVar = evxiVar.i;
        if (!eygrVar.c()) {
            evxiVar.i = eyfy.mutableCopy(eygrVar);
        }
        evxiVar.i.add(evznVar);
    }
}
