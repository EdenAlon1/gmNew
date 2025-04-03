package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezna extends eyfy implements eyht {
    public static final ezna a;
    private static volatile eyhz i;
    public String b = "";
    public String c = "";
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;

    static {
        ezna eznaVar = new ezna();
        a = eznaVar;
        eyfy.registerDefaultInstance(ezna.class, eznaVar);
    }

    private ezna() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004\f\u0005\u0004\u0006\f\u0007\f\b\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new ezna();
        }
        if (ordinal == 4) {
            return new ezmz();
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
        synchronized (ezna.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
