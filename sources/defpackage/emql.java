package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class emql extends ffkh implements ffjm {
    public emql(Object obj) {
        super(2, obj, emqm.class, "dedupeHourConflict", "dedupeHourConflict(II)I", 0);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int min = Math.min(intValue, intValue2);
        if (Math.max(intValue, intValue2) == min + 12) {
            return Integer.valueOf(emqm.d(min));
        }
        throw new empw("Found multiple hours");
    }
}
