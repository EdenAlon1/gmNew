package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyrf extends eyfy implements eyht {
    public static final eyrf a;
    private static volatile eyhz i;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        eyrf eyrfVar = new eyrf();
        a = eyrfVar;
        eyfy.registerDefaultInstance(eyrf.class, eyrfVar);
    }

    private eyrf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0013\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\t᠌\u0006\n᠌\u0007\u0013᠌\t", new Object[]{"b", "c", "d", "e", ezef.a, "f", ezeg.a, "g", ezeh.a, "h", eyre.a});
        }
        if (ordinal == 3) {
            return new eyrf();
        }
        if (ordinal == 4) {
            return new eyrd();
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
        synchronized (eyrf.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
