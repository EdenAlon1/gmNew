package defpackage;

import com.google.android.apps.messaging.gaia.expresssignin.BugleExpressSignInActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adlr extends abo {
    final /* synthetic */ BugleExpressSignInActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adlr(BugleExpressSignInActivity bugleExpressSignInActivity) {
        super(true);
        this.a = bugleExpressSignInActivity;
    }

    @Override // defpackage.abo
    public final void b() {
        this.a.moveTaskToBack(true);
    }
}
