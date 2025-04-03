package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewik extends eyfy implements eyht {
    public static final ewik a;
    private static volatile eyhz c;
    private String d = "";
    private String e = "";
    public eygr b = eyfy.emptyProtobufList();

    static {
        ewik ewikVar = new ewik();
        a = ewikVar;
        eyfy.registerDefaultInstance(ewik.class, ewikVar);
    }

    private ewik() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ț", new Object[]{"d", "e", "b"});
        }
        if (ordinal == 3) {
            return new ewik();
        }
        if (ordinal == 4) {
            return new ewij();
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
        synchronized (ewik.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
