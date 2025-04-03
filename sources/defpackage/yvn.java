package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class yvn extends ffkh implements ffjn {
    public yvn(Object obj) {
        super(3, obj, yvz.class, "onError", "onError(Landroid/content/Context;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        int intValue = ((Number) obj2).intValue();
        ffgu ffguVar = (ffgu) obj3;
        yvz yvzVar = (yvz) this.g;
        if (((ywq) yvzVar.d.b()).i()) {
            return ffcu.a;
        }
        yvzVar.b(context, intValue);
        Object d = ((dthi) yvzVar.j.b()).b.d(ffguVar);
        return d != ffhh.a ? ffcu.a : d;
    }
}
