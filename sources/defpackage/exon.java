package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exon extends eyfy implements eyht {
    public static final exon a;
    public static final eyfw b;
    private static volatile eyhz f;
    public int c;
    public exoh d;
    public exne e;

    static {
        exon exonVar = new exon();
        a = exonVar;
        eyfy.registerDefaultInstance(exon.class, exonVar);
        b = eyfy.newSingularGeneratedExtension(eula.a, exonVar, exonVar, null, 462704549, eyjr.MESSAGE, exon.class);
    }

    private exon() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"c", "d", "e"});
        }
        if (ordinal == 3) {
            return new exon();
        }
        if (ordinal == 4) {
            return new exom();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exon.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
