package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhgo {
    public final fhmx a;
    public fhgn b;
    public final List c;

    public fhgo() {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        fhmx fhmxVar = fhmx.a;
        this.a = fhmw.b(uuid);
        this.b = fhgq.a;
        this.c = new ArrayList();
    }

    public final void a(fhgp fhgpVar) {
        this.c.add(fhgpVar);
    }
}
