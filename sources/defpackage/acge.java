package defpackage;

import android.hardware.Sensor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acge implements erqj {
    final /* synthetic */ acgg a;

    public acge(acgg acggVar) {
        this.a = acggVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        acgg acggVar = this.a;
        Sensor sensor = acggVar.g;
        if (sensor != null) {
            acggVar.h.registerListener(acggVar, sensor, 2);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        acgg.a.r("Fail to get phenotype flag config");
    }
}
