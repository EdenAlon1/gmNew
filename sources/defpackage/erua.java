package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erua extends eyfy implements eyht {
    public static final erua a;
    private static volatile eyhz i;
    public int b;
    public boolean c;
    public boolean d;
    public esbe e;
    public int f;
    public esbi g;
    public boolean h;

    static {
        erua eruaVar = new erua();
        a = eruaVar;
        eyfy.registerDefaultInstance(erua.class, eruaVar);
    }

    private erua() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003ဉ\u0000\u0004\f\u0005ဉ\u0001\u0006ဇ\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new erua();
        }
        if (ordinal == 4) {
            return new ertz();
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
        synchronized (erua.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
