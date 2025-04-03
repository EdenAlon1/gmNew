package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jel extends ffkk implements ffji {
    final /* synthetic */ jem a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jel(jem jemVar) {
        super(1);
        this.a = jemVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        ifr ifrVar = (ifr) obj;
        ibt b = ifrVar.t().b();
        ffjm ffjmVar = this.a.a;
        if (ffjmVar != null) {
            ffjmVar.a(b, ifrVar.t().a);
        }
        return ffcu.a;
    }
}
