package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwqc {
    public final ffbr a;
    public final cqoh b;
    public final ExecutorService c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    private final Context h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;

    public cwqc(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, cqoh cqohVar, ExecutorService executorService, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8) {
        this.h = context;
        this.i = ffbrVar;
        this.j = ffbrVar2;
        this.a = ffbrVar3;
        this.b = cqohVar;
        this.c = executorService;
        this.d = ffbrVar4;
        this.k = ffbrVar5;
        this.e = ffbrVar6;
        this.f = ffbrVar7;
        this.g = ffbrVar8;
    }

    public static void b(Activity activity) {
        ehft ehftVar = new ehft(activity);
        ehftVar.m(R.string.bad_custom_theme);
        ehftVar.j(false);
        ehftVar.o(R.string.bad_custom_theme_close_button, new DialogInterface.OnClickListener() { // from class: cwpx
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                System.exit(0);
            }
        });
        ehftVar.a();
    }

    public static boolean c(Intent intent) {
        if (intent.hasExtra("FOCUS_ON_FIELD")) {
            return intent.getBooleanExtra("should_launch_home_on_back", false) || intent.getBooleanExtra("via_share_intent", false);
        }
        return false;
    }

    public static boolean d(Intent intent) {
        if (intent.getCategories() != null) {
            Iterator<String> it = intent.getCategories().iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(it.next(), "android.intent.category.LAUNCHER")) {
                    return true;
                }
            }
        }
        return intent.getBooleanExtra("via_home_activity", false);
    }

    public final void a(final long j) {
        axos.a(new Runnable() { // from class: cwpz
            @Override // java.lang.Runnable
            public final void run() {
                ((altk) cwqc.this.a.b()).n(j);
            }
        }, this.c);
    }

    public final boolean e(Activity activity) {
        if (!f()) {
            return false;
        }
        ((akvg) this.j.b()).a(activity);
        activity.finish();
        return true;
    }

    public final boolean f() {
        return !((ctud) this.i.b()).k() && ctid.i(this.h) && ((ctvb) this.k.b()).G();
    }
}
