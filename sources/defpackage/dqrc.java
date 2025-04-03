package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqrc {
    public final errm a;
    public final errm b;
    public final errm c;
    public final errm d;
    private final dqrd e;
    private final dqkk f;

    public dqrc(errm errmVar, errm errmVar2, errm errmVar3, errm errmVar4, dqrd dqrdVar, dqkk dqkkVar) {
        errmVar.getClass();
        errmVar2.getClass();
        errmVar3.getClass();
        errmVar4.getClass();
        dqrdVar.getClass();
        dqkkVar.getClass();
        this.a = errmVar;
        this.b = errmVar2;
        this.c = errmVar3;
        this.d = errmVar4;
        this.e = dqrdVar;
        this.f = dqkkVar;
    }

    public final void a() {
        if (this.e.a.compareAndSet(false, true)) {
            this.f.e("GboardDataInitializer#init", new ffix() { // from class: dqrb
                @Override // defpackage.ffix
                public final Object invoke() {
                    dunl dunlVar;
                    dqrc dqrcVar = dqrc.this;
                    errm errmVar = dqrcVar.a;
                    errm errmVar2 = dqrcVar.b;
                    errm errmVar3 = dqrcVar.c;
                    errm errmVar4 = dqrcVar.d;
                    dunl dunlVar2 = dunl.b;
                    if (dunlVar2 != null) {
                        return dunlVar2;
                    }
                    synchronized (dunl.class) {
                        dunlVar = dunl.b;
                        if (dunlVar == null) {
                            dunlVar = new dunl(errmVar, errmVar2, errmVar3, errmVar4);
                            dunl.b = dunlVar;
                        }
                    }
                    return dunlVar;
                }
            });
        }
    }
}
