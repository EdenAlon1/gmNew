package defpackage;

import android.graphics.Point;
import android.view.Display;
import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vui implements ctuj {
    final /* synthetic */ vvn a;
    final /* synthetic */ aler b;

    public vui(vvn vvnVar, aler alerVar) {
        this.b = alerVar;
        this.a = vvnVar;
    }

    @Override // defpackage.ctuj
    public final void c() {
        this.b.b(fagh.PERMISSION_DENIED);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [aoku, java.lang.Object] */
    @Override // defpackage.ctuj
    public final void d() {
        Point point;
        Optional d = ((bcqs) this.a.cA.a()).g.d();
        emxf.l(d.isPresent());
        View findViewById = this.a.p().findViewById(R.id.action_call);
        if (findViewById != null) {
            int[] iArr = new int[2];
            findViewById.getLocationOnScreen(iArr);
            point = new Point(iArr[0] + (findViewById.getWidth() / 2), iArr[1] + (findViewById.getHeight() / 2));
        } else {
            Display defaultDisplay = this.a.p().getWindowManager().getDefaultDisplay();
            point = new Point(defaultDisplay.getWidth() / 2, defaultDisplay.getHeight() / 2);
        }
        ((akvg) this.a.an.b()).Q(this.a.p(), d.get(), point, this.b);
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ void b() {
    }
}
