package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class esrv extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        fgtf fgtfVar = (fgtf) obj;
        int ordinal = fgtfVar.ordinal();
        if (ordinal == 0) {
            return e();
        }
        if (ordinal == 1) {
            return esqx.c;
        }
        if (ordinal == 2) {
            return f();
        }
        if (ordinal == 3) {
            return esqx.a;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(fgtfVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        esqx esqxVar = (esqx) obj;
        int ordinal = esqxVar.ordinal();
        if (ordinal == 0) {
            return fgtf.UNRECOGNIZED;
        }
        if (ordinal == 1) {
            return g();
        }
        if (ordinal == 2) {
            return fgtf.ADMIN;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(esqxVar.toString()));
    }

    public abstract esqx e();

    public abstract esqx f();

    public abstract fgtf g();
}
