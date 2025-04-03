package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dot extends ffkk implements ffjn {
    final /* synthetic */ dpb a;
    final /* synthetic */ imj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dot(dpb dpbVar, imj imjVar) {
        super(3);
        this.a = dpbVar;
        this.b = imjVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        iku ikuVar = (iku) obj;
        iku ikuVar2 = (iku) obj2;
        long j = ((iak) obj3).a;
        if (((Boolean) this.a.f.invoke(ikuVar)).booleanValue()) {
            dpb dpbVar = this.a;
            if (!dpbVar.i) {
                if (dpbVar.h == null) {
                    dpbVar.h = ffwp.a(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
                }
                dpb dpbVar2 = this.a;
                dpbVar2.i = true;
                ffqy.d(dpbVar2.D(), null, null, new dpa(dpbVar2, null), 3);
            }
            imk.b(this.b, ikuVar);
            long e = iak.e(ikuVar2.c, j);
            ffwm ffwmVar = this.a.h;
            if (ffwmVar != null) {
                ffwmVar.b(new dnn(e));
            }
        }
        return ffcu.a;
    }
}
