package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bczk extends bdgd {
    public final cpxu a;
    public final byyt b;
    public final Optional c;
    public final Optional d;
    public final engw e;
    public final boolean f;
    public final boolean g;
    public final Optional h;
    public final int i;
    public final Optional j;
    public final long k;
    public final Optional l;
    public final boolean m;
    public final boolean n;
    public final Optional o;
    public final Optional p;
    public final Optional q;
    public final Optional r;
    public final Optional s;
    public final boolean t;
    public final amer u;
    public final int v;

    public bczk(cpxu cpxuVar, byyt byytVar, Optional optional, Optional optional2, engw engwVar, boolean z, boolean z2, Optional optional3, int i, Optional optional4, long j, Optional optional5, boolean z3, int i2, boolean z4, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10, boolean z5, amer amerVar) {
        this.a = cpxuVar;
        this.b = byytVar;
        this.c = optional;
        this.d = optional2;
        this.e = engwVar;
        this.f = z;
        this.g = z2;
        this.h = optional3;
        this.i = i;
        this.j = optional4;
        this.k = j;
        this.l = optional5;
        this.m = z3;
        this.v = i2;
        this.n = z4;
        this.o = optional6;
        this.p = optional7;
        this.q = optional8;
        this.r = optional9;
        this.s = optional10;
        this.t = z5;
        this.u = amerVar;
    }

    @Override // defpackage.bdgd
    public final int a() {
        return this.i;
    }

    @Override // defpackage.bdgd
    public final long b() {
        return this.k;
    }

    @Override // defpackage.bdgd
    public final amer c() {
        return this.u;
    }

    @Override // defpackage.bdgd
    public final bdgc d() {
        return new bczj(this);
    }

    @Override // defpackage.bdgd
    public final byyt e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdgd) {
            bdgd bdgdVar = (bdgd) obj;
            if (this.a.equals(bdgdVar.f()) && this.b.equals(bdgdVar.e()) && this.c.equals(bdgdVar.p()) && this.d.equals(bdgdVar.i()) && enkr.h(this.e, bdgdVar.g()) && this.f == bdgdVar.t() && this.g == bdgdVar.u() && this.h.equals(bdgdVar.q())) {
                bdgdVar.x();
                if (this.i == bdgdVar.a() && this.j.equals(bdgdVar.k()) && this.k == bdgdVar.b() && this.l.equals(bdgdVar.h()) && this.m == bdgdVar.r()) {
                    int i = this.v;
                    int w = bdgdVar.w();
                    if (i == 0) {
                        throw null;
                    }
                    if (i == w && this.n == bdgdVar.s() && this.o.equals(bdgdVar.n()) && this.p.equals(bdgdVar.l()) && this.q.equals(bdgdVar.o()) && this.r.equals(bdgdVar.m()) && this.s.equals(bdgdVar.j()) && this.t == bdgdVar.v() && this.u.equals(bdgdVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.bdgd
    public final cpxu f() {
        return this.a;
    }

    @Override // defpackage.bdgd
    public final engw g() {
        return this.e;
    }

    @Override // defpackage.bdgd
    public final Optional h() {
        return this.l;
    }

    public final int hashCode() {
        int hashCode = (((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ this.h.hashCode()) * (-721379959)) ^ this.i) * 1000003) ^ this.j.hashCode()) * 1000003;
        long j = this.k;
        int hashCode2 = ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.l.hashCode();
        int i = this.v;
        axug.b(i);
        return (((((((((((((((((((hashCode2 * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ i) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ (true == this.t ? 1231 : 1237)) * 1000003) ^ this.u.hashCode();
    }

    @Override // defpackage.bdgd
    public final Optional i() {
        return this.d;
    }

    @Override // defpackage.bdgd
    public final Optional j() {
        return this.s;
    }

    @Override // defpackage.bdgd
    public final Optional k() {
        return this.j;
    }

    @Override // defpackage.bdgd
    public final Optional l() {
        return this.p;
    }

    @Override // defpackage.bdgd
    public final Optional m() {
        return this.r;
    }

    @Override // defpackage.bdgd
    public final Optional n() {
        return this.o;
    }

    @Override // defpackage.bdgd
    public final Optional o() {
        return this.q;
    }

    @Override // defpackage.bdgd
    public final Optional p() {
        return this.c;
    }

    @Override // defpackage.bdgd
    public final Optional q() {
        return this.h;
    }

    @Override // defpackage.bdgd
    public final boolean r() {
        return this.m;
    }

    @Override // defpackage.bdgd
    public final boolean s() {
        return this.n;
    }

    @Override // defpackage.bdgd
    public final boolean t() {
        return this.f;
    }

    public final String toString() {
        amer amerVar = this.u;
        Optional optional = this.s;
        Optional optional2 = this.r;
        Optional optional3 = this.q;
        Optional optional4 = this.p;
        Optional optional5 = this.o;
        Optional optional6 = this.l;
        Optional optional7 = this.j;
        Optional optional8 = this.h;
        engw engwVar = this.e;
        Optional optional9 = this.d;
        Optional optional10 = this.c;
        byyt byytVar = this.b;
        return "GetOrCreateConversationParameters{threadId=" + String.valueOf(this.a) + ", archiveStatus=" + String.valueOf(byytVar) + ", selfId=" + String.valueOf(optional10) + ", defaultSelfParticipant=" + String.valueOf(optional9) + ", participants=" + String.valueOf(engwVar) + ", notificationEnabled=" + this.f + ", notificationVibration=" + this.g + ", soundUri=" + String.valueOf(optional8) + ", sourceType=0, joinState=" + this.i + ", participantIdList=" + String.valueOf(optional7) + ", rcsSessionId=" + this.k + ", conversationName=" + String.valueOf(optional6) + ", hasBeenRestoredFromTelephony=" + this.m + ", restorationSource=" + axug.a(this.v) + ", isRcsGroup=" + this.n + ", rcsGroupId=" + String.valueOf(optional5) + ", rcsConferenceUri=" + String.valueOf(optional4) + ", rcsGroupSelfMsisdn=" + String.valueOf(optional3) + ", rcsGroupCapabilities=" + String.valueOf(optional2) + ", destinationToken=" + String.valueOf(optional) + ", shouldTriggerCreationListeners=" + this.t + ", conversationCreationSource=" + String.valueOf(amerVar) + "}";
    }

    @Override // defpackage.bdgd
    public final boolean u() {
        return this.g;
    }

    @Override // defpackage.bdgd
    @Deprecated
    public final boolean v() {
        return this.t;
    }

    @Override // defpackage.bdgd
    public final int w() {
        return this.v;
    }

    @Override // defpackage.bdgd
    public final void x() {
    }
}
