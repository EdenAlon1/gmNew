package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czwm extends czwk {
    private static final cskc e = cskc.g("Bugle", "WebSuggestedActionContainerViewHolder");
    private final crjp f;
    private final Context g;
    private final RbmSuggestionData h;

    public czwm(crjp crjpVar, Context context, RbmSuggestionData rbmSuggestionData, View view) {
        super(context, rbmSuggestionData, view);
        this.f = crjpVar;
        this.g = context;
        this.h = rbmSuggestionData;
    }

    @Override // defpackage.czwk
    public final Optional a(int i) {
        String host;
        String propertyValue = this.h.b.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        if (propertyValue != null && (host = Uri.parse(propertyValue).getHost()) != null) {
            Iterator<E> it = ((ezgw) avic.c.e()).b.iterator();
            while (it.hasNext()) {
                if (emuz.e((String) it.next(), host)) {
                    return f(this.g, R.drawable.product_logo_wallet_color_24, i, false);
                }
            }
        }
        Drawable drawable = null;
        if (TextUtils.isEmpty(propertyValue)) {
            e.m("No url; returning default icon");
        } else {
            Intent c = this.f.c(propertyValue);
            PackageManager packageManager = this.g.getPackageManager();
            if (packageManager == null) {
                e.m("Couldn't access package manager; returning default icon");
            } else {
                ResolveInfo resolveActivity = packageManager.resolveActivity(c, 0);
                if (resolveActivity == null || resolveActivity.activityInfo == null || TextUtils.isEmpty(resolveActivity.activityInfo.packageName)) {
                    e.m("Couldn't resolve package name; returning default icon");
                } else {
                    String str = resolveActivity.activityInfo.packageName;
                    if (TextUtils.isEmpty(str) || TextUtils.equals(str, ctid.b(packageManager))) {
                        e.m("No default app for url; returning default icon");
                    } else {
                        try {
                            e.m(a.t(str, "Returning icon for "));
                            drawable = packageManager.getApplicationIcon(str);
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
                }
            }
        }
        return drawable != null ? Optional.of(this.d.h(drawable)) : f(this.g, R.drawable.business_web, i, true);
    }

    @Override // defpackage.czwk
    public final String b() {
        return czwk.g(this.g.getString(R.string.conversation_suggestion_launch_web_action), c());
    }
}
