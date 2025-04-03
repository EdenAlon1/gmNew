package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezoo extends eyfy implements eyht {
    public static final ezoo a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g = "";

    static {
        ezoo ezooVar = new ezoo();
        a = ezooVar;
        eyfy.registerDefaultInstance(ezoo.class, ezooVar);
    }

    private ezoo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0004᠌\u0003\u0006᠌\u0005\u0007ဈ\u0006", new Object[]{"b", "c", ezow.a, "d", ezot.a, "e", ezov.a, "f", ezor.a, "g"});
        }
        if (ordinal == 3) {
            return new ezoo();
        }
        if (ordinal == 4) {
            return new ezon();
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
        synchronized (ezoo.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
