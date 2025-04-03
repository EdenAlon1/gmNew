package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final /* synthetic */ class fgio extends ffkh implements ffjn {
    public static final fgio a = new fgio();

    public fgio() {
        super(3, fgip.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        fgip fgipVar = (fgip) obj;
        fgix fgixVar = (fgix) obj2;
        if (fgipVar.a <= 0) {
            fgixVar.i(ffcu.a);
        } else {
            fgin fginVar = new fgin(fgixVar, fgipVar);
            fgixVar.getClass();
            fgiw fgiwVar = (fgiw) fgixVar;
            ffhd ffhdVar = fgiwVar.a;
            fgiwVar.c = ffsw.e(ffhdVar).c(fgipVar.a, fginVar, ffhdVar);
        }
        return ffcu.a;
    }
}
