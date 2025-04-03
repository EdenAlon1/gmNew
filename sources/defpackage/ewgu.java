package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewgu extends eyfy implements eyht {
    public static final ewgu a;
    private static volatile eyhz d;
    public String b = "";
    public long c;

    static {
        ewgu ewguVar = new ewgu();
        a = ewguVar;
        eyfy.registerDefaultInstance(ewgu.class, ewguVar);
    }

    private ewgu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new ewgu();
        }
        if (ordinal == 4) {
            return new ewgt();
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
        synchronized (ewgu.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
