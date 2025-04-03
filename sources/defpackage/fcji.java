package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcji extends eyfy implements eyht {
    public static final fcji a;
    private static volatile eyhz l;
    public int b;
    public fcfo c;
    public float f;
    public int i;
    public fcfw k;
    public String d = "";
    public String e = "";
    public String g = "";
    public String h = "";
    public eyee j = eyee.b;

    static {
        fcji fcjiVar = new fcji();
        a = fcjiVar;
        eyfy.registerDefaultInstance(fcji.class, fcjiVar);
    }

    private fcji() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0005\u0001\u0006Ȉ\u0007Ȉ\b\f\t\n\nဉ\u0001", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (ordinal == 3) {
            return new fcji();
        }
        if (ordinal == 4) {
            return new fcjh();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fcji.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
