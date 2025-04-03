package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alqk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ elfl b;
    final /* synthetic */ alql c;
    final /* synthetic */ Instant d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alqk(elfl elflVar, int i, alql alqlVar, Instant instant, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = elflVar;
        this.e = i;
        this.c = alqlVar;
        this.d = instant;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alqk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl elflVar = this.b;
            this.a = 1;
            obj = fgfz.c(elflVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            ((enrr) alql.a.g().h("com/google/android/apps/messaging/shared/analytics/screen/ScreenImpressionLogger$saveAndLogFirstEntryToScreen$1", "invokeSuspend", 60, "ScreenImpressionLogger.kt")).t("First screen open time already exists for: %s", algl.a(this.e));
            return ffcu.a;
        }
        ((enrr) alql.a.h().h("com/google/android/apps/messaging/shared/analytics/screen/ScreenImpressionLogger$saveAndLogFirstEntryToScreen$1", "invokeSuspend", 64, "ScreenImpressionLogger.kt")).t("Logging first visit to screen type: %s", algl.a(this.e));
        akxn a = ((akyb) this.c.b.b()).a();
        a.d(this.e == 3 ? epyw.CONVERSATION_SCREEN_FIRST_VISIT : epyw.HOME_SCREEN_FIRST_VISIT);
        a.j(alql.b(this.e, this.d), alal.LOG_SPEC_CONVERSATION_SCREEN_EVENTS);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new alqk(this.b, this.e, this.c, this.d, ffguVar);
    }
}
