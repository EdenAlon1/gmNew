package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxpp extends cxqe {
    public final int a;
    public final int b;

    public cxpp(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.cxqe
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cxqe
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxqe) {
            cxqe cxqeVar = (cxqe) obj;
            if (this.a == cxqeVar.a()) {
                cxqeVar.c();
                if (this.b == cxqeVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * (-721379959)) ^ this.b;
    }

    public final String toString() {
        return "MessageTextColorAndResId{getColor=" + this.a + ", statusColorResId=0, getStatusColor=" + this.b + "}";
    }

    @Override // defpackage.cxqe
    @Deprecated
    public final void c() {
    }
}
