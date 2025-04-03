package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fiur {
    public final long a;
    public final firk b;
    fiur c;
    private String d;
    private int e = Integer.MIN_VALUE;
    private int f = Integer.MIN_VALUE;

    public fiur(firk firkVar, long j) {
        this.a = j;
        this.b = firkVar;
    }

    public final int a(long j) {
        fiur fiurVar = this.c;
        if (fiurVar != null && j >= fiurVar.a) {
            return fiurVar.a(j);
        }
        int i = this.e;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        int a = this.b.a(this.a);
        this.e = a;
        return a;
    }

    public final int b(long j) {
        fiur fiurVar = this.c;
        if (fiurVar != null && j >= fiurVar.a) {
            return fiurVar.b(j);
        }
        int i = this.f;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        int c = this.b.c(this.a);
        this.f = c;
        return c;
    }

    public final String c(long j) {
        fiur fiurVar = this.c;
        if (fiurVar != null && j >= fiurVar.a) {
            return fiurVar.c(j);
        }
        if (this.d == null) {
            this.d = this.b.g(this.a);
        }
        return this.d;
    }
}
