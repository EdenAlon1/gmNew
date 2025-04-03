package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class fbec extends eyfy implements eyht {
    public static final fbec a;
    private static volatile eyhz j;
    public int b;
    public String c = "";
    public int d;
    public fbei e;
    public fbei f;
    public fbek g;
    public fbek h;
    public fbem i;

    static {
        fbec fbecVar = new fbec();
        a = fbecVar;
        eyfy.registerDefaultInstance(fbec.class, fbecVar);
    }

    private fbec() {
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0006ဉ\u0001\u0007ဉ\u0002\tဉ\u0003\nဉ\u0004\u000bဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new fbec();
        }
        if (ordinal == 4) {
            return new fbeb();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbec.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
