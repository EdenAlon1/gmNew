package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.rcs.setup.RcsWelcomeMessageView;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcyt implements ajhy {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/rcs/setup/RcsWelcomeMessagePopup");
    public final ffbr b;
    public Optional c = Optional.empty();
    crly d;
    private final errl e;
    private final errl f;
    private ajid g;

    public dcyt(errl errlVar, errl errlVar2, ffbr ffbrVar) {
        this.e = errlVar;
        this.f = errlVar2;
        this.b = ffbrVar;
    }

    @Override // defpackage.ajhy
    public final elfl b() {
        return ((cmfj) this.b.b()).c().h(new emwl() { // from class: dcys
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cmgi cmgiVar = (cmgi) ((Optional) obj).orElse(null);
                if (cmgiVar == null) {
                    ((enrr) ((enrr) dcyt.a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/RcsWelcomeMessagePopup", "wantsToShowForAllSims", 79, "RcsWelcomeMessagePopup.java")).q("wantsToShowForAllSims: request is null");
                    return false;
                }
                dcyt dcytVar = dcyt.this;
                ((enrr) ((enrr) dcyt.a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/RcsWelcomeMessagePopup", "wantsToShowForAllSims", 83, "RcsWelcomeMessagePopup.java")).t("wantsToShowForAllSims: setting welcome message request for simId: %s", cmgiVar.a);
                dcytVar.c = Optional.of(cmgiVar);
                return true;
            }
        }, this.e);
    }

    @Override // defpackage.ajhy
    public final void c(ajid ajidVar, ViewGroup viewGroup) {
        this.g = ajidVar;
        this.d = new crly(viewGroup, R.id.conversation_list_rcs_welcome_message_stub, R.id.conversation_list_rcs_welcome_message);
    }

    @Override // defpackage.ajhy
    public final void d() {
        this.d.e();
        this.g.b();
        final String str = (String) this.c.map(new Function() { // from class: dcyq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cmgi) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
        if (str == null) {
            ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/RcsWelcomeMessagePopup", "hide", 119, "RcsWelcomeMessagePopup.java")).q("hide: simId is null");
        } else {
            elfo.f(new Runnable() { // from class: dcyr
                @Override // java.lang.Runnable
                public final void run() {
                    ((cmfj) dcyt.this.b.b()).i(new djro(str), true);
                }
            }, this.f).k(axnw.b(), erpp.a);
        }
    }

    @Override // defpackage.ajhy
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        if (((cmgi) this.c.orElse(null)) == null) {
            ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/RcsWelcomeMessagePopup", "show", 96, "RcsWelcomeMessagePopup.java")).q("show: welcome message is missing");
            return false;
        }
        ((RcsWelcomeMessageView) this.d.b()).H().b = this;
        final cmgi cmgiVar = (cmgi) this.c.orElse(null);
        if (cmgiVar != null) {
            final dcyx H = ((RcsWelcomeMessageView) this.d.b()).H();
            H.c.setText(cmgiVar.b);
            H.d.setText(cmgiVar.c);
            TextView textView = (TextView) H.e.findViewById(R.id.rcs_welcome_message_settings_button);
            if (cmgiVar.d) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: dcyv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ((enrr) ((enrr) dcyx.a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/RcsWelcomeMessageViewPeer", "navigateToSettings", 94, "RcsWelcomeMessageViewPeer.java")).q("RcsWelcomeMessage: Settings");
                        dcyx dcyxVar = dcyx.this;
                        Intent o = ((akvg) dcyxVar.f.b()).o(dcyxVar.e.getContext());
                        if (!((aupm) dcyxVar.h.b()).a()) {
                            o.putExtra("open_settings_from_welcome_message", true);
                        }
                        eldl.p(dcyxVar.e.getContext(), o);
                        dcyt dcytVar = dcyxVar.b;
                        if (dcytVar != null) {
                            dcytVar.d();
                        }
                        ((cmfb) dcyxVar.g.b()).f(cmgiVar.a, epgr.RCS_PROVISIONING_WELCOME_MESSAGE_SETTINGS_CLICKED);
                    }
                });
            } else {
                textView.setVisibility(8);
            }
            ((TextView) H.e.findViewById(R.id.rcs_welcome_message_got_it_button)).setOnClickListener(new View.OnClickListener() { // from class: dcyw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((enrr) ((enrr) dcyx.a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/RcsWelcomeMessageViewPeer", "acceptPopup", 112, "RcsWelcomeMessageViewPeer.java")).q("RcsWelcomeMessage: Accepted");
                    dcyx dcyxVar = dcyx.this;
                    dcyt dcytVar = dcyxVar.b;
                    if (dcytVar != null) {
                        dcytVar.d();
                    }
                    ((cmfb) dcyxVar.g.b()).f(cmgiVar.a, epgr.RCS_PROVISIONING_WELCOME_MESSAGE_ACCEPTED);
                }
            });
            ((cmfb) H.g.b()).f(cmgiVar.a, epgr.RCS_PROVISIONING_WELCOME_MESSAGE_SEEN);
        }
        this.d.g(0);
        return true;
    }

    @Override // defpackage.ajhy
    public final int f() {
        return 5;
    }

    @Override // defpackage.ajhy
    public final void g() {
        if (this.d.a() != 8) {
            d();
        }
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ int n() {
        return ajhx.a();
    }
}
