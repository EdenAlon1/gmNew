package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avhy extends eyfy<avhy, avhx> implements eyht {
    public static final avhy a;
    private static volatile eyhz g;
    public int b;
    public avfh c;
    public boolean d;
    public String e = "";
    public boolean f;

    static {
        avhy avhyVar = new avhy();
        a = avhyVar;
        eyfy.registerDefaultInstance(avhy.class, avhyVar);
    }

    private avhy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003Ȉ\u0004\u0007", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new avhy();
        }
        if (ordinal == 4) {
            return new avhx();
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
        synchronized (avhy.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
