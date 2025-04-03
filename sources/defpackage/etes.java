package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etes extends eyfy implements eyht {
    public static final etes a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        etes etesVar = new etes();
        a = etesVar;
        eyfy.registerDefaultInstance(etes.class, etesVar);
    }

    private etes() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", eteq.class});
        }
        if (ordinal == 3) {
            return new etes();
        }
        if (ordinal == 4) {
            return new eter();
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
        synchronized (etes.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
