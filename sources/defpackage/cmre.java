package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmre extends eyfq implements eyht {
    public cmre() {
        super(cmrf.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final cmro a(int i) {
        return (cmro) ((cmrf) this.instance).b.get(i);
    }

    public final void b(cmro cmroVar) {
        copyOnWrite();
        cmrf cmrfVar = (cmrf) this.instance;
        cmrf cmrfVar2 = cmrf.a;
        cmroVar.getClass();
        cmrfVar.a();
        cmrfVar.b.add(cmroVar);
    }

    public final void c(int i) {
        copyOnWrite();
        cmrf cmrfVar = (cmrf) this.instance;
        cmrf cmrfVar2 = cmrf.a;
        cmrfVar.a();
        cmrfVar.b.remove(i);
    }

    public final void d(int i, cmrn cmrnVar) {
        copyOnWrite();
        cmrf cmrfVar = (cmrf) this.instance;
        cmro cmroVar = (cmro) cmrnVar.build();
        cmrf cmrfVar2 = cmrf.a;
        cmroVar.getClass();
        cmrfVar.a();
        cmrfVar.b.set(i, cmroVar);
    }
}
