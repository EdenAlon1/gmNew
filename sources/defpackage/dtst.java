package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtst extends ffhv implements ffjn {
    final /* synthetic */ dtsu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtst(dtsu dtsuVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.a = dtsuVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new dtst(this.a, (ffgu) obj3).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.close();
        return ffcu.a;
    }
}
