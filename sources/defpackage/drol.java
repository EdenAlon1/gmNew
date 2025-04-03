package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drol extends eyfy implements eyht {
    public static final drol a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public String g = "";

    static {
        drol drolVar = new drol();
        a = drolVar;
        eyfy.registerDefaultInstance(drol.class, drolVar);
    }

    private drol() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ለ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new drol();
        }
        if (ordinal == 4) {
            return new droh();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (drol.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
