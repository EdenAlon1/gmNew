package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ywj extends ffhv implements ffjm {
    final /* synthetic */ ywq a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywj(ywq ywqVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ywqVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ywj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.d.l(this.b);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ywj(this.a, this.b, ffguVar);
    }
}
