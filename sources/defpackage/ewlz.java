package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewlz extends eyfy implements eyht {
    public static final ewlz a;
    private static volatile eyhz d;
    public eygr b = emptyProtobufList();
    public eygr c = emptyProtobufList();

    static {
        ewlz ewlzVar = new ewlz();
        a = ewlzVar;
        eyfy.registerDefaultInstance(ewlz.class, ewlzVar);
    }

    private ewlz() {
        eyee eyeeVar = eyee.b;
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
            return new ewlz();
        }
        if (ordinal == 4) {
            return new ewly();
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
        synchronized (ewlz.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
