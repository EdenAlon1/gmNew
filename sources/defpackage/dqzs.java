package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqzs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ drag b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqzs(drag dragVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dragVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqzs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        efiv b = this.b.b();
        efkj efkjVar = dqzp.a;
        String str = this.c;
        efko efkoVar = new efko();
        efkoVar.b("\n      DELETE\n      FROM `emotify`\n      WHERE `id` = ?\n      ");
        efkoVar.d(str);
        ListenableFuture c = b.c(efkoVar.a());
        c.getClass();
        this.a = 1;
        Object c2 = fgfz.c(c, this);
        return c2 == ffhhVar ? ffhhVar : c2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqzs(this.b, this.c, ffguVar);
    }
}
