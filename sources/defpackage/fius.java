package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fius extends firk {
    private static final int e;
    private static final long serialVersionUID = 5472298452022250685L;
    private final firk f;
    private final transient fiur[] g;

    static {
        Integer num;
        int i;
        try {
            num = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            num = null;
        }
        if (num == null) {
            i = 512;
        } else {
            int intValue = num.intValue() - 1;
            int i2 = 0;
            while (intValue > 0) {
                intValue >>= 1;
                i2++;
            }
            i = 1 << i2;
        }
        e = i - 1;
    }

    public fius(firk firkVar) {
        super(firkVar.c);
        this.g = new fiur[e + 1];
        this.f = firkVar;
    }

    private final fiur n(long j) {
        int i = (int) (j >> 32);
        int i2 = e & i;
        fiur[] fiurVarArr = this.g;
        fiur fiurVar = fiurVarArr[i2];
        if (fiurVar != null && ((int) (fiurVar.a >> 32)) == i) {
            return fiurVar;
        }
        long j2 = j & (-4294967296L);
        fiur fiurVar2 = new fiur(this.f, j2);
        long j3 = j2;
        fiur fiurVar3 = fiurVar2;
        while (true) {
            long e2 = this.f.e(j3);
            if (e2 == j3 || e2 > (4294967295L | j2)) {
                break;
            }
            fiur fiurVar4 = new fiur(this.f, e2);
            fiurVar3.c = fiurVar4;
            fiurVar3 = fiurVar4;
            j3 = e2;
        }
        fiurVarArr[i2] = fiurVar2;
        return fiurVar2;
    }

    @Override // defpackage.firk
    public final int a(long j) {
        return n(j).a(j);
    }

    @Override // defpackage.firk
    public final int c(long j) {
        return n(j).b(j);
    }

    @Override // defpackage.firk
    public final long e(long j) {
        return this.f.e(j);
    }

    @Override // defpackage.firk
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fius) {
            return this.f.equals(((fius) obj).f);
        }
        return false;
    }

    @Override // defpackage.firk
    public final long f(long j) {
        return this.f.f(j);
    }

    @Override // defpackage.firk
    public final String g(long j) {
        return n(j).c(j);
    }

    @Override // defpackage.firk
    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // defpackage.firk
    public final boolean k() {
        return false;
    }
}
