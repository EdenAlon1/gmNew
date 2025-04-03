package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duzq extends eyfy implements eyht {
    public static final duzq a;
    private static volatile eyhz c;
    public eygr b = eyfy.emptyProtobufList();

    static {
        duzq duzqVar = new duzq();
        a = duzqVar;
        eyfy.registerDefaultInstance(duzq.class, duzqVar);
    }

    private duzq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new duzq();
        }
        if (ordinal == 4) {
            return new duzp();
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
        synchronized (duzq.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
