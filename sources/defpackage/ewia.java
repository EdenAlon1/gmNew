package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewia extends eyfy implements eyht {
    public static final ewia a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        ewia ewiaVar = new ewia();
        a = ewiaVar;
        eyfy.registerDefaultInstance(ewia.class, ewiaVar);
    }

    private ewia() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", ewhy.class});
        }
        if (ordinal == 3) {
            return new ewia();
        }
        if (ordinal == 4) {
            return new ewhz();
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
        synchronized (ewia.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
