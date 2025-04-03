package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euhx implements etfr {
    static final etre a;
    static final etre b;
    private final euhz c;
    private final String d;
    private final byte[] e;
    private final euie f;
    private final etpg g;
    private final byte[] h;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        etrd.b(euic.NIST_P256, etnp.a, hashMap, hashMap2);
        etrd.b(euic.NIST_P384, etnp.b, hashMap, hashMap2);
        etrd.b(euic.NIST_P521, etnp.c, hashMap, hashMap2);
        a = etrd.a(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        etrd.b(euie.UNCOMPRESSED, etnr.b, hashMap3, hashMap4);
        etrd.b(euie.COMPRESSED, etnr.a, hashMap3, hashMap4);
        etrd.b(euie.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, etnr.c, hashMap3, hashMap4);
        b = etrd.a(hashMap3, hashMap4);
    }

    private euhx(ECPublicKey eCPublicKey, byte[] bArr, String str, euie euieVar, etpg etpgVar, byte[] bArr2) {
        euif.j(eCPublicKey);
        this.c = new euhz(eCPublicKey);
        this.e = bArr;
        this.d = str;
        this.f = euieVar;
        this.g = etpgVar;
        this.h = bArr2;
    }

    public static etfr b(etnv etnvVar) {
        euic euicVar = (euic) a.a(etnvVar.a.b);
        byte[] byteArray = etnvVar.b.getAffineX().toByteArray();
        byte[] byteArray2 = etnvVar.b.getAffineY().toByteArray();
        ECParameterSpec h = euif.h(euicVar);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, byteArray), new BigInteger(1, byteArray2));
        etrc.f(eCPoint, h.getCurve());
        ECPublicKey eCPublicKey = (ECPublicKey) ((KeyFactory) euil.g.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, h));
        eujt eujtVar = etnvVar.a.g;
        byte[] bArr = new byte[0];
        if (eujtVar != null) {
            bArr = eujtVar.c();
        }
        return new euhx(eCPublicKey, bArr, c(etnvVar.a.c), (euie) b.a(etnvVar.a.d), etph.a(etnvVar.a), etnvVar.d.c());
    }

    static final String c(etnq etnqVar) {
        if (etnqVar.equals(etnq.a)) {
            return "HmacSha1";
        }
        if (etnqVar.equals(etnq.b)) {
            return "HmacSha224";
        }
        if (etnqVar.equals(etnq.c)) {
            return "HmacSha256";
        }
        if (etnqVar.equals(etnq.d)) {
            return "HmacSha384";
        }
        if (etnqVar.equals(etnq.e)) {
            return "HmacSha512";
        }
        throw new GeneralSecurityException("hash unsupported for EciesAeadHkdf: ".concat(String.valueOf(String.valueOf(etnqVar))));
    }

    @Override // defpackage.etfr
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        euhz euhzVar = this.c;
        ECPublicKey eCPublicKey = euhzVar.a;
        int a2 = this.g.a();
        KeyPair c = euif.c(eCPublicKey.getParams());
        ECPublicKey eCPublicKey2 = (ECPublicKey) c.getPublic();
        byte[] k = euif.k((ECPrivateKey) c.getPrivate(), euhzVar.a);
        byte[] m = euif.m(eCPublicKey2.getParams().getCurve(), this.f, eCPublicKey2.getW());
        byte[] a3 = euiw.a(m, k, this.d, this.e, bArr2, a2);
        eujt b2 = eujt.b(m);
        byte[] c2 = eujt.b(a3).c();
        byte[] c3 = b2.c();
        return this.g.c(c2, this.h, c3, bArr);
    }
}
