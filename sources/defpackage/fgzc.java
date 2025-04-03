package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgzc {
    public static fgzc a;

    static {
        try {
            a = (fgzc) Class.forName(fhem.a("net.fortuna.ical4j.timezone.registry")).newInstance();
        } catch (Exception unused) {
            a = new fgvc();
        }
    }

    public abstract fgzb a();
}
