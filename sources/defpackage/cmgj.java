package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmgj extends eyfq implements eyht {
    public cmgj() {
        super(cmgn.a);
    }

    public final void a(String str, diuo diuoVar) {
        copyOnWrite();
        cmgn cmgnVar = (cmgn) this.instance;
        cmgn cmgnVar2 = cmgn.a;
        eyhm eyhmVar = cmgnVar.b;
        if (!eyhmVar.b) {
            cmgnVar.b = eyhmVar.a();
        }
        cmgnVar.b.put(str, diuoVar);
    }

    public final void b(String str, boolean z) {
        copyOnWrite();
        cmgn cmgnVar = (cmgn) this.instance;
        cmgn cmgnVar2 = cmgn.a;
        eyhm eyhmVar = cmgnVar.c;
        if (!eyhmVar.b) {
            cmgnVar.c = eyhmVar.a();
        }
        cmgnVar.c.put(str, Boolean.valueOf(z));
    }
}
