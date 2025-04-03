package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqzq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ drag b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ dqzc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqzq(drag dragVar, String str, String str2, dqzc dqzcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dragVar;
        this.c = str;
        this.d = str2;
        this.e = dqzcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqzq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        String str2 = this.d;
        draj h = dran.h(this.e);
        efko efkoVar = new efko();
        efkoVar.b("\n          INSERT INTO `emotify` (`id`, `uri`, `data`)\n          VALUES (?, ?, ?)\n          ");
        efkoVar.d(str);
        efkoVar.d(str2);
        efkoVar.e(h.toByteArray());
        ListenableFuture c = b.c(efkoVar.a());
        c.getClass();
        this.a = 1;
        Object c2 = fgfz.c(c, this);
        return c2 == ffhhVar ? ffhhVar : c2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqzq(this.b, this.c, this.d, this.e, ffguVar);
    }
}
