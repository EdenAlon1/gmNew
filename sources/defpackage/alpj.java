package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alpj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ alqf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alpj(alqf alqfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = alqfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alpj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ListenableFuture a = this.b.a.a();
            a.getClass();
            this.a = 1;
            obj = fgfz.c(a, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return DesugarCollections.unmodifiableMap(((alpb) obj).c);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new alpj(this.b, ffguVar);
    }
}
