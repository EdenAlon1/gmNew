package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azqb {
    public final Optional a;
    private final azpp b;
    private final aolr c;

    public azqb(azpp azppVar, Optional optional, aolr aolrVar) {
        aolrVar.getClass();
        this.b = azppVar;
        this.a = optional;
        this.c = aolrVar;
        if (azppVar.a.a() != azon.a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final aoku a() {
        Object obj;
        this.a.isPresent();
        enip a = this.b.a();
        a.getClass();
        ffoj ffojVar = new ffoj((ffok) ffno.i(ffdx.as(a), new ffji() { // from class: azqa
            /* JADX WARN: Type inference failed for: r0v2, types: [djsi, java.lang.Object] */
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                Integer num = (Integer) obj2;
                ?? r0 = azqb.this.a.get();
                num.getClass();
                return r0.g(num.intValue());
            }
        }));
        while (true) {
            if (!ffojVar.hasNext()) {
                obj = null;
                break;
            }
            obj = ffojVar.next();
            if (((Optional) obj).isPresent()) {
                break;
            }
        }
        Optional optional = (Optional) obj;
        djrj djrjVar = optional != null ? (djrj) optional.get() : null;
        if (djrjVar != null) {
            return this.c.d(djrjVar);
        }
        if (this.b.b().isPresent()) {
            return this.c.c((String) this.b.b().get(), new emyl() { // from class: azpz
                @Override // defpackage.emyl
                public final Object get() {
                    return Optional.empty();
                }
            });
        }
        return null;
    }
}
