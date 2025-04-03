package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eejl extends eekb {
    public final boolean a;
    public final boolean b;
    public final eejk c;
    public final emxc d;

    public eejl(boolean z, boolean z2, eejk eejkVar, emxc emxcVar) {
        this.a = z;
        this.b = z2;
        if (eejkVar == null) {
            throw new NullPointerException("Null transportProtocol");
        }
        this.c = eejkVar;
        this.d = emxcVar;
    }

    @Override // defpackage.eekb
    public final eejk a() {
        return this.c;
    }

    @Override // defpackage.eekb
    public final emxc b() {
        return this.d;
    }

    @Override // defpackage.eekb
    public final boolean c() {
        return this.a;
    }

    @Override // defpackage.eekb
    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eekb) {
            eekb eekbVar = (eekb) obj;
            if (this.a == eekbVar.c() && this.b == eekbVar.d() && this.c.equals(eekbVar.a()) && this.d.equals(eekbVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.d;
        return "DiscoverySpec{forceIPv4=" + this.a + ", preferIPv6=" + this.b + ", transportProtocol=" + this.c.toString() + ", logPrefix=" + emxcVar.toString() + "}";
    }
}
