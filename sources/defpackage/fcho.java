package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcho extends eyfy implements fchp {
    public static final fcho a;
    private static volatile eyhz i;
    public int b;
    public fcek c;
    public fcey d;
    public eygr e;
    public int f;
    public String g;
    public fcic h;

    static {
        fcho fchoVar = new fcho();
        a = fchoVar;
        eyfy.registerDefaultInstance(fcho.class, fchoVar);
    }

    private fcho() {
        emptyProtobufList();
        this.e = emptyProtobufList();
        this.g = "";
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\n\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0006\u001b\u0007\f\tȈ\nဉ\u0003", new Object[]{"b", "c", "d", "e", fchr.class, "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new fcho();
        }
        if (ordinal == 4) {
            return new fchn();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fcho.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
