package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alov extends eyfy implements eyht {
    public static final alov a;
    private static volatile eyhz g;
    public int b;
    public eyhm c = eyhm.a;
    public int d;
    public int e;
    public int f;

    static {
        alov alovVar = new alov();
        a = alovVar;
        eyfy.registerDefaultInstance(alov.class, alovVar);
    }

    private alov() {
    }

    public final eyhm a() {
        eyhm eyhmVar = this.c;
        if (!eyhmVar.b) {
            this.c = eyhmVar.a();
        }
        return this.c;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u00012\u0002င\u0000\u0003င\u0001\u0004င\u0002", new Object[]{"b", "c", alou.a, "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new alov();
        }
        if (ordinal == 4) {
            return new alot();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (alov.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
