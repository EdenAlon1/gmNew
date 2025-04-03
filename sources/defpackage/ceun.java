package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceun extends eyfy implements eyht {
    public static final ceun a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public eyee d = eyee.b;
    public ceup e;

    static {
        ceun ceunVar = new ceun();
        a = ceunVar;
        eyfy.registerDefaultInstance(ceun.class, ceunVar);
    }

    private ceun() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003ဉ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new ceun();
        }
        if (ordinal == 4) {
            return new ceum();
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
        synchronized (ceun.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
