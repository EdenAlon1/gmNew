package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awyz extends eyfy implements eyht {
    public static final awyz a;
    private static volatile eyhz o;
    public int b;
    public awui c;
    public awui d;
    public awui e;
    public azee f;
    public azjw g;
    public fayv j;
    public awul k;
    public awya m;
    public axad n;
    public String h = "";
    public String i = "";
    public eyee l = eyee.b;

    static {
        awyz awyzVar = new awyz();
        a = awyzVar;
        eyfy.registerDefaultInstance(awyz.class, awyzVar);
    }

    private awyz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0005\u0005ဈ\u0006\u0006ဉ\u0007\u0007ဉ\b\bည\t\tဉ\n\nဉ\u000b\u000bဉ\u0003\fဉ\u0004", new Object[]{"b", "c", "d", "e", "h", "i", "j", "k", "l", "m", "n", "f", "g"});
        }
        if (ordinal == 3) {
            return new awyz();
        }
        if (ordinal == 4) {
            return new awyy();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = o;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (awyz.class) {
            eyhzVar = o;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                o = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
