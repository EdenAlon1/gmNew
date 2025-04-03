package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class umu implements ddzp {
    final /* synthetic */ umw a;
    final /* synthetic */ ffgu b;

    public umu(umw umwVar, ffgu ffguVar) {
        this.a = umwVar;
        this.b = ffguVar;
    }

    @Override // defpackage.ddzp
    public final void a(Uri uri) {
        doxs a;
        if (((Boolean) cful.o.e()).booleanValue()) {
            ufq h = ufr.h();
            h.d(uri);
            h.b(eohh.CONTACT_CHOOSER);
            a = h.a();
        } else {
            a = this.a.g.a(uri, eohh.CONTACT_CHOOSER);
        }
        umw umwVar = this.a;
        axol.k(umwVar.h, null, new umt(this.b, umwVar, a, null), 3);
    }
}
