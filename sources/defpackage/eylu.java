package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eylu extends eyfy implements eyht {
    public static final eylu a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public int f;
    public int g;
    public eyly h;

    static {
        eylu eyluVar = new eylu();
        a = eyluVar;
        eyfy.registerDefaultInstance(eylu.class, eyluVar);
    }

    private eylu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0006ဉ\u0005", new Object[]{"b", "c", eyls.a, "d", eylt.a, "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new eylu();
        }
        if (ordinal == 4) {
            return new eylr();
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
        synchronized (eylu.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
