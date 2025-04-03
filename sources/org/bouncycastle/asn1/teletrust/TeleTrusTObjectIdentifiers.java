package org.bouncycastle.asn1.teletrust;

import com.android.vcard.VCardConstants;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface TeleTrusTObjectIdentifiers {
    public static final ASN1ObjectIdentifier a;
    public static final ASN1ObjectIdentifier b;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier d;
    public static final ASN1ObjectIdentifier e;
    public static final ASN1ObjectIdentifier f;
    public static final ASN1ObjectIdentifier g;
    public static final ASN1ObjectIdentifier h;
    public static final ASN1ObjectIdentifier i;
    public static final ASN1ObjectIdentifier j;
    public static final ASN1ObjectIdentifier k;
    public static final ASN1ObjectIdentifier l;
    public static final ASN1ObjectIdentifier m;
    public static final ASN1ObjectIdentifier n;
    public static final ASN1ObjectIdentifier o;
    public static final ASN1ObjectIdentifier p;
    public static final ASN1ObjectIdentifier q;
    public static final ASN1ObjectIdentifier r;
    public static final ASN1ObjectIdentifier s;
    public static final ASN1ObjectIdentifier t;
    public static final ASN1ObjectIdentifier u;
    public static final ASN1ObjectIdentifier v;
    public static final ASN1ObjectIdentifier w;
    public static final ASN1ObjectIdentifier x;
    public static final ASN1ObjectIdentifier y;
    public static final ASN1ObjectIdentifier z;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.36.3");
        a = aSN1ObjectIdentifier;
        b = aSN1ObjectIdentifier.f(VCardConstants.VERSION_V21);
        c = aSN1ObjectIdentifier.f("2.2");
        d = aSN1ObjectIdentifier.f("2.3");
        ASN1ObjectIdentifier f2 = aSN1ObjectIdentifier.f("3.1");
        e = f2;
        f = f2.f("2");
        g = f2.f("3");
        h = f2.f("4");
        ASN1ObjectIdentifier f3 = aSN1ObjectIdentifier.f("3.2");
        i = f3;
        f3.f("1");
        f3.f("2");
        ASN1ObjectIdentifier f4 = aSN1ObjectIdentifier.f("3.2.8");
        j = f4;
        ASN1ObjectIdentifier f5 = f4.f("1");
        k = f5;
        ASN1ObjectIdentifier f6 = f5.f("1");
        l = f6;
        m = f6.f("1");
        n = f6.f("2");
        o = f6.f("3");
        p = f6.f("4");
        q = f6.f("5");
        r = f6.f("6");
        s = f6.f("7");
        t = f6.f("8");
        u = f6.f("9");
        v = f6.f("10");
        w = f6.f("11");
        x = f6.f("12");
        y = f6.f("13");
        z = f6.f("14");
    }
}
