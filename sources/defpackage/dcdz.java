package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcdz implements dbxy {
    final /* synthetic */ dcdk a;

    public dcdz(dcdk dcdkVar) {
        this.a = dcdkVar;
    }

    @Override // defpackage.dbxy
    public final void j(eptm eptmVar) {
        dcdk dcdkVar = this.a;
        dcdkVar.a = true;
        ((dcgl) dcdkVar.g.b()).a(this.a.l);
        ((aled) this.a.f.b()).d(epts.EXTERNAL, eptu.EXPANDED, eptmVar, epto.UNKNOWN_OPENING_STATE, 0, Duration.ofMillis(0L), null);
    }

    @Override // defpackage.dbxy
    public final boolean p(eptm eptmVar, AttachmentQueueState attachmentQueueState) {
        return false;
    }

    @Override // defpackage.dbxy
    public final void r(Intent intent) {
        dcfa dcfaVar = this.a.b;
        if (dcfaVar != null) {
            dcfaVar.a(intent);
        }
    }

    @Override // defpackage.dbxy
    public final void l(eptm eptmVar) {
    }

    @Override // defpackage.dbxy
    public final void m(eptm eptmVar, int i) {
    }

    @Override // defpackage.dbxy
    public final void k(eisx eisxVar, eptm eptmVar, AttachmentQueueState attachmentQueueState) {
    }
}
