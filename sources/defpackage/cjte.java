package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjte extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjtn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjte(ffgu ffguVar, cjtn cjtnVar) {
        super(2, ffguVar);
        this.b = cjtnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjte) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cjtn cjtnVar = this.b;
            ListenableFuture b = cjtnVar.b.b(new cjti(cjtf.a), cjtnVar.c);
            this.a = 1;
            if (fgfz.c(b, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjte cjteVar = new cjte(ffguVar, this.b);
        cjteVar.c = obj;
        return cjteVar;
    }
}
