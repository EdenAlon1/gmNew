package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcio extends vk {
    public final dciz a;
    public int d;
    private final boolean e;
    private final dcit f;
    private final dciq g;

    public dcio(dcit dcitVar, Context context, dciq dciqVar) {
        boolean booleanValue = ((Boolean) cful.d.e()).booleanValue();
        this.e = booleanValue;
        this.d = -1;
        this.f = dcitVar;
        this.g = dciqVar;
        dciw dciwVar = null;
        if (booleanValue) {
            String string = context.getResources().getString(R.string.c2o_gif_browser_recents_button_text);
            ehdr.d(context, R.attr.colorOnSurfaceInverse, "GifBrowserCategoryAdapter");
            dciwVar = new dciw(string, null, ehdr.d(context, R.attr.colorOnSurface, "GifBrowserCategoryAdapter"));
        }
        this.a = new dciz(context, dciwVar);
    }

    @Override // defpackage.vk
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.compose2o_gif_browser_category_item_view_m2, viewGroup, false);
        cxqk cxqkVar = (cxqk) this.f.a.b();
        cxqkVar.getClass();
        inflate.getClass();
        return new dcis(cxqkVar, inflate, this.g);
    }

    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        dciz dcizVar = this.a;
        if (i >= dcizVar.a()) {
            return;
        }
        final dcis dcisVar = (dcis) wrVar;
        final dciw b = dcizVar.b(i);
        dcisVar.t.setText(b.a);
        dcisVar.a.setOnClickListener(dcisVar.s.a(new View.OnClickListener() { // from class: dcir
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dcil dcilVar = (dcil) dcis.this.u;
                dcilVar.d(b.b);
                ((altk) dcilVar.c.b()).aB(3, dcilVar.u, dcilVar.j.m());
            }
        }));
        boolean z = i == this.d;
        dcisVar.t.setSelected(z);
        dcisVar.a.setSelected(z);
    }

    public final int m() {
        int i = this.d;
        if (i == -1) {
            return 1;
        }
        int i2 = i + 11;
        if (!this.e) {
            i2 = i + 12;
        }
        return eomg.a(i2);
    }
}
