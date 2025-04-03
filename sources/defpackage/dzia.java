package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzia extends dzig {
    private final emxc a;
    private final emxc b;
    private final emxc c;

    public dzia(emxc emxcVar, emxc emxcVar2, emxc emxcVar3) {
        this.a = emxcVar;
        this.b = emxcVar2;
        this.c = emxcVar3;
    }

    @Override // defpackage.dzig
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.dzig
    public final emxc b() {
        return this.c;
    }

    @Override // defpackage.dzig
    public final emxc c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzig) {
            dzig dzigVar = (dzig) obj;
            if (this.a.equals(dzigVar.c()) && this.b.equals(dzigVar.a()) && this.c.equals(dzigVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.c;
        emxc emxcVar2 = this.b;
        return "LighterMessageTypeDetail{intendedRenderingType=" + String.valueOf(this.a) + ", actualRenderingType=" + String.valueOf(emxcVar2) + ", contentType=" + String.valueOf(emxcVar) + "}";
    }
}
