package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yfw {
    public final boolean a;
    public final boolean b;

    public yfw(xhu xhuVar) {
        xhuVar.getClass();
        boolean a = xhuVar.a();
        boolean z = xhuVar.h;
        this.a = a;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfw)) {
            return false;
        }
        yfw yfwVar = (yfw) obj;
        return this.a == yfwVar.a && this.b == yfwVar.b;
    }

    public final int hashCode() {
        return (yfv.a(this.a) * 31) + yfv.a(this.b);
    }

    public final String toString() {
        return "DraftInfo(isModified=" + this.a + ", isEncrypted=" + this.b + ")";
    }
}
