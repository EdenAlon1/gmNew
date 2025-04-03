package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtpu extends dtpx {
    public final Context a;
    public final emxc b;
    private final emxc c;
    private final emxc d;

    public dtpu(Context context, emxc emxcVar, emxc emxcVar2, emxc emxcVar3) {
        this.a = context;
        this.c = emxcVar;
        this.d = emxcVar2;
        this.b = emxcVar3;
    }

    @Override // defpackage.dtpx
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.dtpx
    public final emxc b() {
        return this.c;
    }

    @Override // defpackage.dtpx
    public final emxc c() {
        return this.b;
    }

    @Override // defpackage.dtpx
    public final emxc d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtpx) {
            dtpx dtpxVar = (dtpx) obj;
            if (this.a.equals(dtpxVar.a()) && this.c.equals(dtpxVar.b()) && this.d.equals(dtpxVar.d())) {
                dtpxVar.e();
                if (this.b.equals(dtpxVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "CollectionBasisContext{context=" + this.a.toString() + ", accountNames=Optional.absent(), stacktrace=" + String.valueOf(this.d) + ", googlerOverridesCheckbox=false, executor=Optional.absent()}";
    }

    @Override // defpackage.dtpx
    public final void e() {
    }
}
