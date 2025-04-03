package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faks extends eyfy implements eyht {
    public static final faks a;
    private static volatile eyhz e;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        faks faksVar = new faks();
        a = faksVar;
        eyfy.registerDefaultInstance(faks.class, faksVar);
    }

    private faks() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"c", "b", "d", fakp.class});
        }
        if (ordinal == 3) {
            return new faks();
        }
        if (ordinal == 4) {
            return new fakq();
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
        synchronized (faks.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
