package defpackage;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adzp {
    public static void a(eg egVar, eivt eivtVar, String str, cgix cgixVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("conversation_list_mode", cgixVar.d);
        adzz a = adzz.a(eivtVar.a());
        a.at(bundle);
        cg cgVar = new cg(egVar.a());
        cgVar.x(R.id.home_fragment_container, a, str);
        cgVar.c();
    }

    public static void b(Activity activity, Toolbar toolbar, im imVar, int i, boolean z) {
        View findViewById = toolbar.findViewById(R.id.lockup);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        cwpw.c(activity, imVar, i);
        imVar.setHomeActionContentDescription(activity.getResources().getString(R.string.navigate_up_button_content_description));
        imVar.setDisplayShowTitleEnabled(true);
        imVar.setDisplayHomeAsUpEnabled(true);
        imVar.setHomeAsUpIndicator((Drawable) null);
        if (!z) {
            imVar.setBackgroundDrawable(new ColorDrawable(activity.getColor(R.color.color_primary_background_alpha96)));
            activity.getWindow().setStatusBarColor(activity.getColor(R.color.color_primary_background_alpha96));
        }
        imVar.show();
    }
}
