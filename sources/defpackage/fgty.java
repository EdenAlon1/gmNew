package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgty {
    public static fgty a;

    static {
        try {
            a = (fgty) Class.forName(fhem.a("net.fortuna.ical4j.parser")).newInstance();
        } catch (Exception unused) {
            a = new fguh();
        }
    }

    public abstract fgtx a();
}
