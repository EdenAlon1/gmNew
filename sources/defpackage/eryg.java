package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eryg extends eyfy implements eyht {
    public static final eryg a;
    private static volatile eyhz d;
    public eygr b = emptyProtobufList();
    public String c = "";

    static {
        eryg erygVar = new eryg();
        a = erygVar;
        eyfy.registerDefaultInstance(eryg.class, erygVar);
    }

    private eryg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003Ȉ", new Object[]{"b", eruj.class, "c"});
        }
        if (ordinal == 3) {
            return new eryg();
        }
        if (ordinal == 4) {
            return new eryf();
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
        synchronized (eryg.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
