package defpackage;

import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.ProblematicConversationDataView;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.ProblematicMessageDataView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adyc {
    public static final cfup a = cfvl.e(cfvl.b, "max_conversation_count", 5);
    public static final cfup b = cfvl.e(cfvl.b, "max_message_count", 20);
    public LinearLayout c;
    public final ffbr d;
    public final ffbr e;
    public LayoutInflater g;
    public final adva i;
    public final ejwd j;
    public final List f = new ArrayList();
    public final entd h = entd.c("Bugle");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [adyb] */
    public adyc(ffbr ffbrVar, ffbr ffbrVar2) {
        cfva cfvaVar = adva.d;
        adut adutVar = new adut();
        adutVar.c(((Integer) a.e()).intValue());
        adutVar.d(((Integer) b.e()).intValue());
        adutVar.b(new Object() { // from class: adyb
        });
        this.i = adutVar.e();
        this.j = new ejwd<engw<aduy>>() { // from class: adyc.1
            @Override // defpackage.ejwd
            public final void a(Throwable th) {
                ((ensz) ((ensz) ((ensz) adyc.this.h.j()).g(th)).h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/MessageSelectorFragmentPeer$1", "onError", 'N', "MessageSelectorFragmentPeer.java")).q("Failed to fetch data from ProblematicConversationDataRequest, skip");
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v1 */
            /* JADX WARN: Type inference failed for: r11v2, types: [int] */
            /* JADX WARN: Type inference failed for: r11v4 */
            /* JADX WARN: Type inference failed for: r6v2, types: [engw, java.util.List] */
            @Override // defpackage.ejwd
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                engw engwVar;
                int i;
                engw engwVar2 = (engw) obj;
                int size = engwVar2.size();
                boolean z = false;
                int i2 = 0;
                while (i2 < size) {
                    adyc adycVar = adyc.this;
                    aduy aduyVar = (aduy) engwVar2.get(i2);
                    LayoutInflater layoutInflater = adycVar.g;
                    if (layoutInflater != null) {
                        ProblematicConversationDataView problematicConversationDataView = (ProblematicConversationDataView) layoutInflater.inflate(R.layout.problematic_conversation_data_view, adycVar.c, z);
                        adyj H = problematicConversationDataView.H();
                        LayoutInflater layoutInflater2 = adycVar.g;
                        H.f = aduyVar.a();
                        H.b.setText(H.f);
                        H.e = aduyVar.b();
                        ?? c = aduyVar.c();
                        int i3 = ((enou) c).c;
                        for (?? r11 = z; r11 < i3; r11++) {
                            adux aduxVar = (adux) c.get(r11);
                            ProblematicMessageDataView problematicMessageDataView = (ProblematicMessageDataView) layoutInflater2.inflate(R.layout.problematic_message_data_view, H.a, z);
                            adyq H2 = problematicMessageDataView.H();
                            H2.f = aduxVar;
                            H2.a.setText(aduxVar.b());
                            H2.b.setText(((csrh) H2.d.b()).d(aduxVar.a()));
                            H2.e = H;
                            H.d.add(problematicMessageDataView.H());
                            H.a.addView(problematicMessageDataView);
                            engwVar2 = engwVar2;
                            size = size;
                            z = false;
                        }
                        engwVar = engwVar2;
                        i = size;
                        H.a();
                        adycVar.f.add(problematicConversationDataView.H());
                        LinearLayout linearLayout = adycVar.c;
                        if (linearLayout != null) {
                            linearLayout.addView(problematicConversationDataView);
                        }
                    } else {
                        engwVar = engwVar2;
                        i = size;
                    }
                    i2++;
                    engwVar2 = engwVar;
                    size = i;
                    z = false;
                }
            }

            @Override // defpackage.ejwd
            public final /* synthetic */ void hB() {
            }
        };
        this.e = ffbrVar;
        this.d = ffbrVar2;
    }
}
