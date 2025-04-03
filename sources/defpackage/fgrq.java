package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgrq extends eyfy implements eyht {
    public static final fgrq a;
    private static volatile eyhz j;
    public int b;
    public long c;
    public eyja e;
    public eyev f;
    public int g;
    public boolean h;
    public eyev i;
    private byte k = 2;
    public eygr d = emptyProtobufList();

    static {
        fgrq fgrqVar = new fgrq();
        a = fgrqVar;
        eyfy.registerDefaultInstance(fgrq.class, fgrqVar);
    }

    private fgrq() {
        eyfy.emptyProtobufList();
        eyfy.emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0001\u0001စ\u0000\u0003Л\u0004ဉ\u0001\u0005ဉ\u0002\u0007᠌\u0004\bဇ\u0005\tဉ\u0006", new Object[]{"b", "c", "d", fgrn.class, "e", "f", "g", fgrp.a, "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new fgrq();
            case NEW_BUILDER:
                return new fgro();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = j;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fgrq.class) {
                    eyhzVar = j;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        j = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
