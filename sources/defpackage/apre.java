package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apre implements ctbj {
    final /* synthetic */ aprh a;

    public apre(aprh aprhVar) {
        this.a = aprhVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        final aprh aprhVar = this.a;
        aprhVar.d = aprhVar.b.f.a(new ctbf() { // from class: aprd
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                elfl c;
                aprh aprhVar2 = aprh.this;
                c = axol.c(aprhVar2.a, ffhe.a, ffsm.a, new aprg((MessageId) obj, aprhVar2, null));
                return c;
            }
        }, "RichCardMediaTransferProgressManager::Register", "RichCardMediaTransferProgressManager::Callback", "RichCardMediaTransferProgressManager::Unregister");
    }

    @Override // defpackage.ctbj
    public final void fO() {
        ctbx ctbxVar = this.a.d;
        if (ctbxVar != null) {
            ctbxVar.a();
        }
        this.a.d = null;
    }
}
