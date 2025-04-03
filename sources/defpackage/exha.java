package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exha extends eyfy implements eyht {
    public static final exha a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public double d;
    public int e;
    public int f;
    public int g;
    public eyja h;

    static {
        exha exhaVar = new exha();
        a = exhaVar;
        eyfy.registerDefaultInstance(exha.class, exhaVar);
    }

    private exha() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002\u0000\u0003\u0004\u0004င\u0000\u0005င\u0001\u0006ဉ\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new exha();
        }
        if (ordinal == 4) {
            return new exgz();
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
        synchronized (exha.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
