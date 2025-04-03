package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etzs extends eyfy implements eyht {
    public static final etzs a;
    private static volatile eyhz g;
    public int b;
    public etzm c;
    public int d;
    public int e;
    public int f;

    static {
        etzs etzsVar = new etzs();
        a = etzsVar;
        eyfy.registerDefaultInstance(etzs.class, etzsVar);
    }

    private etzs() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new etzs();
        }
        if (ordinal == 4) {
            return new etzr();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (etzs.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
