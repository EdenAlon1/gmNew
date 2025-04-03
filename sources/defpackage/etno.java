package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etno {
    public etnp a = null;
    public etnq b = null;
    public etnr c = null;
    private etgf f = null;
    public etns d = etns.c;
    public eujt e = null;

    public final etnt a() {
        etnp etnpVar = this.a;
        if (etnpVar == null) {
            throw new GeneralSecurityException("Elliptic curve type is not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("Hash type is not set");
        }
        if (this.f == null) {
            throw new GeneralSecurityException("DEM parameters are not set");
        }
        if (this.d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        etnp etnpVar2 = etnp.d;
        if (etnpVar != etnpVar2 && this.c == null) {
            throw new GeneralSecurityException("Point format is not set");
        }
        if (etnpVar != etnpVar2 || this.c == null) {
            return new etnt(this.a, this.b, this.c, this.f, this.d, this.e);
        }
        throw new GeneralSecurityException("For Curve25519 point format must not be set");
    }

    public final void b(etgf etgfVar) {
        if (!etnt.a.contains(etgfVar)) {
            throw new GeneralSecurityException(a.b(etgfVar, "Invalid DEM parameters ", "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported."));
        }
        this.f = etgfVar;
    }
}
