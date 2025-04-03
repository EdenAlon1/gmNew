package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewoi extends eyfy implements eyht {
    public static final ewoi a;
    private static volatile eyhz j;
    public int b;
    public String c = "";
    public int d;
    public eyja e;
    public eyja f;
    public ewol g;
    public ewob h;
    public ewoh i;

    static {
        ewoi ewoiVar = new ewoi();
        a = ewoiVar;
        eyfy.registerDefaultInstance(ewoi.class, ewoiVar);
    }

    private ewoi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001᠌\u0001\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0007ဈ\u0000\bဉ\u0007", new Object[]{"b", "d", ewoe.a, "e", "f", "g", "h", "c", "i"});
        }
        if (ordinal == 3) {
            return new ewoi();
        }
        if (ordinal == 4) {
            return new ewod();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewoi.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
