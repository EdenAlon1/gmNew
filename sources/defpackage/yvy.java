package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yvy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yvz b;
    final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvy(yvz yvzVar, Context context, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = yvzVar;
        this.c = context;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yvy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            yvz yvzVar = this.b;
            Context context = this.c;
            this.a = 1;
            obj = yvzVar.c(context, 4, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ((Boolean) obj).booleanValue();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yvy(this.b, this.c, ffguVar);
    }
}
