package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nsf implements npd {
    final /* synthetic */ nsi a;
    private final long b;
    private final lqc c;
    private final lqc d;
    private boolean e;

    public nsf(nsi nsiVar, long j) {
        this.a = nsiVar;
        this.b = j;
        lqb lqbVar = new lqb();
        lqbVar.c("audio/raw");
        this.c = new lqc(lqbVar);
        lqb lqbVar2 = new lqb();
        lqbVar2.c("audio/raw");
        lqbVar2.D = 44100;
        lqbVar2.C = 2;
        lqbVar2.E = 2;
        this.d = new lqc(lqbVar2);
    }

    public final void a() {
        try {
            if (this.e) {
                return;
            }
            nsh i = this.a.i(this.d);
            if (i == null) {
                lua luaVar = this.a.d;
                ((lva) luaVar).b.postDelayed(new Runnable() { // from class: nse
                    @Override // java.lang.Runnable
                    public final void run() {
                        nsf.this.a();
                    }
                }, 10L);
            } else {
                this.e = true;
                i.c.g.decrementAndGet();
                if (i.c.k()) {
                    return;
                }
                i.d();
            }
        } catch (RuntimeException e) {
            this.a.b(new nrd("Asset loader error", e, 1000));
        } catch (nrd e2) {
            this.a.b(e2);
        }
    }

    @Override // defpackage.npd
    public final int e(nrz nrzVar) {
        nrzVar.a = true != this.e ? 0 : 99;
        return 2;
    }

    @Override // defpackage.npd
    public final enhk f() {
        return enoz.a;
    }

    @Override // defpackage.npd
    public final void h() {
        this.a.a(this.b);
        this.a.c(1);
        this.a.d(this.c, 2);
        a();
    }

    @Override // defpackage.npd
    public final void g() {
    }
}
