package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cvu extends ffhv implements ffjm {
    final /* synthetic */ cvd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvu(cvd cvdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cvdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (this.a.d.isEmpty()) {
            cvd cvdVar = this.a;
            cvdVar.b.i.b(cvdVar.a);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvu(this.a, ffguVar);
    }
}
