package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebgm extends llf {
    private static final Set i = fffi.d(ebfl.OUT_OF_STORAGE, ebfl.LOW_STORAGE_SEVERE);
    public final ebbc a;
    public final llh h;
    private final ebgl j;
    private final eayd k;
    private boolean l;
    private boolean m;
    private ebec n;

    public ebgm(ebga ebgaVar, ebbc ebbcVar) {
        super(false);
        this.a = ebbcVar;
        llh llhVar = new llh() { // from class: ebgj
            @Override // defpackage.llh
            public final void a(Object obj) {
                ((emxc) obj).getClass();
                final ebgm ebgmVar = ebgm.this;
                efbd.e(new Runnable() { // from class: ebgi
                    @Override // java.lang.Runnable
                    public final void run() {
                        ebgm ebgmVar2 = ebgm.this;
                        engw b = ebgmVar2.a.b();
                        b.getClass();
                        ebgmVar2.b(b);
                    }
                });
            }
        };
        this.h = llhVar;
        this.j = new ebgl(this);
        eayd eaydVar = (eayd) ((ebgd) ebgaVar).h.f();
        this.k = eaydVar;
        if (eaydVar != null) {
            p(eaydVar, llhVar);
        }
    }

    public final void b(engw engwVar) {
        eayd eaydVar = this.k;
        boolean z = eaydVar != null && eaydVar.c(engwVar);
        if (z != this.l) {
            efbd.c();
            this.l = z;
            m(Boolean.valueOf(z || this.m));
        }
    }

    public final void c() {
        this.n = null;
        boolean au = ffdx.au(i, null);
        if (au != this.m) {
            efbd.c();
            this.m = au;
            boolean z = true;
            if (!this.l && !au) {
                z = false;
            }
            m(Boolean.valueOf(z));
        }
    }

    @Override // defpackage.llf, defpackage.lld
    protected final void h() {
        efbd.c();
        super.h();
        this.a.c(this.j);
        this.a.a();
        c();
        engw b = this.a.b();
        b.getClass();
        b(b);
    }

    @Override // defpackage.llf, defpackage.lld
    protected final void i() {
        efbd.c();
        super.i();
        this.a.d(this.j);
        c();
        int i2 = engw.d;
        engw engwVar = enou.a;
        engwVar.getClass();
        b(engwVar);
    }
}
