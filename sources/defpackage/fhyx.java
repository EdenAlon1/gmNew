package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhyx {
    public static SubjectPublicKeyInfo a(fhqo fhqoVar) {
        if (fhqoVar instanceof ficg) {
            ficg ficgVar = (ficg) fhqoVar;
            return new SubjectPublicKeyInfo(fhyy.s(ficgVar.b), fics.c(ficgVar.c));
        }
        if (fhqoVar instanceof fhxn) {
            fhxn fhxnVar = (fhxn) fhqoVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(fhtq.d, new fhtr(fhyy.t(fhxnVar.b))), fhxnVar.a());
        }
        if (fhqoVar instanceof fhwf) {
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(fhtq.e), ((fhwf) fhqoVar).a());
        }
        if (fhqoVar instanceof fhvz) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            fhvo.d(1, byteArrayOutputStream);
            fhvo.a((fhvz) fhqoVar, byteArrayOutputStream);
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.E), new DEROctetString(byteArrayOutputStream.toByteArray()));
        }
        if (fhqoVar instanceof fhvs) {
            fhvs fhvsVar = (fhvs) fhqoVar;
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            fhvo.d(fhvsVar.b, byteArrayOutputStream2);
            fhvo.a(fhvsVar.c, byteArrayOutputStream2);
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.E), new DEROctetString(byteArrayOutputStream2.toByteArray()));
        }
        if (fhqoVar instanceof fhxx) {
            fhxx fhxxVar = (fhxx) fhqoVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(fhyy.q(fhxxVar.b)), fhxxVar.a());
        }
        if (fhqoVar instanceof fhuj) {
            fhuj fhujVar = (fhuj) fhqoVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(fhyy.j(fhujVar.b)), fhujVar.a());
        }
        if (fhqoVar instanceof fiag) {
            fiag fiagVar = (fiag) fhqoVar;
            byte[] g = fiai.g(fiagVar.e);
            byte[] g2 = fiai.g(fiagVar.d);
            byte[] a = fiagVar.a();
            if (a.length > g.length + g2.length) {
                return new SubjectPublicKeyInfo(new AlgorithmIdentifier(fhqw.a), new DEROctetString(a));
            }
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(fhtq.f, new fhtu(fiagVar.c.c, fhyy.u(fiagVar.b))), new fhtz(g, g2));
        }
        if (fhqoVar instanceof fhzy) {
            fhzy fhzyVar = (fhzy) fhqoVar;
            byte[] a2 = fhzyVar.a();
            byte[] b = fhzyVar.b();
            byte[] c = fhzyVar.c();
            if (c.length > a2.length + b.length) {
                return new SubjectPublicKeyInfo(new AlgorithmIdentifier(fhqw.b), new DEROctetString(c));
            }
            fhzu fhzuVar = fhzyVar.c;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(fhtq.g, new fhtv(fhzuVar.d, fhzuVar.e, fhyy.u(fhzyVar.b))), new fhtx(fhzyVar.a(), fhzyVar.b()));
        }
        if (fhqoVar instanceof fice) {
            fice ficeVar = (fice) fhqoVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(fhtq.c), new fhtp(ficeVar.c, ficeVar.d, ficeVar.e, fhyy.r(ficeVar.b)));
        }
        if (fhqoVar instanceof fhvj) {
            fhvj fhvjVar = (fhvj) fhqoVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(fhyy.g(fhvjVar.b)), new DEROctetString(fics.c(fhvjVar.c)));
        }
        if (fhqoVar instanceof fhxi) {
            fhxi fhxiVar = (fhxi) fhqoVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(fhyy.o(fhxiVar.b)), new DERSequence(new DEROctetString(fics.c(fhxiVar.c))));
        }
        if (fhqoVar instanceof fhwv) {
            fhwv fhwvVar = (fhwv) fhqoVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(fhyy.m(fhwvVar.b)), new DEROctetString(fhwvVar.a()));
        }
        if (fhqoVar instanceof fhwj) {
            fhwj fhwjVar = (fhwj) fhqoVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(fhyy.k(fhwjVar.b)), new DEROctetString(fhwjVar.a()));
        }
        if (fhqoVar instanceof fhvf) {
            fhvf fhvfVar = (fhvf) fhqoVar;
            byte[] c2 = fics.c(fhvfVar.c);
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(fhyy.f(fhvfVar.b));
            int length = c2.length;
            byte[] bArr = new byte[length + 1];
            bArr[0] = (byte) fhvfVar.b.d;
            System.arraycopy(c2, 0, bArr, 1, length);
            return new SubjectPublicKeyInfo(algorithmIdentifier, bArr);
        }
        if (fhqoVar instanceof fhuz) {
            fhuz fhuzVar = (fhuz) fhqoVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(fhyy.i(fhuzVar.b)), fics.e(fhuzVar.c, fhuzVar.d));
        }
        if (fhqoVar instanceof fhwn) {
            fhwn fhwnVar = (fhwn) fhqoVar;
            byte[] bArr2 = new byte[fhwnVar.b.g];
            byte[] bArr3 = fhwnVar.c;
            System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
            byte[] bArr4 = fhwnVar.d;
            System.arraycopy(bArr4, 0, bArr2, fhwnVar.c.length, bArr4.length);
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(fhyy.l(fhwnVar.b)), new DEROctetString(bArr2));
        }
        if (fhqoVar instanceof fhwr) {
            fhwr fhwrVar = (fhwr) fhqoVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(fhyy.p(fhwrVar.b)), new DEROctetString(fics.c(fhwrVar.c)));
        }
        if (fhqoVar instanceof fhus) {
            fhus fhusVar = (fhus) fhqoVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(fhyy.e(fhusVar.b)), fhusVar.a());
        }
        if (fhqoVar instanceof fhud) {
            fhud fhudVar = (fhud) fhqoVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(fhyy.d(fhudVar.b)), fhudVar.a());
        }
        if (fhqoVar instanceof fhvn) {
            fhvn fhvnVar = (fhvn) fhqoVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(fhyy.h(fhvnVar.b)), fhvnVar.a());
        }
        if (!(fhqoVar instanceof fhxc)) {
            throw new IOException("key parameters not recognized");
        }
        fhxc fhxcVar = (fhxc) fhqoVar;
        return new SubjectPublicKeyInfo(new AlgorithmIdentifier(fhyy.n(fhxcVar.b)), new DEROctetString(fhxcVar.b.m != 1 ? fics.e(fics.e(fics.e(fics.e(fics.e(fhxcVar.d, fhxd.d(fhxcVar.e, false)), fhxd.d(fhxcVar.f, true)), fhxd.d(fhxcVar.g, false)), fhxd.d(fhxcVar.h, true)), fhxd.d(fhxcVar.i, true)) : fhxd.d(fhxcVar.c, true)));
    }
}
