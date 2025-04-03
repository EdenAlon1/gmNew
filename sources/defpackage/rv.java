package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rv extends kpn {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ ry d;

    public rv(ry ryVar, int i, int i2, WeakReference weakReference) {
        this.d = ryVar;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.kpn
    public final void b(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
            typeface = Typeface.create(typeface, i, (this.b & 2) != 0);
        }
        ry ryVar = this.d;
        WeakReference weakReference = this.c;
        if (ryVar.c) {
            ryVar.b = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new rw(textView, typeface, ryVar.a));
                } else {
                    ry.f(textView, typeface, ryVar.a);
                }
            }
        }
    }

    @Override // defpackage.kpn
    public final void a(int i) {
    }
}
