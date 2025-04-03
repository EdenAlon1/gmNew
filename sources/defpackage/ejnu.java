package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejnu extends ejoi {
    public final Class a;
    public final poj b;
    public final emxc c;
    public final ejog d;
    public final emxc e;
    public final pot f;
    public final emxc g;
    public final emxc h;
    public final enip i;
    public final emxc j;
    public final emxc k;
    public final emxc l;

    public ejnu(Class cls, poj pojVar, emxc emxcVar, ejog ejogVar, emxc emxcVar2, pot potVar, emxc emxcVar3, emxc emxcVar4, enip enipVar, emxc emxcVar5, emxc emxcVar6, emxc emxcVar7) {
        this.a = cls;
        this.b = pojVar;
        this.c = emxcVar;
        this.d = ejogVar;
        this.e = emxcVar2;
        this.f = potVar;
        this.g = emxcVar3;
        this.h = emxcVar4;
        this.i = enipVar;
        this.j = emxcVar5;
        this.k = emxcVar6;
        this.l = emxcVar7;
    }

    @Override // defpackage.ejoi
    public final poj a() {
        return this.b;
    }

    @Override // defpackage.ejoi
    public final pot b() {
        return this.f;
    }

    @Override // defpackage.ejoi
    public final ejoe c() {
        return new ejnt(this);
    }

    @Override // defpackage.ejoi
    public final ejog d() {
        return this.d;
    }

    @Override // defpackage.ejoi
    public final emxc e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejoi) {
            ejoi ejoiVar = (ejoi) obj;
            if (this.a.equals(ejoiVar.m()) && this.b.equals(ejoiVar.a()) && this.c.equals(ejoiVar.g()) && this.d.equals(ejoiVar.d()) && this.e.equals(ejoiVar.h()) && this.f.equals(ejoiVar.b()) && this.g.equals(ejoiVar.i()) && this.h.equals(ejoiVar.k()) && this.i.equals(ejoiVar.l()) && this.j.equals(ejoiVar.f()) && this.k.equals(ejoiVar.e()) && this.l.equals(ejoiVar.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ejoi
    public final emxc f() {
        return this.j;
    }

    @Override // defpackage.ejoi
    public final emxc g() {
        return this.c;
    }

    @Override // defpackage.ejoi
    public final emxc h() {
        return this.e;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    @Override // defpackage.ejoi
    public final emxc i() {
        return this.g;
    }

    @Override // defpackage.ejoi
    public final emxc j() {
        return this.l;
    }

    @Override // defpackage.ejoi
    public final emxc k() {
        return this.h;
    }

    @Override // defpackage.ejoi
    public final enip l() {
        return this.i;
    }

    @Override // defpackage.ejoi
    public final Class m() {
        return this.a;
    }

    public final String toString() {
        emxc emxcVar = this.l;
        emxc emxcVar2 = this.k;
        emxc emxcVar3 = this.j;
        enip enipVar = this.i;
        emxc emxcVar4 = this.h;
        emxc emxcVar5 = this.g;
        pot potVar = this.f;
        emxc emxcVar6 = this.e;
        ejog ejogVar = this.d;
        emxc emxcVar7 = this.c;
        poj pojVar = this.b;
        return "TikTokWorkSpec{workerClass=" + this.a.toString() + ", constraints=" + pojVar.toString() + ", expedited=" + String.valueOf(emxcVar7) + ", initialDelay=" + ejogVar.toString() + ", nextScheduleTimeOverride=" + String.valueOf(emxcVar6) + ", inputData=" + potVar.toString() + ", periodic=" + String.valueOf(emxcVar5) + ", unique=" + String.valueOf(emxcVar4) + ", tags=" + enipVar.toString() + ", backoffPolicy=" + String.valueOf(emxcVar3) + ", backoffDelayDuration=" + String.valueOf(emxcVar2) + ", targetProcess=" + String.valueOf(emxcVar) + "}";
    }
}
