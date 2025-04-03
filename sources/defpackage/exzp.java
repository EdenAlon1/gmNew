package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exzp extends eyfy implements eyht {
    public static final exzp a;
    private static volatile eyhz i;
    public int b;
    public faul c;
    public faul d;
    public faul e;
    public faul f;
    public faul g;
    public faul h;

    static {
        exzp exzpVar = new exzp();
        a = exzpVar;
        eyfy.registerDefaultInstance(exzp.class, exzpVar);
    }

    private exzp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new exzp();
        }
        if (ordinal == 4) {
            return new exzo();
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
        synchronized (exzp.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
