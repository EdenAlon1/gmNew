package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eccb extends ecdl {
    public final int a;
    private final errm b;
    private final int c;
    private final boolean d;

    public eccb(errm errmVar, int i, int i2, boolean z) {
        this.b = errmVar;
        this.c = i;
        this.a = i2;
        this.d = z;
    }

    @Override // defpackage.ecdl
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ecdl
    public final int b() {
        return this.c;
    }

    @Override // defpackage.ecdl
    public final errm c() {
        return this.b;
    }

    @Override // defpackage.ecdl
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecdl) {
            ecdl ecdlVar = (ecdl) obj;
            errm errmVar = this.b;
            if (errmVar != null ? errmVar.equals(ecdlVar.c()) : ecdlVar.c() == null) {
                if (this.c == ecdlVar.b() && this.a == ecdlVar.a() && this.d == ecdlVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        errm errmVar = this.b;
        int hashCode = errmVar == null ? 0 : errmVar.hashCode();
        int i = this.c;
        return ((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.a) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "PrimesThreadsConfigurations{primesExecutorService=" + String.valueOf(this.b) + ", primesMetricExecutorPriority=" + this.c + ", primesMetricExecutorPoolSize=" + this.a + ", enableDeferredTasks=" + this.d + "}";
    }
}
