package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class otk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ otp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otk(otp otpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = otpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((otk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            otp otpVar = this.b;
            this.a = 1;
            if (otpVar.c(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new otk(this.b, ffguVar);
    }
}
