package defpackage;

import android.R;
import android.os.Build;
import android.view.Menu;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhr {
    public final ffix a;
    public iam b;
    public ffix c;
    public ffix d;
    public ffix e;
    public ffix f;
    public ffix g;

    public jhr() {
        this(null, 127);
    }

    public static final void a(Menu menu, jhq jhqVar) {
        int i;
        jhq jhqVar2 = jhq.a;
        int ordinal = jhqVar.ordinal();
        if (ordinal == 0) {
            i = R.string.copy;
        } else if (ordinal == 1) {
            i = R.string.paste;
        } else if (ordinal == 2) {
            i = R.string.cut;
        } else if (ordinal == 3) {
            i = R.string.selectAll;
        } else {
            if (ordinal != 4) {
                throw new ffcd();
            }
            i = Build.VERSION.SDK_INT <= 26 ? com.google.android.apps.messaging.R.string.autofill : R.string.autofill;
        }
        menu.add(0, jhqVar.f, jhqVar.g, i).setShowAsAction(1);
    }

    public static final void b(Menu menu, jhq jhqVar, ffix ffixVar) {
        if (ffixVar != null && menu.findItem(jhqVar.f) == null) {
            a(menu, jhqVar);
        } else {
            if (ffixVar != null || menu.findItem(jhqVar.f) == null) {
                return;
            }
            menu.removeItem(jhqVar.f);
        }
    }

    public /* synthetic */ jhr(ffix ffixVar, int i) {
        iam iamVar = iam.a;
        this.a = 1 == (i & 1) ? null : ffixVar;
        this.b = iamVar;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
