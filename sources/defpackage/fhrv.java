package defpackage;

import java.security.Signature;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhrv implements fhrm {
    final /* synthetic */ fhry a;

    public fhrv(fhry fhryVar) {
        this.a = fhryVar;
    }

    @Override // defpackage.fhrm
    public final Signature a(String str) {
        try {
            return this.a.f.a(str);
        } catch (Exception unused) {
            return Signature.getInstance(str);
        }
    }
}
