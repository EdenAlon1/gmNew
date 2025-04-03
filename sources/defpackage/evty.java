package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evty extends eyfq implements eyht {
    public evty() {
        super(evtz.a);
    }

    public final void a(evtw evtwVar) {
        copyOnWrite();
        evtz evtzVar = (evtz) this.instance;
        evtx evtxVar = (evtx) evtwVar.build();
        evtz evtzVar2 = evtz.a;
        evtxVar.getClass();
        eygr eygrVar = evtzVar.c;
        if (!eygrVar.c()) {
            evtzVar.c = eyfy.mutableCopy(eygrVar);
        }
        evtzVar.c.add(evtxVar);
    }
}
