package defpackage;

import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkly implements dkic {
    private final dkhx a;
    private final dkib b;

    public dkly(dkhx dkhxVar, dkib dkibVar) {
        this.a = dkhxVar;
        this.b = dkibVar;
    }

    @Override // defpackage.dkic
    public final void k(long j, String str, dkht dkhtVar) {
        dkty.o("Received capabilities for %s: %s", dkty.a(str), dkhtVar);
        if (dkhtVar.y()) {
            dkty.o("updating RCS contact %s", dkty.a(str));
        } else if (dkhtVar.c || !dkhtVar.d) {
            dkty.o("updating non RCS contact %s", dkty.a(str));
        } else {
            dkty.o("updating offline contact %s", dkty.a(str));
        }
        this.a.d(j, str, new ImsCapabilities(dkhtVar));
    }

    @Override // defpackage.dkic
    public final void l(long j, String str) {
        dkty.o("update error for contact %s", dkty.a(str));
        ImsCapabilities imsCapabilities = new ImsCapabilities(this.b.a);
        dkhx dkhxVar = this.a;
        Optional c = dkhxVar.c.c(str);
        if (c.isEmpty()) {
            dkhxVar.d(j, str, imsCapabilities);
        } else {
            dkhxVar.e(j, str, (ImsCapabilities) c.get());
        }
    }
}
