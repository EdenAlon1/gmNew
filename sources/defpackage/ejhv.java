package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.account.ui.onegoogle.expresssignin.selector.ExpressSignInActivity;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejhv implements eivp, eivq {
    private final Context a;

    public ejhv(Context context) {
        this.a = context;
    }

    @Override // defpackage.eivl
    public final ListenableFuture a(eivr eivrVar) {
        return erqt.i(new Intent(this.a, (Class<?>) ExpressSignInActivity.class));
    }

    @Override // defpackage.eivp
    public final /* synthetic */ ListenableFuture b(Intent intent) {
        return erqt.i(intent);
    }
}
