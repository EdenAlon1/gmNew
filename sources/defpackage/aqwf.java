package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqwf implements bzpy, ctbj {
    private static final entd c = entd.c("BugleSelfIdentity");
    public final ctbl a;
    public final aolr b;

    public aqwf(ctbk ctbkVar, aolr aolrVar) {
        this.a = ctbkVar.a(this);
        this.b = aolrVar;
    }

    @Override // defpackage.bzpy
    public final elfl a(final String str, boolean z) {
        ensz enszVar = (ensz) c.e();
        enszVar.Y(csux.E, str);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/encryption/EtouffeeEncryptionStateListener", "onStateChange", 42, "EtouffeeEncryptionStateListener.java")).t("SelfIdentity encryption state changed to: %s.", true != z ? "DISABLED" : "PROVISIONED");
        this.a.c(new Supplier() { // from class: aqwe
            @Override // java.util.function.Supplier
            public final Object get() {
                return aqwf.this.b.r(str);
            }
        }, "EtouffeeEncryptionStateListener::Notify");
        return elfo.e(null);
    }

    @Override // defpackage.ctbj
    public final /* synthetic */ void fN() {
    }

    @Override // defpackage.ctbj
    public final /* synthetic */ void fO() {
    }
}
