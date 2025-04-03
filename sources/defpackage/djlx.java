package defpackage;

import android.telephony.ims.RcsUceAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djlx implements RcsUceAdapter.OnPublishStateChangedListener {
    private final djmm a;

    public djlx(djmm djmmVar) {
        this.a = djmmVar;
    }

    public final void onPublishStateChange(int i) {
        switch (i) {
            case 1:
                dkty.l(this.a.i, "Received 200 OK PUBLISH response", new Object[0]);
                this.a.q(9);
                break;
            case 2:
                dkty.l(this.a.i, "Has not received any PUBLISH response yet.", new Object[0]);
                break;
            case 3:
                dkty.r(this.a.i, "The device has tried to publish its capabilities (VoLTE), which resulted in an error.", new Object[0]);
                break;
            case 4:
            case 6:
                dkty.r(this.a.i, "The device has tried to publish its capabilities (RCS), which resulted in  error code:[%d]", Integer.valueOf(i));
                this.a.q(10);
                break;
            case 5:
                dkty.r(this.a.i, "The last publish resulted in 408 Request Timeout response.", new Object[0]);
                this.a.q(10);
                break;
            default:
                dkty.r(this.a.i, "Unknown publish state change, code:[%d]", Integer.valueOf(i));
                break;
        }
    }
}
