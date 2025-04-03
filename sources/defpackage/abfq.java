package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfq implements dmfn {
    public final ffix a;
    public final String b;
    public final List c;
    public final ffix d;
    public final ffix e;
    private final boolean f;

    public abfq(ffix ffixVar, String str, List list, ffix ffixVar2, ffix ffixVar3) {
        str.getClass();
        this.a = ffixVar;
        this.f = false;
        this.b = str;
        this.c = list;
        this.d = ffixVar2;
        this.e = ffixVar3;
    }

    @Override // defpackage.dmfn
    public final /* bridge */ /* synthetic */ dmfn a(ffix ffixVar) {
        return new abfq(ffixVar, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.dmfn
    public final ffix b() {
        return this.a;
    }

    @Override // defpackage.dmfn
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abfq)) {
            return false;
        }
        abfq abfqVar = (abfq) obj;
        if (!ffkj.e(this.a, abfqVar.a)) {
            return false;
        }
        boolean z = abfqVar.f;
        return ffkj.e(this.b, abfqVar.b) && ffkj.e(this.c, abfqVar.c) && ffkj.e(this.d, abfqVar.d) && ffkj.e(this.e, abfqVar.e);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + 1237) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "PremiumSmsOptionsUiData(onDismiss=" + this.a + ", includeScrim=false, body=" + this.b + ", bodyAnnotations=" + this.c + ", onSettingsClick=" + this.d + ", onResendClick=" + this.e + ")";
    }
}
