package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezun extends eyft implements eyfu {
    public static final ezun a;
    private static volatile eyhz i;
    public int b;
    public Object d;
    public eygr e;
    public int f;
    public long g;
    public eygl h;
    public int c = 0;
    private byte j = 2;

    static {
        ezun ezunVar = new ezun();
        a = ezunVar;
        eyfy.registerDefaultInstance(ezun.class, ezunVar);
    }

    private ezun() {
        emptyLongList();
        this.e = eyfy.emptyProtobufList();
        emptyLongList();
        emptyLongList();
        emptyLongList();
        emptyDoubleList();
        emptyLongList();
        this.h = emptyLongList();
        emptyLongList();
        emptyLongList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\t/\u0006\u0000\u0002\u0000\t᠌\u0000\n6\u0000\u000bဃ\u0001\u0016\u001a\u0017;\u0000/\u0017", new Object[]{"d", "c", "b", "f", ezum.a, "g", "e", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new ezun();
            case NEW_BUILDER:
                return new ezul();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = i;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ezun.class) {
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
