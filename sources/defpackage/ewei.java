package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewei extends eyfy implements eyht {
    public static final ewei a;
    private static volatile eyhz g;
    public int b;
    public String c = "";
    public eygr d = emptyProtobufList();
    public String e = "";
    public ewek f;

    static {
        ewei eweiVar = new ewei();
        a = eweiVar;
        eyfy.registerDefaultInstance(ewei.class, eweiVar);
    }

    private ewei() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0000\u0002Ȉ\u0004\u001b\u0005Ȉ\u0006ဉ\u0000", new Object[]{"b", "c", "d", ewfc.class, "e", "f"});
        }
        if (ordinal == 3) {
            return new ewei();
        }
        if (ordinal == 4) {
            return new eweh();
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
        synchronized (ewei.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
