package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eptp extends eyfy implements eyht {
    public static final eptp a;
    private static volatile eyhz k;
    public int b;
    public Object d;
    public Object f;
    public eptv g;
    public int h;
    public int i;
    public eqaw j;
    public int c = 0;
    public int e = 0;

    static {
        eptp eptpVar = new eptp();
        a = eptpVar;
        eyfy.registerDefaultInstance(eptp.class, eptpVar);
    }

    private eptp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0002\u0001\u0001É\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004ဉ\u0003e\u083f\u0000f\u083f\u0000É\u083f\u0001", new Object[]{"d", "c", "f", "e", "b", "g", "h", "i", "j", eptl.a, eptj.a, eptn.a});
        }
        if (ordinal == 3) {
            return new eptp();
        }
        if (ordinal == 4) {
            return new epti();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eptp.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
