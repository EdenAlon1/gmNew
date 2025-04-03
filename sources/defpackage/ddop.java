package defpackage;

import android.view.LayoutInflater;
import com.google.android.apps.messaging.ui.search.homeview.ZeroStateContentGridLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddop {
    public final ZeroStateContentGridLayout a;
    public final ffbr b;
    public final ffbr c;
    public final LayoutInflater d;
    public ddqp e;
    private final ffbz f;

    public ddop(ZeroStateContentGridLayout zeroStateContentGridLayout, ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.a = zeroStateContentGridLayout;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        LayoutInflater from = LayoutInflater.from(zeroStateContentGridLayout.getContext());
        from.getClass();
        this.d = from;
        this.f = ffca.a(new ffix() { // from class: ddoo
            @Override // defpackage.ffix
            public final Object invoke() {
                return Integer.valueOf(true != ((auyd) ddop.this.c.b()).a() ? 4 : 2);
            }
        });
    }

    public final int a() {
        return ((Number) this.f.a()).intValue();
    }
}
