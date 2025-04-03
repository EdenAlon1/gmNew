package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eumj extends eyfy implements eyht {
    public static final eumj a;
    private static volatile eyhz g;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;

    static {
        eumj eumjVar = new eumj();
        a = eumjVar;
        eyfy.registerDefaultInstance(eumj.class, eumjVar);
    }

    private eumj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0004\f\u0005Ȉ\u0006\f", new Object[]{"b", "c", "e", "d", "f"});
        }
        if (ordinal == 3) {
            return new eumj();
        }
        if (ordinal == 4) {
            return new eumi();
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
        synchronized (eumj.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
