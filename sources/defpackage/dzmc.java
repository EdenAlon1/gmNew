package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzmc extends dzjn {
    private final emxc a;
    private final emxc b;
    private final emxc c;
    private final emxc d;
    private final long e;
    private final dzje f;
    private final dzje g;

    public dzmc(emxc emxcVar, emxc emxcVar2, emxc emxcVar3, emxc emxcVar4, long j, dzje dzjeVar, dzje dzjeVar2) {
        this.a = emxcVar;
        this.b = emxcVar2;
        this.c = emxcVar3;
        this.d = emxcVar4;
        this.e = j;
        this.f = dzjeVar;
        this.g = dzjeVar2;
    }

    @Override // defpackage.dzjn
    public final long a() {
        return this.e;
    }

    @Override // defpackage.dzjn
    public final dzje b() {
        return this.f;
    }

    @Override // defpackage.dzjn
    public final dzje c() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzjn) {
            dzjn dzjnVar = (dzjn) obj;
            if (this.a.equals(dzjnVar.l()) && this.b.equals(dzjnVar.j()) && this.c.equals(dzjnVar.h()) && this.d.equals(dzjnVar.g()) && this.e == dzjnVar.a() && this.f.equals(dzjnVar.b()) && this.g.equals(dzjnVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzjn
    public final emxc g() {
        return this.d;
    }

    @Override // defpackage.dzjn
    public final emxc h() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        long j = this.e;
        return (((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    @Override // defpackage.dzjn
    public final emxc j() {
        return this.b;
    }

    @Override // defpackage.dzjn
    public final emxc l() {
        return this.a;
    }

    public final String toString() {
        dzje dzjeVar = this.g;
        dzje dzjeVar2 = this.f;
        emxc emxcVar = this.d;
        emxc emxcVar2 = this.c;
        emxc emxcVar3 = this.b;
        return "Action{traceId=" + String.valueOf(this.a) + ", messageId=" + String.valueOf(emxcVar3) + ", eventCallbackPayload=" + String.valueOf(emxcVar2) + ", eventCallbackDestination=" + String.valueOf(emxcVar) + ", actionTriggeredLogId=" + this.e + ", actionPayload=" + dzjeVar2.toString() + ", eventCallbackFailureActionPayload=" + dzjeVar.toString() + "}";
    }
}
