package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class drbv extends ffkh implements ffjm {
    public static final drbv a = new drbv();

    public drbv() {
        super(2, drap.class, "resolveMedia", "resolveMedia(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        ffgu ffguVar = (ffgu) obj2;
        ffji ffjiVar = ((drap) obj).b;
        if (ffjiVar == null) {
            ffkj.c("cachingMediaResolver");
            ffjiVar = null;
        }
        return ffjiVar.invoke(ffguVar);
    }
}
