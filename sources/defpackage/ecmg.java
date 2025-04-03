package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecmg extends ecmr {
    public final String a;
    public final ecda b;
    public final fgmh c;
    public final emxc d;
    public final emxc e;

    public ecmg(String str, ecda ecdaVar, fgmh fgmhVar, emxc emxcVar, emxc emxcVar2) {
        this.a = str;
        this.b = ecdaVar;
        this.c = fgmhVar;
        this.d = emxcVar;
        this.e = emxcVar2;
    }

    @Override // defpackage.ecmr
    public final ecda a() {
        return this.b;
    }

    @Override // defpackage.ecmr
    public final emxc b() {
        return this.e;
    }

    @Override // defpackage.ecmr
    public final emxc c() {
        return this.d;
    }

    @Override // defpackage.ecmr
    public final String d() {
        return this.a;
    }

    @Override // defpackage.ecmr
    public final fgmh e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        ecda ecdaVar;
        fgmh fgmhVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecmr) {
            ecmr ecmrVar = (ecmr) obj;
            if (this.a.equals(ecmrVar.d()) && ((ecdaVar = this.b) != null ? ecdaVar.equals(ecmrVar.a()) : ecmrVar.a() == null) && ((fgmhVar = this.c) != null ? fgmhVar.equals(ecmrVar.e()) : ecmrVar.e() == null)) {
                ecmrVar.f();
                if (this.d.equals(ecmrVar.c()) && this.e.equals(ecmrVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        ecda ecdaVar = this.b;
        int hashCode2 = ((hashCode * 1000003) ^ (ecdaVar == null ? 0 : ecdaVar.hashCode())) * 1000003;
        fgmh fgmhVar = this.c;
        return ((((((hashCode2 ^ (fgmhVar != null ? fgmhVar.hashCode() : 0)) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "JankEventCollectionParameters{eventName=" + this.a + ", noPiiEventName=" + String.valueOf(this.b) + ", metricExtension=" + String.valueOf(this.c) + ", enablePerfettoTraceCollection=false, perfettoTimeoutOverride=Optional.absent(), perfettoBucketOverride=Optional.absent()}";
    }

    @Override // defpackage.ecmr
    public final void f() {
    }
}
