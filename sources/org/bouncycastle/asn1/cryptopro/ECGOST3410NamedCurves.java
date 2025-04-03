package org.bouncycastle.asn1.cryptopro;

import defpackage.fhrd;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ECGOST3410NamedCurves {
    static final X9ECParametersHolder a;
    static final X9ECParametersHolder b;
    static final X9ECParametersHolder c;
    static final X9ECParametersHolder d;
    static final X9ECParametersHolder e;
    static final X9ECParametersHolder f;
    static final X9ECParametersHolder g;
    static final Hashtable h;
    static final Hashtable i;
    static final Hashtable j;

    static {
        X9ECParametersHolder x9ECParametersHolder = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.1
        };
        a = x9ECParametersHolder;
        X9ECParametersHolder x9ECParametersHolder2 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.2
        };
        b = x9ECParametersHolder2;
        X9ECParametersHolder x9ECParametersHolder3 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.3
        };
        c = x9ECParametersHolder3;
        X9ECParametersHolder x9ECParametersHolder4 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.4
        };
        d = x9ECParametersHolder4;
        X9ECParametersHolder x9ECParametersHolder5 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.5
        };
        e = x9ECParametersHolder5;
        X9ECParametersHolder x9ECParametersHolder6 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.6
        };
        f = x9ECParametersHolder6;
        X9ECParametersHolder x9ECParametersHolder7 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.7
        };
        g = x9ECParametersHolder7;
        h = new Hashtable();
        i = new Hashtable();
        j = new Hashtable();
        a("GostR3410-2001-CryptoPro-A", CryptoProObjectIdentifiers.h, x9ECParametersHolder);
        a("GostR3410-2001-CryptoPro-B", CryptoProObjectIdentifiers.i, x9ECParametersHolder2);
        a("GostR3410-2001-CryptoPro-C", CryptoProObjectIdentifiers.j, x9ECParametersHolder3);
        a("GostR3410-2001-CryptoPro-XchA", CryptoProObjectIdentifiers.k, x9ECParametersHolder);
        a("GostR3410-2001-CryptoPro-XchB", CryptoProObjectIdentifiers.l, x9ECParametersHolder3);
        a("Tc26-Gost-3410-12-256-paramSetA", fhrd.e, x9ECParametersHolder4);
        a("Tc26-Gost-3410-12-256-paramSetB", fhrd.f, x9ECParametersHolder);
        a("Tc26-Gost-3410-12-256-paramSetC", fhrd.g, x9ECParametersHolder2);
        a("Tc26-Gost-3410-12-256-paramSetD", fhrd.h, x9ECParametersHolder3);
        a("Tc26-Gost-3410-12-512-paramSetA", fhrd.j, x9ECParametersHolder5);
        a("Tc26-Gost-3410-12-512-paramSetB", fhrd.k, x9ECParametersHolder6);
        a("Tc26-Gost-3410-12-512-paramSetC", fhrd.l, x9ECParametersHolder7);
    }

    static void a(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, X9ECParametersHolder x9ECParametersHolder) {
        h.put(str, aSN1ObjectIdentifier);
        j.put(aSN1ObjectIdentifier, str);
        i.put(aSN1ObjectIdentifier, x9ECParametersHolder);
    }
}
