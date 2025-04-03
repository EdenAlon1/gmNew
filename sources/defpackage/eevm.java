package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.stickers.packdetails.PackDetailsActivity;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eevm extends ConstraintLayout {
    public final eere d;
    public final ImageView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final ImageButton i;
    public final RecyclerView j;
    public ListenableFuture k;
    public wc l;
    public ewnp m;
    public eeve n;
    public final eevl o;
    public boolean p;
    private final Toolbar q;
    private final View r;

    public eevm(Context context, eevl eevlVar) {
        super(context);
        this.o = eevlVar;
        setId(R.id.sticker_pack_details_view);
        this.d = ((eerf) getContext().getApplicationContext()).b();
        inflate(getContext(), R.layout.pack_details_layout, this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.q = toolbar;
        toolbar.t(new View.OnClickListener() { // from class: eevh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eevl eevlVar2 = eevm.this.o;
                if (eevlVar2 != null) {
                    ((PackDetailsActivity) eevlVar2).finish();
                }
            }
        });
        this.e = (ImageView) findViewById(R.id.pack_icon);
        TextView textView = (TextView) findViewById(R.id.pack_name);
        this.f = textView;
        TextView textView2 = (TextView) findViewById(R.id.pack_author);
        this.g = textView2;
        TextView textView3 = (TextView) findViewById(R.id.pack_description);
        this.h = textView3;
        this.i = (ImageButton) findViewById(R.id.favorite_pack_icon);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.pack_recyclerView);
        this.j = recyclerView;
        View findViewById = findViewById(R.id.pack_details_shadow);
        this.r = findViewById;
        getContext();
        Context context2 = getContext();
        Resources resources = context2.getResources();
        recyclerView.ap(new GridLayoutManager(eerv.a(context2.getResources().getDisplayMetrics().widthPixels, resources.getDimension(R.dimen.pack_details_recycler_view_item_size), resources.getDimension(R.dimen.pack_details_recycler_view_item_margin), resources.getDimension(R.dimen.pack_details_view_grid_padding_lr))));
        if (eevlVar.B()) {
            Context context3 = getContext();
            int color = context3.getColor(R.color.white);
            int dimension = (int) getResources().getDimension(R.dimen.sticker_shadow_height_dark_mode);
            int color2 = getContext().getColor(R.color.sticker_shadow_color_dark_mode);
            toolbar.e().mutate().setTint(color);
            textView.setTextColor(context3.getColor(R.color.pack_details_name_color_dark_mode));
            textView2.setTextColor(context3.getColor(R.color.pack_details_author_color_dark_mode));
            textView3.setTextColor(context3.getColor(R.color.pack_details_description_color_dark_mode));
            findViewById.setBackgroundColor(color2);
            au auVar = (au) findViewById.getLayoutParams();
            auVar.height = dimension;
            findViewById.setLayoutParams(auVar);
            View findViewById2 = findViewById(R.id.toolbar_shadow);
            findViewById2.setBackgroundColor(color2);
            au auVar2 = (au) findViewById2.getLayoutParams();
            auVar2.height = dimension;
            findViewById2.setLayoutParams(auVar2);
        }
    }

    public final void b() {
        Context context = getContext();
        if (this.p) {
            int color = context.getColor(true != this.o.B() ? R.color.favorite_enabled_color : R.color.favorite_enabled_color_dark_mode);
            this.i.setImageResource(R.drawable.quantum_ic_favorite_white_24);
            this.i.setColorFilter(color);
            this.i.setContentDescription(getContext().getString(R.string.cd_sticker_favorite_on_icon));
            return;
        }
        int color2 = context.getColor(true != this.o.B() ? R.color.favorite_disabled_color : R.color.favorite_disabled_color_dark_mode);
        this.i.setImageResource(R.drawable.quantum_ic_favorite_border_white_24);
        this.i.setColorFilter(color2);
        this.i.setContentDescription(getContext().getString(R.string.cd_sticker_favorite_off_icon));
    }

    public final void c() {
        if (((GridLayoutManager) this.j.o).K() > 0) {
            this.r.setVisibility(0);
        } else {
            this.r.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 27) {
            this.j.setSystemUiVisibility(1280);
            this.j.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: eevg
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    int dimensionPixelSize = eevm.this.getResources().getDimensionPixelSize(R.dimen.pack_details_view_padding_lr);
                    view.setPadding(dimensionPixelSize, 0, dimensionPixelSize, windowInsets.getSystemWindowInsetBottom());
                    return windowInsets;
                }
            });
        }
        if (this.m != null) {
            ((eeuj) this.d.a()).j(this.m.b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ListenableFuture listenableFuture = this.k;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
        }
    }
}
