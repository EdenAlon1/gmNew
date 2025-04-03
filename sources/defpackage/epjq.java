package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epjq extends eyfy implements eyht {
    public static final epjq a;
    private static volatile eyhz n;
    public int b;
    public int c;
    public int d;
    public eygi e;
    public int f;
    public eygr g;
    public int h;
    public eygr i;
    public int j;
    public String k;
    public int l;
    public long m;

    static {
        epjq epjqVar = new epjq();
        a = epjqVar;
        eyfy.registerDefaultInstance(epjq.class, epjqVar);
    }

    private epjq() {
        emptyIntList();
        emptyIntList();
        this.e = emptyIntList();
        this.g = emptyProtobufList();
        this.i = emptyProtobufList();
        this.k = "";
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0002\u000e\u000b\u0000\u0003\u0000\u0002᠌\u0000\u0003င\u0001\u0006᠌\u0002\u0007\u001b\bင\u0003\t᠌\u0004\nဈ\u0005\u000bࠞ\f᠌\u0006\r\u001b\u000eဂ\u0007", new Object[]{"b", "c", epjo.a, "d", "f", fbqo.a, "g", epjy.class, "h", "j", fbqw.a, "k", "e", fbrh.a, "l", fbqy.a, "i", epjg.class, "m"});
        }
        if (ordinal == 3) {
            return new epjq();
        }
        if (ordinal == 4) {
            return new epjn();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = n;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (epjq.class) {
            eyhzVar = n;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                n = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
