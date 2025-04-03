package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esnx extends eyfy implements eyht {
    public static final esnx a;
    private static volatile eyhz c;
    public esly b;
    private int d;

    static {
        esnx esnxVar = new esnx();
        a = esnxVar;
        eyfy.registerDefaultInstance(esnx.class, esnxVar);
    }

    private esnx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new esnx();
        }
        if (ordinal == 4) {
            return new esnw();
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
        synchronized (esnx.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
