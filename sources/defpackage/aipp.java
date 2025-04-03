package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aipp extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ aipq c;
    final /* synthetic */ eisx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aipp(aipq aipqVar, eisx eisxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = aipqVar;
        this.d = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aipp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            aipq aipqVar = this.c;
            ListenableFuture b = aipqVar.a.b(this.d);
            b.getClass();
            this.a = "Authorization";
            this.b = 1;
            obj = fgfz.c(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            obj2 = "Authorization";
        }
        return new aipo((String) obj2, "Bearer ".concat(String.valueOf(((ekor) obj).a)));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aipp(this.c, this.d, ffguVar);
    }
}
