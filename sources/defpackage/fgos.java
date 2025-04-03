package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgos extends eyfy implements eyht {
    public static final fgos a;
    private static volatile eyhz h;
    public int b;
    public fgow c;
    public long d;
    public String e = "";
    public int f;
    public long g;

    static {
        fgos fgosVar = new fgos();
        a = fgosVar;
        eyfy.registerDefaultInstance(fgos.class, fgosVar);
    }

    private fgos() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဃ\u0001\u0006ဈ\u0003\u0007᠌\u0004\bဃ\u0005", new Object[]{"b", "c", "d", "e", "f", fgor.a, "g"});
        }
        if (ordinal == 3) {
            return new fgos();
        }
        if (ordinal == 4) {
            return new fgoq();
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
        synchronized (fgos.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
