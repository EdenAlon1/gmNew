package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exjl extends eyfy implements eyht {
    public static final exjl a;
    private static volatile eyhz h;
    public int d;
    public boolean e;
    public boolean g;
    public String b = "";
    public String c = "";
    public eygi f = emptyIntList();

    static {
        exjl exjlVar = new exjl();
        a = exjlVar;
        eyfy.registerDefaultInstance(exjl.class, exjlVar);
    }

    private exjl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\f\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0004\f\u0007\u0007\u000b,\f\u0007", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new exjl();
        }
        if (ordinal == 4) {
            return new exjk();
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
        synchronized (exjl.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
