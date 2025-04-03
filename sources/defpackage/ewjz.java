package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewjz extends eyfy implements eyht {
    public static final ewjz a;
    private static volatile eyhz d;
    public eygr b = emptyProtobufList();
    public eygr c = emptyProtobufList();

    static {
        ewjz ewjzVar = new ewjz();
        a = ewjzVar;
        eyfy.registerDefaultInstance(ewjz.class, ewjzVar);
    }

    private ewjz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", ewkp.class, "c", ewja.class});
        }
        if (ordinal == 3) {
            return new ewjz();
        }
        if (ordinal == 4) {
            return new ewjy();
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
        synchronized (ewjz.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
