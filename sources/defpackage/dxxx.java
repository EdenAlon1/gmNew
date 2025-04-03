package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxxx implements erqj {
    final /* synthetic */ String a;
    final /* synthetic */ emxc b;

    public dxxx(String str, emxc emxcVar) {
        this.a = str;
        this.b = emxcVar;
    }

    @Override // defpackage.erqj
    public final /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            dxth.d("%s: Added file group %s with account: %s, variant: %s", "ManifestConfigHelper", this.a, String.valueOf(this.b.f()), "null");
        } else {
            dxth.d("%s: Failed to add file group %s with account: %s, variant: %s", "ManifestConfigHelper", this.a, String.valueOf(this.b.f()), "null");
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        dxth.k(th, "%s: Failed to add file group %s with account: %s, variant: %s", "ManifestConfigHelper", this.a, String.valueOf(this.b.f()), "null");
    }
}
