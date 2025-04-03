package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esln extends eyfy implements eyht {
    public static final esln a;
    private static volatile eyhz e;
    public boolean b;
    public long c;
    public boolean d;

    static {
        esln eslnVar = new esln();
        a = eslnVar;
        eyfy.registerDefaultInstance(esln.class, eslnVar);
    }

    private esln() {
        eyee eyeeVar = eyee.b;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0002\u0004\u0007", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new esln();
        }
        if (ordinal == 4) {
            return new eslm();
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
        synchronized (esln.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
