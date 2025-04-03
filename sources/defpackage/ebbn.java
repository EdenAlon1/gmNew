package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.CrossProfileApps;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebbn {
    public static final String a = "ebbn";

    private ebbn() {
    }

    public static ebfp a(ebbb ebbbVar, final Context context) {
        final CrossProfileApps m28m;
        List targetUserProfiles;
        Drawable profileSwitchingIconDrawable;
        CharSequence profileSwitchingLabel;
        ebbg ebbgVar = (ebbg) ebbbVar;
        if (!((ebfu) ebbgVar.g).a) {
            return null;
        }
        final ebun ebunVar = ebbgVar.l;
        if (Build.VERSION.SDK_INT < 28 || (m28m = abj$$ExternalSyntheticApiModelOutline0.m28m(context.getSystemService(abj$$ExternalSyntheticApiModelOutline0.m36m()))) == null) {
            return null;
        }
        targetUserProfiles = m28m.getTargetUserProfiles();
        if (targetUserProfiles.isEmpty()) {
            return null;
        }
        final UserHandle userHandle = (UserHandle) targetUserProfiles.get(0);
        profileSwitchingIconDrawable = m28m.getProfileSwitchingIconDrawable(userHandle);
        profileSwitchingLabel = m28m.getProfileSwitchingLabel(userHandle);
        ebfn h = ebfp.h();
        h.f(R.id.og_ai_switch_profile);
        ebfr ebfrVar = (ebfr) h;
        ebfrVar.a = profileSwitchingIconDrawable;
        h.g(profileSwitchingLabel.toString());
        h.h(103027);
        ebfrVar.b = new View.OnClickListener() { // from class: ebbm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                List targetUserProfiles2;
                List targetUserProfiles3;
                String str = ebbn.a;
                Context applicationContext = view.getContext().getApplicationContext();
                CrossProfileApps crossProfileApps = m28m;
                targetUserProfiles2 = crossProfileApps.getTargetUserProfiles();
                UserHandle userHandle2 = userHandle;
                boolean contains = targetUserProfiles2.contains(userHandle2);
                final ebun ebunVar2 = ebunVar;
                if (!contains) {
                    if (ebunVar2 != null) {
                        final String packageName = applicationContext.getPackageName();
                        ebunVar2.a(new Runnable() { // from class: ebuf
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((efkw) ((ebvd) ebun.this.a.get()).b.get()).a(packageName);
                            }
                        });
                    }
                    Log.e(ebbn.a, "Trying to switch to a non-existing profile");
                    return;
                }
                Context context2 = context;
                PackageManager packageManager = context2.getPackageManager();
                String packageName2 = context2.getPackageName();
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName2);
                if (launchIntentForPackage == null) {
                    Log.e(ebbn.a, "getLaunchIntentForPackage return null for package ".concat(String.valueOf(packageName2)));
                    return;
                }
                ComponentName component = launchIntentForPackage.getComponent();
                if (component == null) {
                    Log.e(ebbn.a, "Launch component was null for package ".concat(String.valueOf(packageName2)));
                    return;
                }
                try {
                    try {
                        crossProfileApps.startMainActivity(component, userHandle2);
                    } catch (SecurityException e) {
                        throw e;
                    }
                } finally {
                    if (ebunVar2 != null) {
                        boolean hasCategory = launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER");
                        boolean hasCategory2 = launchIntentForPackage.hasCategory("android.intent.category.INFO");
                        targetUserProfiles3 = crossProfileApps.getTargetUserProfiles();
                        ebunVar2.f("OK", hasCategory, hasCategory2, targetUserProfiles3.contains(userHandle2), Build.VERSION.SDK_INT, applicationContext.getPackageName());
                    }
                }
            }
        };
        return h.b();
    }
}
