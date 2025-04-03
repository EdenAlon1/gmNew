package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faxl extends eyfy implements faxm {
    public static final faxl a;
    private static volatile eyhz e;
    public String b = "";
    public eygr c;
    public eygr d;
    private int f;

    static {
        faxl faxlVar = new faxl();
        a = faxlVar;
        eyfy.registerDefaultInstance(faxl.class, faxlVar);
    }

    private faxl() {
        emptyBooleanList();
        emptyLongList();
        this.c = eyfy.emptyProtobufList();
        this.d = emptyProtobufList();
        eyee eyeeVar = eyee.b;
        emptyDoubleList();
    }

    @Override // defpackage.faxm
    public final int a() {
        return this.c.size();
    }

    @Override // defpackage.faxm
    public final String b() {
        return this.b;
    }

    @Override // defpackage.faxm
    public final List c() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.faxm
    public final String d() {
        return (String) this.c.get(0);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0002\u0000\u0001ဈ\u0000\u0004\u001a\u0005\u001b", new Object[]{"f", "b", "c", "d", faxo.class});
        }
        if (ordinal == 3) {
            return new faxl();
        }
        if (ordinal == 4) {
            return new faxk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (faxl.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
