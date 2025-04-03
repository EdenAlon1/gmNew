package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebpf extends vk {
    private final Context a;
    private final engw d;
    private final ebvw e;
    private final int f;

    public ebpf(Context context, engw engwVar, ebvw ebvwVar, int i) {
        context.getClass();
        this.a = context;
        this.d = engwVar;
        this.e = ebvwVar;
        this.f = i;
    }

    @Override // defpackage.vk
    public final int a() {
        return ((enou) this.d).c;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        ebnq ebnqVar = new ebnq(this.a, this.e, viewGroup);
        View view = ebnqVar.a;
        int[] iArr = kvo.a;
        int paddingStart = view.getPaddingStart();
        int i2 = this.f;
        View view2 = ebnqVar.a;
        view.setPaddingRelative(paddingStart + i2, view2.getPaddingTop(), view2.getPaddingEnd() + i2, ebnqVar.a.getPaddingBottom());
        return ebnqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        final ebnq ebnqVar = (ebnq) wrVar;
        final ebno ebnoVar = (ebno) this.d.get(i);
        ebnqVar.w.a = emxc.j(Integer.valueOf(ebnoVar.c()));
        ebnqVar.w.b(ebnqVar.v);
        if (ebnoVar.d() != null) {
            ImageView imageView = ebnqVar.s;
            Drawable d = ebnoVar.d();
            ebor.c(d, ebnqVar.u);
            imageView.setImageDrawable(d);
        } else {
            ImageView imageView2 = ebnqVar.s;
            imageView2.setImageDrawable(ebor.a(imageView2.getContext(), ebnoVar.a(), ebnqVar.u));
        }
        ebnqVar.t.setText(ebnoVar.g());
        ebnqVar.a.setOnClickListener(new View.OnClickListener() { // from class: ebnp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ebnq.this.v.f(new dvxf(5), view);
                ebnoVar.e().onClick(view);
            }
        });
    }

    @Override // defpackage.vk
    public final /* synthetic */ void k(wr wrVar) {
        ebnq ebnqVar = (ebnq) wrVar;
        ebnqVar.w.ho(ebnqVar.v);
        ebnqVar.w.a = emux.a;
    }
}
