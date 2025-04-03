package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehit extends ehmv {
    final /* synthetic */ ehiv a;

    public ehit(ehiv ehivVar) {
        this.a = ehivVar;
    }

    @Override // defpackage.ehmv
    public final void a(int i) {
        this.a.d = true;
        ehiu ehiuVar = (ehiu) this.a.e.get();
        if (ehiuVar != null) {
            ehiuVar.e();
        }
    }

    @Override // defpackage.ehmv
    public final void b(Typeface typeface, boolean z) {
        if (z) {
            return;
        }
        this.a.d = true;
        ehiu ehiuVar = (ehiu) this.a.e.get();
        if (ehiuVar != null) {
            ehiuVar.e();
        }
    }
}
