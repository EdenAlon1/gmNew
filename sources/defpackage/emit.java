package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emit extends eyfy implements eyht {
    public static final emit a;
    private static volatile eyhz e;
    public Object c;
    private int f;
    public int b = 0;
    public String d = "";

    static {
        emit emitVar = new emit();
        a = emitVar;
        eyfy.registerDefaultInstance(emit.class, emitVar);
    }

    private emit() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u00027\u0000\u00034\u0000\u0004:\u0000", new Object[]{"c", "b", "f", "d"});
        }
        if (ordinal == 3) {
            return new emit();
        }
        if (ordinal == 4) {
            return new emis();
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
        synchronized (emit.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
