package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abao implements abam {
    public final ffbr a;
    public final ffbr b;
    public final AtomicReference c;
    private final eisx d;
    private final ecrj e;
    private final ecnx f;
    private final cpdr g;
    private final aleq h;
    private final cpev i;
    private final alse j;
    private final Optional k;
    private final ffbr l;
    private final ffsk m;
    private final ffbr n;
    private final ffbr o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private final AtomicInteger u;
    private aler v;
    private alha w;

    public abao(eisx eisxVar, ecrj ecrjVar, ecnx ecnxVar, cpdr cpdrVar, aleq aleqVar, cpev cpevVar, alse alseVar, Optional optional, ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar, ffbr ffbrVar3, AtomicReference atomicReference, ffbr ffbrVar4, ffbr ffbrVar5) {
        eisxVar.getClass();
        ecrjVar.getClass();
        ecnxVar.getClass();
        cpdrVar.getClass();
        aleqVar.getClass();
        cpevVar.getClass();
        alseVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        ffbrVar3.getClass();
        atomicReference.getClass();
        ffbrVar5.getClass();
        this.d = eisxVar;
        this.e = ecrjVar;
        this.f = ecnxVar;
        this.g = cpdrVar;
        this.h = aleqVar;
        this.i = cpevVar;
        this.j = alseVar;
        this.k = optional;
        this.l = ffbrVar;
        this.a = ffbrVar2;
        this.m = ffskVar;
        this.b = ffbrVar3;
        this.c = atomicReference;
        this.n = ffbrVar4;
        this.o = ffbrVar5;
        this.u = new AtomicInteger();
    }

    private final void k(Context context) {
        if (!this.t && this.p && this.q && this.r) {
            this.t = true;
            ekzz f = eleg.f("ConversationStartupTracker#onReady");
            try {
                ecqk.a.b(ddxb.a(context));
                if (((asyf) this.o.b()).a()) {
                    j(((alry) this.b.b()).b(((axkm) this.a.b()).D()));
                } else if (((fglt) this.c.get()).equals(fglt.UNKNOWN_CLOUD_SYNC_STATUS)) {
                    axol.c(this.m, ffhe.a, ffsm.a, new aban(this, null));
                } else {
                    fgmh b = ((alry) this.b.b()).b((fglt) this.c.get());
                    b.getClass();
                    j(b);
                }
                ffig.a(f, null);
                aler alerVar = this.v;
                if (alerVar != null) {
                    alerVar.c();
                }
                alha alhaVar = this.w;
                if (alhaVar != null) {
                    alhaVar.a();
                }
                axnw.h(this.g.a(this.d));
                ((zer) this.n.b()).a(true);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ffig.a(f, th);
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.abam
    public final void a(boolean z) {
        this.j.e(z ? abal.g : abal.f, this.u.get(), null, ecrh.CANCEL);
    }

    @Override // defpackage.abam
    public final void b() {
        if (this.s) {
            return;
        }
        ekzz f = eleg.f("ConversationStartupTracker#onComposeRowDraftLoaded");
        try {
            this.s = true;
            this.j.d(abal.d, this.u.get(), null);
            ffig.a(f, null);
        } finally {
        }
    }

    @Override // defpackage.abam
    public final void c(Context context) {
        efbd.c();
        if (this.r) {
            return;
        }
        ekzz f = eleg.f("ConversationStartupTracker#onComposeRowInteractive");
        try {
            this.r = true;
            this.j.d(abal.c, this.u.get(), null);
            k(context);
            ffig.a(f, null);
        } finally {
        }
    }

    @Override // defpackage.abam
    public final void d() {
        aler b;
        alha alhaVar;
        ekzz f = eleg.f("ConversationStartupTracker#onFragmentCreation");
        try {
            efbd.c();
            this.p = false;
            this.q = false;
            this.r = false;
            this.s = false;
            this.t = false;
            this.v = null;
            ((zer) this.n.b()).a(false);
            int incrementAndGet = this.u.incrementAndGet();
            this.j.a(alrv.u, incrementAndGet);
            this.j.a(abal.a, incrementAndGet);
            this.j.a(abal.b, incrementAndGet);
            this.j.a(abal.c, incrementAndGet);
            this.j.a(abal.d, incrementAndGet);
            this.j.a(abal.e, incrementAndGet);
            this.j.a(abal.f, incrementAndGet);
            this.j.a(abal.g, incrementAndGet);
            b = this.h.b(176569, null);
            this.v = b;
            algz algzVar = (algz) fflm.b(this.k);
            if (algzVar != null) {
                Object b2 = this.l.b();
                b2.getClass();
                alhaVar = algzVar.a(((Number) b2).longValue());
            } else {
                alhaVar = null;
            }
            this.w = alhaVar;
            this.i.c();
            ffig.a(f, null);
        } finally {
        }
    }

    @Override // defpackage.abam
    public final void e(Context context) {
        efbd.c();
        if (this.q) {
            return;
        }
        ekzz f = eleg.f("ConversationStartupTracker#onMessageListInteractive");
        try {
            this.q = true;
            this.j.d(abal.b, this.u.get(), null);
            k(context);
            ffig.a(f, null);
        } finally {
        }
    }

    @Override // defpackage.abam
    public final void f() {
        aler alerVar = this.v;
        if (alerVar != null) {
            alerVar.a();
        }
        alha alhaVar = this.w;
        if (alhaVar != null) {
            alhaVar.a();
        }
    }

    @Override // defpackage.abam
    public final void g() {
        this.j.d(abal.e, this.u.get(), null);
    }

    @Override // defpackage.abam
    public final void h(boolean z) {
        this.j.d(z ? abal.g : abal.f, this.u.get(), null);
    }

    @Override // defpackage.abam
    public final void i(Context context) {
        efbd.c();
        if (this.p) {
            return;
        }
        ekzz f = eleg.f("ConversationStartupTracker#onTopAppBarInteractive");
        try {
            this.p = true;
            this.j.d(abal.a, this.u.get(), null);
            k(context);
            ffig.a(f, null);
        } finally {
        }
    }

    public final void j(fgmh fgmhVar) {
        this.j.d(alrv.r, 0, fgmhVar);
        this.j.d(alrv.u, this.u.get(), fgmhVar);
        this.j.d(alrv.t, this.u.get(), fgmhVar);
        this.j.d(alrv.s, this.u.get(), fgmhVar);
        this.e.g(csra.n, null, null, ecrh.SUCCESS);
        this.e.g(csra.m, null, null, ecrh.SUCCESS);
        this.j.d(alrz.a, 0, fgmhVar);
        this.f.e(new ecda("Conversation data loaded"), fgmhVar);
    }
}
