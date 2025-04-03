package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akzq extends eyfy implements eyht {
    public static final akzq a;
    private static volatile eyhz d;
    public int b;
    public eygr c = emptyProtobufList();
    private int e;

    static {
        akzq akzqVar = new akzq();
        a = akzqVar;
        eyfy.registerDefaultInstance(akzq.class, akzqVar);
    }

    private akzq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"e", "b", faxr.a, "c", akzl.class});
        }
        if (ordinal == 3) {
            return new akzq();
        }
        if (ordinal == 4) {
            return new akzp();
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
        synchronized (akzq.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
