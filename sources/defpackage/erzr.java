package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erzr extends eyfy implements eyht {
    public static final erzr a;
    private static volatile eyhz h;
    public long c;
    public String b = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        erzr erzrVar = new erzr();
        a = erzrVar;
        eyfy.registerDefaultInstance(erzr.class, erzrVar);
    }

    private erzr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new erzr();
        }
        if (ordinal == 4) {
            return new erzq();
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
        synchronized (erzr.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
