package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebpj extends ebpp {
    public final ebrs a;
    public final ebry b;
    public final boolean c = true;
    private final emxc d;

    public ebpj(ebrs ebrsVar, ebry ebryVar, emxc emxcVar, boolean z) {
        this.a = ebrsVar;
        this.b = ebryVar;
        this.d = emxcVar;
    }

    @Override // defpackage.ebpp
    public final ebrs a() {
        return this.a;
    }

    @Override // defpackage.ebpp
    public final ebry b() {
        return this.b;
    }

    @Override // defpackage.ebpp
    public final emxc c() {
        return this.d;
    }

    @Override // defpackage.ebpp
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebpp) {
            ebpp ebppVar = (ebpp) obj;
            if (this.a.equals(ebppVar.a()) && this.b.equals(ebppVar.b()) && this.d.equals(ebppVar.c())) {
                ebppVar.d();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 1231;
    }

    public final String toString() {
        return "ExpressSignInDialogConfiguration{expressSignInManager=" + this.a.toString() + ", expressSignInSpec=" + this.b.toString() + ", modelUpdater=Optional.absent(), dismissOnTouchOutside=true}";
    }
}
