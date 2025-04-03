package defpackage;

import com.google.android.apps.messaging.gaia.expresssignin.BugleExpressSignInActivity;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adlq extends abo {
    final /* synthetic */ adls a;
    final /* synthetic */ BugleExpressSignInActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adlq(adls adlsVar, BugleExpressSignInActivity bugleExpressSignInActivity) {
        super(true);
        this.a = adlsVar;
        this.d = bugleExpressSignInActivity;
    }

    @Override // defpackage.abo
    public final void b() {
        ((AtomicBoolean) this.a.l.b()).set(true);
        this.d.finish();
    }
}
