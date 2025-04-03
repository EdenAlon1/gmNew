package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dytx extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        dyuc dyucVar = (dyuc) obj;
        dzpf dzpfVar = dzpf.UNKNOWN;
        int ordinal = dyucVar.ordinal();
        if (ordinal == 0) {
            return dzpf.UNKNOWN;
        }
        if (ordinal == 1) {
            return dzpf.PHONE_NUMBER;
        }
        if (ordinal == 2) {
            return dzpf.EMAIL;
        }
        if (ordinal == 3) {
            return dzpf.HANDLER;
        }
        if (ordinal == 4) {
            return c();
        }
        if (ordinal == 5) {
            return dzpf.DEVICE_ID;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(dyucVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        dzpf dzpfVar = (dzpf) obj;
        int ordinal = dzpfVar.ordinal();
        if (ordinal == 0) {
            return dyuc.UNKNOWN;
        }
        if (ordinal == 1) {
            return dyuc.PHONE_NUMBER;
        }
        if (ordinal == 2) {
            return dyuc.EMAIL;
        }
        if (ordinal == 3) {
            return dyuc.HANDLER;
        }
        if (ordinal == 4) {
            return dyuc.DEVICE_ID;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(dzpfVar.toString()));
    }

    public abstract dzpf c();
}
