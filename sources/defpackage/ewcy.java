package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewcy extends eyfy implements eyht {
    public static final ewcy a;
    private static volatile eyhz c;
    public eygr b = eyfy.emptyProtobufList();

    static {
        ewcy ewcyVar = new ewcy();
        a = ewcyVar;
        eyfy.registerDefaultInstance(ewcy.class, ewcyVar);
    }

    private ewcy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new ewcy();
        }
        if (ordinal == 4) {
            return new ewcx();
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
        synchronized (ewcy.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
