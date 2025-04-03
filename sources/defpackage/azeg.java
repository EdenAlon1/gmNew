package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azeg extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Function c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azeg(Function function, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = function;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azeg) c(obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object apply;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            apply = this.c.apply(this.b);
            apply.getClass();
            this.a = 1;
            if (fgfz.c((ListenableFuture) apply, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        azeg azegVar = new azeg(this.c, ffguVar);
        azegVar.b = obj;
        return azegVar;
    }
}
