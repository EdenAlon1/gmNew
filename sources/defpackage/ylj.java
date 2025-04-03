package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ylj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yln b;
    final /* synthetic */ xhu c;
    final /* synthetic */ xit d;
    final /* synthetic */ xii e;
    final /* synthetic */ yjd f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylj(ffgu ffguVar, yln ylnVar, yjd yjdVar, xhu xhuVar, xit xitVar, xii xiiVar) {
        super(2, ffguVar);
        this.b = ylnVar;
        this.f = yjdVar;
        this.c = xhuVar;
        this.d = xitVar;
        this.e = xiiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ylj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                yjo yjoVar = this.b.e;
                yjd yjdVar = this.f;
                this.a = 1;
                Object a = ffra.a(ekxi.a(((yjn) yjoVar).b), new yjm(null, yjdVar, (yjn) yjoVar), this);
                if (a != ffhh.a) {
                    a = ffcu.a;
                }
                if (a == obj2) {
                    return obj2;
                }
            }
            return true;
        } catch (Throwable th) {
            ensk i = yln.a.i();
            i.Y(ente.a, "BugleComposeRow2");
            ((enrr) ((enrr) i).g(th).h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/handler/DraftSendButtonClickHandler$queueForSending$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 261, "DraftSendButtonClickHandler.kt")).J("Failed to send message %s, %s, %s", this.c, this.d, this.e);
            return false;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ylj yljVar = new ylj(ffguVar, this.b, this.f, this.c, this.d, this.e);
        yljVar.g = obj;
        return yljVar;
    }
}
