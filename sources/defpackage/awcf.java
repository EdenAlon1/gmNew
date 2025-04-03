package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awcf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ awcl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awcf(awcl awclVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = awclVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awcf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        awcl awclVar = this.b;
        this.a = 1;
        Object c = awclVar.c(this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new awcf(this.b, ffguVar);
    }
}
