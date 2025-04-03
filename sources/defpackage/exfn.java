package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exfn extends eyfy implements eyht {
    public static final exfn a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public long d = 1;

    static {
        exfn exfnVar = new exfn();
        a = exfnVar;
        eyfy.registerDefaultInstance(exfn.class, exfnVar);
    }

    private exfn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"b", "c", fapj.a, "d"});
        }
        if (ordinal == 3) {
            return new exfn();
        }
        if (ordinal == 4) {
            return new exfm();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exfn.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
