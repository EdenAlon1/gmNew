package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bmb extends bmv {
    private final int a;
    private final int b;
    private final kfb c;

    public bmb(int i, int i2, kfb kfbVar) {
        this.a = i;
        this.b = i2;
        this.c = kfbVar;
    }

    @Override // defpackage.bmv
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bmv
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bmv
    public final kfb c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmv) {
            bmv bmvVar = (bmv) obj;
            if (this.a == bmvVar.a() && this.b == bmvVar.b() && this.c.equals(bmvVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.a + ", rotationDegrees=" + this.b + ", completer=" + this.c + "}";
    }
}
