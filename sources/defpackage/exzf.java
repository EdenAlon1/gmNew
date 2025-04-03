package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exzf extends eyfy implements eyht {
    public static final exzf a;
    private static volatile eyhz e;
    public int b;
    public eygr c = emptyProtobufList();
    public exzb d;

    static {
        exzf exzfVar = new exzf();
        a = exzfVar;
        eyfy.registerDefaultInstance(exzf.class, exzfVar);
    }

    private exzf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"b", "c", exze.class, "d"});
        }
        if (ordinal == 3) {
            return new exzf();
        }
        if (ordinal == 4) {
            return new exyo();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exzf.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
