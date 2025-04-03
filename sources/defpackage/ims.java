package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class ims extends ffkh implements ffjm {
    public static final ims a = new ims();

    public ims() {
        super(2, ffln.class, "max", "max(II)I", 1);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
