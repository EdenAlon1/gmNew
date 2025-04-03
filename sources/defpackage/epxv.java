package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epxv extends eyfy implements eyht {
    public static final epxv a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int e;
    public String d = "";
    public String f = "";

    static {
        epxv epxvVar = new epxv();
        a = epxvVar;
        eyfy.registerDefaultInstance(epxv.class, epxvVar);
    }

    private epxv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဈ\u0003", new Object[]{"b", "c", epxu.a, "d", "e", epxr.a, "f"});
        }
        if (ordinal == 3) {
            return new epxv();
        }
        if (ordinal == 4) {
            return new epxt();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (epxv.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
