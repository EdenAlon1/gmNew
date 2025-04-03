package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yhc extends ffhv implements ffjm {
    final /* synthetic */ yhr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhc(yhr yhrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = yhrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yhc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        abcp abcpVar = this.a.f;
        aler alerVar = abcpVar.b;
        if (alerVar != null) {
            alerVar.c();
        }
        abcpVar.b = null;
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yhc(this.a, ffguVar);
    }
}
