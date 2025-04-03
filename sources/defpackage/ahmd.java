package defpackage;

import android.widget.Switch;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.settingspage.SettingsPageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahmd implements ejxk {
    final /* synthetic */ ahmc a;

    public ahmd(ahmc ahmcVar) {
        this.a = ahmcVar;
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
        this.a.b();
        this.a.a();
        ahmb ahmbVar = this.a.d;
        ahmbVar.getClass();
        Toast.makeText(((SettingsPageView) ahmbVar.N().findViewById(R.id.settings_page)).getContext(), R.string.read_receipt_fetch_failure, 0).show();
        ahmb ahmbVar2 = this.a.d;
        ahmbVar2.getClass();
        ((Switch) ahmbVar2.N().findViewById(R.id.read_receipt_switch_button)).setClickable(true);
    }

    @Override // defpackage.ejxk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.b();
        this.a.a();
        ahmb ahmbVar = this.a.d;
        ahmbVar.getClass();
        Switch r0 = (Switch) ahmbVar.N().findViewById(R.id.read_receipt_switch_button);
        r0.setChecked(((Boolean) obj).booleanValue());
        r0.jumpDrawablesToCurrentState();
        r0.setClickable(true);
    }
}
