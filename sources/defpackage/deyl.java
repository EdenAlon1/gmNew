package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deyl extends eyfy implements eyht {
    public static final deyl a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        deyl deylVar = new deyl();
        a = deylVar;
        eyfy.registerDefaultInstance(deyl.class, deylVar);
    }

    private deyl() {
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", deyk.class});
        }
        if (ordinal == 3) {
            return new deyl();
        }
        if (ordinal == 4) {
            return new dexg();
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
        synchronized (deyl.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
