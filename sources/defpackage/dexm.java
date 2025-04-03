package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dexm extends eyfy implements eyht {
    public static final dexm a;
    private static volatile eyhz d;
    public eygr b = emptyProtobufList();
    public boolean c;

    static {
        dexm dexmVar = new dexm();
        a = dexmVar;
        eyfy.registerDefaultInstance(dexm.class, dexmVar);
    }

    private dexm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003\u0007", new Object[]{"b", dexl.class, "c"});
        }
        if (ordinal == 3) {
            return new dexm();
        }
        if (ordinal == 4) {
            return new dexi();
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
        synchronized (dexm.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
