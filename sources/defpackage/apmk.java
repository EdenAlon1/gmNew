package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apmk implements ctbj {
    final /* synthetic */ apml a;

    public apmk(apml apmlVar) {
        this.a = apmlVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        awth awthVar = new awth() { // from class: apmi
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                BugleConversationId bugleConversationId = new BugleConversationId(bdgq.b((String) obj));
                apml apmlVar = apmk.this.a;
                return !apmlVar.e.equals(bugleConversationId) ? elfo.e(null) : apmlVar.d();
            }
        };
        apml apmlVar = this.a;
        apmlVar.h = ctbt.b(apmlVar.a.a(awthVar), this.a.f.a(new aqgd() { // from class: apmj
            @Override // defpackage.aqgd
            public final elfl a() {
                return apmk.this.a.d();
            }
        }));
    }

    @Override // defpackage.ctbj
    public final void fO() {
        ctbx ctbxVar = this.a.h;
        ctbxVar.getClass();
        ctbxVar.a();
        this.a.h = null;
    }
}
