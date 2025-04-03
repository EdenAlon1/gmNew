package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmma extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dmmk b;
    final /* synthetic */ dji c;
    final /* synthetic */ hjz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmma(dmmk dmmkVar, dji djiVar, hjz hjzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dmmkVar;
        this.c = djiVar;
        this.d = hjzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmma) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object d;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            if (this.d.c() < this.b.a.size()) {
                dji djiVar = this.c;
                this.a = 1;
                d = djiVar.d(Alert.DURATION_SHOW_INDEFINITELY, new dac(0.0f, (Object) null, 7), this);
                if (d == ffhhVar) {
                    return ffhhVar;
                }
            }
        }
        this.d.i(this.b.a.size());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmma(this.b, this.c, this.d, ffguVar);
    }
}
