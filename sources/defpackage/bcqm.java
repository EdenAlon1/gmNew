package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bcqm extends bcxq {
    private final int a;
    private final SelfIdentityId b;
    private final Uri c;
    private final Uri d;
    private final String e;
    private final int f;
    private final String g;

    public bcqm(int i, SelfIdentityId selfIdentityId, Uri uri, Uri uri2, String str, int i2, String str2) {
        this.a = i;
        this.b = selfIdentityId;
        if (uri == null) {
            throw new NullPointerException("Null iconUri");
        }
        this.c = uri;
        if (uri2 == null) {
            throw new NullPointerException("Null selectedIconUri");
        }
        this.d = uri2;
        if (str == null) {
            throw new NullPointerException("Null displayName");
        }
        this.e = str;
        this.f = i2;
        this.g = str2;
    }

    @Override // defpackage.bcxq
    public final int a() {
        return this.f;
    }

    @Override // defpackage.bcxq
    public final int b() {
        return this.a;
    }

    @Override // defpackage.bcxq
    public final Uri c() {
        return this.c;
    }

    @Override // defpackage.bcxq
    public final Uri d() {
        return this.d;
    }

    @Override // defpackage.bcxq
    public final SelfIdentityId e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcxq) {
            bcxq bcxqVar = (bcxq) obj;
            if (this.a == bcxqVar.b() && this.b.equals(bcxqVar.e()) && this.c.equals(bcxqVar.c()) && this.d.equals(bcxqVar.d()) && this.e.equals(bcxqVar.g()) && this.f == bcxqVar.a() && ((str = this.g) != null ? str.equals(bcxqVar.f()) : bcxqVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bcxq
    public final String f() {
        return this.g;
    }

    @Override // defpackage.bcxq
    public final String g() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        String str = this.g;
        return (((hashCode * 1000003) ^ this.f) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        Uri uri = this.d;
        Uri uri2 = this.c;
        return "SelfIdentityEntry{subId=" + this.a + ", selfParticipantId=" + this.b.toString() + ", iconUri=" + uri2.toString() + ", selectedIconUri=" + uri.toString() + ", displayName=" + this.e + ", displayColor=" + this.f + ", displayDestination=" + this.g + "}";
    }
}
