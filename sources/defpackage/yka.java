package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yka extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;

    public yka(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yka) c((xls) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            xls xlsVar = (xls) this.b;
            ffci.b(obj);
            return xlsVar;
        }
        ffci.b(obj);
        xls xlsVar2 = (xls) this.b;
        ensk g = yks.a.g();
        g.Y(ente.a, "BugleComposeRow2");
        ((enrr) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/SendButtonUiAdapterImpl$enabledFlow$2", "invokeSuspend", 105, "SendButtonUiAdapterImpl.kt")).t("SendButtonUiAdapterImpl.enabledFlow iconDataFlow with %s", xlsVar2);
        if (xlsVar2 == xls.a) {
            long j = yks.b;
            this.b = xlsVar2;
            this.a = 1;
            if (ffsw.d(j, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return xlsVar2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yka ykaVar = new yka(ffguVar);
        ykaVar.b = obj;
        return ykaVar;
    }
}
