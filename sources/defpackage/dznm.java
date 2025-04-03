package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dznm extends dzqs {
    public final String a;
    public final dzpg b;
    public final dzpt c;
    public final long d;
    public final emxc e;
    public final dzqk f;
    public final dzqm g;
    public final emxc h;
    public final enhk i;
    public final int j;
    public final dzqp k;
    public final int l;
    public final int m;
    public final eyee n;
    public final emxc o;
    public final engw p;
    public final enhk q;
    public final int r;

    public dznm(String str, int i, dzpg dzpgVar, dzpt dzptVar, long j, emxc emxcVar, dzqk dzqkVar, dzqm dzqmVar, emxc emxcVar2, enhk enhkVar, int i2, dzqp dzqpVar, int i3, int i4, eyee eyeeVar, emxc emxcVar3, engw engwVar, enhk enhkVar2) {
        this.a = str;
        this.r = i;
        this.b = dzpgVar;
        this.c = dzptVar;
        this.d = j;
        this.e = emxcVar;
        this.f = dzqkVar;
        this.g = dzqmVar;
        this.h = emxcVar2;
        this.i = enhkVar;
        this.j = i2;
        this.k = dzqpVar;
        this.l = i3;
        this.m = i4;
        this.n = eyeeVar;
        this.o = emxcVar3;
        this.p = engwVar;
        this.q = enhkVar2;
    }

    @Override // defpackage.dzqs
    public final int a() {
        return this.j;
    }

    @Override // defpackage.dzqs
    public final int b() {
        return this.m;
    }

    @Override // defpackage.dzqs
    public final int c() {
        return this.l;
    }

    @Override // defpackage.dzqs
    public final long d() {
        return this.d;
    }

    @Override // defpackage.dzqs
    public final dzpg e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzqs) {
            dzqs dzqsVar = (dzqs) obj;
            if (this.a.equals(dzqsVar.r()) && this.r == dzqsVar.s() && this.b.equals(dzqsVar.e()) && this.c.equals(dzqsVar.f()) && this.d == dzqsVar.d() && this.e.equals(dzqsVar.k()) && this.f.equals(dzqsVar.h()) && this.g.equals(dzqsVar.i()) && this.h.equals(dzqsVar.m()) && this.i.equals(dzqsVar.o()) && this.j == dzqsVar.a() && this.k.equals(dzqsVar.j()) && this.l == dzqsVar.c() && this.m == dzqsVar.b() && this.n.equals(dzqsVar.q()) && this.o.equals(dzqsVar.l()) && enkr.h(this.p, dzqsVar.n()) && ennc.m(this.q, dzqsVar.p())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzqs
    public final dzpt f() {
        return this.c;
    }

    @Override // defpackage.dzqs
    public final dzqg g() {
        return new dznl(this);
    }

    @Override // defpackage.dzqs
    public final dzqk h() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.r) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (((((((((((((((((((((((((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l) * 1000003) ^ this.m) * 1000003) ^ this.n.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode();
    }

    @Override // defpackage.dzqs
    public final dzqm i() {
        return this.g;
    }

    @Override // defpackage.dzqs
    public final dzqp j() {
        return this.k;
    }

    @Override // defpackage.dzqs
    public final emxc k() {
        return this.e;
    }

    @Override // defpackage.dzqs
    public final emxc l() {
        return this.o;
    }

    @Override // defpackage.dzqs
    public final emxc m() {
        return this.h;
    }

    @Override // defpackage.dzqs
    public final engw n() {
        return this.p;
    }

    @Override // defpackage.dzqs
    public final enhk o() {
        return this.i;
    }

    @Override // defpackage.dzqs
    public final enhk p() {
        return this.q;
    }

    @Override // defpackage.dzqs
    public final eyee q() {
        return this.n;
    }

    @Override // defpackage.dzqs
    public final String r() {
        return this.a;
    }

    @Override // defpackage.dzqs
    public final int s() {
        return this.r;
    }

    public final String toString() {
        String str = this.r != 1 ? "OUTGOING" : "INCOMING";
        dzpg dzpgVar = this.b;
        dzpt dzptVar = this.c;
        emxc emxcVar = this.e;
        dzqk dzqkVar = this.f;
        dzqm dzqmVar = this.g;
        emxc emxcVar2 = this.h;
        enhk enhkVar = this.i;
        dzqp dzqpVar = this.k;
        eyee eyeeVar = this.n;
        emxc emxcVar3 = this.o;
        engw engwVar = this.p;
        enhk enhkVar2 = this.q;
        return "Message{messageId=" + this.a + ", messageType=" + str + ", sender=" + dzpgVar.toString() + ", conversationId=" + dzptVar.toString() + ", serverTimestampUs=" + this.d + ", fallback=" + String.valueOf(emxcVar) + ", messageContent=" + dzqkVar.toString() + ", messageStatus=" + dzqmVar.toString() + ", snippet=" + String.valueOf(emxcVar2) + ", metadata=" + enhkVar.toString() + ", capability=" + this.j + ", renderingDetails=" + dzqpVar.toString() + ", intendedRenderingType=" + this.l + ", filterableFlags=" + this.m + ", conversationContext=" + eyeeVar.toString() + ", featureType=" + String.valueOf(emxcVar3) + ", activeDecorationIds=" + engwVar.toString() + ", possibleDecorations=" + ennc.g(enhkVar2) + "}";
    }
}
