package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewgk extends eyfy implements eyht {
    public static final ewgk a;
    private static volatile eyhz g;
    public int b;
    public ewgo c;
    public eygr d = emptyProtobufList();
    public int e;
    public int f;

    static {
        ewgk ewgkVar = new ewgk();
        a = ewgkVar;
        eyfy.registerDefaultInstance(ewgk.class, ewgkVar);
    }

    private ewgk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003င\u0001\u0004င\u0002", new Object[]{"b", "c", "d", ewgm.class, "e", "f"});
        }
        if (ordinal == 3) {
            return new ewgk();
        }
        if (ordinal == 4) {
            return new ewgj();
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
        synchronized (ewgk.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
