package defpackage;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhls extends fhlu {
    private final fhlw a;

    public fhls(fhlw fhlwVar) {
        this.a = fhlwVar;
    }

    private static final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!ffkj.e(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // defpackage.fhlu
    public final List a(List list, String str) {
        list.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        removeFirst.getClass();
        arrayList.add(removeFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a = this.a.a(x509Certificate);
            if (a == null) {
                Iterator it = arrayDeque.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z) {
                    Objects.toString(x509Certificate);
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed ".concat(x509Certificate.toString()));
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !ffkj.e(x509Certificate, a)) {
                arrayList.add(a);
            }
            if (b(a, a)) {
                return arrayList;
            }
            z = true;
        }
        arrayList.toString();
        throw new SSLPeerUnverifiedException("Certificate chain too long: ".concat(arrayList.toString()));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof fhls) && ffkj.e(((fhls) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
