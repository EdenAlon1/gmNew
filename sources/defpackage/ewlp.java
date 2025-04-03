package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewlp extends eyfy implements eyht {
    public static final ewlp a;
    private static volatile eyhz g;
    public int b;
    public String c = "";
    public long d;
    public int e;
    public eyja f;

    static {
        ewlp ewlpVar = new ewlp();
        a = ewlpVar;
        eyfy.registerDefaultInstance(ewlp.class, ewlpVar);
    }

    private ewlp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", ewln.a, "f"});
        }
        if (ordinal == 3) {
            return new ewlp();
        }
        if (ordinal == 4) {
            return new ewlm();
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
        synchronized (ewlp.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
