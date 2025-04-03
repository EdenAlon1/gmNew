package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzhk extends dzhm {
    private final int a;
    private final emxc b;
    private final emxc c;
    private final emxc d;
    private final emxc e;
    private final emxc f;
    private final emxc g;
    private final emxc h;
    private final emxc i;
    private final emxc j;
    private final emxc k;
    private final engw l;
    private final emxc m;
    private final emxc n;
    private final emxc o;
    private final emxc p;
    private final emxc q;

    public dzhk(int i, emxc emxcVar, emxc emxcVar2, emxc emxcVar3, emxc emxcVar4, emxc emxcVar5, emxc emxcVar6, emxc emxcVar7, emxc emxcVar8, emxc emxcVar9, emxc emxcVar10, engw engwVar, emxc emxcVar11, emxc emxcVar12, emxc emxcVar13, emxc emxcVar14, emxc emxcVar15) {
        this.a = i;
        this.b = emxcVar;
        this.c = emxcVar2;
        this.d = emxcVar3;
        this.e = emxcVar4;
        this.f = emxcVar5;
        this.g = emxcVar6;
        this.h = emxcVar7;
        this.i = emxcVar8;
        this.j = emxcVar9;
        this.k = emxcVar10;
        this.l = engwVar;
        this.m = emxcVar11;
        this.n = emxcVar12;
        this.o = emxcVar13;
        this.p = emxcVar14;
        this.q = emxcVar15;
    }

    @Override // defpackage.dzhm
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dzhm
    public final emxc b() {
        return this.q;
    }

    @Override // defpackage.dzhm
    public final emxc c() {
        return this.e;
    }

    @Override // defpackage.dzhm
    public final emxc d() {
        return this.f;
    }

    @Override // defpackage.dzhm
    public final emxc e() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzhm) {
            dzhm dzhmVar = (dzhm) obj;
            if (this.a == dzhmVar.a() && this.b.equals(dzhmVar.l()) && this.c.equals(dzhmVar.m()) && this.d.equals(dzhmVar.n()) && this.e.equals(dzhmVar.c()) && this.f.equals(dzhmVar.d()) && this.g.equals(dzhmVar.h()) && this.h.equals(dzhmVar.f()) && this.i.equals(dzhmVar.k()) && this.j.equals(dzhmVar.j()) && this.k.equals(dzhmVar.o()) && enkr.h(this.l, dzhmVar.q()) && this.m.equals(dzhmVar.p()) && this.n.equals(dzhmVar.i()) && this.o.equals(dzhmVar.e()) && this.p.equals(dzhmVar.g()) && this.q.equals(dzhmVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzhm
    public final emxc f() {
        return this.h;
    }

    @Override // defpackage.dzhm
    public final emxc g() {
        return this.p;
    }

    @Override // defpackage.dzhm
    public final emxc h() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode();
    }

    @Override // defpackage.dzhm
    public final emxc i() {
        return this.n;
    }

    @Override // defpackage.dzhm
    public final emxc j() {
        return this.j;
    }

    @Override // defpackage.dzhm
    public final emxc k() {
        return this.i;
    }

    @Override // defpackage.dzhm
    public final emxc l() {
        return this.b;
    }

    @Override // defpackage.dzhm
    public final emxc m() {
        return this.c;
    }

    @Override // defpackage.dzhm
    public final emxc n() {
        return this.d;
    }

    @Override // defpackage.dzhm
    public final emxc o() {
        return this.k;
    }

    @Override // defpackage.dzhm
    public final emxc p() {
        return this.m;
    }

    @Override // defpackage.dzhm
    public final engw q() {
        return this.l;
    }

    public final String toString() {
        return "LighterLogData{eventType=" + this.a + ", source=" + String.valueOf(this.b) + ", sourceRegistrationId=" + String.valueOf(this.c) + ", traceId=" + String.valueOf(this.d) + ", destContactId=" + String.valueOf(this.e) + ", destConversationId=" + String.valueOf(this.f) + ", lighterTransportEventType=" + String.valueOf(this.g) + ", eventDetail=" + String.valueOf(this.h) + ", rpcResponseCode=" + String.valueOf(this.i) + ", messageOrigin=" + String.valueOf(this.j) + ", unsupportedCapability=" + String.valueOf(this.k) + ", experimentIds=" + this.l.toString() + ", visualElementDetail=Optional.absent(), linkType=" + String.valueOf(this.n) + ", elapsedTimeUs=" + String.valueOf(this.o) + ", lighterMessageTypeDetail=" + String.valueOf(this.p) + ", bootstrapDetail=" + String.valueOf(this.q) + "}";
    }
}
