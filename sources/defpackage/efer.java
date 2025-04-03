package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efer extends efga {
    public final Uri a;
    public final eyhs b;
    public final emxc c;
    public final engw d;
    public final efhs e;
    public final boolean f;

    public efer(Uri uri, eyhs eyhsVar, emxc emxcVar, engw engwVar, efhs efhsVar, boolean z) {
        this.a = uri;
        this.b = eyhsVar;
        this.c = emxcVar;
        this.d = engwVar;
        this.e = efhsVar;
        this.f = z;
    }

    @Override // defpackage.efga
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.efga
    public final efhs b() {
        return this.e;
    }

    @Override // defpackage.efga
    public final emxc c() {
        return this.c;
    }

    @Override // defpackage.efga
    public final engw d() {
        return this.d;
    }

    @Override // defpackage.efga
    public final eyhs e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efga) {
            efga efgaVar = (efga) obj;
            if (this.a.equals(efgaVar.a()) && this.b.equals(efgaVar.e()) && this.c.equals(efgaVar.c()) && enkr.h(this.d, efgaVar.d()) && this.e.equals(efgaVar.b()) && this.f == efgaVar.f()) {
                efgaVar.g();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.efga
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        efhs efhsVar = this.e;
        engw engwVar = this.d;
        emxc emxcVar = this.c;
        eyhs eyhsVar = this.b;
        return "ProtoDataStoreConfig{uri=" + this.a.toString() + ", schema=" + eyhsVar.toString() + ", handler=" + String.valueOf(emxcVar) + ", migrations=" + String.valueOf(engwVar) + ", variantConfig=" + efhsVar.toString() + ", useGeneratedExtensionRegistry=" + this.f + ", enableTracing=false}";
    }

    @Override // defpackage.efga
    public final void g() {
    }
}
