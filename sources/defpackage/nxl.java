package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nxl extends ffkk implements ffix {
    final /* synthetic */ nxm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxl(nxm nxmVar) {
        super(0);
        this.a = nxmVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        nxm nxmVar = this.a;
        if (!nxmVar.g) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (nxmVar.e.c != lkj.DESTROYED) {
            return ((nxh) new lmw(nxmVar, (lms) nxmVar.i.a()).a(nxh.class)).a;
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
    }
}
