package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.gaia.GaiaDittoActivity;
import defpackage.ekkz;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbud extends dbvd implements ekhu, fbas, ekhq, ekkk, elar, ellr {
    private dbuw a;
    private boolean ah;
    private Context d;
    private final lkv e = new lkv(this);
    private final ells ag = new ells();

    @Deprecated
    public dbud() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return dbuw.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Spanned fromHtml;
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final dbuw H = H();
            ((ejwl) H.j.b()).b(new cgfb((cgfd) H.n.b(), H.b), new dbuq(H));
            ((ejwl) H.j.b()).b(((eixo) H.k.b()).a(H.b), new dbur(H));
            final View inflate = layoutInflater.inflate(true != ((auya) H.o.b()).a() ? R.layout.gaia_pairing_settings_fragment_v2 : R.layout.gaia_pairing_settings_fragment_coolranch, viewGroup, false);
            View findViewById = H.c.fe().findViewById(android.R.id.content);
            kud kudVar = new kud() { // from class: dbuf
                @Override // defpackage.kud
                public final kxh ey(View view, kxh kxhVar) {
                    kpt f = kxhVar.f(519);
                    view.setPadding(f.b, 0, f.d, 0);
                    return kxhVar;
                }
            };
            int[] iArr = kvo.a;
            kvd.k(findViewById, kudVar);
            kvd.k((LinearLayout) inflate.findViewById(R.id.switch_to_qr_button_wrapper), new kud() { // from class: dbug
                @Override // defpackage.kud
                public final kxh ey(View view, kxh kxhVar) {
                    view.setPadding(0, 0, 0, kxhVar.f(519).e);
                    return kxhVar;
                }
            });
            final GaiaDittoActivity gaiaDittoActivity = (GaiaDittoActivity) H.c.fe();
            im k = gaiaDittoActivity.k();
            k.getClass();
            cwpw.a(k, null);
            k.setDisplayHomeAsUpEnabled(true);
            Toolbar eZ = gaiaDittoActivity.eZ();
            eZ.getClass();
            eZ.t(new View.OnClickListener() { // from class: dbue
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GaiaDittoActivity.this.gE().d();
                }
            });
            H.c.av(true);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.gaia_paired_desktop_list);
            recyclerView.aL();
            recyclerView.an(null);
            recyclerView.ap(new LinearLayoutManager());
            recyclerView.am(H.t);
            final View findViewById2 = inflate.findViewById(R.id.instruction_list_title_container);
            Button button = (Button) inflate.findViewById(R.id.instruction_list_title);
            final View findViewById3 = inflate.findViewById(R.id.instruction_list);
            final ImageView imageView = (ImageView) inflate.findViewById(R.id.instruction_list_indicator);
            TextView textView = (TextView) inflate.findViewById(R.id.instruction_list_item_text_two);
            fromHtml = Html.fromHtml(H.g.getResources().getString(R.string.instruction_access_url_text_rebrand, bzaq.i.e()), 63);
            textView.setText(fromHtml);
            button.setOnClickListener(new View.OnClickListener() { // from class: dbun
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dbuw dbuwVar = dbuw.this;
                    View view2 = inflate;
                    View view3 = findViewById3;
                    int visibility = view3.getVisibility();
                    ImageView imageView2 = imageView;
                    View view4 = findViewById2;
                    if (visibility == 8) {
                        view3.setVisibility(0);
                        imageView2.setImageResource(R.drawable.quantum_ic_expand_less_vd_theme_24);
                        view4.setContentDescription(dbuwVar.g.getResources().getString(R.string.instruction_how_to_pair_expanded_content_description));
                        if (((aslh) dbuwVar.r.b()).a()) {
                            view3.setAccessibilityLiveRegion(1);
                            return;
                        } else {
                            dbuwVar.a(view2, true);
                            return;
                        }
                    }
                    view3.setVisibility(8);
                    imageView2.setImageResource(R.drawable.quantum_ic_expand_more_vd_theme_24);
                    view4.setContentDescription(dbuwVar.g.getResources().getString(R.string.instruction_how_to_pair_collapsed_content_description));
                    if (((aslh) dbuwVar.r.b()).a()) {
                        view3.setAccessibilityLiveRegion(1);
                    } else {
                        dbuwVar.a(view2, false);
                    }
                }
            });
            final View findViewById4 = inflate.findViewById(R.id.paired_desktops_list_title_container);
            Button button2 = (Button) inflate.findViewById(R.id.paired_desktops_list_title);
            final View findViewById5 = inflate.findViewById(R.id.gaia_paired_desktop_item_list_layout);
            final ImageView imageView2 = (ImageView) inflate.findViewById(R.id.paired_desktops_list_indicator);
            final TextView textView2 = (TextView) inflate.findViewById(R.id.no_paired_devices_text);
            button2.setText(H.g.getResources().getString(R.string.paired_desktops_title, 0));
            button2.setOnClickListener(new View.OnClickListener() { // from class: dbup
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dbuw dbuwVar = dbuw.this;
                    View view2 = inflate;
                    View view3 = findViewById5;
                    TextView textView3 = textView2;
                    int visibility = view3.getVisibility();
                    ImageView imageView3 = imageView2;
                    View view4 = findViewById4;
                    if (visibility != 8) {
                        textView3.setVisibility(8);
                        view3.setVisibility(8);
                        imageView3.setImageResource(R.drawable.quantum_ic_expand_more_vd_theme_24);
                        view4.setContentDescription(dbuwVar.g.getResources().getString(R.string.paired_desktops_collapsed_content_description, Integer.valueOf(dbuwVar.s.size())));
                        if (((aslh) dbuwVar.r.b()).a()) {
                            view3.setAccessibilityLiveRegion(1);
                            return;
                        } else {
                            dbuwVar.a(view2, false);
                            return;
                        }
                    }
                    if (dbuwVar.s.isEmpty()) {
                        textView3.setVisibility(0);
                    } else {
                        textView3.setVisibility(8);
                    }
                    view3.setVisibility(0);
                    imageView3.setImageResource(R.drawable.quantum_ic_expand_less_vd_theme_24);
                    view4.setContentDescription(dbuwVar.g.getResources().getString(R.string.paired_desktops_expanded_content_description, Integer.valueOf(dbuwVar.s.size())));
                    if (((aslh) dbuwVar.r.b()).a()) {
                        view3.setAccessibilityLiveRegion(1);
                    } else {
                        dbuwVar.a(view2, true);
                    }
                }
            });
            inflate.findViewById(R.id.unpair_all_devices_button).setOnClickListener(new View.OnClickListener() { // from class: dbuh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final dbuw dbuwVar = dbuw.this;
                    ((akzt) dbuwVar.l.b()).c("Bugle.Gaia.UnpairAll.Button.Clicked");
                    ehft ehftVar = new ehft(dbuwVar.g);
                    ehftVar.y(dbuwVar.g.getResources().getString(R.string.delete_all_paired_desktops_dialog_title));
                    ehftVar.n(dbuwVar.g.getResources().getString(R.string.delete_all_paired_desktops_dialog_content));
                    ehftVar.u(dbuwVar.g.getResources().getString(R.string.delete_paired_desktop_positive_button_text), new elbb((elbx) dbuwVar.i.b(), "GaiaPairingSettingsFragmentPeer.confirm_signout_all", new DialogInterface.OnClickListener() { // from class: dbui
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            dbuw dbuwVar2 = dbuw.this;
                            ((akzt) dbuwVar2.l.b()).c("Bugle.Gaia.UnpairAll.Button.Confirmed");
                            dbuwVar2.b((List) Collection.EL.stream(dbuwVar2.s).map(new Function() { // from class: dbuk
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return ((bzhy) obj).a;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(Collectors.toCollection(new Supplier() { // from class: dbul
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return new ArrayList();
                                }
                            })));
                        }
                    }));
                    ehftVar.p(dbuwVar.g.getResources().getString(R.string.delete_paired_desktop_negative_button_text), new elbb((elbx) dbuwVar.i.b(), "GaiaPairingSettingsFragmentPeer.cancel_signout_all", new DialogInterface.OnClickListener() { // from class: dbuj
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            ((akzt) dbuw.this.l.b()).c("Bugle.Gaia.UnpairAll.Button.Cancelled");
                            dialogInterface.dismiss();
                        }
                    }));
                    ehftVar.a();
                }
            });
            if (inflate == null) {
                dbuy.a(this, H());
            }
            ekyf.q();
            return inflate;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.e;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dbuw H() {
        dbuw dbuwVar = this.a;
        if (dbuwVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ah) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return dbuwVar;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.d == null) {
            this.d = new ekkn(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.dbvd, defpackage.efaf, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
        try {
            super.ag(activity);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efaf, defpackage.ea
    public final void ah(Menu menu, MenuInflater menuInflater) {
        super.ah(menu, menuInflater);
        H();
        menuInflater.inflate(R.menu.gaia_ditto_toolbar_menu, menu);
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.c.k();
        try {
            ellg.b(this).b = view;
            H();
            dbuy.a(this, H());
            bm(view, bundle);
            final dbuw H = H();
            Button button = (Button) view.findViewById(R.id.switch_to_qr_button);
            H.d(false);
            button.setOnClickListener(new elay((elbx) H.i.b(), "GaiaPairingSettingsFragmentPeer.onSwitchToQrClick", new View.OnClickListener() { // from class: dbum
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    dbuw dbuwVar = dbuw.this;
                    ((akzt) dbuwVar.l.b()).c("Bugle.Gaia.SwitchToQr.Button.Clicked");
                    ((ejlq) dbuwVar.d.b()).g(ejlp.b(((bzib) dbuwVar.f.b()).e()), dbuwVar.q);
                }
            }));
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        emxf.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
    }

    @Override // defpackage.dbvd
    protected final /* bridge */ /* synthetic */ ekky b() {
        return new ekkt(this, true);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final elds bb() {
        return this.c.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.c.e(eldsVar, z);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void be(elds eldsVar) {
        this.c.b = eldsVar;
    }

    @Override // defpackage.ellr
    public final elli e(ellf ellfVar) {
        return this.ag.a(ellfVar);
    }

    @Override // defpackage.ellr
    public final void f(Class cls, ellh ellhVar) {
        this.ag.b(cls, ellhVar);
    }

    @Override // defpackage.dbvd, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ah) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    Object aX = aX();
                    eisx eisxVar = (eisx) ((akgo) aX).b.b.b();
                    dbud dbudVar = (dbud) ((akgo) aX).eR.b();
                    fbbf fbbfVar = ((akgo) aX).f;
                    fbbf fbbfVar2 = ((akgo) aX).n;
                    fbbf fbbfVar3 = ((akgo) aX).dl;
                    akis akisVar = ((akgo) aX).a;
                    akkp akkpVar = akisVar.a;
                    fbbf fbbfVar4 = akkpVar.Px;
                    fbbf fbbfVar5 = ((akgo) aX).b.ap;
                    fbbf fbbfVar6 = ((akgo) aX).eS;
                    fbbf fbbfVar7 = ((akgo) aX).g;
                    fbbf fbbfVar8 = akkpVar.as;
                    fbbf fbbfVar9 = akkpVar.C;
                    fbbf fbbfVar10 = ((akgo) aX).di;
                    fbbf fbbfVar11 = akkpVar.Dy;
                    akko akkoVar = akisVar.b;
                    this.a = new dbuw(eisxVar, dbudVar, fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, fbbfVar8, fbbfVar9, fbbfVar10, fbbfVar11, akkoVar.kW, akkoVar.kX);
                    this.Z.c(new ekkg(this.c, this.e));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater aO = aO();
            LayoutInflater cloneInContext = aO.cloneInContext(new ekkz.a(aO, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new ekkn(this, cloneInContext));
            ekyf.q();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aY(bundle);
            dbuw H = H();
            ((ejxn) H.e.b()).g(R.id.device_pairing_settings_local_subscription, ((bzib) H.f.b()).a(H.b), new dbuv(H));
            ((ejlq) H.d.b()).k(H.p);
            ((ejlq) H.d.b()).k(H.q);
            dbtx dbtxVar = (dbtx) H.h.b();
            Context context = H.g;
            dbud dbudVar = (dbud) dbtxVar.a.b();
            dbudVar.getClass();
            csrh csrhVar = (csrh) dbtxVar.b.b();
            csrhVar.getClass();
            elbx elbxVar = (elbx) dbtxVar.c.b();
            elbxVar.getClass();
            H.t = new dbtw(dbudVar, csrhVar, elbxVar, dbtxVar.d, dbtxVar.e, context);
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.efaf, defpackage.ea
    public final void j() {
        elav a = this.c.a();
        try {
            bg();
            this.ah = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dbvd, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
