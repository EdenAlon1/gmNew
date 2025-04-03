package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acgi implements erqj {
    final /* synthetic */ acgj a;

    public acgi(acgj acgjVar) {
        this.a = acgjVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        acgj acgjVar = this.a;
        acgjVar.c = booleanValue;
        if (booleanValue) {
            final acgg acggVar = (acgg) acgjVar.b.b();
            if (acggVar.g == null) {
                acgg.a.p("The device does not support accelerometer sensor.");
            } else {
                acggVar.j = acggVar.k.submit(new Callable() { // from class: acgd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        double floatValue = ((Float) acfp.b.e()).floatValue();
                        acgg acggVar2 = acgg.this;
                        acggVar2.b = floatValue;
                        acggVar2.c = ((Long) acfp.c.e()).longValue();
                        acggVar2.d = ((Integer) acfp.e.e()).intValue();
                        acggVar2.f = ((Long) acfp.f.e()).longValue();
                        acggVar2.e = ((Float) acfp.d.e()).floatValue();
                        return null;
                    }
                });
                elfr.l(acggVar.j, new acge(acggVar), acggVar.k);
            }
            acgg acggVar2 = (acgg) this.a.b.b();
            acggVar2.i.add(this.a);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        acgj.a.r("Fail to get phenotype flag for isShakeToReportEnabled");
    }
}
