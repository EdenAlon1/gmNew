package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eayn {
    private static final String a = "eayn";

    private eayn() {
    }

    public static void a(View view, emxc emxcVar, ewom ewomVar, eave eaveVar, Object obj, String str) {
        if (obj == null || !eaveVar.g(obj)) {
            ea d = d(view);
            Activity G = d != null ? d.G() : null;
            if (G == null) {
                G = c(view.getContext());
            }
            try {
                new afg().a().a(G, Uri.parse(str));
                return;
            } catch (ActivityNotFoundException e) {
                Log.e(a, String.format("Can't open URL '%s'. This can happen if there is no browser app on the device.", str), e);
                return;
            }
        }
        String c = eaveVar.c(obj);
        ewon ewonVar = (ewon) ewop.a.createBuilder();
        int i = ewomVar.qw;
        ewonVar.copyOnWrite();
        ewop ewopVar = (ewop) ewonVar.instance;
        ewopVar.b = 1 | ewopVar.b;
        ewopVar.c = i;
        b(view, c, (ewop) ewonVar.build());
    }

    public static void b(View view, String str, ewop ewopVar) {
        ea d = d(view);
        str.getClass();
        ewopVar.getClass();
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.accountsettings.action.VIEW_SETTINGS");
        intent.setPackage("com.google.android.gms").putExtra("extra.screenId", ewopVar.c).putExtra("extra.utmSource", "OG").putExtra("extra.accountName", str).putExtra("extra.themeChoice", 0);
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(ewopVar.d);
        unmodifiableMap.getClass();
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            str2.getClass();
            intent.putExtra("extra.screen.".concat(str2), str3);
        }
        Activity G = d != null ? d.G() : null;
        if (G == null) {
            G = c(view.getContext());
        }
        G.startActivityForResult(intent, 51332);
    }

    private static Activity c(Context context) {
        Activity activity = (Activity) ebnz.a(context, Activity.class);
        activity.getClass();
        return activity;
    }

    private static ea d(View view) {
        try {
            return fr.f(view);
        } catch (IllegalStateException e) {
            Log.e(a, "Failed to find Fragment for view", e);
            return null;
        }
    }
}
