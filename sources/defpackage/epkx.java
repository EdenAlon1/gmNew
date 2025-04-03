package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epkx extends eyfq implements eyht {
    public epkx() {
        super(eplc.a);
    }

    public final void a(epld epldVar) {
        copyOnWrite();
        eplc eplcVar = (eplc) this.instance;
        eplh eplhVar = (eplh) epldVar.build();
        eplc eplcVar2 = eplc.a;
        eplhVar.getClass();
        eygr eygrVar = eplcVar.f;
        if (!eygrVar.c()) {
            eplcVar.f = eyfy.mutableCopy(eygrVar);
        }
        eplcVar.f.add(eplhVar);
    }
}
