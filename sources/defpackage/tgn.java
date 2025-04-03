package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgn extends eyfy<tgn, tgl> implements eyht {
    public static final tgn a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        tgn tgnVar = new tgn();
        a = tgnVar;
        eyfy.registerDefaultInstance(tgn.class, tgnVar);
    }

    private tgn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new tgn();
        }
        if (ordinal == 4) {
            return new tgl();
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
        synchronized (tgn.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
