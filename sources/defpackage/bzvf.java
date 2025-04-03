package defpackage;

import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzvf extends cafb {
    public final fays a;
    public final bdhg b;
    public final String c;
    public final enit d;
    public final boolean e;
    public final boolean f;
    public final eote g;
    public final NativeMessageEncryptorV2 h;

    public bzvf(fays faysVar, bdhg bdhgVar, String str, enit enitVar, boolean z, boolean z2, eote eoteVar, NativeMessageEncryptorV2 nativeMessageEncryptorV2) {
        this.a = faysVar;
        this.b = bdhgVar;
        this.c = str;
        this.d = enitVar;
        this.e = z;
        this.f = z2;
        this.g = eoteVar;
        this.h = nativeMessageEncryptorV2;
    }

    @Override // defpackage.cafb
    public final bdhg a() {
        return this.b;
    }

    @Override // defpackage.cafb
    public final enit b() {
        return this.d;
    }

    @Override // defpackage.cafb
    public final eote c() {
        return this.g;
    }

    @Override // defpackage.cafb
    public final NativeMessageEncryptorV2 d() {
        return this.h;
    }

    @Override // defpackage.cafb
    public final fays e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cafb) {
            cafb cafbVar = (cafb) obj;
            if (this.a.equals(cafbVar.e()) && this.b.equals(cafbVar.a()) && this.c.equals(cafbVar.f()) && this.d.equals(cafbVar.b()) && this.e == cafbVar.h() && this.f == cafbVar.g() && this.g.equals(cafbVar.c()) && this.h.equals(cafbVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cafb
    public final String f() {
        return this.c;
    }

    @Override // defpackage.cafb
    public final boolean g() {
        return this.f;
    }

    @Override // defpackage.cafb
    public final boolean h() {
        return this.e;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true == this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        NativeMessageEncryptorV2 nativeMessageEncryptorV2 = this.h;
        eote eoteVar = this.g;
        enit enitVar = this.d;
        bdhg bdhgVar = this.b;
        return "MessageEncryptParams{secretMessage=" + this.a.toString() + ", rcsMessageId=" + bdhgVar.toString() + ", localRegistrationId=" + this.c + ", normalizedDestinationWithRegistrations=" + enitVar.toString() + ", isReceipt=" + this.e + ", forceOtk=" + this.f + ", messageType=" + eoteVar.toString() + ", messageEncryptor=" + nativeMessageEncryptorV2.toString() + "}";
    }
}
