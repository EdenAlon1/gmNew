package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bapt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bbcg b;
    final /* synthetic */ bara c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bapt(ffgu ffguVar, bbcg bbcgVar, bara baraVar) {
        super(2, ffguVar);
        this.b = bbcgVar;
        this.c = baraVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bapt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            bbcg bbcgVar = this.b;
            bara baraVar = this.c;
            int b = bbcgVar.b("sub_id", -1);
            String l = bbcgVar.l("transaction_id");
            String l2 = bbcgVar.l("content_location");
            long d = bbcgVar.d("message_logging_id");
            ffhd a = ekxi.a(baraVar.J);
            bapu bapuVar = new bapu(null, baraVar, b, l, l2, d);
            this.a = 1;
            if (ffra.a(a, bapuVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        bara.a.l("MMS receiving END");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bapt baptVar = new bapt(ffguVar, this.b, this.c);
        baptVar.d = obj;
        return baptVar;
    }
}
