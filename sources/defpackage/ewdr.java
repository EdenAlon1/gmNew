package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewdr extends eyfy implements eyht {
    public static final ewdr a;
    private static volatile eyhz d;
    public ewdn b;
    public eydq c;
    private int e;

    static {
        ewdr ewdrVar = new ewdr();
        a = ewdrVar;
        eyfy.registerDefaultInstance(ewdr.class, ewdrVar);
    }

    private ewdr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"e", "b", "c"});
        }
        if (ordinal == 3) {
            return new ewdr();
        }
        if (ordinal == 4) {
            return new ewdq();
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
        synchronized (ewdr.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
