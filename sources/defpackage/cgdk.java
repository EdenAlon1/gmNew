package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgdk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cgdm b;
    final /* synthetic */ Exception c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgdk(cgdm cgdmVar, Exception exc, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cgdmVar;
        this.c = exc;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgdk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cgdm cgdmVar = this.b;
            cskc cskcVar = cgdm.a;
            if (cgdmVar.d.a()) {
                crze.c("Getting Gaia auth check result failed", this.c);
            } else {
                elfl b = ((cfyt) this.b.c.b()).b(this.c);
                this.a = 1;
                if (fgfz.c(b, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cgdk(this.b, this.c, ffguVar);
    }
}
