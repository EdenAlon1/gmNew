package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emkq extends eyfy implements eyht {
    public static final emkq a;
    private static volatile eyhz l;
    public int b;
    public emiw c;
    public emko d;
    public emlc e;
    public emle f;
    public emhv g;
    public boolean h;
    public emkd i;
    public emku j;
    public emks k;
    private byte m = 2;

    static {
        emkq emkqVar = new emkq();
        a = emkqVar;
        eyfy.registerDefaultInstance(emkq.class, emkqVar);
    }

    private emkq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0002\u000b\t\u0000\u0000\u0001\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ᐉ\u0003\u0006ဉ\u0004\bဇ\u0006\tဉ\u0007\nဉ\b\u000bဉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new emkq();
            case NEW_BUILDER:
                return new emkp();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = l;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (emkq.class) {
                    eyhzVar = l;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        l = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
