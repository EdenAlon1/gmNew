package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class egbn extends vk {
    private final egaj a;
    engw d;
    final dvyc e;
    final dvxi f;
    public final egbl g;
    private final emxc h;

    public egbn(egaj egajVar, dvyc dvycVar, dvxi dvxiVar, egbl egblVar, emxc emxcVar) {
        int i = engw.d;
        this.d = enou.a;
        this.a = egajVar;
        this.e = dvycVar;
        this.f = dvxiVar;
        this.g = egblVar;
        this.h = emxcVar;
    }

    final boolean F() {
        return this.h.g();
    }

    final boolean G(int i) {
        return this.h.g() && i == 0;
    }

    @Override // defpackage.vk
    public int a() {
        return this.d.size() + (this.h.g() ? 1 : 0);
    }

    @Override // defpackage.vk
    public int dE(int i) {
        return G(i) ? 0 : 1;
    }

    @Override // defpackage.vk
    public wr e(ViewGroup viewGroup, int i) {
        SquareImageView squareImageView;
        if (i == 0) {
            return new egbk(LayoutInflater.from(viewGroup.getContext()).inflate(true != fdrm.l() ? R.layout.photo_picker_photos_header_view : R.layout.photo_picker_photos_header_view_art_style, viewGroup, false));
        }
        if (fdrm.l()) {
            squareImageView = new SquareImageView(viewGroup.getContext());
            squareImageView.d();
            squareImageView.setPadding(0, 0, 0, 0);
        } else {
            squareImageView = new SquareImageView(viewGroup.getContext());
        }
        return new egbm(squareImageView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        if (dE(i) == 0) {
            egbk egbkVar = (egbk) wrVar;
            egaj egajVar = this.a;
            ewlp ewlpVar = ((ewiw) this.h.c()).d;
            if (ewlpVar == null) {
                ewlpVar = ewlp.a;
            }
            Uri a = egai.a(ewlpVar);
            egal egalVar = new egal();
            egalVar.a();
            egalVar.c();
            int i2 = egbk.u;
            egajVar.f(a, egalVar, egbkVar.s);
            if ((((ewiw) this.h.c()).b & 4) != 0) {
                egbkVar.t.setText(((ewiw) this.h.c()).e);
                return;
            }
            return;
        }
        if (dE(i) == 1) {
            final egbm egbmVar = (egbm) wrVar;
            int i3 = i - (this.h.g() ? 1 : 0);
            ewlp ewlpVar2 = (ewlp) this.d.get(i3);
            int i4 = egbm.t;
            SquareImageView squareImageView = egbmVar.s;
            Context context = squareImageView.getContext();
            eyja eyjaVar = ewlpVar2.f;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            squareImageView.setContentDescription(context.getString(R.string.op3_picker_accessibility_photo, efzu.a(eyjaVar)));
            final Uri a2 = egai.a(ewlpVar2);
            egaj egajVar2 = this.a;
            egal egalVar2 = new egal();
            egalVar2.a();
            egajVar2.g(a2, egalVar2, egbmVar.s);
            dvwz a3 = this.e.b.a(89756);
            a3.f(dwbr.a(ewlpVar2.c.hashCode()));
            a3.f(dvxp.a(i3));
            a3.c(egbmVar.s);
            egbmVar.s.setOnClickListener(new View.OnClickListener() { // from class: egbj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dvxh e = dvxh.e();
                    int i5 = egbm.t;
                    egbn egbnVar = egbn.this;
                    egbnVar.f.a(e, egbmVar.s);
                    egbnVar.g.a(a2);
                }
            });
        }
    }

    @Override // defpackage.vk
    public final void k(wr wrVar) {
        if (wrVar instanceof egbm) {
            dvyc dvycVar = this.e;
            int i = egbm.t;
            dvycVar.b.c(((egbm) wrVar).s);
        }
    }

    public final void m(engw engwVar, int i, int i2) {
        this.d = engwVar;
        w(i, i2);
    }
}
