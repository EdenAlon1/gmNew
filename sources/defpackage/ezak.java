package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezak extends eyfy implements eyht {
    public static final ezak a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;

    static {
        ezak ezakVar = new ezak();
        a = ezakVar;
        eyfy.registerDefaultInstance(ezak.class, ezakVar);
    }

    private ezak() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"b", "c", ezah.a, "d", ezai.a, "e", ezaf.a, "f", "g"});
        }
        if (ordinal == 3) {
            return new ezak();
        }
        if (ordinal == 4) {
            return new ezae();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ezak.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
