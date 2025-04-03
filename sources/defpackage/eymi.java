package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eymi extends eyfy implements eyht {
    public static final eymi a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public String d = "";

    static {
        eymi eymiVar = new eymi();
        a = eymiVar;
        eyfy.registerDefaultInstance(eymi.class, eymiVar);
    }

    private eymi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"b", "c", eymg.a, "d"});
        }
        if (ordinal == 3) {
            return new eymi();
        }
        if (ordinal == 4) {
            return new eymh();
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
        synchronized (eymi.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
