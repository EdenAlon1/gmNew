package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xfz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xgb b;
    final /* synthetic */ xhp c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfz(xgb xgbVar, xhp xhpVar, int i, int i2, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = xgbVar;
        this.c = xhpVar;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xfz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            xgb xgbVar = this.b;
            xhp xhpVar = this.c;
            this.a = 1;
            obj = xgbVar.a(xhpVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        xfs xfsVar = (xfs) obj;
        if (xfsVar != null) {
            this.b.d(this.e + (-1) != 1 ? 3 : 4, xfsVar, this.d);
            return ffcu.a;
        }
        ensk f = xgb.a.f();
        f.Y(ente.a, "BugleComposeRow2");
        ((enrr) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/AttachmentUsageLogger$onAttachmentRemoved$1", "invokeSuspend", 86, "AttachmentUsageLogger.kt")).B("Skipping attachment remove logging for %s at %s", this.c, this.d);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xfz(this.b, this.c, this.d, this.e, ffguVar);
    }
}
