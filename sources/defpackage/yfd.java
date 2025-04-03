package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class yfd extends ffju implements ffjm {
    public static final yfd a = new yfd();

    public yfd() {
        super(2, bsxy.class, "setSubject", "setSubject(Ljava/lang/String;)Lcom/google/android/apps/messaging/shared/datamodel/databasegen/tabledefinitions/DraftsTable$UpdateBuilder;", 8);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bsxy bsxyVar = (bsxy) obj;
        String str = (String) obj2;
        bsxyVar.getClass();
        int intValue = bsyb.c().intValue();
        int intValue2 = bsyb.c().intValue();
        if (intValue2 < 59170) {
            dtub.w("subject", intValue2);
        }
        if (intValue >= 59170) {
            dtub.u(bsxyVar.a, "subject", str);
        }
        return ffcu.a;
    }
}
