package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epes extends eyfy implements eyht {
    public static final epes a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public int d;
    public long e;
    public double f;
    public int g;
    public boolean h;

    static {
        epes epesVar = new epes();
        a = epesVar;
        eyfy.registerDefaultInstance(epes.class, epesVar);
    }

    private epes() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဋ\u0001\u0003ဃ\u0002\u0004က\u0003\u0005᠌\u0004\u0006ဇ\u0005", new Object[]{"b", "c", epee.a, "d", "e", "f", "g", epfw.a, "h"});
        }
        if (ordinal == 3) {
            return new epes();
        }
        if (ordinal == 4) {
            return new eper();
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
        synchronized (epes.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
