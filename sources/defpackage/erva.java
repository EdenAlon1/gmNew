package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erva extends eyfy implements eyht {
    public static final erva a;
    private static volatile eyhz c;
    public String b = "";

    static {
        erva ervaVar = new erva();
        a = ervaVar;
        eyfy.registerDefaultInstance(erva.class, ervaVar);
    }

    private erva() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new erva();
        }
        if (ordinal == 4) {
            return new eruz();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (erva.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
