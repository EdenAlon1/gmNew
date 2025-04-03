package defpackage;

import android.content.Intent;
import android.widget.TextView;
import com.google.android.apps.messaging.navigation.targets.DirectSendResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dctd extends abo {
    final /* synthetic */ dcte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dctd(dcte dcteVar) {
        super(true);
        this.a = dcteVar;
    }

    @Override // defpackage.abo
    public final void b() {
        dctl dctlVar;
        dcte dcteVar = this.a;
        dctl dctlVar2 = dcteVar.d;
        if (dctlVar2 == null || !dctlVar2.H().q()) {
            dcteVar.e.h(false);
            if (dcteVar.f && (dctlVar = dcteVar.d) != null) {
                dcty H = dctlVar.H();
                emxf.l(H.aa);
                TextView textView = H.F;
                textView.getClass();
                CharSequence text = textView.getText();
                dcteVar.a.setResult(-1, new Intent("android.intent.action.SEND").putExtra("direct_send_result", new DirectSendResult.Discard(emxe.a(text == null ? null : text.toString()))));
            }
            dcteVar.a.gE().d();
        }
    }
}
