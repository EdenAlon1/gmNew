package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cymp extends eyfy<cymp, cymo> implements eyht {
    public static final cymp a;
    private static volatile eyhz e;
    public int b;
    public float c = 1.0f;
    public boolean d = true;

    static {
        cymp cympVar = new cymp();
        a = cympVar;
        eyfy.registerDefaultInstance(cymp.class, cympVar);
    }

    private cymp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new cymp();
        }
        if (ordinal == 4) {
            return new cymo();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cymp.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
