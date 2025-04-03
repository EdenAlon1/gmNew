package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erjs extends eyfy implements eyht {
    public static final erjs a;
    private static volatile eyhz i;
    public int b;
    public long c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;

    static {
        erjs erjsVar = new erjs();
        a = erjsVar;
        eyfy.registerDefaultInstance(erjs.class, erjsVar);
    }

    private erjs() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006᠌\u0005", new Object[]{"b", "c", "d", erjq.a, "e", "f", "g", "h", erjr.a});
        }
        if (ordinal == 3) {
            return new erjs();
        }
        if (ordinal == 4) {
            return new erjp();
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
        synchronized (erjs.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
