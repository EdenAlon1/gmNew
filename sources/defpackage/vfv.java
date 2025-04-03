package defpackage;

import com.google.android.apps.messaging.R;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfv implements ejlr<Void, eyjv<cneb>> {
    private final ea a;
    private final Runnable b;

    public vfv(ea eaVar, Runnable runnable) {
        this.a = eaVar;
        this.b = runnable;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        String string;
        eyjv eyjvVar = (eyjv) obj2;
        eyjvVar.getClass();
        int i = ((cneb) eyjvVar.a(cneb.a, eyfc.a())).b;
        cnea cneaVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : cnea.FAIL_ENABLE_MMS_IN_GROUP : cnea.FAIL_MMS_UNAVAILABLE : cnea.SUCCESS : cnea.STATUS_UNSPECIFIED;
        if (cneaVar == null) {
            cneaVar = cnea.UNRECOGNIZED;
        }
        cneaVar.getClass();
        if (cneaVar != cnea.SUCCESS) {
            int ordinal = cneaVar.ordinal();
            if (ordinal == 2) {
                string = this.a.A().getString(R.string.mms_failure_outgoing_disabled);
            } else {
                if (ordinal != 3) {
                    throw new IllegalStateException("Unexpected transport type selection status: ".concat(String.valueOf(cneaVar.name())));
                }
                string = this.a.A().getString(R.string.cant_send_group_mms_message_when_group_mms_is_disabled);
            }
            string.getClass();
            ellj.f(new cvms(string, "", new Runnable() { // from class: vfu
                @Override // java.lang.Runnable
                public final void run() {
                }
            }), this.a);
        }
        this.b.run();
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        if (!(th instanceof CancellationException)) {
            throw new IllegalStateException("Unable to send a reaction", th);
        }
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
