package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erwq extends eyfy implements eyht {
    public static final erwq a;
    private static volatile eyhz g;
    public String b = "";
    public int c;
    public int d;
    public boolean e;
    public int f;

    static {
        erwq erwqVar = new erwq();
        a = erwqVar;
        eyfy.registerDefaultInstance(erwq.class, erwqVar);
    }

    private erwq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002Ȉ\u0003\f\u0004\f\u0005\u0007\u0006\f", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new erwq();
        }
        if (ordinal == 4) {
            return new erwo();
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
        synchronized (erwq.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
