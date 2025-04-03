package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpke implements ffji {
    final /* synthetic */ float a;

    public dpke(float f) {
        this.a = f;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        kfq kfqVar = (kfq) obj;
        kfqVar.getClass();
        kgv.a(kfqVar.e, kfqVar.c.b, 0.0f, 6);
        if (Build.VERSION.SDK_INT >= 35) {
            kfn kfnVar = kfqVar.f;
            kfr kfrVar = kfqVar.c;
            kgo.a(kfnVar, kfrVar.c, this.a, 4);
        } else {
            kgo.a(kfqVar.f, kfqVar.c.c, 0.0f, 6);
        }
        return ffcu.a;
    }
}
