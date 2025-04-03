package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhmj extends IOException {
    static final fhgl a = new fhgl() { // from class: fhmi
        @Override // defpackage.fhgl
        public final fhhb a(fhiu fhiuVar) {
            return fhmj.a(fhiuVar);
        }
    };

    public fhmj(Throwable th) {
        super(th);
    }

    static /* synthetic */ fhhb a(fhiu fhiuVar) {
        try {
            return fhiuVar.b(fhiuVar.c);
        } catch (Error | RuntimeException e) {
            throw new fhmj(e);
        }
    }
}
