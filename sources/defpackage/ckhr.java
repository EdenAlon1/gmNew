package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckhr extends ckjz {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Optional h;
    public final Optional i;
    public final Optional j;
    public final Optional k;
    public final Optional l;
    public final Optional m;
    public final Optional n;
    public final int o;
    public final cpxu p;
    public final boolean q;
    public final Optional r;
    public final Optional s;
    public final boolean t;
    public final amer u;
    public final int v;

    public ckhr(boolean z, boolean z2, boolean z3, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10, Optional optional11, int i, cpxu cpxuVar, boolean z4, int i2, Optional optional12, Optional optional13, boolean z5, amer amerVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = optional;
        this.e = optional2;
        this.f = optional3;
        this.g = optional4;
        this.h = optional5;
        this.i = optional6;
        this.j = optional7;
        this.k = optional8;
        this.l = optional9;
        this.m = optional10;
        this.n = optional11;
        this.o = i;
        this.p = cpxuVar;
        this.q = z4;
        this.v = i2;
        this.r = optional12;
        this.s = optional13;
        this.t = z5;
        this.u = amerVar;
    }

    @Override // defpackage.ckjz
    public final int a() {
        return this.o;
    }

    @Override // defpackage.ckjz
    public final amer b() {
        return this.u;
    }

    @Override // defpackage.ckjz
    public final cpxu c() {
        return this.p;
    }

    @Override // defpackage.ckjz
    public final Optional d() {
        return this.r;
    }

    @Override // defpackage.ckjz
    public final Optional e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckjz) {
            ckjz ckjzVar = (ckjz) obj;
            if (this.a == ckjzVar.q() && this.b == ckjzVar.s() && this.c == ckjzVar.t() && this.d.equals(ckjzVar.p()) && this.e.equals(ckjzVar.m()) && this.f.equals(ckjzVar.l()) && this.g.equals(ckjzVar.i()) && this.h.equals(ckjzVar.g()) && this.i.equals(ckjzVar.k()) && this.j.equals(ckjzVar.o()) && this.k.equals(ckjzVar.e()) && this.l.equals(ckjzVar.h()) && this.m.equals(ckjzVar.j()) && this.n.equals(ckjzVar.n()) && this.o == ckjzVar.a() && this.p.equals(ckjzVar.c()) && this.q == ckjzVar.r()) {
                int i = this.v;
                int v = ckjzVar.v();
                if (i == 0) {
                    throw null;
                }
                if (i == v && this.r.equals(ckjzVar.d()) && this.s.equals(ckjzVar.f()) && this.t == ckjzVar.u() && this.u.equals(ckjzVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ckjz
    public final Optional f() {
        return this.s;
    }

    @Override // defpackage.ckjz
    public final Optional g() {
        return this.h;
    }

    @Override // defpackage.ckjz
    public final Optional h() {
        return this.l;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        int hashCode = ((((((((((((((((((((((((((((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o) * 1000003) ^ this.p.hashCode();
        int i2 = this.v;
        axug.b(i2);
        return (((((((((((hashCode * 1000003) ^ (true != this.q ? 1237 : 1231)) * 1000003) ^ i2) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ (true == this.t ? 1231 : 1237)) * 1000003) ^ this.u.hashCode();
    }

    @Override // defpackage.ckjz
    public final Optional i() {
        return this.g;
    }

    @Override // defpackage.ckjz
    public final Optional j() {
        return this.m;
    }

    @Override // defpackage.ckjz
    public final Optional k() {
        return this.i;
    }

    @Override // defpackage.ckjz
    public final Optional l() {
        return this.f;
    }

    @Override // defpackage.ckjz
    public final Optional m() {
        return this.e;
    }

    @Override // defpackage.ckjz
    public final Optional n() {
        return this.n;
    }

    @Override // defpackage.ckjz
    public final Optional o() {
        return this.j;
    }

    @Override // defpackage.ckjz
    public final Optional p() {
        return this.d;
    }

    @Override // defpackage.ckjz
    public final boolean q() {
        return this.a;
    }

    @Override // defpackage.ckjz
    public final boolean r() {
        return this.q;
    }

    @Override // defpackage.ckjz
    public final boolean s() {
        return this.b;
    }

    @Override // defpackage.ckjz
    public final boolean t() {
        return this.c;
    }

    public final String toString() {
        amer amerVar = this.u;
        Optional optional = this.s;
        Optional optional2 = this.r;
        cpxu cpxuVar = this.p;
        Optional optional3 = this.n;
        Optional optional4 = this.m;
        Optional optional5 = this.l;
        Optional optional6 = this.k;
        Optional optional7 = this.j;
        Optional optional8 = this.i;
        Optional optional9 = this.h;
        Optional optional10 = this.g;
        Optional optional11 = this.f;
        Optional optional12 = this.e;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(optional12);
        String valueOf3 = String.valueOf(optional11);
        String valueOf4 = String.valueOf(optional10);
        String valueOf5 = String.valueOf(optional9);
        String valueOf6 = String.valueOf(optional8);
        String valueOf7 = String.valueOf(optional7);
        String valueOf8 = String.valueOf(optional6);
        String valueOf9 = String.valueOf(optional5);
        String valueOf10 = String.valueOf(optional4);
        String valueOf11 = String.valueOf(optional3);
        String valueOf12 = String.valueOf(cpxuVar);
        String valueOf13 = String.valueOf(optional2);
        String valueOf14 = String.valueOf(optional);
        String valueOf15 = String.valueOf(amerVar);
        StringBuilder sb = new StringBuilder("RcsConversationAndThreadIdQueryParameters{createConversationIfNotPresent=");
        sb.append(this.a);
        sb.append(", isBot=");
        sb.append(this.b);
        sb.append(", isRcsGroup=");
        sb.append(this.c);
        sb.append(", rcsSessionId=");
        sb.append(valueOf);
        sb.append(", rcsGroupInfo=");
        sb.append(valueOf2);
        sb.append(", rcsGroupId=");
        sb.append(valueOf3);
        sb.append(", rcsConferenceUri=");
        sb.append(valueOf4);
        sb.append(", groupName=");
        sb.append(valueOf5);
        sb.append(", rcsGroupIconUrl=");
        sb.append(valueOf6);
        sb.append(", rcsGroupSelfMsisdn=");
        sb.append(valueOf7);
        sb.append(", defaultSelfParticipant=");
        sb.append(valueOf8);
        sb.append(", participants=");
        sb.append(valueOf9);
        sb.append(", rcsGroupCapabilities=");
        sb.append(valueOf10);
        sb.append(", rcsGroupResolutionTriggerSource=");
        sb.append(valueOf11);
        sb.append(", rcsGroupJoinState=");
        sb.append(this.o);
        sb.append(", knownThreadForConversationCreation=");
        sb.append(valueOf12);
        sb.append(", hasBeenRestoredFromTelephony=");
        sb.append(this.q);
        sb.append(", restorationSource=");
        sb.append(axug.a(this.v));
        sb.append(", customHeaders=");
        sb.append(valueOf13);
        sb.append(", destinationToken=");
        sb.append(valueOf14);
        boolean z = this.t;
        sb.append(", shouldTriggerCreationListeners=");
        sb.append(z);
        sb.append(", conversationCreationSource=");
        sb.append(valueOf15);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.ckjz
    @Deprecated
    public final boolean u() {
        return this.t;
    }

    @Override // defpackage.ckjz
    public final int v() {
        return this.v;
    }
}
