package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgrf extends eyfy implements eyht {
    public static final fgrf a;
    private static volatile eyhz i;
    public int b;
    public long c;
    public fgmh d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    private byte j = 2;

    static {
        fgrf fgrfVar = new fgrf();
        a = fgrfVar;
        eyfy.registerDefaultInstance(fgrf.class, fgrfVar);
    }

    private fgrf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဃ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဃ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new fgrf();
            case NEW_BUILDER:
                return new fgre();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = i;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fgrf.class) {
                    eyhzVar = i;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        i = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
