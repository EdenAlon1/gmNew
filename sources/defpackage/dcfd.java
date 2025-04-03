package defpackage;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryContentItemView;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcfd extends dbzx {
    public View e;
    private final dcfs f;
    private final int g;
    private final dcgs h;

    private dcfd(dcfs dcfsVar, int i, int i2, int i3, dcgs dcgsVar) {
        super(dcfsVar, i, i2);
        this.f = dcfsVar;
        this.g = i3;
        this.h = dcgsVar;
    }

    static dcfd I(dcfs dcfsVar, int i, int i2, int i3, dcgs dcgsVar) {
        dcfd dcfdVar = new dcfd(dcfsVar, i, i2, i3, dcgsVar);
        dcfdVar.B(true);
        return dcfdVar;
    }

    @Override // defpackage.dbzx
    protected final wr F(ViewGroup viewGroup, int i) {
        View inflate;
        if (i == 2) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.g, viewGroup, false);
        } else if (i == 3) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.compose2o_camera_item_view_m2, viewGroup, false);
        } else if (i == 8) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.compose2o_fullscreen_gallery_item_view, viewGroup, false);
        } else if (i != 12) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(true != ((Boolean) cful.V.e()).booleanValue() ? R.layout.compose2o_gallery_item_view : R.layout.compose2o_camera_gallery_roll_item_view, viewGroup, false);
            ((GalleryContentItemView) inflate).b = false;
        } else {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.compose2o_device_camera_item_view, viewGroup, false);
        }
        return new dcfc(inflate);
    }

    @Override // defpackage.dbzx
    protected final void G(View view, int i) {
        super.G(view, i + this.f.h());
    }

    @Override // defpackage.dbzx
    protected final boolean H() {
        return this.d.a() >= 3 && this.d.b(1) != 2;
    }

    @Override // defpackage.dbzx, defpackage.vk
    public final int a() {
        return super.a() + this.f.h();
    }

    @Override // defpackage.dbzx, defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        dcgs dcgsVar;
        wr e = super.e(viewGroup, i);
        if (i == 0 && (dcgsVar = this.h) != null) {
            final View view = e.a;
            dcgy dcgyVar = dcgsVar.a;
            if (!dcgyVar.r.fu() && dcgyVar.L()) {
                dcgyVar.p.ifPresent(new Consumer() { // from class: dcgr
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        int i2 = dcgy.t;
                        ((aeqo) obj).a((ViewGroup) view);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            this.e = e.a;
        }
        return e;
    }

    @Override // defpackage.dbzx, defpackage.cxpu, defpackage.vk
    public final void g(wr wrVar, int i) {
        int i2 = wrVar.f;
        if (i2 == 3 || i2 == 12) {
            KeyEvent.Callback callback = wrVar.a;
            if (callback instanceof dcal) {
                ((dcal) callback).b(new dcai(this.d, i));
            }
            G(wrVar.a, i);
            return;
        }
        if (i2 != 8 && i2 != 2) {
            super.g(wrVar, i - this.f.h());
        } else {
            ((dcal) wrVar.a).b(new dcai(this.d, i));
            wrVar.a.setClipToOutline(true);
        }
    }

    @Override // defpackage.dbzx
    protected final int m() {
        return R.string.c2o_category_gallery_content_description;
    }
}
