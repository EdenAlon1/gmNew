package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Build;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eesm extends FrameLayout implements eetz {
    public final eesi a;
    public final eety b;
    private final eere c;
    private final ProgressBar d;
    private ListenableFuture e;
    private final eesl f;
    private final RecyclerView g;

    public eesm(Context context, eety eetyVar) {
        super(context);
        this.b = eetyVar;
        setId(R.id.browse_sticker_packs_view);
        eere b = ((eerf) getContext().getApplicationContext()).b();
        this.c = b;
        inflate(getContext(), R.layout.browse_sticker_packs_layout, this);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        this.d = progressBar;
        eesi eesiVar = new eesi(b, (AccessibilityManager) getContext().getSystemService("accessibility"), b.n(), eetyVar);
        this.a = eesiVar;
        getContext();
        Context context2 = getContext();
        Resources resources = context2.getResources();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(Math.max(eerv.a(context2.getResources().getDisplayMetrics().widthPixels, resources.getDimension(R.dimen.browse_sticker_icon_size), resources.getDimension(R.dimen.browse_item_margin_lr), resources.getDimension(R.dimen.browse_view_padding_lr)), resources.getInteger(R.integer.browse_min_sticker_pack_per_row)));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.browse_recycler_view);
        this.g = recyclerView;
        recyclerView.ap(gridLayoutManager);
        recyclerView.am(eesiVar);
        eesl eeslVar = new eesl(eesiVar);
        this.f = eeslVar;
        b.j(eeslVar);
        if (eetyVar.G()) {
            progressBar.getIndeterminateDrawable().setColorFilter(getContext().getColor(R.color.white), PorterDuff.Mode.SRC_IN);
        }
    }

    public final void a() {
        this.d.setVisibility(8);
    }

    @Override // defpackage.eetz
    public final void b() {
        ((eeuj) this.c.a()).i(6);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT < 27) {
            return windowInsets;
        }
        this.g.setSystemUiVisibility(1280);
        this.g.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: eesj
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets2) {
                eesm eesmVar = eesm.this;
                int dimensionPixelSize = eesmVar.getResources().getDimensionPixelSize(R.dimen.browse_view_padding_lr);
                view.setPadding(dimensionPixelSize, eesmVar.getResources().getDimensionPixelOffset(R.dimen.browse_view_padding_top), dimensionPixelSize, windowInsets2.getSystemWindowInsetBottom());
                return windowInsets2;
            }
        });
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ListenableFuture d = this.c.d();
        this.e = d;
        erqt.r(d, new eesk(this), eerw.a);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.cancel(true);
        this.c.l(this.f);
    }

    @Override // defpackage.eetz
    public final void c() {
    }
}
