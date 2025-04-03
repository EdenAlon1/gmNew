package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awad extends ffhv implements ffjm {
    int a;
    final /* synthetic */ awah b;
    final /* synthetic */ awap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awad(awah awahVar, awap awapVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = awahVar;
        this.c = awapVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awad) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            awah awahVar = this.b;
            awap awapVar = this.c;
            this.a = 1;
            if (awahVar.a.e(awapVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new awad(this.b, this.c, ffguVar);
    }
}
