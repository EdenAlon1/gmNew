package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyrp extends eyfy implements eyht {
    public static final eyrp a;
    private static volatile eyhz h;
    public int b;
    public Object d;
    public int e;
    public int c = 0;
    private byte i = 2;
    public String f = "";
    public String g = "";

    static {
        eyrp eyrpVar = new eyrp();
        a = eyrpVar;
        eyfy.registerDefaultInstance(eyrp.class, eyrpVar);
    }

    private eyrp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001f\u0005\u0000\u0000\u0001\u0001ᴌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002e<\u0000f<\u0000", new Object[]{"d", "c", "b", "e", eyro.a, "f", "g", eyrk.class, eyrm.class});
            case NEW_MUTABLE_INSTANCE:
                return new eyrp();
            case NEW_BUILDER:
                return new eyrn();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = h;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (eyrp.class) {
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
