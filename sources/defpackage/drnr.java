package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drnr extends eyfy implements eyht {
    public static final drnr a;
    private static volatile eyhz h;
    public int b;
    public int c = 0;
    public Object d;
    public eyev e;
    public dteh f;
    public droo g;

    static {
        drnr drnrVar = new drnr();
        a = drnrVar;
        eyfy.registerDefaultInstance(drnr.class, drnrVar);
    }

    private drnr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001È\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001dဉ\u0002È<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", drnq.class});
        }
        if (ordinal == 3) {
            return new drnr();
        }
        if (ordinal == 4) {
            return new drno();
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
        synchronized (drnr.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
