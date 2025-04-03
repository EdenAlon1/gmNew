package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahib extends eyfy implements eyht {
    public static final ahib a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public int g;
    public long h;

    static {
        ahib ahibVar = new ahib();
        a = ahibVar;
        eyfy.registerDefaultInstance(ahib.class, ahibVar);
    }

    private ahib() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0006᠌\u0004\u0007ဂ\u0005", new Object[]{"b", "c", akud.a, "d", eqju.a, "e", "f", "g", eqil.a, "h"});
        }
        if (ordinal == 3) {
            return new ahib();
        }
        if (ordinal == 4) {
            return new ahia();
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
        synchronized (ahib.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
