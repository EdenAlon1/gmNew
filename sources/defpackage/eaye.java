package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaye {
    public final lkr a;
    public final emxc b;
    public final emxc c;

    public eaye(lkr lkrVar, emxc emxcVar, emxc emxcVar2) {
        this.a = lkrVar;
        this.b = emxcVar;
        this.c = emxcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eaye)) {
            return false;
        }
        eaye eayeVar = (eaye) obj;
        return ffkj.e(this.a, eayeVar.a) && ffkj.e(this.b, eayeVar.b) && ffkj.e(this.c, eayeVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 2040732332) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ObservableAccountInformation(lifecycleOwner=" + this.a + ", countDecorationGenerator=" + this.b + ", criticalAlertFeature=" + this.c + ")";
    }
}
