package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bczj extends bdgc {
    public Optional a;
    public Optional b;
    public Optional c;
    private cpxu d;
    private byyt e;
    private Optional f;
    private Optional g;
    private engw h;
    private boolean i;
    private boolean j;
    private int k;
    private Optional l;
    private long m;
    private boolean n;
    private boolean o;
    private Optional p;
    private Optional q;
    private Optional r;
    private Optional s;
    private boolean t;
    private amer u;
    private byte v;
    private int w;

    public bczj() {
        this.f = Optional.empty();
        this.g = Optional.empty();
        this.a = Optional.empty();
        this.l = Optional.empty();
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.p = Optional.empty();
        this.q = Optional.empty();
        this.r = Optional.empty();
        this.s = Optional.empty();
    }

    @Override // defpackage.bdgc
    public final bdgd a() {
        if (this.v == -1 && this.d != null && this.e != null && this.h != null && this.w != 0 && this.u != null) {
            return new bczk(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.a, this.k, this.l, this.m, this.b, this.n, this.w, this.o, this.c, this.p, this.q, this.r, this.s, this.t, this.u);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" threadId");
        }
        if (this.e == null) {
            sb.append(" archiveStatus");
        }
        if (this.h == null) {
            sb.append(" participants");
        }
        if ((this.v & 1) == 0) {
            sb.append(" notificationEnabled");
        }
        if ((this.v & 2) == 0) {
            sb.append(" notificationVibration");
        }
        if ((this.v & 4) == 0) {
            sb.append(" sourceType");
        }
        if ((this.v & 8) == 0) {
            sb.append(" joinState");
        }
        if ((this.v & 16) == 0) {
            sb.append(" rcsSessionId");
        }
        if ((this.v & 32) == 0) {
            sb.append(" hasBeenRestoredFromTelephony");
        }
        if (this.w == 0) {
            sb.append(" restorationSource");
        }
        if ((this.v & 64) == 0) {
            sb.append(" isRcsGroup");
        }
        if ((this.v & 128) == 0) {
            sb.append(" shouldTriggerCreationListeners");
        }
        if (this.u == null) {
            sb.append(" conversationCreationSource");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.bdgc
    public final Optional b() {
        return this.r;
    }

    @Override // defpackage.bdgc
    public final Optional c() {
        return this.c;
    }

    @Override // defpackage.bdgc
    public final Optional d() {
        return this.q;
    }

    @Override // defpackage.bdgc
    public final boolean e() {
        if ((this.v & 64) != 0) {
            return this.o;
        }
        throw new IllegalStateException("Property \"isRcsGroup\" has not been set");
    }

    @Override // defpackage.bdgc
    public final void f(byyt byytVar) {
        if (byytVar == null) {
            throw new NullPointerException("Null archiveStatus");
        }
        this.e = byytVar;
    }

    @Override // defpackage.bdgc
    public final void g(amer amerVar) {
        if (amerVar == null) {
            throw new NullPointerException("Null conversationCreationSource");
        }
        this.u = amerVar;
    }

    @Override // defpackage.bdgc
    public final void h(String str) {
        this.b = Optional.of(str);
    }

    @Override // defpackage.bdgc
    public final void i(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null defaultSelfParticipant");
        }
        this.g = optional;
    }

    @Override // defpackage.bdgc
    public final void j(azcr azcrVar) {
        this.s = Optional.of(azcrVar);
    }

    @Override // defpackage.bdgc
    public final void k(boolean z) {
        this.n = z;
        this.v = (byte) (this.v | 32);
    }

    @Override // defpackage.bdgc
    public final void l(boolean z) {
        this.o = z;
        this.v = (byte) (this.v | 64);
    }

    @Override // defpackage.bdgc
    public final void m(int i) {
        this.k = i;
        this.v = (byte) (this.v | 8);
    }

    @Override // defpackage.bdgc
    public final void n(boolean z) {
        this.i = z;
        this.v = (byte) (this.v | 1);
    }

    @Override // defpackage.bdgc
    public final void o(boolean z) {
        this.j = z;
        this.v = (byte) (this.v | 2);
    }

    @Override // defpackage.bdgc
    public final void p(List list) {
        this.h = engw.n(list);
    }

    @Override // defpackage.bdgc
    public final void q(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null rcsConferenceUri");
        }
        this.p = optional;
    }

    @Override // defpackage.bdgc
    public final void r(String str) {
        this.p = Optional.of(str);
    }

    @Override // defpackage.bdgc
    public final void s(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null rcsGroupId");
        }
        this.c = optional;
    }

    @Override // defpackage.bdgc
    public final void t(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null rcsGroupSelfMsisdn");
        }
        this.q = optional;
    }

    @Override // defpackage.bdgc
    public final void u(long j) {
        this.m = j;
        this.v = (byte) (this.v | 16);
    }

    @Override // defpackage.bdgc
    public final void v(int i) {
        if (i == 0) {
            throw new NullPointerException("Null restorationSource");
        }
        this.w = i;
    }

    @Override // defpackage.bdgc
    public final void w(SelfIdentityId selfIdentityId) {
        this.f = Optional.of(selfIdentityId);
    }

    @Override // defpackage.bdgc
    public final void x(boolean z) {
        this.t = z;
        this.v = (byte) (this.v | Byte.MIN_VALUE);
    }

    @Override // defpackage.bdgc
    public final void y() {
        this.v = (byte) (this.v | 4);
    }

    @Override // defpackage.bdgc
    public final void z(cpxu cpxuVar) {
        if (cpxuVar == null) {
            throw new NullPointerException("Null threadId");
        }
        this.d = cpxuVar;
    }

    public bczj(bdgd bdgdVar) {
        this.f = Optional.empty();
        this.g = Optional.empty();
        this.a = Optional.empty();
        this.l = Optional.empty();
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.p = Optional.empty();
        this.q = Optional.empty();
        this.r = Optional.empty();
        this.s = Optional.empty();
        bczk bczkVar = (bczk) bdgdVar;
        this.d = bczkVar.a;
        this.e = bczkVar.b;
        this.f = bczkVar.c;
        this.g = bczkVar.d;
        this.h = bczkVar.e;
        this.i = bczkVar.f;
        this.j = bczkVar.g;
        this.a = bczkVar.h;
        this.k = bczkVar.i;
        this.l = bczkVar.j;
        this.m = bczkVar.k;
        this.b = bczkVar.l;
        this.n = bczkVar.m;
        this.w = bczkVar.v;
        this.o = bczkVar.n;
        this.c = bczkVar.o;
        this.p = bczkVar.p;
        this.q = bczkVar.q;
        this.r = bczkVar.r;
        this.s = bczkVar.s;
        this.t = bczkVar.t;
        this.u = bczkVar.u;
        this.v = (byte) -1;
    }
}
