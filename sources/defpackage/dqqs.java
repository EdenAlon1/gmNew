package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqqs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqqw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqqs(dqqw dqqwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqqwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqqs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ListenableFuture b = this.b.f().b();
        b.getClass();
        this.a = 1;
        Object c = fgfz.c(b, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqqs(this.b, ffguVar);
    }
}
