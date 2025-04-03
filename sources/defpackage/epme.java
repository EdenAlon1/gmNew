package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epme extends eyfy implements eyht {
    public static final epme a;
    private static volatile eyhz i;
    public int b;
    public erhm c;
    public erhm e;
    public epnw f;
    public epmu g;
    public epmg h;
    private erhm j;
    private byte k = 2;
    public eygr d = emptyProtobufList();

    static {
        epme epmeVar = new epme();
        a = epmeVar;
        eyfy.registerDefaultInstance(epme.class, epmeVar);
    }

    private epme() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0007\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0003\tᐉ\u0007", new Object[]{"b", "c", "d", epoa.class, "e", "f", "g", "j", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new epme();
            case NEW_BUILDER:
                return new epmd();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = i;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (epme.class) {
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
