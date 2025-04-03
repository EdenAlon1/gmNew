package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avkk {
    private final ffbr a;

    public avkk(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public final eqyl a() {
        eqna d = ((crgh) this.a.b()).d();
        int ordinal = d.ordinal();
        if (ordinal == 0) {
            return eqyl.UNKNOWN_RCS_TYPE;
        }
        if (ordinal == 1) {
            return eqyl.RCS_DUAL_REG;
        }
        if (ordinal == 2) {
            return eqyl.RCS_TACHYGRAM;
        }
        if (ordinal == 3) {
            return eqyl.RCS_SINGLE_REG;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(d))));
    }
}
