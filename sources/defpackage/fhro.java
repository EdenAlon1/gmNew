package defpackage;

import java.security.Signature;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhro implements fhrm {
    final /* synthetic */ fhrr a;

    public fhro(fhrr fhrrVar) {
        this.a = fhrrVar;
    }

    @Override // defpackage.fhrm
    public final Signature a(String str) {
        try {
            return this.a.e.a(str);
        } catch (Exception unused) {
            return Signature.getInstance(str);
        }
    }
}
