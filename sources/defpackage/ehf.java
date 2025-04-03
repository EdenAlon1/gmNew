package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ehf extends ffhv implements ffjm {
    final /* synthetic */ ehh a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehf(ehh ehhVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ehhVar;
        this.b = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ehf) c((drd) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ehh ehhVar = this.a;
        int a = ehhVar.d.a();
        int i = this.b;
        if (a != i || ehhVar.d.b() != 0) {
            ehhVar.j.c();
        }
        egt egtVar = ehhVar.d;
        egtVar.e(i, 0);
        egtVar.b = null;
        iqn iqnVar = ehhVar.g;
        if (iqnVar != null) {
            iqnVar.h();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ehf(this.a, this.b, ffguVar);
    }
}
