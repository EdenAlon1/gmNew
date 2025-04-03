package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejwk extends ejwl {
    public ejwn a;
    public final ejlj b;

    public ejwk(ea eaVar, Executor executor) {
        ejlj ejljVar = new ejlj(executor, true, false);
        this.b = ejljVar;
        ejljVar.c();
        eaVar.P().c(new eleu(new ejwj(this, eaVar)));
    }

    @Override // defpackage.ejwl
    public final void a(final ejuh ejuhVar, final ejwd ejwdVar) {
        efbd.c();
        this.b.execute(new Runnable() { // from class: ejwg
            @Override // java.lang.Runnable
            public final void run() {
                ejwn ejwnVar = ejwk.this.a;
                ejuk ejukVar = new ejuk(ejwa.DONT_CARE);
                efbd.c();
                ejwnVar.b(ejuhVar, 2, ejwdVar, ejukVar);
            }
        });
    }

    @Override // defpackage.ejwl
    public final void b(final ejuh ejuhVar, final ejwd ejwdVar) {
        efbd.c();
        emxf.m(!(ejwdVar instanceof ejud), "Callbacks that implement BackgroundCallbacks must be registered with subscribeWithBackground().");
        this.b.execute(new Runnable() { // from class: ejwi
            @Override // java.lang.Runnable
            public final void run() {
                ejwk.this.a.a(ejuhVar, new ejul(), ejwdVar);
            }
        });
    }

    @Override // defpackage.ejwl
    public final void c(final ejuh ejuhVar, final ejwa ejwaVar, final ejwd ejwdVar) {
        efbd.c();
        emxf.m(!(ejwdVar instanceof ejud), "Callbacks that implement BackgroundCallbacks must be registered with subscribeWithBackground().");
        this.b.execute(new Runnable() { // from class: ejwh
            @Override // java.lang.Runnable
            public final void run() {
                ejwk.this.a.a(ejuhVar, new ejuk(ejwaVar), ejwdVar);
            }
        });
    }
}
