package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxbp extends dxbq {
    public final String a;
    private final int b;

    public dxbp(int i, String str) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.dxbq
    public final String a() {
        return this.a;
    }

    @Override // defpackage.dxbq
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxbq) {
            dxbq dxbqVar = (dxbq) obj;
            if (this.b == dxbqVar.b() && this.a.equals(dxbqVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }
}
