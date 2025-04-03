package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dexs extends eyfy implements eyht {
    public static final dexs a;
    private static volatile eyhz d;
    public int b;
    public eygr c = eyfy.emptyProtobufList();

    static {
        dexs dexsVar = new dexs();
        a = dexsVar;
        eyfy.registerDefaultInstance(dexs.class, dexsVar);
    }

    private dexs() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002Ț", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new dexs();
        }
        if (ordinal == 4) {
            return new dexr();
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
        synchronized (dexs.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
