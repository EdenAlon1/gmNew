package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckhq extends ckjy {
    public Optional a;
    public Optional b;
    public Optional c;
    public cpxu d;
    public int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private Optional i;
    private Optional j;
    private Optional k;
    private Optional l;
    private Optional m;
    private Optional n;
    private Optional o;
    private Optional p;
    private int q;
    private boolean r;
    private Optional s;
    private Optional t;
    private boolean u;
    private amer v;
    private byte w;

    public ckhq() {
        this.i = Optional.empty();
        this.a = Optional.empty();
        this.j = Optional.empty();
        this.k = Optional.empty();
        this.l = Optional.empty();
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.m = Optional.empty();
        this.n = Optional.empty();
        this.o = Optional.empty();
        this.p = Optional.empty();
        this.s = Optional.empty();
        this.t = Optional.empty();
    }

    @Override // defpackage.ckjy
    public final void A(Optional optional) {
        this.i = optional;
    }

    @Override // defpackage.ckjy
    public final void B(boolean z) {
        this.u = z;
        this.w = (byte) (this.w | 32);
    }

    @Override // defpackage.ckjy
    public final ckjy C() {
        this.e = 3;
        return this;
    }

    @Override // defpackage.ckjy
    public final ckjz a() {
        if (this.w == 63 && this.d != null && this.e != 0 && this.v != null) {
            return new ckhr(this.f, this.g, this.h, this.i, this.a, this.j, this.k, this.l, this.b, this.c, this.m, this.n, this.o, this.p, this.q, this.d, this.r, this.e, this.s, this.t, this.u, this.v);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.w & 1) == 0) {
            sb.append(" createConversationIfNotPresent");
        }
        if ((this.w & 2) == 0) {
            sb.append(" isBot");
        }
        if ((this.w & 4) == 0) {
            sb.append(" isRcsGroup");
        }
        if ((this.w & 8) == 0) {
            sb.append(" rcsGroupJoinState");
        }
        if (this.d == null) {
            sb.append(" knownThreadForConversationCreation");
        }
        if ((this.w & 16) == 0) {
            sb.append(" hasBeenRestoredFromTelephony");
        }
        if (this.e == 0) {
            sb.append(" restorationSource");
        }
        if ((this.w & 32) == 0) {
            sb.append(" shouldTriggerCreationListeners");
        }
        if (this.v == null) {
            sb.append(" conversationCreationSource");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ckjy
    public final Optional b() {
        return this.l;
    }

    @Override // defpackage.ckjy
    public final Optional c() {
        return this.n;
    }

    @Override // defpackage.ckjy
    public final Optional d() {
        return this.k;
    }

    @Override // defpackage.ckjy
    public final Optional e() {
        return this.j;
    }

    @Override // defpackage.ckjy
    public final Optional f() {
        return this.a;
    }

    @Override // defpackage.ckjy
    public final Optional g() {
        return this.c;
    }

    @Override // defpackage.ckjy
    public final Optional h() {
        return this.i;
    }

    @Override // defpackage.ckjy
    public final void i(amer amerVar) {
        if (amerVar == null) {
            throw new NullPointerException("Null conversationCreationSource");
        }
        this.v = amerVar;
    }

    @Override // defpackage.ckjy
    public final void j(boolean z) {
        this.f = z;
        this.w = (byte) (this.w | 1);
    }

    @Override // defpackage.ckjy
    public final void k(fayv fayvVar) {
        this.s = Optional.ofNullable(fayvVar);
    }

    @Override // defpackage.ckjy
    public final void l(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null defaultSelfParticipant");
        }
        this.m = optional;
    }

    @Override // defpackage.ckjy
    public final void m(azcr azcrVar) {
        this.t = Optional.of(azcrVar);
    }

    @Override // defpackage.ckjy
    public final void n(String str) {
        this.l = Optional.of(str);
    }

    @Override // defpackage.ckjy
    public final void o(boolean z) {
        this.r = z;
        this.w = (byte) (this.w | 16);
    }

    @Override // defpackage.ckjy
    public final void p(boolean z) {
        this.g = z;
        this.w = (byte) (this.w | 2);
    }

    @Override // defpackage.ckjy
    public final void q(boolean z) {
        this.h = z;
        this.w = (byte) (this.w | 4);
    }

    @Override // defpackage.ckjy
    public final void r(List list) {
        this.n = Optional.of(list);
    }

    @Override // defpackage.ckjy
    public final void s(String str) {
        this.k = Optional.of(str);
    }

    @Override // defpackage.ckjy
    public final void t(cknh cknhVar) {
        this.o = Optional.of(cknhVar);
    }

    @Override // defpackage.ckjy
    public final void u(String str) {
        this.j = Optional.of(str);
    }

    @Override // defpackage.ckjy
    public final void v(int i) {
        this.q = i;
        this.w = (byte) (this.w | 8);
    }

    @Override // defpackage.ckjy
    public final void w(epby epbyVar) {
        this.p = Optional.of(epbyVar);
    }

    @Override // defpackage.ckjy
    public final void x(Optional optional) {
        this.c = optional;
    }

    @Override // defpackage.ckjy
    public final void y(String str) {
        this.c = Optional.of(str);
    }

    @Override // defpackage.ckjy
    public final void z(long j) {
        this.i = Optional.of(Long.valueOf(j));
    }

    public ckhq(ckjz ckjzVar) {
        this.i = Optional.empty();
        this.a = Optional.empty();
        this.j = Optional.empty();
        this.k = Optional.empty();
        this.l = Optional.empty();
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.m = Optional.empty();
        this.n = Optional.empty();
        this.o = Optional.empty();
        this.p = Optional.empty();
        this.s = Optional.empty();
        this.t = Optional.empty();
        ckhr ckhrVar = (ckhr) ckjzVar;
        this.f = ckhrVar.a;
        this.g = ckhrVar.b;
        this.h = ckhrVar.c;
        this.i = ckhrVar.d;
        this.a = ckhrVar.e;
        this.j = ckhrVar.f;
        this.k = ckhrVar.g;
        this.l = ckhrVar.h;
        this.b = ckhrVar.i;
        this.c = ckhrVar.j;
        this.m = ckhrVar.k;
        this.n = ckhrVar.l;
        this.o = ckhrVar.m;
        this.p = ckhrVar.n;
        this.q = ckhrVar.o;
        this.d = ckhrVar.p;
        this.r = ckhrVar.q;
        this.e = ckhrVar.v;
        this.s = ckhrVar.r;
        this.t = ckhrVar.s;
        this.u = ckhrVar.t;
        this.v = ckhrVar.u;
        this.w = (byte) 63;
    }
}
