package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etzw extends eyfy implements eyht {
    public static final etzw a;
    private static volatile eyhz f;
    public String b = "";
    public int c;
    public int d;
    public int e;

    static {
        etzw etzwVar = new etzw();
        a = etzwVar;
        eyfy.registerDefaultInstance(etzw.class, etzwVar);
    }

    private etzw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new etzw();
        }
        if (ordinal == 4) {
            return new etzv();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (etzw.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
