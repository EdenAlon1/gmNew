package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zok extends ffhv implements ffjm {
    int a;
    final /* synthetic */ zmz b;
    final /* synthetic */ Context c;
    final /* synthetic */ eey d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zok(zmz zmzVar, Context context, eey eeyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = zmzVar;
        this.c = context;
        this.d = eeyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zok) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final eey eeyVar = this.d;
            zog zogVar = new zog(ffyy.a(new zoj(hkt.a(new ffix() { // from class: zod
                @Override // defpackage.ffix
                public final Object invoke() {
                    return eey.this.d().i();
                }
            }))));
            this.a = 1;
            if (fgbj.a(zogVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        zmz zmzVar = this.b;
        zmzVar.p.invoke(this.c);
        zoz.d(this.b, this.d);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zok(this.b, this.c, this.d, ffguVar);
    }
}
