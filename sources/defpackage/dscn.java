package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dscn extends eyfy implements eyht {
    public static final dscn a;
    private static volatile eyhz f;
    public int b;
    public int c = 0;
    public Object d;
    public drer e;

    static {
        dscn dscnVar = new dscn();
        a = dscnVar;
        eyfy.registerDefaultInstance(dscn.class, dscnVar);
    }

    private dscn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0001dÈ\u0002\u0000\u0000\u0000dဉ\u0000È<\u0000", new Object[]{"d", "c", "b", "e", dscm.class});
        }
        if (ordinal == 3) {
            return new dscn();
        }
        if (ordinal == 4) {
            return new dsck();
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
        synchronized (dscn.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
