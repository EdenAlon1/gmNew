package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekqk extends ekqn {
    public final int a;
    public final int b;

    public ekqk(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ekqn
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ekqn
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekqn) {
            ekqn ekqnVar = (ekqn) obj;
            if (this.a == ekqnVar.b() && this.b == ekqnVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "StorageSpec{type=" + ekqo.a(this.a) + ", directBoot=" + (this.b != 1 ? "CREDENTIAL" : "DEVICE") + "}";
    }
}
