package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public final class erut extends eyfy implements eyht {
    public static final erut a;
    private static volatile eyhz d;
    public String b = "";
    public eygr c = emptyProtobufList();

    static {
        erut erutVar = new erut();
        a = erutVar;
        eyfy.registerDefaultInstance(erut.class, erutVar);
    }

    private erut() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"b", "c", esal.class});
        }
        if (ordinal == 3) {
            return new erut();
        }
        if (ordinal == 4) {
            return new erus();
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
        synchronized (erut.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
