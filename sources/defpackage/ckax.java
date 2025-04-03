package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckax extends ckbx {
    public final int a;
    public final int b;
    public final byzl c;
    public final Uri d;
    public final int e;
    public final eqxi f;
    public final Optional g;
    public final int h;

    public ckax(int i, int i2, byzl byzlVar, Uri uri, int i3, eqxi eqxiVar, int i4, Optional optional) {
        this.a = i;
        this.b = i2;
        this.c = byzlVar;
        this.d = uri;
        this.e = i3;
        this.f = eqxiVar;
        this.h = i4;
        this.g = optional;
    }

    @Override // defpackage.ckbx
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ckbx
    public final int b() {
        return this.e;
    }

    @Override // defpackage.ckbx
    public final int c() {
        return this.a;
    }

    @Override // defpackage.ckbx
    public final Uri d() {
        return this.d;
    }

    @Override // defpackage.ckbx
    public final byzl e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        eqxi eqxiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckbx) {
            ckbx ckbxVar = (ckbx) obj;
            if (this.a == ckbxVar.c() && this.b == ckbxVar.a() && this.c.equals(ckbxVar.e()) && ((uri = this.d) != null ? uri.equals(ckbxVar.d()) : ckbxVar.d() == null) && this.e == ckbxVar.b() && ((eqxiVar = this.f) != null ? eqxiVar.equals(ckbxVar.g()) : ckbxVar.g() == null)) {
                int i = this.h;
                int i2 = ckbxVar.i();
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1 && this.g.equals(ckbxVar.h())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ckbx
    public final ckbw f() {
        return new ckaw(this);
    }

    @Override // defpackage.ckbx
    public final eqxi g() {
        return this.f;
    }

    @Override // defpackage.ckbx
    public final Optional h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
        Uri uri = this.d;
        int hashCode2 = ((((hashCode * 1000003) ^ (uri == null ? 0 : uri.hashCode())) * 1000003) ^ this.e) * 1000003;
        eqxi eqxiVar = this.f;
        int hashCode3 = eqxiVar != null ? eqxiVar.hashCode() : 0;
        eopg.c(this.h);
        return ((((hashCode2 ^ hashCode3) * 1000003) ^ 1) * 1000003) ^ this.g.hashCode();
    }

    @Override // defpackage.ckbx
    public final int i() {
        return this.h;
    }

    public final String toString() {
        eqxi eqxiVar = this.f;
        Uri uri = this.d;
        return "MessageStatusPlusUri{status=" + this.a + ", rawStatus=" + this.b + ", xmsTransportType=" + String.valueOf(this.c) + ", uri=" + String.valueOf(uri) + ", resultCode=" + this.e + ", rcsDiagnostics=" + String.valueOf(eqxiVar) + ", mmsApi=" + (this.h != 0 ? eopg.b(1) : "null") + ", retryStrategy=" + String.valueOf(this.g) + "}";
    }
}
