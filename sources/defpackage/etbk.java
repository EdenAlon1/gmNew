package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etbk extends eyfy implements eyht {
    public static final etbk a;
    private static volatile eyhz g;
    public int b;
    public etau c;
    public String d = "";
    public etaq e;
    public eyfh f;

    static {
        etbk etbkVar = new etbk();
        a = etbkVar;
        eyfy.registerDefaultInstance(etbk.class, etbkVar);
    }

    private etbk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001ϧ\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0001\u0003ဉ\u0002ϧဉ\u0000", new Object[]{"b", "d", "e", "f", "c"});
        }
        if (ordinal == 3) {
            return new etbk();
        }
        if (ordinal == 4) {
            return new etbj();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (etbk.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
