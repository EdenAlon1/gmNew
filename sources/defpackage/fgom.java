package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgom extends eyfy implements eyht {
    public static final fgom a;
    private static volatile eyhz l;
    public int b;
    public long c;
    public fgoj e;
    public eyja g;
    public eyev h;
    public int i;
    public fgol j;
    public String d = "";
    public eygr f = emptyProtobufList();
    public eygr k = emptyProtobufList();

    static {
        fgom fgomVar = new fgom();
        a = fgomVar;
        eyfy.registerDefaultInstance(fgom.class, fgomVar);
    }

    private fgom() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0002\u0000\u0001စ\u0000\u0002ဈ\u0001\u0004ဉ\u0004\u0005င\u0006\u0006ဉ\u0007\u0007\u001b\b\u001b\nဉ\u0002\u000bဉ\u0005", new Object[]{"b", "c", "d", "g", "i", "j", "k", fgox.class, "f", fgoh.class, "e", "h"});
        }
        if (ordinal == 3) {
            return new fgom();
        }
        if (ordinal == 4) {
            return new fgoc();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fgom.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
