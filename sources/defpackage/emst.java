package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emst extends eyfy implements eyht {
    public static final emst a;
    private static volatile eyhz e;
    public int b;
    public eygr c = emptyProtobufList();
    public eygr d = eyfy.emptyProtobufList();

    static {
        emst emstVar = new emst();
        a = emstVar;
        eyfy.registerDefaultInstance(emst.class, emstVar);
    }

    private emst() {
        emptyIntList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0002\u0005\u0003\u0000\u0002\u0000\u0002\u000b\u0003\u001b\u0005Ț", new Object[]{"b", "c", emsj.class, "d"});
        }
        if (ordinal == 3) {
            return new emst();
        }
        if (ordinal == 4) {
            return new emss();
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
        synchronized (emst.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
