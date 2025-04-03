package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbs extends ffkk implements ffji {
    final /* synthetic */ fbw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbs(fbw fbwVar) {
        super(1);
        this.a = fbwVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = ((jlm) obj).b;
        fbw fbwVar = this.a;
        fbq fbqVar = fbwVar.j;
        if (fbqVar == null) {
            fbq fbqVar2 = new fbq(fbwVar.a, str);
            faz fazVar = new faz(str, fbwVar.b, fbwVar.c, fbwVar.d, fbwVar.e, fbwVar.f);
            fazVar.d(fbwVar.a().f);
            fbqVar2.c = fazVar;
            fbwVar.j = fbqVar2;
        } else if (!ffkj.e(str, fbqVar.a)) {
            fbqVar.a = str;
            faz fazVar2 = fbqVar.c;
            if (fazVar2 != null) {
                fazVar2.e(str, fbwVar.b, fbwVar.c, fbwVar.d, fbwVar.e, fbwVar.f);
            }
        }
        this.a.j();
        return true;
    }
}
