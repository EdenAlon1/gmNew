package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eylo extends eyfy implements eyht {
    public static final eylo a;
    private static volatile eyhz e;
    public int b;
    public eylm c;
    public eylq d;

    static {
        eylo eyloVar = new eylo();
        a = eyloVar;
        eyfy.registerDefaultInstance(eylo.class, eyloVar);
    }

    private eylo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new eylo();
        }
        if (ordinal == 4) {
            return new eyln();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eylo.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
