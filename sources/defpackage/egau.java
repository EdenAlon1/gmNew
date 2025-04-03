package defpackage;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egau extends vk {
    public engw a;
    public final dvxi d;
    public final egax e;
    private final egaj f;
    private final dvyc g;

    public egau(egaj egajVar, dvyc dvycVar, dvxi dvxiVar, egax egaxVar) {
        int i = engw.d;
        this.a = enou.a;
        this.f = egajVar;
        this.g = dvycVar;
        this.d = dvxiVar;
        this.e = egaxVar;
    }

    static final boolean m(int i) {
        return i == 0;
    }

    @Override // defpackage.vk
    public final int a() {
        return this.a.size() + 1;
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return m(i) ? 0 : 1;
    }

    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        return i == 0 ? new egat(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_clusters_header_view, viewGroup, false)) : new egas(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_cluster_image, viewGroup, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        if (dE(i) == 1) {
            final egas egasVar = (egas) wrVar;
            int i2 = i - 1;
            final ewiw ewiwVar = (ewiw) this.a.get(i2);
            egaj egajVar = this.f;
            ewlp ewlpVar = ewiwVar.d;
            if (ewlpVar == null) {
                ewlpVar = ewlp.a;
            }
            Uri a = egai.a(ewlpVar);
            egal egalVar = new egal();
            egalVar.a();
            int i3 = egas.v;
            egajVar.g(a, egalVar, egasVar.s);
            boolean z = ((ewiwVar.b & 4) == 0 && ewiwVar.e.isEmpty()) ? false : true;
            egasVar.t.setText(z ? ewiwVar.e : "");
            SquareImageView squareImageView = egasVar.s;
            int i4 = true != z ? 1 : 2;
            int[] iArr = kvo.a;
            squareImageView.setImportantForAccessibility(i4);
            egasVar.u.setVisibility(true == z ? 0 : 4);
            dvwz a2 = this.g.b.a(89735);
            a2.f(dwbr.a(ewiwVar.c.hashCode()));
            a2.f(dvxp.a(i2));
            a2.c(egasVar.s);
            egasVar.s.setOnClickListener(new View.OnClickListener() { // from class: egar
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dvxh e = dvxh.e();
                    int i5 = egas.v;
                    egau egauVar = egau.this;
                    egauVar.d.a(e, egasVar.s);
                    egauVar.e.a.b(ewiwVar);
                }
            });
        }
    }

    @Override // defpackage.vk
    public final void k(wr wrVar) {
        if (wrVar instanceof egas) {
            dvyc dvycVar = this.g;
            int i = egas.v;
            dvycVar.b.c(((egas) wrVar).s);
        }
    }
}
