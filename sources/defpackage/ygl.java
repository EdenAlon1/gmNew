package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ygl extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ xuw c;
    final /* synthetic */ ygv d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygl(ffgu ffguVar, xuw xuwVar, ygv ygvVar) {
        super(3, ffguVar);
        this.c = xuwVar;
        this.d = ygvVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ygl yglVar = new ygl((ffgu) obj3, this.c, this.d);
        yglVar.e = (ffxy) obj;
        yglVar.b = obj2;
        return yglVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffxx yguVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r9 = this.e;
            ygk ygkVar = (ygk) this.b;
            if (ygkVar == null) {
                yguVar = new ffyg(null);
            } else {
                ensk e = ygv.a.e();
                e.Y(ente.a, "BugleComposeRow2");
                ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/info/DraftInfoUiAdapterImpl$special$$inlined$flatMapLatest$1", "invokeSuspend", 69, "DraftInfoUiAdapterImpl.kt")).G("DraftInfoUiAdapterImpl useInfoTooltip: %b, maxMessageSizeBytes: %d", ygkVar.a, ygkVar.b);
                if (ygkVar.a) {
                    xuw xuwVar = this.c;
                    yguVar = new ygu(xuwVar.j, this.d, ygkVar);
                } else {
                    yguVar = new ffyg(null);
                }
            }
            this.a = 1;
            if (ffyk.c(r9, yguVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
