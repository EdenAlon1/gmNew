package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtcu extends ffhv implements ffjm {
    /* synthetic */ int a;
    final /* synthetic */ Integer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtcu(Integer num, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = num;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtcu) c(Integer.valueOf(((Number) obj).intValue()), (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        int i = this.a;
        Integer num = this.b;
        boolean z = false;
        if (num != null && i == num.intValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dtcu dtcuVar = new dtcu(this.b, ffguVar);
        dtcuVar.a = ((Number) obj).intValue();
        return dtcuVar;
    }
}
