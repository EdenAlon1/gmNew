package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqt extends btf {
    private final int e;
    private final axr f;
    private final int g;

    public bqt(int i, int i2, axr axrVar) {
        this.e = i;
        this.g = i2;
        this.f = axrVar;
    }

    @Override // defpackage.btf
    public final int a() {
        return this.e;
    }

    @Override // defpackage.btf
    public final axr b() {
        return this.f;
    }

    @Override // defpackage.btf
    public final int c() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        axr axrVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof btf) {
            btf btfVar = (btf) obj;
            if (this.e == btfVar.a() && this.g == btfVar.c() && ((axrVar = this.f) != null ? axrVar.equals(btfVar.b()) : btfVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        axr axrVar = this.f;
        return (axrVar == null ? 0 : axrVar.hashCode()) ^ ((((this.e ^ 1000003) * 1000003) ^ this.g) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamInfo{id=");
        sb.append(this.e);
        sb.append(", streamState=");
        sb.append((Object) (this.g != 1 ? "INACTIVE" : "ACTIVE"));
        sb.append(", inProgressTransformationInfo=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
