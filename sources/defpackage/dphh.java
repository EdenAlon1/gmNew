package defpackage;

import android.media.ToneGenerator;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dphh implements ffxy {
    final /* synthetic */ dpif a;

    public dphh(dpif dpifVar) {
        this.a = dpifVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        this.a.j(50L, 125);
        new ToneGenerator(1, 100).startTone(24, BasePaymentResult.ERROR_REQUEST_FAILED);
        return ffcu.a;
    }
}
