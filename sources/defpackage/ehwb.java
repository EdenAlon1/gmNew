package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.inappreview.protocol.IInAppReviewService;
import java.util.Map;
import org.whispersystems.curve25519.Curve25519;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehwb extends ehwh {
    final /* synthetic */ dhri a;
    final /* synthetic */ ehwe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehwb(ehwe ehweVar, dhri dhriVar, dhri dhriVar2) {
        super(dhriVar);
        this.a = dhriVar2;
        this.b = ehweVar;
    }

    @Override // defpackage.ehwh
    protected final void a() {
        try {
            ehwe ehweVar = this.b;
            IInAppReviewService iInAppReviewService = (IInAppReviewService) ehweVar.b.n;
            String str = ehweVar.c;
            int i = ehwf.a;
            Bundle bundle = new Bundle();
            Map a = ehwf.a();
            bundle.putInt("playcore_version_code", ((Integer) a.get(Curve25519.JAVA)).intValue());
            if (a.containsKey(Curve25519.NATIVE)) {
                bundle.putInt("playcore_native_version", ((Integer) a.get(Curve25519.NATIVE)).intValue());
            }
            if (a.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) a.get("unity")).intValue());
            }
            iInAppReviewService.getLaunchReviewFlowInfo(str, bundle, new ehwd(this.b, this.a));
        } catch (RemoteException e) {
            ehwe.a.c(e, "error requesting in-app review for %s", this.b.c);
            this.a.c(new RuntimeException(e));
        }
    }
}
