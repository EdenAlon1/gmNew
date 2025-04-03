package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alap extends eyfy implements eyht {
    public static final alap a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        alap alapVar = new alap();
        a = alapVar;
        eyfy.registerDefaultInstance(alap.class, alapVar);
    }

    private alap() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", alan.class});
        }
        if (ordinal == 3) {
            return new alap();
        }
        if (ordinal == 4) {
            return new alao();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (alap.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
