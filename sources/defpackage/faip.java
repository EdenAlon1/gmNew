package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faip extends eyfy implements eyht {
    public static final faip a;
    private static volatile eyhz e;
    public int b;
    public fajm c;
    public faki d;

    static {
        faip faipVar = new faip();
        a = faipVar;
        eyfy.registerDefaultInstance(faip.class, faipVar);
    }

    private faip() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new faip();
        }
        if (ordinal == 4) {
            return new faio();
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
        synchronized (faip.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
