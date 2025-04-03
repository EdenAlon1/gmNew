package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhvu {
    public static final fhvu a = new fhvu(1, 32, 1, 265, NISTObjectIdentifiers.c);
    public static final fhvu b;
    public static final fhvu c;
    public static final fhvu d;
    public static final fhvu e;
    public static final fhvu f;
    public static final fhvu g;
    public static final fhvu h;
    public static final fhvu i;
    public static final fhvu j;
    public static final fhvu k;
    public static final fhvu l;
    public static final fhvu m;
    public static final fhvu n;
    public static final fhvu o;
    public static final fhvu p;
    private static final Map v;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final ASN1ObjectIdentifier u;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.c;
        b = new fhvu(2, 32, 2, 133, aSN1ObjectIdentifier);
        c = new fhvu(3, 32, 4, 67, aSN1ObjectIdentifier);
        d = new fhvu(4, 32, 8, 34, aSN1ObjectIdentifier);
        e = new fhvu(5, 24, 1, BasePaymentResult.ERROR_REQUEST_FAILED, aSN1ObjectIdentifier);
        f = new fhvu(6, 24, 2, EnergyProfile.EVCONNECTOR_TYPE_OTHER, aSN1ObjectIdentifier);
        g = new fhvu(7, 24, 4, 51, aSN1ObjectIdentifier);
        h = new fhvu(8, 24, 8, 26, aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.o;
        i = new fhvu(9, 32, 1, 265, aSN1ObjectIdentifier2);
        j = new fhvu(10, 32, 2, 133, aSN1ObjectIdentifier2);
        k = new fhvu(11, 32, 4, 67, aSN1ObjectIdentifier2);
        l = new fhvu(12, 32, 8, 34, aSN1ObjectIdentifier2);
        m = new fhvu(13, 24, 1, BasePaymentResult.ERROR_REQUEST_FAILED, aSN1ObjectIdentifier2);
        n = new fhvu(14, 24, 2, EnergyProfile.EVCONNECTOR_TYPE_OTHER, aSN1ObjectIdentifier2);
        o = new fhvu(15, 24, 4, 51, aSN1ObjectIdentifier2);
        p = new fhvu(16, 24, 8, 26, aSN1ObjectIdentifier2);
        v = new fhvt();
    }

    protected fhvu(int i2, int i3, int i4, int i5, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.q = i2;
        this.r = i3;
        this.s = i4;
        this.t = i5;
        this.u = aSN1ObjectIdentifier;
    }

    public static fhvu a(int i2) {
        return (fhvu) v.get(Integer.valueOf(i2));
    }
}
