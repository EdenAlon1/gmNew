package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.stickers.gallery.StickerSearchView;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeuc extends ConstraintLayout implements eetm {
    public final StickerSearchView d;
    public final ViewPager e;
    public RecyclerView f;
    public ProgressBar g;
    public ImageView h;
    public TextView i;
    public final eett j;
    public final eeui k;
    public final eety l;
    private final Toolbar m;
    private final ViewFlipper n;
    private final TabLayout o;
    private MenuItem p;
    private final boolean q;
    private int r;
    private eetn s;

    public eeuc(Context context, eety eetyVar) {
        super(context);
        this.r = -16777216;
        this.l = eetyVar;
        setId(R.id.sticker_gallery_view);
        eere b = ((eerf) getContext().getApplicationContext()).b();
        inflate(getContext(), R.layout.sticker_gallery_layout, this);
        this.k = b.a();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.m = toolbar;
        toolbar.t(new View.OnClickListener() { // from class: eetu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eety eetyVar2;
                eeuc eeucVar = eeuc.this;
                if (eeucVar.e() || (eetyVar2 = eeucVar.l) == null) {
                    return;
                }
                eetyVar2.B();
            }
        });
        StickerSearchView stickerSearchView = (StickerSearchView) findViewById(R.id.search_view);
        this.d = stickerSearchView;
        stickerSearchView.setVisibility(8);
        this.n = (ViewFlipper) findViewById(R.id.view_flipper);
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        this.e = viewPager;
        eett eettVar = new eett(viewPager, eetyVar);
        this.j = eettVar;
        viewPager.j(eettVar);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        this.o = tabLayout;
        tabLayout.u(viewPager);
        int b2 = eulz.b(b.i().b);
        boolean z = b2 == 0 || b2 != 5;
        this.q = z;
        if (z) {
            toolbar.o(R.menu.sticker_gallery_search_menu);
            MenuItem findItem = toolbar.h().findItem(R.id.action_search);
            this.p = findItem;
            findItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: eetx
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    eeuc eeucVar = eeuc.this;
                    eeucVar.d();
                    eeucVar.d.requestFocus();
                    eumg eumgVar = eumg.SEARCH_ICON;
                    eumi eumiVar = (eumi) eumj.a.createBuilder();
                    eumiVar.copyOnWrite();
                    ((eumj) eumiVar.instance).b = eumh.a(20);
                    eumiVar.copyOnWrite();
                    ((eumj) eumiVar.instance).e = eumgVar.a();
                    ((eeuj) eeucVar.k).g((eumj) eumiVar.build());
                    return true;
                }
            });
            this.f = (RecyclerView) findViewById(R.id.search_recycler_view);
            this.g = (ProgressBar) findViewById(R.id.search_progress_bar);
            this.h = (ImageView) findViewById(R.id.search_no_result_image);
            this.i = (TextView) findViewById(R.id.search_no_result_text);
            eeti eetiVar = new eeti(eetyVar);
            eetn eetnVar = new eetn(b, eetiVar, this, eetyVar);
            this.s = eetnVar;
            stickerSearchView.d = eetnVar;
            RecyclerView recyclerView = this.f;
            getContext();
            Context context2 = getContext();
            Resources resources = context2.getResources();
            recyclerView.ap(new GridLayoutManager(eerv.a(context2.getResources().getDisplayMetrics().widthPixels, resources.getDimension(R.dimen.search_sticker_icon_size), resources.getDimension(R.dimen.search_item_margin), resources.getDimension(R.dimen.search_view_padding_lr))));
            this.f.an(null);
            this.f.am(eetiVar);
        }
        if (eetyVar.H()) {
            toolbar.r(R.drawable.quantum_ic_arrow_back_black_24);
        }
        if (eetyVar.G()) {
            int color = getContext().getColor(R.color.theme_color_dark_mode);
            int color2 = getContext().getColor(R.color.white);
            int color3 = getContext().getColor(R.color.sticker_gallery_tab_text_color_dark_mode);
            int color4 = getContext().getColor(R.color.sticker_gallery_tab_selected_color_dark_mode);
            int dimension = (int) getResources().getDimension(R.dimen.sticker_shadow_height_dark_mode);
            int color5 = getContext().getColor(R.color.sticker_shadow_color_dark_mode);
            this.r = color2;
            toolbar.e().mutate().setTint(color2);
            if (z) {
                this.p.getIcon().mutate().setTint(color2);
                stickerSearchView.b.getDrawable().mutate().setTint(color2);
            }
            tabLayout.setBackgroundColor(color);
            tabLayout.t(TabLayout.c(color3, color4));
            tabLayout.q(color4);
            View findViewById = findViewById(R.id.view_pager_shadow);
            au auVar = (au) findViewById.getLayoutParams();
            auVar.height = dimension;
            findViewById.setLayoutParams(auVar);
            findViewById.setBackgroundColor(color5);
            View findViewById2 = findViewById(R.id.toolbar_shadow);
            au auVar2 = (au) findViewById2.getLayoutParams();
            auVar2.height = dimension;
            findViewById2.setLayoutParams(auVar2);
            findViewById2.setBackgroundColor(color5);
            this.g.getIndeterminateDrawable().setColorFilter(getContext().getColor(R.color.white), PorterDuff.Mode.SRC_IN);
            this.i.setTextColor(getContext().getColor(R.color.search_not_result_text_color_dark_mode));
        }
    }

    @Override // defpackage.eetm
    public final void a() {
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
    }

    @Override // defpackage.eetm
    public final void b(String str) {
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.i.setText(getContext().getString(R.string.search_no_result_text, str));
        this.h.setVisibility(0);
        this.i.setVisibility(0);
    }

    public final void c() {
        if (this.d.getVisibility() == 8) {
            return;
        }
        this.n.showPrevious();
        this.d.setVisibility(8);
        StickerSearchView stickerSearchView = this.d;
        stickerSearchView.a.setText("");
        stickerSearchView.a.clearFocus();
        if (!this.l.H()) {
            this.m.r(R.drawable.quantum_ic_close_black_24);
            if (this.r != -16777216) {
                this.m.e().mutate().setTint(this.r);
            }
        }
        this.p.setVisible(true);
        eetn eetnVar = this.s;
        if (eetnVar != null) {
            eetnVar.a();
            eetnVar.a.a();
        }
    }

    public final void d() {
        if (this.d.getVisibility() == 0) {
            return;
        }
        this.n.showNext();
        this.d.setVisibility(0);
        a();
        if (!this.l.H()) {
            this.m.r(R.drawable.quantum_ic_arrow_back_black_24);
            if (this.r != -16777216) {
                this.m.e().mutate().setTint(this.r);
            }
        }
        this.p.setVisible(false);
        ((eeuj) this.k).i(8);
    }

    public final boolean e() {
        if (this.d.getVisibility() != 0) {
            return false;
        }
        c();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.q || Build.VERSION.SDK_INT < 27) {
            return;
        }
        this.f.setSystemUiVisibility(1280);
        this.e.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: eetv
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                eeuc.this.j.a = windowInsets;
                return windowInsets;
            }
        });
        this.f.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: eetw
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                eeuc eeucVar = eeuc.this;
                int dimensionPixelSize = eeucVar.getResources().getDimensionPixelSize(R.dimen.search_view_padding_lr);
                view.setPadding(dimensionPixelSize, eeucVar.getResources().getDimensionPixelOffset(R.dimen.search_view_padding_top), dimensionPixelSize, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        eetn eetnVar = this.s;
        if (eetnVar != null) {
            eetnVar.a();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        eeub eeubVar = (eeub) parcelable;
        super.onRestoreInstanceState(eeubVar.getSuperState());
        if (eeubVar.a) {
            d();
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        eeub eeubVar = new eeub(super.onSaveInstanceState());
        eeubVar.a = this.d.getVisibility() == 0;
        return eeubVar;
    }
}
