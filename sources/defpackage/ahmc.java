package defpackage;

import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.settingspage.SettingsPageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahmc {
    public static final cskc a = cskc.g("Lighter", "LighterSettingsFragment");
    public final ffbr b;
    public final errl c;
    public final ahmb d;
    dzja e;
    dzpt f;
    public final ejlq g;
    public final ejxn h;
    public final ejlr i = new ejlr<Boolean, Boolean>() { // from class: ahmc.1
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            ahmb ahmbVar = ahmc.this.d;
            ahmbVar.getClass();
            Toast.makeText(((SettingsPageView) ahmbVar.N().findViewById(R.id.settings_page)).getContext(), true != ((Boolean) obj2).booleanValue() ? R.string.read_receipt_setting_disable_success : R.string.read_receipt_setting_enable_success, 0).show();
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            ahmb ahmbVar = ahmc.this.d;
            ahmbVar.getClass();
            Toast.makeText(((SettingsPageView) ahmbVar.N().findViewById(R.id.settings_page)).getContext(), R.string.read_receipt_setting_failure, 0).show();
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final ejxk j = new ahmd(this);
    public eadn k;
    public dypu l;

    public ahmc(ahmb ahmbVar, ffbr ffbrVar, ejlq ejlqVar, ejxn ejxnVar, errl errlVar) {
        this.d = ahmbVar;
        this.b = ffbrVar;
        this.g = ejlqVar;
        this.h = ejxnVar;
        this.c = errlVar;
    }

    public final void a() {
        ahmb ahmbVar = this.d;
        ahmbVar.getClass();
        ((ProgressBar) ahmbVar.N().findViewById(R.id.settings_progress_bar)).setVisibility(4);
    }

    public final void b() {
        ahmb ahmbVar = this.d;
        ahmbVar.getClass();
        ((LinearLayout) ahmbVar.N().findViewById(R.id.settings_read_receipt_container)).setVisibility(0);
    }
}
