package defpackage;

import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.DERIA5String;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhrb extends DERIA5String {
    public fhrb(ASN1IA5String aSN1IA5String) {
        super(aSN1IA5String.e());
    }

    @Override // org.bouncycastle.asn1.ASN1IA5String
    public final String toString() {
        return "VerisignCzagExtension: ".concat(e());
    }
}
