package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final /* synthetic */ class ffuo extends ffkh implements ffjn {
    public static final ffuo a = new ffuo();

    public ffuo() {
        super(3, ffuq.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ffte b;
        ffuq ffuqVar = (ffuq) obj;
        fgix fgixVar = (fgix) obj2;
        while (true) {
            Object E = ffuqVar.E();
            if (!(E instanceof fftx)) {
                if (!(E instanceof ffrt)) {
                    E = ffur.b(E);
                }
                fgixVar.i(E);
            } else if (ffuqVar.A(E) >= 0) {
                b = ffui.b(ffuqVar, true, new ffun(ffuqVar, fgixVar));
                fgixVar.g(b);
                break;
            }
        }
        return ffcu.a;
    }
}
