package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyyt extends eyfy implements eyht {
    public static final eyyt a;
    private static volatile eyhz i;
    public int b;
    public Object d;
    public int e;
    public int h;
    public int c = 0;
    public String f = "";
    public String g = "";

    static {
        eyyt eyytVar = new eyyt();
        a = eyytVar;
        eyfy.registerDefaultInstance(eyyt.class, eyytVar);
    }

    private eyyt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004᠌\u0000\u0005ဈ\u0001\u0006ဈ\u0002\u0007᠌\u0003", new Object[]{"d", "c", "b", eyzd.class, eyzf.class, eyyq.class, "e", eyys.a, "f", "g", "h", ezev.a});
        }
        if (ordinal == 3) {
            return new eyyt();
        }
        if (ordinal == 4) {
            return new eyyr();
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
        synchronized (eyyt.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
