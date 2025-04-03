package defpackage;

import org.apache.commons.codec.BinaryEncoder;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fhes {
    public static fhes a;

    static {
        try {
            a = (fhes) Class.forName(fhem.a("net.fortuna.ical4j.factory.encoder")).newInstance();
        } catch (Exception unused) {
            a = new fher();
        }
    }

    public abstract BinaryEncoder a(fhbc fhbcVar);
}
