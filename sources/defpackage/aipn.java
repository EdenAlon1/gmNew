package defpackage;

import j$.util.Optional;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aipn {
    private final emyl a;

    public aipn(final fazb fazbVar) {
        this.a = emys.a(new emyl() { // from class: aipm
            @Override // defpackage.emyl
            public final Object get() {
                return aipn.b(fazb.this);
            }
        });
    }

    public static Optional b(fazb fazbVar) {
        try {
            return Optional.of((CronetEngine) fazbVar.b());
        } catch (IllegalStateException | UnsatisfiedLinkError unused) {
            return Optional.empty();
        }
    }

    public final Optional a() {
        return (Optional) this.a.get();
    }
}
