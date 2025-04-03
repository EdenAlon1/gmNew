package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjtj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjtn b;
    final /* synthetic */ eyja c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjtj(ffgu ffguVar, cjtn cjtnVar, eyja eyjaVar) {
        super(2, ffguVar);
        this.b = cjtnVar;
        this.c = eyjaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjtj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cjtn cjtnVar = this.b;
            ListenableFuture b = cjtnVar.b.b(new cjti(new cjtk(this.c)), cjtnVar.c);
            this.a = 1;
            if (fgfz.c(b, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjtj cjtjVar = new cjtj(ffguVar, this.b, this.c);
        cjtjVar.d = obj;
        return cjtjVar;
    }
}
