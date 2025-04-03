package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbhc extends eyfy implements eyht {
    public static final fbhc a;
    private static volatile eyhz i;
    public int b;
    public fcfo c;
    public long d;
    public long e;
    public int f;
    public String g = "";
    public boolean h;
    private fbgp j;

    static {
        fbhc fbhcVar = new fbhc();
        a = fbhcVar;
        eyfy.registerDefaultInstance(fbhc.class, fbhcVar);
    }

    private fbhc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0002\u0003\u0002\u0004\u0004\u0005Ȉ\u0006\u0007\u0007ဉ\u0001", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j"});
        }
        if (ordinal == 3) {
            return new fbhc();
        }
        if (ordinal == 4) {
            return new fbhb();
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
        synchronized (fbhc.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
