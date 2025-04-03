package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clzf extends eyfy<clzf, clza> implements eyht {
    public static final clzf a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public int d;
    public eyja e;
    public boolean f;
    public boolean g;
    public int h;

    static {
        clzf clzfVar = new clzf();
        a = clzfVar;
        eyfy.registerDefaultInstance(clzf.class, clzfVar);
    }

    private clzf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0006ဇ\u0005\u0007ဌ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new clzf();
        }
        if (ordinal == 4) {
            return new clza();
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
        synchronized (clzf.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
