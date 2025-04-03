package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ycl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ycn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycl(ffgu ffguVar, ycn ycnVar) {
        super(2, ffguVar);
        this.b = ycnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ycl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ycs ycsVar = (ycs) this.b.f.b();
        this.a = 1;
        Object c = ycsVar.c(this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ycl yclVar = new ycl(ffguVar, this.b);
        yclVar.c = obj;
        return yclVar;
    }
}
