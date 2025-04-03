package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emrz extends eyfy implements eyht {
    public static final emrz a;
    private static volatile eyhz d;
    public eygi b = emptyIntList();
    public long c;

    static {
        emrz emrzVar = new emrz();
        a = emrzVar;
        eyfy.registerDefaultInstance(emrz.class, emrzVar);
    }

    private emrz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001+\u0002\u0010", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new emrz();
        }
        if (ordinal == 4) {
            return new emry();
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
        synchronized (emrz.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
