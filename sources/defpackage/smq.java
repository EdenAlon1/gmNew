package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class smq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ sms b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smq(sms smsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = smsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((smq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl c = ((csyy) this.b.e.b()).c(((cqoh) this.b.d.b()).f().toEpochMilli());
            c.getClass();
            this.a = 1;
            if (fgfz.c(c, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new smq(this.b, ffguVar);
    }
}
