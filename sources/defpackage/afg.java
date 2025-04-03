package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afg {
    public ActivityOptions b;
    private ArrayList d;
    private Bundle e;
    public final Intent a = new Intent("android.intent.action.VIEW");
    private final afe c = new afe();
    private int f = 0;

    public final afh a() {
        LocaleList adjustedDefault;
        int size;
        String str;
        Locale locale;
        if (!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            this.a.putExtras(bundle);
        }
        ArrayList<? extends Parcelable> arrayList = this.d;
        if (arrayList != null) {
            this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
        }
        this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        this.a.putExtras(this.c.a().a());
        Bundle bundle2 = this.e;
        if (bundle2 != null) {
            this.a.putExtras(bundle2);
        }
        this.a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f);
        adjustedDefault = LocaleList.getAdjustedDefault();
        size = adjustedDefault.size();
        if (size > 0) {
            locale = adjustedDefault.get(0);
            str = locale.toLanguageTag();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            Bundle bundleExtra = this.a.hasExtra("com.android.browser.headers") ? this.a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", str);
                this.a.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (Build.VERSION.SDK_INT >= 34) {
            if (this.b == null) {
                this.b = ActivityOptions.makeBasic();
            }
            this.b.setShareIdentityEnabled(false);
        }
        ActivityOptions activityOptions = this.b;
        return new afh(this.a, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public final void b(String str, PendingIntent pendingIntent) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        Bundle bundle = new Bundle();
        bundle.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", str);
        bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
        this.d.add(bundle);
    }

    public final void c(aff affVar) {
        this.e = affVar.a();
    }

    public final void d(int i) {
        this.f = i;
        if (i == 1) {
            this.a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
        } else {
            this.a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        }
    }

    public final void e() {
        this.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
    }

    @Deprecated
    public final void f(int i) {
        this.c.b(i);
    }
}
