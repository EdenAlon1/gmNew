package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dexz extends eyfy implements eyht {
    public static final dexz a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        dexz dexzVar = new dexz();
        a = dexzVar;
        eyfy.registerDefaultInstance(dexz.class, dexzVar);
    }

    private dexz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002Ȼ\u0000", new Object[]{"c", "b"});
        }
        if (ordinal == 3) {
            return new dexz();
        }
        if (ordinal == 4) {
            return new dexy();
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
        synchronized (dexz.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
