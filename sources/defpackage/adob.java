package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.google.android.apps.messaging.gaia.signoutaccount.SignOutAccountActivity;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adob {
    public static final enru a = enru.c("com/google/android/apps/messaging/gaia/signoutaccount/SignOutAccountActivityPeer");
    public final SignOutAccountActivity b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    private final ffbr f;

    public adob(SignOutAccountActivity signOutAccountActivity, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.b = signOutAccountActivity;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.f = ffbrVar3;
        this.e = ffbrVar4;
        eito eitoVar = (eito) ffbrVar.b();
        if (!eiwz.h() && signOutAccountActivity.getCallingActivity() == null) {
            ((enrr) ((enrr) eiwz.d.j()).h("com/google/apps/tiktok/account/api/controller/Config", "forRequirementActivity", 129, "Config.java")).t("Requirement activity not launched for result: %s", signOutAccountActivity.getClass());
        }
        eiwy d = eiwz.d();
        d.c(true);
        int i = engw.d;
        ((eiwv) d).a = enou.a;
        eitoVar.g(d.a());
        signOutAccountActivity.getIntent().getExtras();
        eitoVar.e(new adoa(this));
        Optional optional = (Optional) ffbrVar3.b();
        final ffji ffjiVar = new ffji() { // from class: adny
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                eito eitoVar2 = (eito) adob.this.c.b();
                eitoVar2.e(new adhs((adht) obj));
                return eitoVar2;
            }
        };
        optional.map(new Function() { // from class: adnz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final eisx a() {
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        Intent intent = this.b.getIntent();
        intent.getClass();
        if (Build.VERSION.SDK_INT > 33) {
            parcelableExtra2 = intent.getParcelableExtra("EXTRA_ACCOUNT_ID_TO_SWITCH_TO", eisx.class);
            parcelableExtra = (Parcelable) parcelableExtra2;
        } else {
            parcelableExtra = intent.getParcelableExtra("EXTRA_ACCOUNT_ID_TO_SWITCH_TO");
        }
        return (eisx) parcelableExtra;
    }
}
