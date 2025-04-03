package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eohl extends eyfy implements eyht {
    public static final eohl a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public int d;
    public eohb e;
    public int f;
    public long g;
    private byte j = 2;
    private int i = -1;

    static {
        eohl eohlVar = new eohl();
        a = eohlVar;
        eyfy.registerDefaultInstance(eohl.class, eohlVar);
    }

    private eohl() {
    }

    public static /* synthetic */ void a(eohl eohlVar) {
        eohlVar.b |= 2;
        eohlVar.i = 1;
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဌ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ᐉ\u0003\u0005ဌ\u0004\u0006ဂ\u0005", new Object[]{"b", "c", "i", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new eohl();
            case NEW_BUILDER:
                return new eohk();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = h;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (eohl.class) {
                    eyhzVar = h;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        h = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
