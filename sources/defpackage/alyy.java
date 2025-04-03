package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alyy extends alzq {
    private final alzn a;
    private final alzo b;
    private final alzp c;

    public alyy(alzn alznVar, alzo alzoVar, alzp alzpVar) {
        this.a = alznVar;
        this.b = alzoVar;
        this.c = alzpVar;
    }

    @Override // defpackage.alzq
    public final alzn a() {
        return this.a;
    }

    @Override // defpackage.alzq
    public final alzo b() {
        return this.b;
    }

    @Override // defpackage.alzq
    public final alzp c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alzq) {
            alzq alzqVar = (alzq) obj;
            if (this.a.equals(alzqVar.a()) && this.b.equals(alzqVar.b()) && this.c.equals(alzqVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        alzp alzpVar = this.c;
        alzo alzoVar = this.b;
        return "GlobalConfiguration{rcsSetting=" + this.a.toString() + ", readReceiptBehavior=" + alzoVar.toString() + ", typingIndicatorBehavior=" + alzpVar.toString() + "}";
    }
}
