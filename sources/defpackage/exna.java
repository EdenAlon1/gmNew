package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exna extends eyfy implements eyht {
    public static final exna a;
    private static volatile eyhz e;
    public int b;
    public eygr c = emptyProtobufList();
    public long d;

    static {
        exna exnaVar = new exna();
        a = exnaVar;
        eyfy.registerDefaultInstance(exna.class, exnaVar);
    }

    private exna() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000", new Object[]{"b", "c", exnc.class, "d"});
        }
        if (ordinal == 3) {
            return new exna();
        }
        if (ordinal == 4) {
            return new exmz();
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
        synchronized (exna.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
