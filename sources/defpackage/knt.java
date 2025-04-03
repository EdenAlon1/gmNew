package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knt {
    private final Intent a;
    private ArrayList b;

    public knt(Context context) {
        Activity activity;
        ksw.h(context);
        Intent action = new Intent().setAction("android.intent.action.SEND");
        this.a = action;
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.addFlags(524288);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            ComponentName componentName = activity.getComponentName();
            this.a.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            this.a.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
    }

    public final Intent a() {
        ArrayList arrayList = this.b;
        if (arrayList == null || arrayList.size() <= 1) {
            this.a.setAction("android.intent.action.SEND");
            ArrayList arrayList2 = this.b;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                this.a.removeExtra("android.intent.extra.STREAM");
                this.a.setClipData(null);
                Intent intent = this.a;
                intent.setFlags(intent.getFlags() & (-2));
            } else {
                this.a.putExtra("android.intent.extra.STREAM", (Parcelable) this.b.get(0));
                knu.a(this.a, this.b);
            }
        } else {
            this.a.setAction("android.intent.action.SEND_MULTIPLE");
            this.a.putParcelableArrayListExtra("android.intent.extra.STREAM", this.b);
            knu.a(this.a, this.b);
        }
        return this.a;
    }

    public final void b(Uri uri) {
        this.b = null;
        if (uri != null) {
            this.b = new ArrayList();
            this.b.add(uri);
        }
    }

    public final void c(CharSequence charSequence) {
        this.a.putExtra("android.intent.extra.TEXT", charSequence);
    }

    public final void d(String str) {
        this.a.setType(str);
    }
}
