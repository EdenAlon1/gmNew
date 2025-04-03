package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Size;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifContentItem;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcjd extends dcar {
    private static final dcle c = dcle.b(epts.GIF, eptu.EXPANDED);
    private static final enip d = new enpx(132);
    private final dcja e;
    private final dbxy f;
    private dciv g;

    public dcjd(cuxz cuxzVar, Context context, dbxy dbxyVar, dcab dcabVar, ContentGridView contentGridView, int i) {
        super(cuxzVar, eymn.GIF, i);
        this.f = dbxyVar;
        String string = context.getResources().getString(R.string.c2o_gif_search_button_text);
        ehdr.d(context, R.attr.colorOnSurfaceInverse, "GifContentCategory");
        this.e = new dcja(dbxyVar, new dciz(context, new dciw(string, null, ehdr.d(context, R.attr.colorOnSurface, "GifContentCategory"))), dcabVar, contentGridView, i);
    }

    @Override // defpackage.dcar
    protected final /* synthetic */ dbzy A() {
        return this.e;
    }

    @Override // defpackage.dcae
    public final int a() {
        return R.dimen.c2o_gif_category_item_height;
    }

    @Override // defpackage.dcae
    public final int b() {
        return R.string.c2o_category_gif_content_description;
    }

    @Override // defpackage.dcae
    protected final int c() {
        return R.drawable.ic_insert_gif_white;
    }

    @Override // defpackage.dcae
    public final Set d() {
        return d;
    }

    @Override // defpackage.dcae
    public final void f(cxqz cxqzVar) {
        Intent intent;
        if (cxqzVar.b != -1 || (intent = cxqzVar.c) == null) {
            return;
        }
        int intExtra = intent.getIntExtra("gif_position_selected", -1);
        GifContentItem gifContentItem = (GifContentItem) cxqzVar.c.getParcelableExtra("gif_content_item");
        if (gifContentItem != null) {
            if (!((Boolean) cful.o.e()).booleanValue()) {
                this.i.d(gifContentItem, c, false, intExtra);
                return;
            }
            Uri uri = gifContentItem.b;
            ufl h = ufm.h();
            h.e(uri);
            uer uerVar = (uer) h;
            uerVar.b = gifContentItem.e;
            h.d(gifContentItem.f);
            uerVar.a = new Size(gifContentItem.c(), gifContentItem.b());
            h.b(eohh.GIF_CHOOSER);
            this.i.c(h.a(), c, false, intExtra);
        }
    }

    @Override // defpackage.dcat
    public final void j() {
        this.f.l(eptm.CATEGORY_HEADER);
    }

    @Override // defpackage.dcar
    protected final int k() {
        return R.string.c2o_category_name_gif;
    }

    @Override // defpackage.dcae
    public final boolean m() {
        return true;
    }

    @Override // defpackage.dcar
    protected final dbzx z() {
        if (this.g == null) {
            this.g = new dciv(this.e);
        }
        return this.g;
    }
}
