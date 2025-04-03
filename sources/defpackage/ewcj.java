package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewcj extends eyfy implements eyht {
    public static final ewcj a;
    private static volatile eyhz d;
    public int b;
    public eyhm c = eyhm.a;

    static {
        ewcj ewcjVar = new ewcj();
        a = ewcjVar;
        eyfy.registerDefaultInstance(ewcj.class, ewcjVar);
    }

    private ewcj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0004\u00022", new Object[]{"b", "c", ewci.a});
        }
        if (ordinal == 3) {
            return new ewcj();
        }
        if (ordinal == 4) {
            return new ewch();
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
        synchronized (ewcj.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
