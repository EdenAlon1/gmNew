package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhjx implements ffix {
    final /* synthetic */ fhkf a;
    private final fhkj b;

    public fhjx(fhkf fhkfVar, fhkj fhkjVar) {
        this.a = fhkfVar;
        this.b = fhkjVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        try {
        } catch (IOException e) {
            this.a.k(2, 2, e);
        } catch (Throwable th) {
            this.a.k(3, 3, null);
            fhhl.q(this.b);
            throw th;
        }
        if (!this.b.a(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (this.b.a(false, this)) {
        }
        this.a.k(1, 9, null);
        fhhl.q(this.b);
        return ffcu.a;
    }
}
