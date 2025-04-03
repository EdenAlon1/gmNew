package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ewtg implements evbk {
    private final ecda b = ecda.a(ewum.a, new ecda("GetPublicPeople"));
    private final enip c = enip.t("https://www.googleapis.com/auth/peopleapi.legacy.readwrite", "https://www.googleapis.com/auth/peopleapi.readonly", "https://www.googleapis.com/auth/peopleapi.readwrite", "https://www.googleapis.com/auth/plus.peopleapi.readwrite");

    @Override // defpackage.evbk
    public final ecda a() {
        return this.b;
    }

    @Override // defpackage.evbk
    public final Set b() {
        return this.c.isEmpty() ? ewum.ac.ae : this.c;
    }

    public final String toString() {
        return this.b.a;
    }
}
