package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eywh extends eyfy implements eyht {
    public static final eywh a;
    private static volatile eyhz j;
    public int b;
    public String c = "";
    public String d = "";
    public eywf e;
    public eyvy f;
    public eywd g;
    public eywj h;
    public eywb i;

    static {
        eywh eywhVar = new eywh();
        a = eywhVar;
        eyfy.registerDefaultInstance(eywh.class, eywhVar);
    }

    private eywh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0002\u0002ဉ\u0003\u0003ဉ\u0004\u0004ဉ\u0005\u0005ဉ\u0006\u0006ဈ\u0000\u0007ဈ\u0001", new Object[]{"b", "e", "f", "g", "h", "i", "c", "d"});
        }
        if (ordinal == 3) {
            return new eywh();
        }
        if (ordinal == 4) {
            return new eywg();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eywh.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
