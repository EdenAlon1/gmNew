package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eapl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eapm b;
    final /* synthetic */ easy c;
    final /* synthetic */ String d;
    final /* synthetic */ exuu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eapl(eapm eapmVar, easy easyVar, String str, exuu exuuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eapmVar;
        this.c = easyVar;
        this.d = str;
        this.e = exuuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eapl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            eapm eapmVar = this.b;
            easy easyVar = this.c;
            String str = this.d;
            exuu exuuVar = this.e;
            this.a = 1;
            obj = ffra.a(eapmVar.b, new eapk(eapmVar, easyVar, str, exuuVar, null), this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        Object b = ((eafl) obj).b();
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eapl(this.b, this.c, this.d, this.e, ffguVar);
    }
}
