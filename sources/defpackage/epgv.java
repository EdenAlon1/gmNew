package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epgv extends eyfq implements eyht {
    public epgv() {
        super(ephe.a);
    }

    public final void a(epha ephaVar) {
        copyOnWrite();
        ephe epheVar = (ephe) this.instance;
        ephe epheVar2 = ephe.a;
        ephaVar.getClass();
        eygi eygiVar = epheVar.f;
        if (!eygiVar.c()) {
            epheVar.f = eyfy.mutableCopy(eygiVar);
        }
        epheVar.f.h(ephaVar.e);
    }

    public final void b(epha ephaVar) {
        copyOnWrite();
        ephe epheVar = (ephe) this.instance;
        ephe epheVar2 = ephe.a;
        ephaVar.getClass();
        eygi eygiVar = epheVar.e;
        if (!eygiVar.c()) {
            epheVar.e = eyfy.mutableCopy(eygiVar);
        }
        epheVar.e.h(ephaVar.e);
    }
}
