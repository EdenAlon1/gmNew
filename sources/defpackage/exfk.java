package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exfk extends eyfy implements eyht {
    public static final exfk a;
    private static volatile eyhz h;
    public int b;
    public int c = 1;
    public exge d;
    public exgc e;
    public exfn f;
    public exfs g;

    static {
        exfk exfkVar = new exfk();
        a = exfkVar;
        eyfy.registerDefaultInstance(exfk.class, exfkVar);
    }

    private exfk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0001", new Object[]{"b", "c", exfq.a, "e", "f", "g", "d"});
        }
        if (ordinal == 3) {
            return new exfk();
        }
        if (ordinal == 4) {
            return new exfj();
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
        synchronized (exfk.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
