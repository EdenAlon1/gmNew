package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etzx extends eyfy implements eyht {
    public static final etzx a;
    private static volatile eyhz d;
    public int b;
    public eygr c = emptyProtobufList();

    static {
        etzx etzxVar = new etzx();
        a = etzxVar;
        eyfy.registerDefaultInstance(etzx.class, etzxVar);
    }

    private etzx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"b", "c", etzw.class});
        }
        if (ordinal == 3) {
            return new etzx();
        }
        if (ordinal == 4) {
            return new etzu();
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
        synchronized (etzx.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
