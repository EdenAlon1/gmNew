package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhge {
    public final fhhh a;
    public final fhfk b;
    public final List c;
    private final ffbz d;

    public fhge(fhhh fhhhVar, fhfk fhfkVar, List list, final ffix ffixVar) {
        fhhhVar.getClass();
        this.a = fhhhVar;
        this.b = fhfkVar;
        this.c = list;
        this.d = ffca.a(new ffix() { // from class: fhgb
            @Override // defpackage.ffix
            public final Object invoke() {
                return fhge.b(ffix.this);
            }
        });
    }

    public static final List b(ffix ffixVar) {
        try {
            return (List) ffixVar.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return ffel.a;
        }
    }

    private static final String c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        type.getClass();
        return type;
    }

    public final List a() {
        return (List) this.d.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fhge)) {
            return false;
        }
        fhge fhgeVar = (fhge) obj;
        return fhgeVar.a == this.a && ffkj.e(fhgeVar.b, this.b) && ffkj.e(fhgeVar.a(), a()) && ffkj.e(fhgeVar.c, this.c);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + a().hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        List a = a();
        ArrayList arrayList = new ArrayList(ffdx.n(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(c((Certificate) it.next()));
        }
        String obj = arrayList.toString();
        fhhh fhhhVar = this.a;
        fhfk fhfkVar = this.b;
        List list = this.c;
        ArrayList arrayList2 = new ArrayList(ffdx.n(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c((Certificate) it2.next()));
        }
        return "Handshake{tlsVersion=" + fhhhVar + " cipherSuite=" + fhfkVar + " peerCertificates=" + obj + " localCertificates=" + arrayList2 + "}";
    }
}
