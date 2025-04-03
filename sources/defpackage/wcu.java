package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wcu extends eyfy implements eyht {
    public static final wcu a;
    private static volatile eyhz e;
    public aora c;
    private int f;
    public String b = "";
    public String d = "";

    static {
        wcu wcuVar = new wcu();
        a = wcuVar;
        eyfy.registerDefaultInstance(wcu.class, wcuVar);
    }

    private wcu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (ordinal == 3) {
            return new wcu();
        }
        if (ordinal == 4) {
            return new wct();
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
        synchronized (wcu.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
