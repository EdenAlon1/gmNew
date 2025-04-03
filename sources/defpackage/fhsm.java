package defpackage;

import java.security.PrivilegedAction;
import java.util.logging.Level;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhsm implements PrivilegedAction {
    final /* synthetic */ fhsp a;

    public fhsm(fhsp fhspVar) {
        this.a = fhspVar;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        fhsp.f("org.bouncycastle.jcajce.provider.digest.", fhsp.i);
        fhsp.f("org.bouncycastle.jcajce.provider.symmetric.", fhsp.d);
        fhsp.f("org.bouncycastle.jcajce.provider.symmetric.", fhsp.e);
        fhpt[] fhptVarArr = fhsp.f;
        int i = 0;
        while (true) {
            int length = fhptVarArr.length;
            if (i == 38) {
                break;
            }
            fhpt fhptVar = fhptVarArr[i];
            try {
                fhpy.a();
                fhsp.e("org.bouncycastle.jcajce.provider.symmetric.", fhptVar.a());
            } catch (fhps unused) {
                if (fhsp.a.isLoggable(Level.FINE)) {
                    fhsp.a.logp(Level.FINE, "org.bouncycastle.jce.provider.BouncyCastleProvider", "loadAlgorithms", "service for " + fhptVar.a() + " ignored due to constraints");
                }
            }
            i++;
        }
        fhsp.f("org.bouncycastle.jcajce.provider.asymmetric.", fhsp.g);
        fhsp.f("org.bouncycastle.jcajce.provider.asymmetric.", fhsp.h);
        fhsp.f("org.bouncycastle.jcajce.provider.keystore.", fhsp.j);
        fhsp.f("org.bouncycastle.jcajce.provider.drbg.", fhsp.k);
        fhsp.d(BCObjectIdentifiers.n, new fibs());
        fhsp.d(BCObjectIdentifiers.o, new fibs());
        fhsp.d(BCObjectIdentifiers.p, new fibs());
        fhsp.d(BCObjectIdentifiers.q, new fibs());
        fhsp.d(BCObjectIdentifiers.r, new fibs());
        fhsp.d(BCObjectIdentifiers.s, new fibs());
        fhsp.d(BCObjectIdentifiers.t, new fibs());
        fhsp.d(BCObjectIdentifiers.u, new fibs());
        fhsp.d(BCObjectIdentifiers.v, new fibs());
        fhsp.d(BCObjectIdentifiers.w, new fibs());
        fhsp.d(BCObjectIdentifiers.x, new fibs());
        fhsp.d(BCObjectIdentifiers.y, new fibs());
        fhsp.d(BCObjectIdentifiers.z, new fibs());
        fhsp.d(BCObjectIdentifiers.A, new fibs());
        fhsp.d(BCObjectIdentifiers.B, new fibs());
        fhsp.d(BCObjectIdentifiers.C, new fibs());
        fhsp.d(BCObjectIdentifiers.D, new fibs());
        fhsp.d(BCObjectIdentifiers.E, new fibs());
        fhsp.d(BCObjectIdentifiers.F, new fibs());
        fhsp.d(BCObjectIdentifiers.G, new fibs());
        fhsp.d(BCObjectIdentifiers.H, new fibs());
        fhsp.d(BCObjectIdentifiers.I, new fibs());
        fhsp.d(BCObjectIdentifiers.J, new fibs());
        fhsp.d(BCObjectIdentifiers.K, new fibs());
        fhsp.d(BCObjectIdentifiers.L, new fibs());
        fhsp.d(BCObjectIdentifiers.M, new fibs());
        fhsp.d(BCObjectIdentifiers.N, new fibs());
        fhsp.d(BCObjectIdentifiers.O, new fibs());
        fhsp.d(BCObjectIdentifiers.P, new fibs());
        fhsp.d(BCObjectIdentifiers.Q, new fibs());
        fhsp.d(BCObjectIdentifiers.R, new fibs());
        fhsp.d(BCObjectIdentifiers.S, new fibs());
        fhsp.d(BCObjectIdentifiers.T, new fibs());
        fhsp.d(BCObjectIdentifiers.U, new fibs());
        fhsp.d(BCObjectIdentifiers.V, new fibs());
        fhsp.d(BCObjectIdentifiers.W, new fibs());
        fhsp.d(BCObjectIdentifiers.X, new fibs());
        fhsp.d(BCObjectIdentifiers.aa, new fibs());
        fhsp.d(BCObjectIdentifiers.ac, new fibs());
        fhsp.d(BCObjectIdentifiers.ae, new fibs());
        fhsp.d(new ASN1ObjectIdentifier("1.3.9999.6.4.10"), new fibs());
        fhsp.d(BCObjectIdentifiers.af, new fibs());
        fhsp.d(BCObjectIdentifiers.ah, new fibs());
        fhsp.d(BCObjectIdentifiers.aj, new fibs());
        fhsp.d(fhtq.d, new fibp());
        fhsp.d(fhtq.e, new fibg());
        fhsp.d(fhtq.f, new fica());
        fhsp.d(fhqw.a, new fica());
        fhsp.d(fhtq.g, new ficb());
        fhsp.d(fhqw.b, new ficb());
        fhsp.d(PKCSObjectIdentifiers.E, new fibd());
        fhsp.d(BCObjectIdentifiers.am, new fibm());
        fhsp.d(BCObjectIdentifiers.aA, new fiau());
        fhsp.d(BCObjectIdentifiers.aB, new fiau());
        fhsp.d(BCObjectIdentifiers.aC, new fiar());
        fhsp.d(BCObjectIdentifiers.aD, new fiar());
        fhsp.d(BCObjectIdentifiers.aE, new fiar());
        fhsp.d(BCObjectIdentifiers.aF, new fiar());
        fhsp.d(BCObjectIdentifiers.aG, new fiar());
        fhsp.d(BCObjectIdentifiers.aH, new fiar());
        fhsp.d(BCObjectIdentifiers.bN, new fiba());
        fhsp.d(BCObjectIdentifiers.bO, new fiba());
        fhsp.d(BCObjectIdentifiers.bP, new fiba());
        fhsp.d(BCObjectIdentifiers.aU, new fiao());
        fhsp.d(BCObjectIdentifiers.aW, new fiao());
        fhsp.d(BCObjectIdentifiers.aY, new fiao());
        fhsp.d(BCObjectIdentifiers.ba, new fiao());
        fhsp.d(BCObjectIdentifiers.bc, new fiao());
        fhsp.d(BCObjectIdentifiers.cj, new fial());
        fhsp.d(BCObjectIdentifiers.ck, new fial());
        fhsp.d(BCObjectIdentifiers.cl, new fial());
        fhsp fhspVar = this.a;
        fhsp.d(BCObjectIdentifiers.cn, new fiax());
        fhsp.d(BCObjectIdentifiers.co, new fiax());
        fhsp.d(BCObjectIdentifiers.cp, new fiax());
        fhsp.d(BCObjectIdentifiers.bP, new fiba());
        fhsp.d(BCObjectIdentifiers.bQ, new fiba());
        fhsp.d(BCObjectIdentifiers.bR, new fiba());
        fhsp.d(BCObjectIdentifiers.bS, new fiba());
        fhsp.d(BCObjectIdentifiers.bG, new fibj());
        fhsp.d(BCObjectIdentifiers.bH, new fibj());
        fhsp.d(BCObjectIdentifiers.bI, new fibj());
        fhsp.d(BCObjectIdentifiers.bJ, new fibj());
        fhspVar.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        fhspVar.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        fhspVar.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        fhspVar.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        fhspVar.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        fhspVar.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        fhspVar.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        fhspVar.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        fhspVar.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        fhspVar.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        fhspVar.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        fhspVar.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        fhspVar.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        fhspVar.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        fhspVar.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        if (fhsp.c != null) {
            fhspVar.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
            fhspVar.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
            fhspVar.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            fhspVar.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8");
            fhspVar.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            fhspVar.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8");
        } else {
            fhspVar.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
            fhspVar.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
            fhspVar.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            fhspVar.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
            fhspVar.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            fhspVar.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        }
        fhspVar.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        fhspVar.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        fhspVar.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        fhspVar.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
        return null;
    }
}
