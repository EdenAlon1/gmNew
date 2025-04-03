package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drct extends eyfy implements eyht {
    public static final drct a;
    private static volatile eyhz d;
    public int b;
    public drer c;

    static {
        drct drctVar = new drct();
        a = drctVar;
        eyfy.registerDefaultInstance(drct.class, drctVar);
    }

    private drct() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001ee\u0001\u0000\u0000\u0000eဉ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new drct();
        }
        if (ordinal == 4) {
            return new drcs();
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
        synchronized (drct.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
