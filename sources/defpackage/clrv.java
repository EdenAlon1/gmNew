package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clrv extends eyfy implements eyht {
    public static final clrv a;
    private static volatile eyhz h;
    public int b;
    public eydq c;
    public clsn d;
    public clqc e;
    public clqx f;
    public clns g;

    static {
        clrv clrvVar = new clrv();
        a = clrvVar;
        eyfy.registerDefaultInstance(clrv.class, clrvVar);
    }

    private clrv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new clrv();
        }
        if (ordinal == 4) {
            return new clru();
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
        synchronized (clrv.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
