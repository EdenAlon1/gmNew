package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erjc extends eyfy implements eyht {
    public static final erjc a;
    private static volatile eyhz i;
    public int b;
    public erie c;
    public int d;
    public long e;
    public long f;
    public String g = "";
    public int h;

    static {
        erjc erjcVar = new erjc();
        a = erjcVar;
        eyfy.registerDefaultInstance(erjc.class, erjcVar);
    }

    private erjc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006င\u0005", new Object[]{"b", "c", "d", erke.a, "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new erjc();
        }
        if (ordinal == 4) {
            return new erjb();
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
        synchronized (erjc.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
