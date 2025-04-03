package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fark extends eyft implements eyfu {
    public static final fark a;
    private static volatile eyhz c;
    public fari b;
    private int d;
    private fara e;
    private farv f;
    private faqy g;
    private faro h;
    private byte i = 2;

    static {
        fark farkVar = new fark();
        a = farkVar;
        eyfy.registerDefaultInstance(fark.class, farkVar);
    }

    private fark() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u001c\u0005\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0007ᐉ\t\nဉ\u0011\u001cဉ\u001c", new Object[]{"d", "e", "b", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new fark();
            case NEW_BUILDER:
                return new farj();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = c;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fark.class) {
                    eyhzVar = c;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        c = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
