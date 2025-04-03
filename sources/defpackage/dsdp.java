package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dsdp extends ffkh implements ffjm {
    public static final dsdp a = new dsdp();

    public dsdp() {
        super(2, drey.class, "resolveMedia", "resolveMedia(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        ffgu ffguVar = (ffgu) obj2;
        ffji ffjiVar = ((drey) obj).d;
        if (ffjiVar == null) {
            ffkj.c("cachingMediaResolver");
            ffjiVar = null;
        }
        return ffjiVar.invoke(ffguVar);
    }
}
