package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmsb extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ dmsk c;
    final /* synthetic */ Context d;
    final /* synthetic */ hho e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmsb(dmsk dmskVar, Context context, hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dmskVar;
        this.d = context;
        this.e = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmsb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        hho hhoVar;
        ffhh ffhhVar = ffhh.a;
        if (this.b == 0) {
            ffci.b(obj);
            dmsj dmsjVar = this.c.h;
            if (dmsjVar != null) {
                Context context = this.d;
                hho hhoVar2 = this.e;
                Integer num = new Integer(dmsjVar.a);
                this.a = hhoVar2;
                this.b = 1;
                if (dmsjVar.b.a(context, num, this) == ffhhVar) {
                    return ffhhVar;
                }
                hhoVar = hhoVar2;
            }
            return ffcu.a;
        }
        Object obj2 = this.a;
        ffci.b(obj);
        hhoVar = obj2;
        hhoVar.b(false);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmsb(this.c, this.d, this.e, ffguVar);
    }
}
