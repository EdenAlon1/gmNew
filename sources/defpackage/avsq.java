package defpackage;

import android.telephony.ims.RcsContactUceCapability;
import android.telephony.ims.RcsUceAdapter;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avsq implements RcsUceAdapter.CapabilitiesCallback {
    final /* synthetic */ avsr a;
    private final kfb b;
    private final long c;

    public avsq(avsr avsrVar, kfb kfbVar, long j) {
        this.a = avsrVar;
        this.b = kfbVar;
        this.c = j;
    }

    public final void onCapabilitiesReceived(List list) {
        if (list.size() != 1) {
            this.b.c(new avlo(String.format(Locale.US, "[Single Registration] Getting Capabilities failed: Expected 1 set but found: %d", Integer.valueOf(list.size()))));
            this.a.e(this.c);
            return;
        }
        this.b.b((RcsContactUceCapability) list.get(0));
        try {
            this.a.f.c(this.c, 3, list);
        } catch (RuntimeException e) {
            dkty.r(new dktn("(SingleContactAdapterCallback)"), "[SR] there was an error logging the capabilities discovery id[%d] to clearcut: %s", Long.valueOf(this.c), e.getMessage());
        }
    }

    public final void onError(int i, long j) {
        boolean z = true;
        String format = String.format(Locale.US, "[Single Registration] Getting capabilities failed. Platform returned error code: %d", Integer.valueOf(i));
        if (i != 9 && i != 11 && i != 12) {
            z = false;
        }
        this.b.c(new avlo(format, i, z));
        this.a.f.a(this.c, 3, i, j);
    }

    public final void onComplete() {
    }
}
