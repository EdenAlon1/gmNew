package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.welcome.v1.SignedInWelcomeActivity;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deka implements ejxk {
    final /* synthetic */ Callable a;
    final /* synthetic */ dekb b;

    public deka(Callable callable, dekb dekbVar) {
        this.a = callable;
        this.b = dekbVar;
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
        this.a.call();
        ensk i = dekb.b.i();
        i.Y(ente.a, "BugleWelcome");
        ((enrr) ((enrr) i).g(th).h("com/google/android/apps/messaging/welcome/v1/WelcomeFlowV1EntryPointImpl$registerMixinCallbacks$1", "onLoadError", 93, "WelcomeFlowV1EntryPointImpl.kt")).q("Failed to load Welcome Flow launchData.");
    }

    @Override // defpackage.ejxk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dejq dejqVar = (dejq) obj;
        if (dejqVar.a == dejp.a) {
            ensk h = dekb.b.h();
            h.Y(ente.a, "BugleWelcome");
            ((enrr) h.h("com/google/android/apps/messaging/welcome/v1/WelcomeFlowV1EntryPointImpl$registerMixinCallbacks$1", "onLoaded", 84, "WelcomeFlowV1EntryPointImpl.kt")).q("notifies that the OOBE won't launch and allows showing Popups on app startup");
            this.a.call();
            return;
        }
        final dekb dekbVar = this.b;
        ensk h2 = dekb.b.h();
        h2.Y(ente.a, "BugleWelcome");
        ((enrr) h2.h("com/google/android/apps/messaging/welcome/v1/WelcomeFlowV1EntryPointImpl", "launchActivityInWelcomePathIfApplicable", 185, "WelcomeFlowV1EntryPointImpl.kt")).t("Welcome flow launch path is: %s", dejqVar.a);
        int ordinal = dejqVar.a.ordinal();
        if (ordinal == 1) {
            cvjl cvjlVar = dejqVar.b;
            Intent intent = new Intent(dekbVar.f.A(), (Class<?>) SignedInWelcomeActivity.class);
            eiuy.c(intent, dekbVar.e);
            intent.putExtra("INTENT_EXTRA_WELCOME_FLOW_TRIGGER_SOURCE", cvjlVar.g);
            ((dekv) dekbVar.k.b()).a(cvjlVar);
            elhh.a(dekbVar.f, intent);
            return;
        }
        if (ordinal != 2) {
            return;
        }
        final cvjl cvjlVar2 = dejqVar.b;
        final int i = dejqVar.c ? admj.h.j : admj.i.j;
        Optional optional = (Optional) dekbVar.i.b();
        final ffji ffjiVar = new ffji() { // from class: dejs
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                admk admkVar = (admk) obj2;
                admkVar.getClass();
                dekb dekbVar2 = dekb.this;
                dekv dekvVar = (dekv) dekbVar2.k.b();
                cvjl cvjlVar3 = cvjlVar2;
                dekvVar.a(cvjlVar3);
                dekbVar2.f.fe().getIntent().putExtra("EXPRESS_SIGN_IN_FLOW_KEY", i).putExtra("INTENT_EXTRA_WELCOME_FLOW_TRIGGER_SOURCE", cvjlVar3.g);
                admkVar.b((eito) dekbVar2.h.b());
                return ffcu.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: dejt
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                ejui ejuiVar = dekb.a;
                ffji.this.invoke(obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
