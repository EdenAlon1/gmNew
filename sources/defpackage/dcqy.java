package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcqy extends wc {
    final /* synthetic */ dcqz a;

    public dcqy(dcqz dcqzVar) {
        this.a = dcqzVar;
    }

    @Override // defpackage.wc
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (i != 0) {
            dcqz dcqzVar = this.a;
            if (dcqzVar.s.getParent() != null) {
                int width = ((RecyclerView) dcqzVar.s.getParent()).getWidth() / 2;
                float x = dcqzVar.s.getX() + (r7.getWidth() / 2);
                View view = dcqzVar.s;
                float abs = Math.abs(width - x);
                int e = kps.e(dcqzVar.u, dcqzVar.v, cskf.b(1.0f - (abs / (view.getWidth() * 0.75f))));
                if (e != dcqzVar.w) {
                    dcqzVar.w = e;
                    dcqzVar.t.setTextColor(e);
                }
                dcqzVar.D(cskf.b((1.0f - (abs / (dcqzVar.s.getWidth() * 0.75f))) * 3.0f));
                float width2 = (dcqzVar.s.getWidth() / 2) * 0.2f;
                dcqzVar.C(kps.e(dcqzVar.x, dcqzVar.y, cskf.b((abs - width2) / ((dcqzVar.s.getWidth() / 2) - (width2 + width2)))));
            }
        }
    }
}
