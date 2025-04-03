package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.setupcompat.internal.TemplateLayout;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiqx {
    public static int a(Context context) {
        char c;
        String j = eios.h(context).j(context, eioq.CONFIG_LAYOUT_GRAVITY);
        if (j == null) {
            return 0;
        }
        String lowerCase = j.toLowerCase(Locale.ROOT);
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode == 109757538 && lowerCase.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME)) {
                c = 1;
            }
            c = 65535;
        } else {
            if (lowerCase.equals("center")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            return c != 1 ? 0 : 8388611;
        }
        return 17;
    }

    public static TemplateLayout b(Activity activity) {
        View findViewById;
        if (activity == null || (findViewById = activity.findViewById(R.id.suc_layout_status)) == null) {
            return null;
        }
        return (TemplateLayout) findViewById.getParent();
    }

    public static boolean c(View view) {
        Activity activity;
        if (view instanceof einu) {
            return ((einu) view).e();
        }
        Context context = view.getContext();
        if (Build.VERSION.SDK_INT < 29 || !eios.h(context).m()) {
            return false;
        }
        try {
            int i = einu.c;
            activity = eios.e(context);
            if (activity != null) {
                try {
                    TemplateLayout b = b(activity);
                    if (b instanceof einu) {
                        return ((einu) b).e();
                    }
                } catch (ClassCastException | IllegalArgumentException unused) {
                }
            }
        } catch (ClassCastException | IllegalArgumentException unused2) {
            activity = null;
        }
        boolean a = activity != null ? eips.a(activity.getIntent()) : false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.sucUsePartnerResource});
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        return a || z;
    }
}
