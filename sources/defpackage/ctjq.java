package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctjq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ctko b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctjq(ctko ctkoVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ctkoVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctjq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        ctko ctkoVar = this.b;
        String str = this.c;
        this.a = 1;
        if (ctkoVar.h(str, this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ctjq(this.b, this.c, ffguVar);
    }
}
