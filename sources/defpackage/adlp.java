package defpackage;

import com.google.android.apps.messaging.gaia.expresssignin.BugleExpressSignInActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adlp extends abo {
    final /* synthetic */ adls a;
    final /* synthetic */ BugleExpressSignInActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adlp(adls adlsVar, BugleExpressSignInActivity bugleExpressSignInActivity) {
        super(true);
        this.a = adlsVar;
        this.d = bugleExpressSignInActivity;
    }

    @Override // defpackage.abo
    public final void b() {
        ((ayfg) this.a.m.b()).j(this.a.a, null);
        this.d.finish();
    }
}
