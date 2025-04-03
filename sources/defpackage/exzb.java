package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exzb extends eyfy implements eyht {
    public static final exzb a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public exxc f;
    public eygr g = emptyProtobufList();
    public int h;
    public exyx i;
    public exyv j;

    static {
        exzb exzbVar = new exzb();
        a = exzbVar;
        eyfy.registerDefaultInstance(exzb.class, exzbVar);
    }

    private exzb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\t\b\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0002\u0003ဉ\u0003\u0005\u001b\u0006᠌\u0004\u0007ဉ\u0005\bဉ\u0006\tဇ\u0001", new Object[]{"b", "c", exyq.a, "e", "f", "g", exza.class, "h", exys.a, "i", "j", "d"});
        }
        if (ordinal == 3) {
            return new exzb();
        }
        if (ordinal == 4) {
            return new exyp();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exzb.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
