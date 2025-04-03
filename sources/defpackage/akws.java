package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akws extends cpdo {
    public final aliv a;
    public final alir b;
    private final errl c;

    public akws(aliv alivVar, alir alirVar, errl errlVar) {
        this.c = errlVar;
        this.a = alivVar;
        this.b = alirVar;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f("MessageStatusLoggerBackgroundStartupTask");
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        return elfo.f(new Runnable() { // from class: akwr
            @Override // java.lang.Runnable
            public final void run() {
                akws akwsVar = akws.this;
                akwsVar.a.e();
                akwsVar.b.d();
            }
        }, this.c);
    }

    @Override // defpackage.cpeh
    public final boolean c() {
        return true;
    }
}
