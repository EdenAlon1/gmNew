package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewnt extends eyfy implements eyht {
    public static final ewnt a;
    private static volatile eyhz c;
    public ewnk b;
    private int d;

    static {
        ewnt ewntVar = new ewnt();
        a = ewntVar;
        eyfy.registerDefaultInstance(ewnt.class, ewntVar);
    }

    private ewnt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new ewnt();
        }
        if (ordinal == 4) {
            return new ewns();
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
        synchronized (ewnt.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
