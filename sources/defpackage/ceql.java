package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceql extends eyfy implements eyht {
    public static final ceql a;
    private static volatile eyhz d;
    public eygr b = eyfy.emptyProtobufList();
    public eygr c = eyfy.emptyProtobufList();

    static {
        ceql ceqlVar = new ceql();
        a = ceqlVar;
        eyfy.registerDefaultInstance(ceql.class, ceqlVar);
    }

    private ceql() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001Ț\u0002Ț", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new ceql();
        }
        if (ordinal == 4) {
            return new ceqk();
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
        synchronized (ceql.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
