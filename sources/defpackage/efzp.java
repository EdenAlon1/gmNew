package defpackage;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class efzp extends vk {
    public final efzn a;
    public final dvxi d;
    public final egjk e;
    public engw f;
    private final egaj g;
    private final qqe h;
    private final dvyc i;
    private final dvxy j;

    public efzp(egaj egajVar, dvyc dvycVar, dvxy dvxyVar, dvxi dvxiVar, egjk egjkVar, efzn efznVar) {
        int i = engw.d;
        this.f = enou.a;
        this.g = egajVar;
        this.h = qqe.HIGH;
        this.a = efznVar;
        this.i = dvycVar;
        this.j = dvxyVar;
        this.d = dvxiVar;
        this.e = egjkVar;
    }

    @Override // defpackage.vk
    public final int a() {
        return this.f.size();
    }

    @Override // defpackage.vk
    public wr e(ViewGroup viewGroup, int i) {
        return new efzo((SquareImageView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_grid_item, viewGroup, false).findViewById(R.id.photo_picker_grid_image));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        final efzo efzoVar = (efzo) wrVar;
        final egea egeaVar = (egea) this.f.get(i);
        Uri parse = Uri.parse(egeaVar.d());
        egal egalVar = new egal();
        egalVar.a();
        int i2 = efzo.t;
        this.g.h(parse, egalVar, efzoVar.s, this.h);
        efzoVar.s.setOnClickListener(new View.OnClickListener() { // from class: efzm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dvxh e = dvxh.e();
                int i3 = efzo.t;
                efzp efzpVar = efzp.this;
                efzpVar.d.a(e, efzoVar.s);
                efzpVar.e.c = 15;
                efzn efznVar = efzpVar.a;
                egea egeaVar2 = egeaVar;
                efznVar.a(egeaVar2.a(), egeaVar2.c());
            }
        });
        efzoVar.s.setContentDescription(egeaVar.b());
        SquareImageView squareImageView = efzoVar.s;
        dvwz a = this.i.a(128094);
        a.f(dvxp.a(i));
        this.j.e(squareImageView, a);
    }

    @Override // defpackage.vk
    public final void k(wr wrVar) {
        int i = efzo.t;
        this.j.c(((efzo) wrVar).s);
    }
}
