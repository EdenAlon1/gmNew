package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccvf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ccvj b;
    final /* synthetic */ boolean c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccvf(ccvj ccvjVar, boolean z, String str, String str2, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ccvjVar;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccvf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ccvf ccvfVar;
        Object i;
        ffhh ffhhVar = ffhh.a;
        int i2 = this.a;
        ffci.b(obj);
        if (i2 != 0) {
            i = ((ffch) obj).a;
            ccvfVar = this;
        } else {
            ccvj ccvjVar = this.b;
            boolean z = this.c;
            String str = this.d;
            String str2 = this.e;
            int i3 = this.f;
            this.a = 1;
            ccvfVar = this;
            i = ccvjVar.i(z, str, str2, i3, ccvfVar);
            if (i == ffhhVar) {
                return ffhhVar;
            }
        }
        int i4 = ccvfVar.f;
        Throwable c = ffch.c(i);
        return c == null ? new cckg() : cckc.a(c, i4);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ccvf(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
