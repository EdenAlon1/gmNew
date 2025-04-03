package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ercb extends eyfy implements eyht {
    public static final ercb a;
    private static volatile eyhz h;
    public int b;
    public long c;
    public int d;
    public eygi e = emptyIntList();
    public long f;
    public long g;

    static {
        ercb ercbVar = new ercb();
        a = ercbVar;
        eyfy.registerDefaultInstance(ercb.class, ercbVar);
    }

    private ercb() {
    }

    public final void a() {
        eygi eygiVar = this.e;
        if (eygiVar.c()) {
            return;
        }
        this.e = eyfy.mutableCopy(eygiVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003,\u0004ဂ\u0002\u0005ဂ\u0003", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new ercb();
        }
        if (ordinal == 4) {
            return new erby();
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
        synchronized (ercb.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
