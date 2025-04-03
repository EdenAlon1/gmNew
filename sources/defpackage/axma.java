package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axma extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axmb b;
    final /* synthetic */ Context c;
    final /* synthetic */ eisx d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axma(axmb axmbVar, Context context, eisx eisxVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = axmbVar;
        this.c = context;
        this.d = eisxVar;
        this.e = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axma) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            axmb axmbVar = this.b;
            axlz axlzVar = new axlz(axmbVar, this.c, this.d, this.e, null);
            this.a = 1;
            if (axmbVar.b(axlzVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axma(this.b, this.c, this.d, this.e, ffguVar);
    }
}
