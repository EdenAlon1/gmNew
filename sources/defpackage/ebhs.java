package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebhs extends ebhv {
    private final emxc a;
    private final engw b;
    private final emxc c;

    public ebhs(emxc emxcVar, engw engwVar, emxc emxcVar2) {
        this.a = emxcVar;
        this.b = engwVar;
        this.c = emxcVar2;
    }

    @Override // defpackage.ebhv
    public final emxc a() {
        return this.c;
    }

    @Override // defpackage.ebgs
    public final emxc c() {
        return this.a;
    }

    @Override // defpackage.ebhv, defpackage.ebgs
    public final engw d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebhv) {
            ebhv ebhvVar = (ebhv) obj;
            if (this.a.equals(ebhvVar.c()) && enkr.h(this.b, ebhvVar.d()) && this.c.equals(ebhvVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 2097800333) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "CollapsibleAccountManagementFeatureImpl{commonCards=Optional.absent(), flavorCustomActions=" + this.b.toString() + ", dynamicCards=Optional.absent()}";
    }
}
