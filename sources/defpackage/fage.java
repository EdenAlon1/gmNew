package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fage extends eyfy implements eyht {
    public static final fage a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public int d;
    public facw e;
    public facw f;
    public float g;
    public long h;

    static {
        fage fageVar = new fage();
        a = fageVar;
        eyfy.registerDefaultInstance(fage.class, fageVar);
    }

    private fage() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u0001\u0006\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new fage();
        }
        if (ordinal == 4) {
            return new fagd();
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
        synchronized (fage.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
