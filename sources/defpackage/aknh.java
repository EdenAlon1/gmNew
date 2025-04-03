package defpackage;

import android.content.Intent;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aknh implements cbvu {
    private static final enhk a;
    private final ffbr b;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k(Integer.valueOf(BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED), adcp.GROUP_CREATED);
        enhdVar.k(217, adcp.GROUP_RENAMED_GLOBAL);
        enhdVar.k(218, adcp.GROUP_RENAMED_GLOBAL);
        enhdVar.k(Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED), adcp.PARTICIPANT_JOINED);
        enhdVar.k(Integer.valueOf(BasePaymentResult.ERROR_REQUEST_TIMEOUT), adcp.PARTICIPANT_LEFT);
        enhdVar.k(Integer.valueOf(BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED), adcp.SELF_LEFT);
        a = enhdVar.c();
    }

    public aknh(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    @Override // defpackage.cbvu
    public final void a(cpxu cpxuVar, int i, long j) {
        enhk enhkVar = a;
        Integer valueOf = Integer.valueOf(i);
        if (enhkVar.containsKey(valueOf)) {
            adcp adcpVar = (adcp) enhkVar.get(valueOf);
            adcpVar.getClass();
            Intent intent = new Intent();
            intent.setAction("com.google.android.apps.messaging.samsung.mde.groupstatus.GROUP_STATUS_CHANGED");
            intent.putExtra("EXTRA_THREAD_ID", cpxv.a(cpxuVar));
            intent.putExtra("EXTRA_EVENT_TYPE", adcpVar.a());
            intent.putExtra("EXTRA_TIMESTAMP", j);
            ((akne) this.b.b()).a(intent);
        }
    }
}
