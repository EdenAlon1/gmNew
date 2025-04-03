package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyoy extends eyfy implements eyht {
    public static final eyoy a;
    private static volatile eyhz l;
    public int b;
    public Object d;
    public int e;
    public eyox f;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int c = 0;
    public String g = "";

    static {
        eyoy eyoyVar = new eyoy();
        a = eyoyVar;
        eyfy.registerDefaultInstance(eyoy.class, eyoyVar);
    }

    private eyoy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\n\t\u0000\u0000\u0000\u0001;\u0000\u0003င\u0000\u0004ဉ\u0001\u0005ဈ\u0002\u0006ဇ\u0003\u0007ဇ\u0004\bဇ\u0005\t;\u0000\n᠌\u0006", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", "j", "k", eyou.a});
        }
        if (ordinal == 3) {
            return new eyoy();
        }
        if (ordinal == 4) {
            return new eyot();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eyoy.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
