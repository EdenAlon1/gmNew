package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emhg extends eyfy implements eyht {
    public static final emhg a;
    private static volatile eyhz e;
    public int c;
    public eygr b = emptyProtobufList();
    public String d = "";

    static {
        emhg emhgVar = new emhg();
        a = emhgVar;
        eyfy.registerDefaultInstance(emhg.class, emhgVar);
    }

    private emhg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\f\u0003Ȉ", new Object[]{"b", emhe.class, "c", "d"});
        }
        if (ordinal == 3) {
            return new emhg();
        }
        if (ordinal == 4) {
            return new emhf();
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
        synchronized (emhg.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
