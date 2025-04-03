package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adgk {
    public static final entd a = entd.c("Bugle");
    public final Class b;
    public final Optional c;
    private final errl d;
    private final Optional e;

    public adgk(Class cls, errl errlVar, Optional optional, Optional optional2) {
        this.b = cls;
        this.d = errlVar;
        this.c = optional;
        this.e = optional2;
    }

    public final elfl a() {
        if (this.c.isEmpty()) {
            return elfo.e(Optional.empty());
        }
        this.e.isPresent();
        emxf.m(true, "the isEnabledFn should be present when the feature is compiled in");
        return ((adgg) this.e.get()).a().h(new emwl() { // from class: adgi
            /* JADX WARN: Type inference failed for: r1v5, types: [fazb, java.lang.Object] */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (!bool.booleanValue()) {
                    return Optional.empty();
                }
                Object b = adgk.this.c.get().b();
                b.getClass();
                return Optional.of(b);
            }
        }, this.d).e(Exception.class, new emwl() { // from class: adgj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                ensz enszVar = (ensz) adgk.a.h();
                enszVar.Y(csux.O, adgk.this.b.toString());
                ((ensz) enszVar.h("com/google/android/apps/messaging/featureprovider/AsyncFeatureProvider", "getFeature", 97, "AsyncFeatureProvider.java")).o();
                axnw.d(exc);
                throw new IllegalStateException(exc);
            }
        }, this.d);
    }
}
