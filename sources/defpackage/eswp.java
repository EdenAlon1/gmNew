package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eswp extends eyfq implements eyht {
    public eswp() {
        super(eswr.a);
    }

    public final void a(String str, eyee eyeeVar) {
        copyOnWrite();
        eswr eswrVar = (eswr) this.instance;
        eswr eswrVar2 = eswr.a;
        eyhm eyhmVar = eswrVar.g;
        if (!eyhmVar.b) {
            eswrVar.g = eyhmVar.a();
        }
        eswrVar.g.put(str, eyeeVar);
    }
}
