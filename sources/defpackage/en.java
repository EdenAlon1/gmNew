package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class en extends ek {
    public final Activity b;
    public final Context c;
    public final Handler d;
    public final fr e = new fs();

    public en(Activity activity, Context context, Handler handler) {
        this.b = activity;
        this.c = context;
        this.d = handler;
    }

    @Override // defpackage.ek
    public View a(int i) {
        throw null;
    }

    @Override // defpackage.ek
    public boolean b() {
        throw null;
    }

    public final void i(Intent intent, int i) {
        intent.getClass();
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.c.startActivity(intent, null);
    }

    public void f() {
    }
}
