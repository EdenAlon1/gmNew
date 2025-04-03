package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvtv extends ffhv implements ffjm {
    final /* synthetic */ cvuc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvtv(cvuc cvucVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cvucVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvtv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cvuc cvucVar = this.a;
        if (cvucVar != null && cvucVar.a()) {
            cvucVar.a.invoke();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvtv(this.a, ffguVar);
    }
}
