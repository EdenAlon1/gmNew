package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sek extends eyfy implements eyht {
    public static final sek a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        sek sekVar = new sek();
        a = sekVar;
        eyfy.registerDefaultInstance(sek.class, sekVar);
    }

    private sek() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"b", seq.class});
        }
        if (ordinal == 3) {
            return new sek();
        }
        if (ordinal == 4) {
            return new sej();
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
        synchronized (sek.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
