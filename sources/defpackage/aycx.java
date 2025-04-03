package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aycx extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ aycz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aycx(aycz ayczVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = ayczVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aycx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ejoc ejocVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.c;
        if (i == 0) {
            ffci.b(obj);
            aycz ayczVar = this.d;
            obj2 = poz.CANCEL_AND_REENQUEUE;
            aycw aycwVar = aycz.a;
            Object b = ayczVar.h.b();
            b.getClass();
            ejoc ejocVar2 = ayczVar.e;
            this.a = ejocVar2;
            this.b = obj2;
            this.c = 1;
            Object b2 = aycwVar.b((comc) b, this);
            if (b2 != ffhhVar) {
                ejocVar = ejocVar2;
                obj = b2;
            }
        }
        if (i != 1) {
            ffci.b(obj);
            return obj;
        }
        obj2 = this.b;
        Object obj3 = this.a;
        ffci.b(obj);
        ejocVar = obj3;
        ListenableFuture c = ejocVar.c(aycw.d((poz) obj2, (String) obj));
        this.a = null;
        this.b = null;
        this.c = 2;
        Object c2 = fgfz.c(c, this);
        return c2 == ffhhVar ? ffhhVar : c2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aycx(this.d, ffguVar);
    }
}
