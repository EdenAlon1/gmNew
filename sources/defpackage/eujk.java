package defpackage;

import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eujk implements etgi {
    static final etre a;
    private static final byte[] b;
    private static final byte[] c;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        etrd.b(euiu.SHA256, eudo.a, hashMap, hashMap2);
        etrd.b(euiu.SHA384, eudo.b, hashMap, hashMap2);
        etrd.b(euiu.SHA512, eudo.c, hashMap, hashMap2);
        a = etrd.a(hashMap, hashMap2);
        b = new byte[0];
        c = new byte[]{0};
    }

    public static etgi b(eudu euduVar) {
        try {
            Provider c2 = eufj.c();
            if (c2 == null) {
                throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
            }
            RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA", c2).generatePublic(new RSAPublicKeySpec(euduVar.b, euduVar.a.c));
            eudq eudqVar = euduVar.a;
            return new eufj(rSAPublicKey, eudqVar.e, eudqVar.f, eudqVar.g, euduVar.c.c(), euduVar.a.d.equals(eudp.c) ? eufj.b : eufj.a, c2);
        } catch (NoSuchProviderException unused) {
            RSAPublicKey rSAPublicKey2 = (RSAPublicKey) ((KeyFactory) euil.g.a("RSA")).generatePublic(new RSAPublicKeySpec(euduVar.b, euduVar.a.c));
            eudq eudqVar2 = euduVar.a;
            eudo eudoVar = eudqVar2.e;
            etre etreVar = a;
            return new eujj(rSAPublicKey2, (euiu) etreVar.a(eudoVar), (euiu) etreVar.a(eudqVar2.f), eudqVar2.g, euduVar.c.c(), euduVar.a.d.equals(eudp.c) ? c : b);
        }
    }

    @Override // defpackage.etgi
    public final void a(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
