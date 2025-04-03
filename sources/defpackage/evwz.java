package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evwz extends eyfq implements eyht {
    public evwz() {
        super(evxa.a);
    }

    public final void a(evwr evwrVar) {
        copyOnWrite();
        evxa evxaVar = (evxa) this.instance;
        evwt evwtVar = (evwt) evwrVar.build();
        evxa evxaVar2 = evxa.a;
        evwtVar.getClass();
        eygr eygrVar = evxaVar.c;
        if (!eygrVar.c()) {
            evxaVar.c = eyfy.mutableCopy(eygrVar);
        }
        evxaVar.c.add(evwtVar);
    }
}
