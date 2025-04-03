package defpackage;

import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajfi {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final Optional d;
    public SwitchPreferenceCompat e;
    public final ejlr f;

    public ajfi(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffsk ffskVar, Optional optional) {
        ffbrVar2.getClass();
        ffskVar.getClass();
        optional.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = optional;
        this.f = new ejlr<Boolean, Void>() { // from class: ajfi.1
            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SwitchPreferenceCompat switchPreferenceCompat = ajfi.this.e;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.G(false);
                }
                SwitchPreferenceCompat switchPreferenceCompat2 = ajfi.this.e;
                if (switchPreferenceCompat2 != null) {
                    switchPreferenceCompat2.k(booleanValue);
                }
            }

            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SwitchPreferenceCompat switchPreferenceCompat = ajfi.this.e;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.G(true);
                }
                Snackbar.r(((ajfg) ajfi.this.a.b()).N().getRootView(), ((ajfg) ajfi.this.a.b()).Z(true != booleanValue ? R.string.gemini_chat_archived : R.string.gemini_chat_restored, ((cjdk) ajfi.this.d.get()).s()), -1).i();
            }

            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SwitchPreferenceCompat switchPreferenceCompat = ajfi.this.e;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.G(true);
                }
                SwitchPreferenceCompat switchPreferenceCompat2 = ajfi.this.e;
                if (switchPreferenceCompat2 != null) {
                    switchPreferenceCompat2.k(!booleanValue);
                }
            }
        };
    }
}
