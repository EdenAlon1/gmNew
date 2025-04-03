package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvms extends cvmt {
    private final String a;
    private final String b;
    private final Runnable c;

    public cvms(String str, String str2, Runnable runnable) {
        if (str == null) {
            throw new NullPointerException("Null message");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null actionLabel");
        }
        this.b = str2;
        this.c = runnable;
    }

    @Override // defpackage.cvmt
    public final Runnable a() {
        return this.c;
    }

    @Override // defpackage.cvmt
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cvmt
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvmt) {
            cvmt cvmtVar = (cvmt) obj;
            if (this.a.equals(cvmtVar.c()) && this.b.equals(cvmtVar.b()) && this.c.equals(cvmtVar.a())) {
                cvmtVar.d();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "SnackbarEvent{message=" + this.a + ", actionLabel=" + this.b + ", action=" + this.c.toString() + ", runRunnableInA11y=false}";
    }

    @Override // defpackage.cvmt
    public final void d() {
    }
}
