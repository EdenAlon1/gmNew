package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daay {
    public daax a;
    public final daaq b;
    public final ffbr c;
    public final ffbr d;
    private final ffbr g;
    public final AtomicReference f = new AtomicReference(Optional.empty());
    public final crlv e = new crlv("enable_google_tos_banner", new ffix() { // from class: daat
        @Override // defpackage.ffix
        public final Object invoke() {
            return Boolean.valueOf(djai.F());
        }
    });

    static {
        engw.t(Integer.valueOf(R.string.fast_track_positive_button_text_experiment), Integer.valueOf(R.string.rcs_setup_accept), Integer.valueOf(R.string.google_tos_positive_button_continue));
        engw.t(Integer.valueOf(R.string.conversation_list_guest_cloud_onboarding_negative_link_text_v2), Integer.valueOf(R.string.google_tos_negative_link_text), Integer.valueOf(R.string.new_fast_track_negative_button_text));
    }

    public daay(daaq daaqVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.b = daaqVar;
        this.g = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        daaqVar.p(false);
    }

    final void a(final daax daaxVar) {
        this.a = daaxVar;
        if (djai.F() && ((Optional) this.f.get()).isPresent()) {
            daaxVar.k((Optional) this.f.get());
        }
        if (((Boolean) this.g.b()).booleanValue()) {
            this.b.N().findViewById(R.id.conversation_list_google_tos_popup_positive_button).setOnClickListener(new View.OnClickListener() { // from class: daar
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    daaxVar.j(daay.this.b.fe());
                }
            });
            this.b.N().findViewById(R.id.conversation_list_google_tos_popup_negative_button).setOnClickListener(new View.OnClickListener() { // from class: daas
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    daaxVar.i(daay.this.b.fe());
                }
            });
        }
    }
}
