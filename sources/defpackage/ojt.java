package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ojt extends ffhv implements ffji {
    int a;
    final /* synthetic */ ojv b;
    final /* synthetic */ ojf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojt(ojv ojvVar, ojf ojfVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = ojvVar;
        this.c = ojfVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ojv ojvVar = this.b;
            olm olmVar = this.c.b;
            olm olmVar2 = ojvVar.c;
            ojvVar.c = olmVar;
            if (olmVar2 instanceof ojq) {
                ojq ojqVar = (ojq) olmVar2;
                boolean z = ojqVar.a;
                if (ojqVar.b) {
                    olmVar.a();
                }
            }
            ojf ojfVar = this.c;
            ojs ojsVar = new ojs(this.b, ojfVar);
            this.a = 1;
            if (ojfVar.a.a(ojsVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ojt(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
