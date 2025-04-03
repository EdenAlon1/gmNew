package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duzc extends eyfy implements eyht {
    public static final duzc a;
    private static volatile eyhz f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        duzc duzcVar = new duzc();
        a = duzcVar;
        eyfy.registerDefaultInstance(duzc.class, duzcVar);
    }

    private duzc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002:\u0000\u0003@\u0000\u0004A\u0000\u00054\u0000\u0006;\u0000\u0007<\u0000", new Object[]{"d", "c", "b", "e", duzq.class});
        }
        if (ordinal == 3) {
            return new duzc();
        }
        if (ordinal == 4) {
            return new duza();
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
        synchronized (duzc.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
