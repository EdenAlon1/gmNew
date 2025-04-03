package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doyl extends eyfy implements eyht {
    public static final doyl a;
    private static volatile eyhz d;
    public int b;
    public doyi c;

    static {
        doyl doylVar = new doyl();
        a = doylVar;
        eyfy.registerDefaultInstance(doyl.class, doylVar);
    }

    private doyl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001dd\u0001\u0000\u0000\u0000dဉ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new doyl();
        }
        if (ordinal == 4) {
            return new doyk();
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
        synchronized (doyl.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
