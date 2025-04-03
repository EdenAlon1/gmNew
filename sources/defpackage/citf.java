package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class citf extends cixt {
    public final String a;
    public final Uri b;
    public final Optional c;

    public citf(String str, Uri uri, Optional optional) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        if (uri == null) {
            throw new NullPointerException("Null iconUri");
        }
        this.b = uri;
        this.c = optional;
    }

    @Override // defpackage.cixt
    public final Uri a() {
        return this.b;
    }

    @Override // defpackage.cixt
    public final Optional b() {
        return this.c;
    }

    @Override // defpackage.cixt
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cixt) {
            cixt cixtVar = (cixt) obj;
            if (this.a.equals(cixtVar.c()) && this.b.equals(cixtVar.a()) && this.c.equals(cixtVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        return "PersonInfo{name=" + this.a + ", iconUri=" + this.b.toString() + ", contactUri=" + optional.toString() + "}";
    }
}
