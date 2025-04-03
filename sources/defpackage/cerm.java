package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cerm extends eyfy implements eyht {
    public static final cerm a;
    private static volatile eyhz i;
    public int b;
    public int d;
    public long e;
    public eopq f;
    public long g;
    public long h;
    private byte j = 2;
    public String c = "";

    static {
        cerm cermVar = new cerm();
        a = cermVar;
        eyfy.registerDefaultInstance(cerm.class, cermVar);
    }

    private cerm() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\t\u0006\u0000\u0000\u0004\u0002ᔈ\u0000\u0003ᔄ\u0001\u0004ᔂ\u0002\u0007ᐉ\u0003\bဂ\u0004\tဂ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new cerm();
            case NEW_BUILDER:
                return new cerl();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = i;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (cerm.class) {
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
