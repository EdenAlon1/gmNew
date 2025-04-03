package defpackage;

import com.android.vcard.VCardConstants;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface fhqx {
    public static final ASN1ObjectIdentifier a;
    public static final ASN1ObjectIdentifier b;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier d;
    public static final ASN1ObjectIdentifier e;
    public static final ASN1ObjectIdentifier f;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.0.10118");
        a = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier f2 = aSN1ObjectIdentifier.f(VCardConstants.VERSION_V30);
        b = f2;
        c = f2.f("49");
        d = f2.f("50");
        e = f2.f("55");
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier("1.0.18033.2");
        f = aSN1ObjectIdentifier2;
        aSN1ObjectIdentifier2.f("1.2");
        aSN1ObjectIdentifier2.f("2.4");
    }
}
