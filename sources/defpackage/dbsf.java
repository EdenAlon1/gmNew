package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbsf implements ctuj {
    final /* synthetic */ dbrs a;
    final /* synthetic */ dbsl b;

    public dbsf(dbsl dbslVar, dbrs dbrsVar) {
        this.a = dbrsVar;
        this.b = dbslVar;
    }

    @Override // defpackage.ctuj
    public final void c() {
        this.b.i.finish();
    }

    @Override // defpackage.ctuj
    public final void d() {
        dbsl dbslVar = this.b;
        lkj lkjVar = dbslVar.j.a.c;
        if (lkjVar != lkj.STARTED && lkjVar != lkj.RESUMED) {
            ((ensz) ((ensz) dbsl.a.j()).h("com/google/android/apps/messaging/ui/ditto/QrScannerFragmentPeer$1", "onGranted", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "QrScannerFragmentPeer.java")).t("Skip loading camera. State: %s", lkjVar.name());
            this.b.i.finish();
        } else {
            dbrs dbrsVar = this.a;
            dbslVar.t.a(new dbry(dbslVar.f, dbslVar.i, dbrsVar));
        }
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ void b() {
    }
}
