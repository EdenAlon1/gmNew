package org.bouncycastle.asn1.x509;

import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class CRLReason extends ASN1Object {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
    private static final Hashtable c = new Hashtable();
    private ASN1Enumerated d;

    private CRLReason(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid CRL reason : not in (0..MAX)");
        }
        this.d = new ASN1Enumerated(i);
    }

    public static CRLReason a(int i) {
        Integer valueOf = Integer.valueOf(i);
        Hashtable hashtable = c;
        if (!hashtable.containsKey(valueOf)) {
            hashtable.put(valueOf, new CRLReason(i));
        }
        return (CRLReason) hashtable.get(valueOf);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return this.d;
    }

    public final String toString() {
        int intValue = this.d.e().intValue();
        return "CRLReason: ".concat(String.valueOf((intValue < 0 || intValue > 10) ? "invalid" : b[intValue]));
    }
}
