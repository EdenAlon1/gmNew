package defpackage;

import android.net.Uri;
import j$.util.Optional;
import j$.util.OptionalLong;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crbg extends crbv {
    public final Optional a;
    public final Optional b;
    public final Uri c;
    public final Optional d;
    public final OptionalLong e;
    public final Optional f;
    public final Optional g;

    public crbg(Optional optional, Optional optional2, Uri uri, Optional optional3, OptionalLong optionalLong, Optional optional4, Optional optional5) {
        this.a = optional;
        this.b = optional2;
        this.c = uri;
        this.d = optional3;
        this.e = optionalLong;
        this.f = optional4;
        this.g = optional5;
    }

    @Override // defpackage.crbv
    public final Uri a() {
        return this.c;
    }

    @Override // defpackage.crbv
    public final Optional b() {
        return this.a;
    }

    @Override // defpackage.crbv
    public final Optional c() {
        return this.b;
    }

    @Override // defpackage.crbv
    public final Optional d() {
        return this.d;
    }

    @Override // defpackage.crbv
    public final Optional e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crbv) {
            crbv crbvVar = (crbv) obj;
            if (this.a.equals(crbvVar.b()) && this.b.equals(crbvVar.c()) && this.c.equals(crbvVar.a()) && this.d.equals(crbvVar.d()) && this.e.equals(crbvVar.g()) && this.f.equals(crbvVar.e()) && this.g.equals(crbvVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.crbv
    public final Optional f() {
        return this.g;
    }

    @Override // defpackage.crbv
    public final OptionalLong g() {
        return this.e;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        Optional optional = this.g;
        Optional optional2 = this.f;
        OptionalLong optionalLong = this.e;
        Optional optional3 = this.d;
        Uri uri = this.c;
        Optional optional4 = this.b;
        return "FileUploadInfo{audioDuration=" + String.valueOf(this.a) + ", contentType=" + String.valueOf(optional4) + ", contentUri=" + String.valueOf(uri) + ", fileName=" + String.valueOf(optional3) + ", fileSize=" + String.valueOf(optionalLong) + ", previewContentType=" + String.valueOf(optional2) + ", previewData=" + String.valueOf(optional) + "}";
    }
}
