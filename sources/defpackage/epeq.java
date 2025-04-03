package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epeq extends eyfy implements eyht {
    public static final epeq a;
    private static volatile eyhz q;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public int g;
    public epfs h;
    public int i;
    public int j;
    public epek k;
    public epeo l;
    public epem n;
    public epeb p;
    private byte r = 2;
    public eygi m = emptyIntList();
    public String o = "";

    static {
        epeq epeqVar = new epeq();
        a = epeqVar;
        eyfy.registerDefaultInstance(epeq.class, epeqVar);
    }

    private epeq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0002\u0001ᴌ\u0000\u0002ᴌ\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005᠌\u0004\u0006ဉ\u0005\u0007င\u0006\bင\u0007\tဉ\b\nဉ\t\u000bࠬ\fဉ\n\rဈ\u000b\u000eဉ\f", new Object[]{"b", "c", epfw.a, "d", epee.a, "e", epef.a, "f", "g", epec.a, "h", "i", "j", "k", "l", "m", epdy.a, "n", "o", "p"});
            case NEW_MUTABLE_INSTANCE:
                return new epeq();
            case NEW_BUILDER:
                return new epep();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = q;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (epeq.class) {
                    eyhzVar = q;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        q = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
