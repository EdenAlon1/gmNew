package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alzx extends ambj {
    private final Long a;
    private final String b;
    private final String c;
    private final String d;
    private final engw e;
    private final Uri f;

    public alzx(Long l, String str, String str2, String str3, engw engwVar, Uri uri) {
        this.a = l;
        if (str == null) {
            throw new NullPointerException("Null lookupKey");
        }
        this.b = str;
        if (str2 == null) {
            throw new NullPointerException("Null header");
        }
        this.c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null displayName");
        }
        this.d = str3;
        if (engwVar == null) {
            throw new NullPointerException("Null destinations");
        }
        this.e = engwVar;
        this.f = uri;
    }

    @Override // defpackage.ambj, defpackage.amar
    public final Uri a() {
        return this.f;
    }

    @Override // defpackage.amar
    public final engw b() {
        return this.e;
    }

    @Override // defpackage.amar
    public final Long c() {
        return this.a;
    }

    @Override // defpackage.amar
    public final String d() {
        return this.d;
    }

    @Override // defpackage.amar
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ambj) {
            ambj ambjVar = (ambj) obj;
            if (this.a.equals(ambjVar.c()) && this.b.equals(ambjVar.f()) && this.c.equals(ambjVar.e()) && this.d.equals(ambjVar.d()) && enkr.h(this.e, ambjVar.b()) && ((uri = this.f) != null ? uri.equals(ambjVar.a()) : ambjVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.amar
    public final String f() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        Uri uri = this.f;
        return (hashCode * 1000003) ^ (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        Uri uri = this.f;
        return "DefaultContactEntry{contactId=" + this.a + ", lookupKey=" + this.b + ", header=" + this.c + ", displayName=" + this.d + ", destinations=" + this.e.toString() + ", photo=" + String.valueOf(uri) + "}";
    }
}
