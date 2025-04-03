package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eylg extends eyfy implements eyli {
    public static final eylg a;
    private static volatile eyhz e;
    public int b;
    public eykv c;
    public eylo d;

    static {
        eylg eylgVar = new eylg();
        a = eylgVar;
        eyfy.registerDefaultInstance(eylg.class, eylgVar);
    }

    private eylg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new eylg();
        }
        if (ordinal == 4) {
            return new eylf();
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
        synchronized (eylg.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
