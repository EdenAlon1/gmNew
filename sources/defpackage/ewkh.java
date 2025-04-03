package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewkh extends eyfy implements eyht {
    public static final ewkh a;
    private static volatile eyhz g;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    private int h;

    static {
        ewkh ewkhVar = new ewkh();
        a = ewkhVar;
        eyfy.registerDefaultInstance(ewkh.class, ewkhVar);
    }

    private ewkh() {
        emptyIntList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\u0007\u0005\u0000\u0000\u0000\u0003ဇ\u0001\u0004ဇ\u0002\u0005᠌\u0003\u0006᠌\u0004\u0007ဇ\u0005", new Object[]{"h", "b", "c", "d", ewkf.a, "e", ewkd.a, "f"});
        }
        if (ordinal == 3) {
            return new ewkh();
        }
        if (ordinal == 4) {
            return new ewkc();
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
        synchronized (ewkh.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
