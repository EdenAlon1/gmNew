package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjta extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjtn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjta(ffgu ffguVar, cjtn cjtnVar) {
        super(2, ffguVar);
        this.b = cjtnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjta) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ListenableFuture a = this.b.b.a();
        a.getClass();
        this.a = 1;
        Object c = fgfz.c(a, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjta cjtaVar = new cjta(ffguVar, this.b);
        cjtaVar.c = obj;
        return cjtaVar;
    }
}
