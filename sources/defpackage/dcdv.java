package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
class dcdv implements ejwd<eixz> {
    final /* synthetic */ Bundle a;
    final /* synthetic */ dcdk b;

    public dcdv(dcdk dcdkVar, Bundle bundle) {
        this.a = bundle;
        this.b = dcdkVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        csjy.n("Bugle", "AccountFullscreenGalleryFragmentPeer: failed to fetch account info");
        this.b.a(new emyl() { // from class: dcdt
            @Override // defpackage.emyl
            public final Object get() {
                return false;
            }
        }, this.a);
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final eixz eixzVar = (eixz) obj;
        dcdk dcdkVar = this.b;
        final boolean z = dcdkVar.p.c;
        dcdkVar.a(new emyl() { // from class: dcdu
            @Override // defpackage.emyl
            public final Object get() {
                boolean z2 = false;
                if (!z && !eixzVar.k.equals("pseudonymous")) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }, this.a);
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }
}
