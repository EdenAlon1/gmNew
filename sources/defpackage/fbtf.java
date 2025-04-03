package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbtf extends eyfy implements eyht {
    public static final fbtf a;
    private static volatile eyhz m;
    public int b;
    public int c;
    public fbte d;
    public fbta e;
    public fbst f;
    public fbsw g;
    public fbsy h;
    public fbtc i;
    public fbst j;
    public fbst k;
    public fbsw l;

    static {
        fbtf fbtfVar = new fbtf();
        a = fbtfVar;
        eyfy.registerDefaultInstance(fbtf.class, fbtfVar);
    }

    private fbtf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        }
        if (ordinal == 3) {
            return new fbtf();
        }
        if (ordinal == 4) {
            return new fbsr();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = m;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbtf.class) {
            eyhzVar = m;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                m = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
