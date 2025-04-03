package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class emqb extends ffkh implements ffjm {
    public emqb(Object obj) {
        super(2, obj, emqm.class, "dedupeUnitConflictAction", "dedupeUnitConflictAction(II)I", 0);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj).intValue();
        ((Number) obj2).intValue();
        throw new empw("Found multiple units");
    }
}
