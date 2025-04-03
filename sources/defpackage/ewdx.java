package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewdx extends eyfy implements eyht {
    public static final ewdx a;
    private static volatile eyhz d;
    public String b = "";
    public int c;

    static {
        ewdx ewdxVar = new ewdx();
        a = ewdxVar;
        eyfy.registerDefaultInstance(ewdx.class, ewdxVar);
    }

    private ewdx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new ewdx();
        }
        if (ordinal == 4) {
            return new ewdw();
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
        synchronized (ewdx.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
