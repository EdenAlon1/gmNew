package defpackage;

import android.widget.TextView;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajkq implements ejxk {
    final /* synthetic */ ajkt a;

    public ajkq(ajkt ajktVar) {
        this.a = ajktVar;
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
        ensk j = ajkt.a.j();
        j.Y(ente.a, "Bugle");
        ((enrr) ((enrr) j).g(th).h("com/google/android/apps/messaging/privacy/identitydetails/IdentityDetailsFragmentPeer$onLoadSecurityKey$1", "onLoadError", 89, "IdentityDetailsFragmentPeer.kt")).q("Failed to load identity details");
        this.a.a().setVisibility(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ejxk
    public final /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        String str = (String) (optional.isPresent() ? optional.get() : null);
        if (str == null) {
            ensk h = ajkt.a.h();
            h.Y(ente.a, "Bugle");
            ((enrr) h.h("com/google/android/apps/messaging/privacy/identitydetails/IdentityDetailsFragmentPeer$onLoadSecurityKey$1", "onLoaded", 83, "IdentityDetailsFragmentPeer.kt")).q("Identity details not loaded or not present");
            this.a.a().setVisibility(4);
            return;
        }
        ajkt ajktVar = this.a;
        List list = ajkt.b;
        int i = ((enou) list).c;
        int length = str.length();
        if (length != 0) {
            if (length % i == 0) {
                int i2 = length / i;
                enqv it = ((engw) list).iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    TextView textView = (TextView) ajktVar.c.N().findViewById(((Number) it.next()).intValue());
                    int g = ffmk.g(i3 + i2, length);
                    String substring = str.substring(i3, g);
                    substring.getClass();
                    textView.setText(substring);
                    if (g >= length) {
                        break;
                    } else {
                        i3 = g;
                    }
                }
            } else {
                ensk j = ajkt.a.j();
                j.Y(ente.a, "Bugle");
                ((enrr) j.h("com/google/android/apps/messaging/privacy/identitydetails/IdentityDetailsFragmentPeer", "setIdentityDetailsText", 150, "IdentityDetailsFragmentPeer.kt")).r("Unexpected security key length: %d", length);
            }
        } else {
            ensk j2 = ajkt.a.j();
            j2.Y(ente.a, "Bugle");
            ((enrr) j2.h("com/google/android/apps/messaging/privacy/identitydetails/IdentityDetailsFragmentPeer", "setIdentityDetailsText", 146, "IdentityDetailsFragmentPeer.kt")).q("Identity details found with 0 length; skipping");
        }
        this.a.a().setVisibility(0);
    }
}
