package defpackage;

/* compiled from: PG */
@ffbs
/* loaded from: classes4.dex */
public final class dnur implements dnux {
    public final ffix a;
    public final dmzz b;
    public final dnuq c;

    /* JADX WARN: Multi-variable type inference failed */
    public dnur() {
        this(null, 0 == true ? 1 : 0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnur)) {
            return false;
        }
        dnur dnurVar = (dnur) obj;
        return ffkj.e(this.a, dnurVar.a) && this.b == dnurVar.b && ffkj.e(this.c, dnurVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Cancelled(onRetryButtonClicked=" + this.a + ", icon=" + this.b + ", flags=" + this.c + ")";
    }

    public /* synthetic */ dnur(ffix ffixVar, dnuq dnuqVar, int i) {
        ffixVar = (i & 1) != 0 ? new ffix() { // from class: dnup
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar;
        dmzz dmzzVar = (i & 2) != 0 ? dmzz.z : null;
        dnuqVar = (i & 4) != 0 ? new dnuq((byte[]) null) : dnuqVar;
        ffixVar.getClass();
        dmzzVar.getClass();
        dnuqVar.getClass();
        this.a = ffixVar;
        this.b = dmzzVar;
        this.c = dnuqVar;
    }
}
