package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class yes extends ffju implements ffjm {
    public static final yes a = new yes();

    public yes() {
        super(2, bsxy.class, "setIsUrgent", "setIsUrgent(Z)Lcom/google/android/apps/messaging/shared/datamodel/databasegen/tabledefinitions/DraftsTable$UpdateBuilder;", 8);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bsxy bsxyVar = (bsxy) obj;
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        bsxyVar.getClass();
        int intValue = bsyb.c().intValue();
        int intValue2 = bsyb.c().intValue();
        if (intValue2 < 59170) {
            dtub.w("is_urgent", intValue2);
        }
        if (intValue >= 59170) {
            bsxyVar.a.put("is_urgent", bool);
        }
        return ffcu.a;
    }
}
