package defpackage;

import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.StringDecoder;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fhep {
    public static fhep a;

    static {
        try {
            a = (fhep) Class.forName(fhem.a("net.fortuna.ical4j.factory.decoder")).newInstance();
        } catch (Exception unused) {
            a = new fheq();
        }
    }

    public abstract BinaryDecoder a(fhbc fhbcVar);

    public abstract StringDecoder b(fhbc fhbcVar);
}
