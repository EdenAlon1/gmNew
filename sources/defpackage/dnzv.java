package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnzv implements dnzz {
    public final ffix a;
    public final dmzz b;
    private final boolean c;
    private final ffix d;
    private final ffix e;
    private final String f;

    /* JADX WARN: Multi-variable type inference failed */
    public dnzv() {
        this(null, 0 == true ? 1 : 0, 63);
    }

    @Override // defpackage.dnoq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dnoq
    public final ffix b() {
        return this.d;
    }

    @Override // defpackage.dnoq
    public final ffix c() {
        return this.e;
    }

    @Override // defpackage.dnoq
    public final boolean d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnzv)) {
            return false;
        }
        dnzv dnzvVar = (dnzv) obj;
        if (!ffkj.e(this.a, dnzvVar.a) || this.b != dnzvVar.b) {
            return false;
        }
        boolean z = dnzvVar.c;
        if (!ffkj.e(this.d, dnzvVar.d) || !ffkj.e(this.e, dnzvVar.e)) {
            return false;
        }
        String str = dnzvVar.f;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + 1237) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
    }

    public final String toString() {
        return "Cancelled(onRetryButtonClicked=" + this.a + ", icon=" + this.b + ", isHighlighted=false, onClick=" + this.d + ", onLayout=" + this.e + ", contentDescription=null)";
    }

    public /* synthetic */ dnzv(ffix ffixVar, dmzz dmzzVar, int i) {
        ffixVar = (i & 1) != 0 ? new ffix() { // from class: dnzs
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar;
        dmzzVar = (i & 2) != 0 ? dmzz.z : dmzzVar;
        ffix ffixVar2 = new ffix() { // from class: dnzt
            @Override // defpackage.ffix
            public final Object invoke() {
                return false;
            }
        };
        ffix ffixVar3 = new ffix() { // from class: dnzu
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        };
        ffixVar.getClass();
        dmzzVar.getClass();
        this.a = ffixVar;
        this.b = dmzzVar;
        this.c = false;
        this.d = ffixVar2;
        this.e = ffixVar3;
        this.f = null;
    }
}
