package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fctc extends eyfy implements eyht {
    public static final fctc a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public int h;

    static {
        fctc fctcVar = new fctc();
        a = fctcVar;
        eyfy.registerDefaultInstance(fctc.class, fctcVar);
    }

    private fctc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0007\u0004\u0002\u0005\u0004\u0006\u0004\u0007\u0004", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new fctc();
        }
        if (ordinal == 4) {
            return new fctb();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fctc.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
