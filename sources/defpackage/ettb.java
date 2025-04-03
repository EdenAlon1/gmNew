package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ettb {
    public final etta a;
    public final Class b;
    public final etrt c;
    private final Map d;
    private final List e;

    public ettb(Map map, List list, etta ettaVar, etrt etrtVar, Class cls) {
        this.d = map;
        this.e = list;
        this.a = ettaVar;
        this.b = cls;
        this.c = etrtVar;
    }

    public final Collection a() {
        return this.d.values();
    }

    public final List b() {
        return DesugarCollections.unmodifiableList(this.e);
    }

    public final List c(byte[] bArr) {
        List list = (List) this.d.get(eujt.b(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public final List d() {
        return c(etfo.a);
    }

    public final boolean e() {
        return !this.c.b.isEmpty();
    }
}
