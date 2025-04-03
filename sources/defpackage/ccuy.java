package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccuy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ccvj b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccuy(ccvj ccvjVar, String str, String str2, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ccvjVar;
        this.c = str;
        this.d = str2;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccuy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object i;
        ffhh ffhhVar = ffhh.a;
        int i2 = this.a;
        ffci.b(obj);
        if (i2 != 0) {
            i = ((ffch) obj).a;
        } else {
            ccvj ccvjVar = this.b;
            String str = this.c;
            String str2 = this.d;
            int i3 = this.e;
            this.a = 1;
            i = ccvjVar.i(true, str, str2, i3, this);
            if (i == ffhhVar) {
                return ffhhVar;
            }
        }
        Throwable c = ffch.c(i);
        if (c != null) {
            try {
                if (!(c instanceof ccwq) && !(c instanceof ccyy)) {
                    throw c;
                }
                i = null;
            } catch (Throwable th) {
                i = ffci.a(th);
            }
        }
        ffci.b(i);
        return true;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ccuy(this.b, this.c, this.d, this.e, ffguVar);
    }
}
