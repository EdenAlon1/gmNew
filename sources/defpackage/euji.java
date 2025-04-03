package defpackage;

import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euji implements etgh {
    public static etgh a(euds eudsVar) {
        try {
            Provider c = eufj.c();
            if (c == null) {
                throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
            }
            KeyFactory keyFactory = KeyFactory.getInstance("RSA", c);
            eudq c2 = eudsVar.c();
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(eudsVar.a.b, c2.c, eudsVar.b.a, eudsVar.c.a, eudsVar.d.a, eudsVar.e.a, eudsVar.f.a, eudsVar.g.a));
            eudo eudoVar = c2.e;
            eudo eudoVar2 = c2.f;
            int i = c2.g;
            eudsVar.f().c();
            c2.d.equals(eudp.c);
            return new eufi(rSAPrivateCrtKey, eudoVar, eudoVar2, i);
        } catch (NoSuchProviderException unused) {
            RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) ((KeyFactory) euil.g.a("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(eudsVar.a.b, eudsVar.c().c, eudsVar.b.a, eudsVar.c.a, eudsVar.d.a, eudsVar.e.a, eudsVar.f.a, eudsVar.g.a));
            eudq c3 = eudsVar.c();
            euiu euiuVar = (euiu) eujk.a.a(c3.e);
            euiu euiuVar2 = (euiu) eujk.a.a(c3.f);
            eudsVar.f().c();
            eudsVar.c().d.equals(eudp.c);
            return new eujh(rSAPrivateCrtKey2, euiuVar, euiuVar2);
        }
    }
}
