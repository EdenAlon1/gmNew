package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewhd extends eyfy implements eyht {
    public static final ewhd a;
    private static volatile eyhz d;
    public eygr b = emptyProtobufList();
    public eygi c = emptyIntList();

    static {
        ewhd ewhdVar = new ewhd();
        a = ewhdVar;
        eyfy.registerDefaultInstance(ewhd.class, ewhdVar);
    }

    private ewhd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002+", new Object[]{"b", ewgw.class, "c"});
        }
        if (ordinal == 3) {
            return new ewhd();
        }
        if (ordinal == 4) {
            return new ewhc();
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
        synchronized (ewhd.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
