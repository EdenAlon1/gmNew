package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgjd implements cgjb {
    public static final cskc a = cskc.g("Lighter", "LighterEntryPointConfigImpl");
    public final ffbr b;
    private final Context c;
    private final ffbr d;
    private final ffbr e;

    public cgjd(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.c = context;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.b = ffbrVar3;
    }

    @Override // defpackage.cgjb
    public final void a() {
        boolean z = true;
        boolean z2 = false;
        if (cgje.a() && ((ctvs) this.d.b()).d()) {
            z2 = true;
        }
        cskc cskcVar = a;
        cskcVar.m("LighterFlags.enableUnifiedInbox: " + cgje.a());
        cskcVar.m("EnableUnifiedInbox -> isDefaultSmsApp(): " + ((ctvs) this.d.b()).d());
        cskcVar.m(a.q(adhu.a(), "EnableUnifiedInbox -> GaiaFlags.isBugleAccountEnabled: "));
        cskcVar.m("isBugleAccountEnabled -> enableGooglePhotosIntegration: ".concat(String.valueOf(String.valueOf(cjja.a.e()))));
        cskcVar.m("isBugleAccountEnabled -> ENABLE_INPUT_MANAGER_REFACTOR: ".concat(String.valueOf(String.valueOf(cful.ap.e()))));
        cskcVar.m(a.q(z2, "enable lighter entry point activity: "));
        if (z2) {
            if (((Boolean) ((cfup) cgje.a.get()).e()).booleanValue()) {
                cskcVar.m("Enabling unified inbox since enable_lighter is true");
                ((akzt) this.b.b()).e("Bugle.UnifiedInbox.Entrypoints", 3);
                b(z);
            } else if (aspf.a()) {
                cskcVar.m("Checking sign-in status since lighter_enable_only_signed_in is true");
                axnw.h(((cgfd) this.e.b()).a().h(new emwl() { // from class: cgjc
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Boolean bool = (Boolean) obj;
                        cskc cskcVar2 = cgjd.a;
                        Objects.toString(bool);
                        cskcVar2.m("EnableUnifiedInbox -> isSignedIn: ".concat(String.valueOf(bool)));
                        boolean booleanValue = bool.booleanValue();
                        cgjd cgjdVar = cgjd.this;
                        if (!booleanValue) {
                            ((akzt) cgjdVar.b.b()).e("Bugle.UnifiedInbox.Entrypoints", 2);
                        } else {
                            if (ersy.a("bugle.lighter_enable_only_already_enabled_users", "bugle")) {
                                ((akzt) cgjdVar.b.b()).e("Bugle.UnifiedInbox.Entrypoints", 4);
                                return true;
                            }
                            cgjdVar.b(true);
                            ((akzt) cgjdVar.b.b()).e("Bugle.UnifiedInbox.Entrypoints", 1);
                        }
                        return true;
                    }
                }, erpp.a));
                return;
            }
        }
        z = z2;
        b(z);
    }

    public final void b(boolean z) {
        Context context = this.c;
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, "com.google.android.apps.messaging.lighterconversation.LighterEntryPointActivity"), true != z ? 2 : 1, 1);
    }
}
