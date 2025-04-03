package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exjq implements evbk {
    private final ecda b = ecda.a(exjt.a, new ecda("GetPhotoMedia"));
    private final enip c = enip.s("https://www.googleapis.com/auth/maps-platform.places.getphotomedia", "https://www.googleapis.com/auth/maps-platform.places", "https://www.googleapis.com/auth/cloud-platform");

    @Override // defpackage.evbk
    public final ecda a() {
        return this.b;
    }

    @Override // defpackage.evbk
    public final Set b() {
        return this.c.isEmpty() ? exjt.g.i : this.c;
    }

    public final String toString() {
        return this.b.a;
    }
}
