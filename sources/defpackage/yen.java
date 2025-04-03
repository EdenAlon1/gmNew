package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class yen extends ffju implements ffjm {
    public static final yen a = new yen();

    public yen() {
        super(2, bsxy.class, "setIsEncrypted", "setIsEncrypted(Z)Lcom/google/android/apps/messaging/shared/datamodel/databasegen/tabledefinitions/DraftsTable$UpdateBuilder;", 8);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bsxy bsxyVar = (bsxy) obj;
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        bsxyVar.getClass();
        int intValue = bsyb.c().intValue();
        int intValue2 = bsyb.c().intValue();
        if (intValue2 < 59720) {
            dtub.w("is_encrypted", intValue2);
        }
        if (intValue >= 59720) {
            bsxyVar.a.put("is_encrypted", bool);
        }
        return ffcu.a;
    }
}
