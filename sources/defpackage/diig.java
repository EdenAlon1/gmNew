package defpackage;

import android.telephony.ims.RcsContactUceCapability;
import android.telephony.ims.RcsUceAdapter;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class diig implements RcsUceAdapter.CapabilitiesCallback {
    final /* synthetic */ diih a;
    private final long b;
    private final kfb c;

    public diig(diih diihVar, long j, kfb kfbVar) {
        this.a = diihVar;
        this.b = j;
        this.c = kfbVar;
    }

    public final void onCapabilitiesReceived(List list) {
        if (list.size() != 1) {
            this.c.c(new diii(String.format(Locale.US, "[SR] Getting Capabilities id[%d] failed: Expected 1 set but found: %d", Long.valueOf(this.b), Integer.valueOf(list.size()))));
            this.a.d.a(this.b, 2, -1, -1L);
        } else {
            this.c.b((RcsContactUceCapability) list.get(0));
            try {
                this.a.d.c(this.b, 2, list);
            } catch (RuntimeException e) {
                dkty.q("[SR] there was an error logging the capabilities discovery id[%d] to clearcut: %s", Long.valueOf(this.b), e.getMessage());
            }
        }
    }

    public final void onError(int i, long j) {
        if (j > 0) {
            diih diihVar = this.a;
            diihVar.c = diihVar.b.a().plusMillis(j);
        }
        Long valueOf = Long.valueOf(this.b);
        Integer valueOf2 = Integer.valueOf(i);
        dkty.q("[SR] UCE call id[%d] failed with error %d, cannot retry for %d milliseconds", valueOf, valueOf2, Long.valueOf(j));
        this.c.c(new diii(String.format(Locale.US, "[SR] Getting capabilities failed. Platform returned error code: %d", valueOf2)));
        this.a.d.a(this.b, 2, i, j);
    }

    public final void onComplete() {
    }
}
