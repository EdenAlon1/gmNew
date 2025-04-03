package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awyv extends eyfy implements eyht {
    public static final awyv a;
    private static volatile eyhz d;
    public int b;
    public String c = "";

    static {
        awyv awyvVar = new awyv();
        a = awyvVar;
        eyfy.registerDefaultInstance(awyv.class, awyvVar);
    }

    private awyv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new awyv();
        }
        if (ordinal == 4) {
            return new awyu();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (awyv.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
