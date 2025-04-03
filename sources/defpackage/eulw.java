package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eulw extends eyfy implements eyht {
    public static final eulw a;
    private static volatile eyhz d;
    public int b;
    public eyee c = eyee.b;
    private int e;

    static {
        eulw eulwVar = new eulw();
        a = eulwVar;
        eyfy.registerDefaultInstance(eulw.class, eulwVar);
    }

    private eulw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ည\u0001", new Object[]{"e", "b", eulu.a, "c"});
        }
        if (ordinal == 3) {
            return new eulw();
        }
        if (ordinal == 4) {
            return new eult();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eulw.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
