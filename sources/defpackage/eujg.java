package defpackage;

import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eujg implements etgi {
    static final etre a;
    private static final byte[] b = new byte[0];
    private static final byte[] c = {0};

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        etrd.b(euiu.SHA256, eudc.a, hashMap, hashMap2);
        etrd.b(euiu.SHA384, eudc.b, hashMap, hashMap2);
        etrd.b(euiu.SHA512, eudc.c, hashMap, hashMap2);
        a = etrd.a(hashMap, hashMap2);
    }

    public static etgi b(eudi eudiVar) {
        try {
            byte[] bArr = eufa.a;
            if (ettp.d()) {
                ettp.c().intValue();
            }
            Provider a2 = etqr.a();
            if (a2 != null) {
                return new eufa((RSAPublicKey) KeyFactory.getInstance("RSA", a2).generatePublic(new RSAPublicKeySpec(eudiVar.b, eudiVar.a.c)), eudiVar.a.e, eudiVar.c.c(), eudiVar.a.d.equals(eudd.c) ? eufa.b : eufa.a, a2);
            }
            throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
        } catch (NoSuchProviderException unused) {
            return new eujf((RSAPublicKey) ((KeyFactory) euil.g.a("RSA")).generatePublic(new RSAPublicKeySpec(eudiVar.b, eudiVar.a.c)), (euiu) a.a(eudiVar.a.e), eudiVar.c.c(), eudiVar.a.d.equals(eudd.c) ? c : b);
        }
    }

    @Override // defpackage.etgi
    public final void a(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
