package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cagy extends eyfy implements eyht {
    public static final cagy a;
    private static volatile eyhz i;
    public int b;
    public long d;
    public awui g;
    public awui h;
    public String c = "";
    public String e = "";
    public String f = "";

    static {
        cagy cagyVar = new cagy();
        a = cagyVar;
        eyfy.registerDefaultInstance(cagy.class, cagyVar);
    }

    private cagy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0005Ȉ\u0006ဉ\u0000\u0007ဉ\u0001", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new cagy();
        }
        if (ordinal == 4) {
            return new cagx();
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
        synchronized (cagy.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
