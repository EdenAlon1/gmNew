package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dotg extends ffhv implements ffjm {
    final /* synthetic */ dotb a;
    final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dotg(dotb dotbVar, Context context, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dotbVar;
        this.b = context;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dotg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.f.invoke(this.b);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dotg(this.a, this.b, ffguVar);
    }
}
