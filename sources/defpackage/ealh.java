package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ealh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ealj b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ealh(ealj ealjVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ealjVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ealh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        String a = ealk.a(null, this.c);
        ealj.a.o().J("Cancelling a scheduled work request for package [%s] with ID: %s, type: %s", this.b.b.getApplicationContext().getPackageName(), a, new Integer(this.c));
        ListenableFuture listenableFuture = ((pqc) pqr.a(this.b.b).b(a)).c;
        this.a = 1;
        Object c = fgfz.c(listenableFuture, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ealh(this.b, this.c, ffguVar);
    }
}
