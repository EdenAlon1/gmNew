package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjsy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjtn b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjsy(ffgu ffguVar, cjtn cjtnVar, String str, String str2) {
        super(2, ffguVar);
        this.b = cjtnVar;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjsy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cjtn cjtnVar = this.b;
            ListenableFuture b = cjtnVar.b.b(new cjti(new cjsz(this.c, this.d)), cjtnVar.c);
            this.a = 1;
            if (fgfz.c(b, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjsy cjsyVar = new cjsy(ffguVar, this.b, this.c, this.d);
        cjsyVar.e = obj;
        return cjsyVar;
    }
}
