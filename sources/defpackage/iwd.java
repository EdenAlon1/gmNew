package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iwd extends ffkk implements ffjm {
    final /* synthetic */ iwi a;
    final /* synthetic */ ffix b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwd(iwi iwiVar, ffix ffixVar) {
        super(2);
        this.a = iwiVar;
        this.b = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        iwi iwiVar;
        boolean z;
        ibt ibtVar = (ibt) obj;
        iga igaVar = (iga) obj2;
        if (this.a.r.g()) {
            iwi iwiVar2 = this.a;
            iwiVar2.A = ibtVar;
            iwiVar2.z = igaVar;
            iwiVar2.ac().d(iwiVar2, iwi.n, this.b);
            iwiVar = this.a;
            z = false;
        } else {
            iwiVar = this.a;
            z = true;
        }
        iwiVar.B = z;
        return ffcu.a;
    }
}
