package defpackage;

import java.security.Signature;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhrw implements fhrm {
    final /* synthetic */ String a;

    public fhrw(String str) {
        this.a = str;
    }

    @Override // defpackage.fhrm
    public final Signature a(String str) {
        String str2 = this.a;
        return str2 != null ? Signature.getInstance(str, str2) : Signature.getInstance(str);
    }
}
