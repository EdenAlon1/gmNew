package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbjc extends eyfy implements eyht {
    public static final cbjc a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public awup e;
    public eplp g;
    public String d = "";
    public eyee f = eyee.b;

    static {
        cbjc cbjcVar = new cbjc();
        a = cbjcVar;
        eyfy.registerDefaultInstance(cbjc.class, cbjcVar);
    }

    private cbjc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0004ည\u0001\u0005ဉ\u0002\u0006ဉ\u0000", new Object[]{"b", "c", "d", "f", "g", "e"});
        }
        if (ordinal == 3) {
            return new cbjc();
        }
        if (ordinal == 4) {
            return new cbja();
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
        synchronized (cbjc.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
