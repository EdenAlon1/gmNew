package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiuz extends firk {
    private static final long serialVersionUID = -3513011772763289092L;
    private final String e;
    private final int f;
    private final int g;

    public fiuz(String str, String str2, int i, int i2) {
        super(str);
        this.e = str2;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.firk
    public final int a(long j) {
        return this.f;
    }

    @Override // defpackage.firk
    public final int b(long j) {
        return this.f;
    }

    @Override // defpackage.firk
    public final int c(long j) {
        return this.g;
    }

    @Override // defpackage.firk
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fiuz) {
            fiuz fiuzVar = (fiuz) obj;
            if (this.c.equals(fiuzVar.c) && this.g == fiuzVar.g && this.f == fiuzVar.f) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.firk
    public final String g(long j) {
        return this.e;
    }

    @Override // defpackage.firk
    public final int hashCode() {
        return this.c.hashCode() + (this.g * 37) + (this.f * 31);
    }

    @Override // defpackage.firk
    public final boolean k() {
        return true;
    }

    @Override // defpackage.firk
    public final long e(long j) {
        return j;
    }

    @Override // defpackage.firk
    public final long f(long j) {
        return j;
    }
}
