package defpackage;

import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abyy {
    public static final cskc a = cskc.g("Bugle", "DataDonationFragmentPeer");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    final ejwd m = new abyw(this);
    final ejlr n = new abyx(this);
    public RecyclerView o;
    public abzm p;
    public CircularProgressIndicator q;
    public FrameLayout r;
    public Button s;

    public abyy(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = ffbrVar6;
        this.h = ffbrVar7;
        this.i = ffbrVar8;
        this.j = ffbrVar9;
        this.k = ffbrVar10;
        this.l = ffbrVar11;
    }

    public final void a() {
        CircularProgressIndicator circularProgressIndicator = this.q;
        if (circularProgressIndicator.getVisibility() != 0) {
            circularProgressIndicator.removeCallbacks(circularProgressIndicator.h);
        } else {
            circularProgressIndicator.removeCallbacks(circularProgressIndicator.i);
            long uptimeMillis = SystemClock.uptimeMillis() - circularProgressIndicator.e;
            long j = circularProgressIndicator.d;
            if (uptimeMillis >= j) {
                circularProgressIndicator.i.run();
            } else {
                circularProgressIndicator.postDelayed(circularProgressIndicator.i, j - uptimeMillis);
            }
        }
        this.r.setVisibility(8);
    }

    public final void b() {
        this.q.g();
        this.r.setVisibility(0);
    }
}
