package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apmz extends apnx {
    public final String a;
    public final Uri b;
    public final Optional c;
    public final Uri d;
    public final apra e;
    private final Size f;
    private final long g;
    private final boolean h;
    private final String i;
    private final Uri j;
    private final int k;

    public apmz(String str, Uri uri, Size size, Optional optional, long j, boolean z, Uri uri2, apra apraVar, String str2, Uri uri3, int i) {
        this.a = str;
        this.b = uri;
        this.f = size;
        this.c = optional;
        this.g = j;
        this.h = z;
        this.d = uri2;
        this.e = apraVar;
        this.i = str2;
        this.j = uri3;
        this.k = i;
    }

    @Override // defpackage.appq
    public final long a() {
        return this.g;
    }

    @Override // defpackage.appj
    public final String b() {
        return this.a;
    }

    @Override // defpackage.apnx, defpackage.apmq
    public final Uri c() {
        return this.d;
    }

    @Override // defpackage.apnx, defpackage.appq
    public final Uri d() {
        return this.j;
    }

    @Override // defpackage.apmq
    public final Uri e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apnx) {
            apnx apnxVar = (apnx) obj;
            if (this.a.equals(apnxVar.b()) && this.b.equals(apnxVar.e()) && this.f.equals(apnxVar.f()) && this.c.equals(apnxVar.j()) && this.g == apnxVar.a() && this.h == apnxVar.l()) {
                apnxVar.m();
                Uri uri = this.d;
                if (uri != null ? uri.equals(apnxVar.c()) : apnxVar.c() == null) {
                    apra apraVar = this.e;
                    if (apraVar != null ? apraVar.equals(apnxVar.fk()) : apnxVar.fk() == null) {
                        String str = this.i;
                        if (str != null ? str.equals(apnxVar.k()) : apnxVar.k() == null) {
                            Uri uri2 = this.j;
                            if (uri2 != null ? uri2.equals(apnxVar.d()) : apnxVar.d() == null) {
                                if (this.k == apnxVar.n()) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.apqd
    public final Size f() {
        return this.f;
    }

    @Override // defpackage.apnx, defpackage.apmq
    public final apra fk() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.c.hashCode();
        Uri uri = this.d;
        int hashCode2 = uri == null ? 0 : uri.hashCode();
        long j = this.g;
        int i = ((((((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ hashCode2) * 1000003;
        apra apraVar = this.e;
        int hashCode3 = (i ^ (apraVar == null ? 0 : apraVar.hashCode())) * 1000003;
        String str = this.i;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Uri uri2 = this.j;
        return ((hashCode4 ^ (uri2 != null ? uri2.hashCode() : 0)) * 1000003) ^ this.k;
    }

    @Override // defpackage.appq
    public final Optional j() {
        return this.c;
    }

    @Override // defpackage.apnx, defpackage.apqd
    public final String k() {
        return this.i;
    }

    @Override // defpackage.appq
    public final boolean l() {
        return this.h;
    }

    @Override // defpackage.appq
    public final boolean m() {
        return false;
    }

    @Override // defpackage.apnx, defpackage.appq
    public final int n() {
        return this.k;
    }

    public final String toString() {
        Uri uri = this.j;
        apra apraVar = this.e;
        Uri uri2 = this.d;
        Optional optional = this.c;
        Size size = this.f;
        return "BugleImageContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", size=" + size.toString() + ", duration=" + String.valueOf(optional) + ", mediaModifiedTimestamp=" + this.g + ", isResizable=" + this.h + ", saveToExternalStorage=false, originalUri=" + String.valueOf(uri2) + ", progress=" + String.valueOf(apraVar) + ", caption=" + this.i + ", previewUri=" + String.valueOf(uri) + ", displayState=" + appp.a(this.k) + "}";
    }
}
