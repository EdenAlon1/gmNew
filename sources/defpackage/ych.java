package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ych extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ycn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ych(ffgu ffguVar, ycn ycnVar) {
        super(2, ffguVar);
        this.b = ycnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ych) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ycv ycvVar = (ycv) this.b.g.b();
        this.a = 1;
        Object c = ycvVar.c(this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ych ychVar = new ych(ffguVar, this.b);
        ychVar.c = obj;
        return ychVar;
    }
}
