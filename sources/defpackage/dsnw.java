package defpackage;

import android.R;
import android.app.Activity;
import android.view.ViewGroup;
import com.google.android.libraries.compose.ui.keyboard.detector.KeyboardDetectorViewInsetsListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsnw implements dsmr {
    static final /* synthetic */ ffmx[] a;
    public static final /* synthetic */ int c = 0;
    public final eg b;
    private final dsnq d;
    private final ffbz e;
    private final ffls f;

    static {
        ffko ffkoVar = new ffko(dsnw.class, "state", "getState()Lcom/google/android/libraries/compose/ui/keyboard/detector/KeyboardDetectorViewStrategy$Companion$State;", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar};
    }

    public dsnw(final Activity activity, dsnq dsnqVar) {
        activity.getClass();
        this.d = dsnqVar;
        if (!(activity instanceof eg)) {
            throw new IllegalStateException("Check failed.");
        }
        this.b = (eg) activity;
        this.e = ffca.a(new ffix() { // from class: dsnr
            @Override // defpackage.ffix
            public final Object invoke() {
                int i = dsnw.c;
                return (ViewGroup) activity.findViewById(R.id.content);
            }
        });
        this.f = new dsnv(dsnt.a, this);
    }

    private final dsnu e() {
        return (dsnu) this.f.c(a[0]);
    }

    private final void f(dsnu dsnuVar) {
        this.f.d(a[0], dsnuVar);
    }

    @Override // defpackage.dsmr
    public final void a(dsmn dsmnVar) {
        if (e() instanceof dsns) {
            throw new IllegalStateException("Detector view was already attached");
        }
        dsod dsodVar = new dsod(this.b);
        dsodVar.setTag("KEYBOARD_DETECTION");
        dsodVar.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        dqkk dqkkVar = (dqkk) this.d.a.b();
        dqkkVar.getClass();
        f(new dsns(dsodVar, new KeyboardDetectorViewInsetsListener(dqkkVar, dsodVar), dsmnVar));
    }

    @Override // defpackage.dsmr
    public final void b() {
        if (!(e() instanceof dsns)) {
            throw new IllegalStateException("Detector view wasn't attached");
        }
        f(dsnt.a);
    }

    @Override // defpackage.dsmr
    public final boolean c() {
        return !dski.d(this.b);
    }

    public final ViewGroup d() {
        return (ViewGroup) this.e.a();
    }
}
