package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asu extends atm {
    public final int a;
    private final Throwable b;

    public asu(int i, Throwable th) {
        this.a = i;
        this.b = th;
    }

    @Override // defpackage.atm
    public final int a() {
        return this.a;
    }

    @Override // defpackage.atm
    public final Throwable b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof atm) {
            atm atmVar = (atm) obj;
            if (this.a == atmVar.a() && ((th = this.b) != null ? th.equals(atmVar.b()) : atmVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.b;
        return (th == null ? 0 : th.hashCode()) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "StateError{code=" + this.a + ", cause=" + this.b + "}";
    }
}
