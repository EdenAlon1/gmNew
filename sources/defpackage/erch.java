package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erch extends eyfy implements eyht {
    public static final erch a;
    private static volatile eyhz h;
    public int b;
    public int c = 0;
    public Object d;
    public erce e;
    public int f;
    public int g;

    static {
        erch erchVar = new erch();
        a = erchVar;
        eyfy.registerDefaultInstance(erch.class, erchVar);
    }

    private erch() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဉ\u0000\u0004᠌\u0001\u0005င\u0002", new Object[]{"d", "c", "b", ercm.class, erck.class, "e", "f", ercn.a, "g"});
        }
        if (ordinal == 3) {
            return new erch();
        }
        if (ordinal == 4) {
            return new ercg();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (erch.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
