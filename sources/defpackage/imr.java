package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class imr extends ffkh implements ffjm {
    public static final imr a = new imr();

    public imr() {
        super(2, ffln.class, "min", "min(II)I", 1);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
