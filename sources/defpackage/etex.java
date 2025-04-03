package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etex extends eyfy implements eyht {
    public static final etex a;
    private static volatile eyhz i;
    public int b;
    public eyja d;
    public int g;
    public eygr c = emptyProtobufList();
    public eyee e = eyee.b;
    public String f = "";
    public eygr h = emptyProtobufList();

    static {
        etex etexVar = new etex();
        a = etexVar;
        eyfy.registerDefaultInstance(etex.class, etexVar);
    }

    private etex() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u001c\u0002ဉ\u0000\u0003\n\u0004Ȉ\u0005\f\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", eyja.class});
        }
        if (ordinal == 3) {
            return new etex();
        }
        if (ordinal == 4) {
            return new etev();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (etex.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
