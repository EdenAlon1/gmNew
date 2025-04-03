package defpackage;

import android.content.Context;
import android.widget.Toast;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class daup implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Context c;

    public daup(String str, String str2, Context context) {
        this.a = str;
        this.b = str2;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dauq.a("rm ".concat(this.a));
        dauq.a("ln -s " + this.b + " " + this.a);
        Toast.makeText(this.c, "link updated to target ".concat(this.b), 1).show();
    }
}
