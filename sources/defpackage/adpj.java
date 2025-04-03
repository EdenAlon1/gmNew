package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.gaia.signoutaccount.SignOutAccountArguments;
import com.google.android.apps.messaging.gaia.signoutaccount.SignOutAccountViewModel;
import com.google.android.apps.messaging.welcome.v1.viewmodel.AccountWelcomeViewModel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adpj {
    public static final enru a = enru.c("com/google/android/apps/messaging/gaia/signoutaccount/SignOutAccountFragmentPeer");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffsk j;
    public final ffbz k;
    public final ffbz l;

    public adpj(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffsk ffskVar) {
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffskVar.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = ffbrVar6;
        this.h = ffbrVar7;
        this.i = ffbrVar8;
        this.j = ffskVar;
        Object b = ffbrVar.b();
        b.getClass();
        ea eaVar = (ea) b;
        ffbz b2 = ffca.b(3, new adpb(new adpa(eaVar)));
        int i = fflc.a;
        this.k = new lmn(new ffkb(SignOutAccountViewModel.class), new adpc(b2), new adpe(eaVar, b2), new adpd(b2));
        Object b3 = ffbrVar.b();
        b3.getClass();
        ea eaVar2 = (ea) b3;
        ffbz b4 = ffca.b(3, new adpg(new adpf(eaVar2)));
        this.l = new lmn(new ffkb(AccountWelcomeViewModel.class), new adph(b4), new adoz(eaVar2, b4), new adpi(b4));
    }

    public final eisx a() {
        SignOutAccountArguments signOutAccountArguments;
        Bundle bundle = ((adoq) this.b.b()).m;
        if (bundle == null || (signOutAccountArguments = (SignOutAccountArguments) ih.a(bundle, "sign_out_account_arguments", SignOutAccountArguments.class)) == null) {
            return null;
        }
        return signOutAccountArguments.a;
    }
}
