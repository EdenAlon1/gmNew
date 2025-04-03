package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uif extends ffhv implements ffjm {
    final /* synthetic */ drlx a;
    final /* synthetic */ Context b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uif(ffgu ffguVar, drlx drlxVar, Context context) {
        super(2, ffguVar);
        this.a = drlxVar;
        this.b = context;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uif) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return cbgi.d(le.d(this.a.a()), this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        uif uifVar = new uif(ffguVar, this.a, this.b);
        uifVar.c = obj;
        return uifVar;
    }
}
