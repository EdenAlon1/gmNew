package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czfv implements dbzn {
    final /* synthetic */ czfx a;

    public czfv(czfx czfxVar) {
        this.a = czfxVar;
    }

    private final void l(MessagePartCoreData messagePartCoreData, boolean z) {
        if (z) {
            bcvr bcvrVar = (bcvr) this.a.o.a();
            int o = bcvrVar.o();
            if (o == 0) {
                o = 1;
            }
            czfx czfxVar = this.a;
            MessageCoreData j = czfxVar.n.j(o, bcvrVar.e, bcvrVar.t());
            ((MessageData) j).p = bcvrVar.z();
            j.aL(messagePartCoreData);
            czfx czfxVar2 = this.a;
            bcvrVar.y();
            czfxVar2.f.aM();
            czfx czfxVar3 = this.a;
            czfxVar3.d.g(j, czfxVar3.h.a()).t();
            this.a.t.at();
        } else if (messagePartCoreData instanceof PendingAttachmentData) {
            cxvv cxvvVar = ((cxtc) this.a.u).c;
            ((bcvr) cxvvVar.x.a()).E((PendingAttachmentData) messagePartCoreData, cxvvVar.x);
            cxvvVar.m.requestFocus();
        } else {
            new ArrayList().add(messagePartCoreData);
            ((upg) ((cxtc) this.a.u).c.ae.b()).a();
        }
        if (this.a.m.n() || this.a.t.bc()) {
            this.a.u.z(false);
        }
    }

    private final void m(String str) {
        bcvr bcvrVar = (bcvr) this.a.o.a();
        MessageCoreData o = this.a.n.o(bcvr.p(bcvrVar.n()), bcvrVar.e, bcvrVar.t(), str);
        ((MessageData) o).p = bcvrVar.z();
        bcvrVar.y();
        this.a.f.aM();
        ((ctiy) this.a.g.b()).d(this.a.p);
        czfx czfxVar = this.a;
        czfxVar.d.g(o, czfxVar.h.a()).t();
        if (this.a.m.n()) {
            this.a.u.z(false);
        }
        this.a.t.at();
    }

    @Override // defpackage.dbzn
    public final /* synthetic */ void a(ufd ufdVar, dcle dcleVar, boolean z) {
        dbzm.a(this, ufdVar, dcleVar, z);
    }

    @Override // defpackage.dbzn
    public final /* synthetic */ void b(MediaContentItem mediaContentItem, dcle dcleVar, boolean z) {
        dbzm.b(this, mediaContentItem, dcleVar, z);
    }

    @Override // defpackage.dbzn
    public final void c(ufd ufdVar, dcle dcleVar, boolean z, int i) {
        l(this.a.j.a(ufdVar, dcleVar), z);
        this.a.e.c(dclb.a(ufdVar, dcleVar), ((bcvr) this.a.o.a()).k() - 1, i);
    }

    @Override // defpackage.dbzn
    public final void d(MediaContentItem mediaContentItem, dcle dcleVar, boolean z, int i) {
        l(this.a.i.a(mediaContentItem, dcleVar), z);
        this.a.e.c(dcll.a(mediaContentItem, dcleVar), ((bcvr) this.a.o.a()).k() - 1, i);
    }

    @Override // defpackage.dbzn
    public final /* synthetic */ void e(ufd ufdVar, dcle dcleVar) {
        dbzm.c(this, ufdVar, dcleVar);
    }

    @Override // defpackage.dbzn
    public final /* synthetic */ void f(MediaContentItem mediaContentItem, dcle dcleVar) {
        dbzm.d(this, mediaContentItem, dcleVar);
    }

    @Override // defpackage.dbzn
    public final void g(ufd ufdVar, dcle dcleVar, int i) {
        czfx czfxVar = this.a;
        MessagePartCoreData u = czfxVar.u.u(czfxVar.j.a(ufdVar, dcleVar));
        eppr O = u != null ? u.O() : null;
        if (O != null) {
            this.a.p(O, i);
        } else {
            this.a.p(dclb.a(ufdVar, dcleVar), i);
        }
    }

    @Override // defpackage.dbzn
    public final void h(MediaContentItem mediaContentItem, dcle dcleVar, int i) {
        czfx czfxVar = this.a;
        MessagePartCoreData u = czfxVar.u.u(czfxVar.i.a(mediaContentItem, dcleVar));
        eppr O = u != null ? u.O() : null;
        if (O != null) {
            this.a.p(O, i);
        } else {
            this.a.p(dcll.a(mediaContentItem, dcleVar), i);
        }
    }

    @Override // defpackage.dbzn
    public final void i(dcas dcasVar, boolean z) {
        CharSequence a = dcasVar.a();
        if (TextUtils.isEmpty(a)) {
            return;
        }
        if (z) {
            m(a.toString());
        } else {
            this.a.s.p(a);
            this.a.f.aO();
        }
    }

    @Override // defpackage.dbzn
    public final /* synthetic */ void j(appw appwVar, dcle dcleVar, boolean z) {
        dbzm.e(this, appwVar, dcleVar, z);
    }

    @Override // defpackage.dbzn
    public final void k(appw appwVar, dcle dcleVar, boolean z, int i) {
        String c = appwVar.c();
        if (TextUtils.isEmpty(c)) {
            return;
        }
        if (z) {
            m(c);
        } else {
            this.a.s.p(c);
        }
        czfx czfxVar = this.a;
        czfxVar.e.c(dclo.a(appwVar, dcleVar), -1, i);
    }
}
