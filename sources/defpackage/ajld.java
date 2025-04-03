package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajld extends eyfy implements eyht {
    public static final ajld a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public String e = "";

    static {
        ajld ajldVar = new ajld();
        a = ajldVar;
        eyfy.registerDefaultInstance(ajld.class, ajldVar);
    }

    private ajld() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new ajld();
        }
        if (ordinal == 4) {
            return new ajlc();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ajld.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
