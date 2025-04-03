package defpackage;

import android.accounts.Account;
import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egrb {
    private static final enru g = enru.c("com/google/android/libraries/user/profile/photopicker/picker/ActivityParams");
    public final emxc a;
    public final emxc b;
    public final emxc c;
    public final exfi d;
    public final boolean e;
    public final emxc f;
    private final boolean h;

    public egrb(eg egVar, efzv efzvVar) {
        emxc emxcVar;
        String str;
        emxc i = emxc.i(egVar.getIntent().getExtras());
        emxc i2 = i.g() ? emxc.i(egVar.getIntent().getExtras().getString("com.google.profile.photopicker.ACCOUNT")) : emux.a;
        this.a = i2;
        if (i2.g()) {
            Account[] a = efzvVar.a();
            String str2 = (String) i2.c();
            for (Account account : a) {
                if (account.name.equals(str2)) {
                    emxcVar = emxc.j(account);
                    break;
                }
            }
        }
        emxcVar = emux.a;
        this.b = emxcVar;
        this.h = ((Boolean) i.b(new emwl() { // from class: egra
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Bundle) obj).containsKey("com.google.profile.photopicker.INTENT_SIGNED_OUT"));
            }
        }).e(false)).booleanValue();
        this.e = i.g() && ((Bundle) i.c()).getBoolean("hide_photos_of_you");
        if (fdrm.q()) {
            this.f = i.g() ? emxc.i(((Bundle) i.c()).getString("open_to_content_url_override")) : emux.a;
        } else {
            this.f = emux.a;
        }
        if (i.g() && ((Bundle) i.c()).containsKey("com.google.profile.photopicker.HOST_INFO")) {
            exgr exgrVar = (exgr) ((exgs) ProtoParsers.f((Bundle) i.c(), "com.google.profile.photopicker.HOST_INFO", exgs.a, eyfc.a())).toBuilder();
            Application application = egVar.getApplication();
            try {
                str = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str = "not available";
            }
            exgrVar.copyOnWrite();
            exgs exgsVar = (exgs) exgrVar.instance;
            str.getClass();
            exgsVar.b |= 2;
            exgsVar.d = str;
            this.c = emxc.j((exgs) exgrVar.build());
        } else {
            this.c = emux.a;
        }
        exfh exfhVar = (exfh) exfi.a.createBuilder();
        exfhVar.copyOnWrite();
        exfi exfiVar = (exfi) exfhVar.instance;
        exfiVar.b |= 1;
        exfiVar.c = "0.1";
        exfhVar.copyOnWrite();
        exfi exfiVar2 = (exfi) exfhVar.instance;
        exfiVar2.b |= 2;
        exfiVar2.d = 728121172L;
        this.d = (exfi) exfhVar.build();
    }

    public final boolean a() {
        emxc emxcVar = this.a;
        if (!emxcVar.g() && !this.h) {
            ((enrr) ((enrr) g.j()).h("com/google/android/libraries/user/profile/photopicker/picker/ActivityParams", "hasValidParams", 162, "ActivityParams.java")).q("Photopicker parameters invalid: PHOTO_PICKER_MESSAGE_ACCOUNT is missing.");
            return false;
        }
        if (emxcVar.g() && this.h) {
            ((enrr) ((enrr) g.j()).h("com/google/android/libraries/user/profile/photopicker/picker/ActivityParams", "hasValidParams", 167, "ActivityParams.java")).q("Photopicker parameters invalid: PHOTO_PICKER_MESSAGE_ACCOUNT and PHOTO_PICKER_INTENT_SIGNED_OUT are both present.");
            return false;
        }
        if (!this.b.g() && !this.h) {
            ((enrr) ((enrr) g.j()).h("com/google/android/libraries/user/profile/photopicker/picker/ActivityParams", "hasValidParams", 173, "ActivityParams.java")).q("Photopicker parameters invalid: the specified account was not present.");
            return false;
        }
        if (this.c.g()) {
            return true;
        }
        ((enrr) ((enrr) g.j()).h("com/google/android/libraries/user/profile/photopicker/picker/ActivityParams", "hasValidParams", 178, "ActivityParams.java")).q("Photopicker parameters invalid: the contacts host information was not present.");
        return false;
    }
}
