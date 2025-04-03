package defpackage;

import androidx.media3.ui.LegacyPlayerView;
import com.google.android.apps.messaging.R;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcxd extends lqe {
    final /* synthetic */ dcxe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcxd(dcxe dcxeVar, lro lroVar) {
        super(lroVar);
        this.b = dcxeVar;
    }

    @Override // defpackage.lqe, defpackage.lro
    public final void S(boolean z) {
        if (z) {
            LegacyPlayerView legacyPlayerView = (LegacyPlayerView) this.b.a.N().findViewById(R.id.exo_player);
            if (legacyPlayerView != null) {
                legacyPlayerView.b(500);
            }
            dcxe dcxeVar = this.b;
            final eqad m = dcxeVar.m();
            final epzq l = dcxeVar.l();
            final long j = dcxeVar.j();
            dcxeVar.b.o(new Supplier() { // from class: alil
                @Override // java.util.function.Supplier
                public final Object get() {
                    return alim.b(eqad.this, l, 2, j);
                }
            });
        } else {
            dcxe dcxeVar2 = this.b;
            final eqad m2 = dcxeVar2.m();
            final epzq l2 = dcxeVar2.l();
            final long j2 = dcxeVar2.j();
            dcxeVar2.b.o(new Supplier() { // from class: alii
                @Override // java.util.function.Supplier
                public final Object get() {
                    return alim.b(eqad.this, l2, 3, j2);
                }
            });
        }
        this.a.S(z);
    }

    @Override // defpackage.lqe, defpackage.lro
    public final void d() {
        S(false);
    }

    @Override // defpackage.lqe, defpackage.lro
    public final void e() {
        S(true);
    }
}
