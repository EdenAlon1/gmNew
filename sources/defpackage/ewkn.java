package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewkn extends eyfy implements eyht {
    public static final ewkn a;
    private static volatile eyhz d;
    public String b = "";
    public int c;
    private int e;

    static {
        ewkn ewknVar = new ewkn();
        a = ewknVar;
        eyfy.registerDefaultInstance(ewkn.class, ewknVar);
    }

    private ewkn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"e", "b", "c"});
        }
        if (ordinal == 3) {
            return new ewkn();
        }
        if (ordinal == 4) {
            return new ewkm();
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
        synchronized (ewkn.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
