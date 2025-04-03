package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddam implements ejxk {
    final /* synthetic */ ddae a;

    public ddam(ddae ddaeVar) {
        this.a = ddaeVar;
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
        ((enrr) ((enrr) ((enrr) ddae.a.j()).g(th)).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputBottomSheetFragmentPeer$GetPhoneNumberInputDataCallback", "onLoadError", (char) 242, "PhoneNumberInputBottomSheetFragmentPeer.java")).q("Failed to get PhoneNumberInputUiSimInfo");
    }

    @Override // defpackage.ejxk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((Optional) obj).ifPresent(new Consumer() { // from class: ddal
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                clyv clyvVar = (clyv) obj2;
                ddam ddamVar = ddam.this;
                if (ddamVar.a.q()) {
                    ((TextView) ddamVar.a.d.N().findViewById(R.id.title)).setText(ddamVar.a.d.Z(R.string.phone_number_input_title_text_multi_sim, Integer.valueOf(clyvVar.a + 1)));
                    if (clyvVar.b.isEmpty()) {
                        ddamVar.a.d.N().findViewById(R.id.multi_sim_subtitle).setVisibility(8);
                        return;
                    }
                    dczw dczwVar = ddamVar.a.d;
                    Context A = dczwVar.A();
                    TextView textView = (TextView) dczwVar.N().findViewById(R.id.multi_sim_subtitle);
                    Integer valueOf = Integer.valueOf(clyvVar.a + 1);
                    String string = A.getString(R.string.phone_number_input_multisim_text, valueOf, clyvVar.b);
                    if (clyvVar.c) {
                        string = clyvVar.d ? A.getString(R.string.phone_number_input_multisim_text_default_call_sms, valueOf, clyvVar.b) : A.getString(R.string.phone_number_input_multisim_text_default_call, valueOf, clyvVar.b);
                    } else if (clyvVar.d) {
                        string = A.getString(R.string.phone_number_input_multisim_text_default_sms, valueOf, clyvVar.b);
                    }
                    textView.setText(string);
                    dcxx.e(A, textView);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
