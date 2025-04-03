package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fccb extends eyfy implements eyht {
    public static final fccb a;
    private static volatile eyhz h;
    public fcfk b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    private int i;

    static {
        fccb fccbVar = new fccb();
        a = fccbVar;
        eyfy.registerDefaultInstance(fccb.class, fccbVar);
    }

    private fccb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005", new Object[]{"i", "b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new fccb();
        }
        if (ordinal == 4) {
            return new fcca();
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
        synchronized (fccb.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
