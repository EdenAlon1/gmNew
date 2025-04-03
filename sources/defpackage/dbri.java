package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.support.v7.widget.AppCompatImageView;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbri extends vk {
    public final akzt a;
    public final akzt d;
    public final elbx e;
    public final Context f;
    public final ffbr g;
    public final ellq h;
    public List i;
    private final enhk j;
    private final String k;
    private final csrh l;
    private final ctbe m;
    private final chep n;
    private final chyn o;
    private final ffbr p;
    private final Optional q;
    private final ffbr r;
    private View s;
    private View t;
    private boolean u = false;
    private boolean v = false;

    public dbri(csrh csrhVar, ctbe ctbeVar, akzt akztVar, akzt akztVar2, chep chepVar, chyn chynVar, ffbr ffbrVar, ellq ellqVar, elbx elbxVar, ffbr ffbrVar2, ffbr ffbrVar3, Context context, Optional optional) {
        this.l = csrhVar;
        this.m = ctbeVar;
        this.a = akztVar;
        this.d = akztVar2;
        this.n = chepVar;
        this.o = chynVar;
        this.p = ffbrVar2;
        this.e = elbxVar;
        this.f = context;
        this.h = ellqVar;
        this.r = ffbrVar;
        this.q = optional;
        this.g = ffbrVar3;
        Resources resources = context.getResources();
        String string = resources.getString(R.string.desktop_browser_type_unknown);
        this.k = string;
        enhd enhdVar = new enhd();
        enhdVar.k(eslr.UNKNOWN, string);
        enhdVar.k(eslr.OTHER, resources.getString(R.string.desktop_browser_type_other));
        enhdVar.k(eslr.CHROME, resources.getString(R.string.desktop_browser_type_chrome));
        enhdVar.k(eslr.FIREFOX, resources.getString(R.string.desktop_browser_type_firefox));
        enhdVar.k(eslr.SAFARI, resources.getString(R.string.desktop_browser_type_safari));
        enhdVar.k(eslr.OPERA, resources.getString(R.string.desktop_browser_type_opera));
        enhdVar.k(eslr.IE, resources.getString(R.string.desktop_browser_type_ie));
        enhdVar.k(eslr.EDGE, resources.getString(R.string.desktop_browser_type_edge));
        this.j = enhdVar.c();
    }

    final void F(boolean z) {
        this.u = true;
        this.v = z;
        p();
    }

    final void G(LottieAnimationView lottieAnimationView) {
        (((crjx) this.p.b()).g() ? this.v ? egxu.a : egxw.a : this.v ? egxv.a : egxx.a).g(lottieAnimationView);
    }

    @Override // defpackage.vk
    public final int a() {
        if (!this.u) {
            return 0;
        }
        List list = this.i;
        if (list == null || list.isEmpty()) {
            return 1;
        }
        return this.i.size() + 2;
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        if (i == 0) {
            return 0;
        }
        return i == this.i.size() + 1 ? 2 : 1;
    }

    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(this.f);
        if (i != 0) {
            if (i == 1) {
                return new dbrh(from.inflate(R.layout.paired_desktop_list_item_view, viewGroup, false));
            }
            if (i == 2) {
                return new dbrh(from.inflate(R.layout.delete_all_desktops_button, viewGroup, false));
            }
            throw new IllegalStateException(a.f(i, "View type ", " is not supported."));
        }
        View inflate = from.inflate(this.v ? R.layout.cms_no_qr_welcome_banner : (adhu.b() && this.q.isPresent() && ((Optional) this.g.b()).isPresent()) ? R.layout.qr_welcome_banner_animated_add_gaia : R.layout.qr_welcome_banner_animated, viewGroup, false);
        this.s = inflate.findViewById(R.id.ditto_welcome_banner);
        this.t = inflate.findViewById(R.id.simplified_ditto_welcome_banner);
        LottieAnimationView lottieAnimationView = this.v ? (LottieAnimationView) this.s.findViewById(R.id.cms_illustration) : (LottieAnimationView) this.s.findViewById(R.id.qr_illustration);
        G(lottieAnimationView);
        lottieAnimationView.d();
        return new dbrh(inflate);
    }

    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        String str;
        Button button;
        Optional of;
        if (dE(i) == 0) {
            TextView textView = (TextView) this.s.findViewById(R.id.ditto_bottom_text);
            TextView textView2 = (TextView) this.s.findViewById(R.id.ditto_footer_text);
            String str2 = (String) bzaq.i.e();
            if (this.v) {
                this.t.setVisibility(8);
                this.s.setVisibility(0);
                textView2.setVisibility(8);
                String string = this.f.getResources().getString(R.string.cms_no_qr_welcome_bottom_text, str2);
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
                int indexOf = string.indexOf(str2);
                if (indexOf >= 0) {
                    valueOf.setSpan(new StyleSpan(1), indexOf, str2.length() + indexOf, 33);
                }
                textView.setText(valueOf);
                this.s.findViewById(R.id.cms_illustration).setVisibility(true != ddzb.o(this.f) ? 0 : 8);
                textView.setClickable(false);
                textView.setLongClickable(false);
                of = Optional.empty();
            } else {
                if (a() == 1) {
                    button = (Button) this.s.findViewById(R.id.scan_qr_code_button);
                    textView.setText(this.f.getResources().getString(R.string.qr_welcome_bottom_text, str2));
                    this.t.setVisibility(8);
                    this.s.setVisibility(0);
                    this.s.findViewById(R.id.qr_illustration).setVisibility(true != ddzb.o(this.f) ? 0 : 8);
                    textView.setClickable(false);
                    textView.setLongClickable(false);
                    Context context = this.f;
                    String string2 = context.getString(R.string.qr_welcome_terms_of_service);
                    String string3 = context.getString(R.string.qr_welcome_privacy);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(R.string.qr_welcome_footer_text, string2, string3));
                    crmi.c(context, spannableStringBuilder, string2, new dbrf(this, this.m.b()));
                    crmi.c(context, spannableStringBuilder, string3, new dbrg(this, this.m.a()));
                    textView2.setText(spannableStringBuilder);
                    egyl.b(textView2);
                    egyl.c(textView2);
                } else {
                    button = (Button) this.t.findViewById(R.id.scan_qr_code_button);
                    this.s.setVisibility(8);
                    this.t.setVisibility(0);
                    this.t.findViewById(R.id.simplified_qr_illustration).setVisibility(8);
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) this.t.findViewById(R.id.scan_qr_illustration);
                    boolean o = ddzb.o(this.f);
                    lottieAnimationView.setVisibility(true != o ? 0 : 8);
                    if (!o) {
                        G(lottieAnimationView);
                        lottieAnimationView.d();
                    }
                    this.t.findViewById(R.id.simplified_qr_url_top_spacing).setVisibility(true == ddzb.o(this.f) ? 0 : 8);
                    ((TextView) this.t.findViewById(R.id.simplified_ditto_url_text_view)).setText(Html.fromHtml(this.f.getResources().getString(R.string.qr_simplified_welcome_banner_url_text, bzaq.i.e())));
                }
                of = Optional.of(button);
                if (adhu.b() && this.q.isPresent() && ((Optional) this.g.b()).isPresent()) {
                    (a() == 1 ? (Button) this.s.findViewById(R.id.switch_to_gaia_button) : (Button) this.t.findViewById(R.id.switch_to_gaia_button)).setOnClickListener(new elay(this.e, "DittoWelcome.switch_to_gaia", new View.OnClickListener() { // from class: dbre
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            dbri dbriVar = dbri.this;
                            dbriVar.d.c("Bugle.Gaia.SwitchToGaia.Button.Clicked");
                            ((dbtj) ((Optional) dbriVar.g.b()).get()).b();
                        }
                    }));
                }
            }
            of.ifPresent(new Consumer() { // from class: dbqx
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    dbsz dbszVar = new dbsz();
                    dbri.this.h.b((Button) obj, dbszVar);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        if (dE(i) != 1) {
            if (dE(i) == 2) {
                Button button2 = (Button) wrVar.a.findViewById(R.id.delete_all_desktops_button);
                if (this.v) {
                    button2.setVisibility(8);
                    button2.setText(this.f.getString(R.string.qr_welcome_hangouts_unpair_devices_text));
                } else {
                    button2.setText(this.f.getString(R.string.qr_delete_all_paired_desktops_button_text));
                }
                button2.setOnClickListener(new View.OnClickListener() { // from class: dbra
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        final dbri dbriVar = dbri.this;
                        dbriVar.a.c("Bugle.Ditto.Pairing.Computers.SignOut.All");
                        ehft ehftVar = new ehft(dbriVar.f);
                        ehftVar.n(dbriVar.f.getResources().getString(R.string.delete_all_paired_desktops_dialog_title));
                        ehftVar.u(dbriVar.f.getResources().getString(R.string.delete_paired_desktop_positive_button_text), new elbb(dbriVar.e, "DittoWelcome.confirm_signout_all", new DialogInterface.OnClickListener() { // from class: dbrc
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                dbri dbriVar2 = dbri.this;
                                dbriVar2.a.c("Bugle.Ditto.Pairing.Computers.SignOut.All.Confirm");
                                List list = dbriVar2.i;
                                if (list != null) {
                                    dbriVar2.m(list);
                                }
                            }
                        }));
                        ehftVar.p(dbriVar.f.getResources().getString(R.string.delete_paired_desktop_negative_button_text), new elbb(dbriVar.e, "DittoWelcome.cancel_signout_all", new DialogInterface.OnClickListener() { // from class: dbrd
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                dialogInterface.dismiss();
                            }
                        }));
                        ehftVar.a();
                    }
                });
                return;
            }
            return;
        }
        View view = wrVar.a;
        final bcxe bcxeVar = (bcxe) this.i.get(i - 1);
        bsrt bsrtVar = bcxeVar.a;
        if (TextUtils.isEmpty(bsrtVar.s())) {
            eslr a = bcxeVar.a();
            str = (a == null || !this.j.containsKey(a)) ? this.k : (String) this.j.get(a);
        } else {
            str = bsrtVar.s();
            if (!TextUtils.isEmpty(bsrtVar.t())) {
                str = str + " " + bsrtVar.t();
            }
        }
        TextView textView3 = (TextView) view.findViewById(R.id.paired_desktop_list_item_name);
        textView3.setText(str);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.paired_desktop_list_item_icon);
        byyv n = bcxeVar.a.n();
        byyv byyvVar = byyv.SATELLITE;
        eslr a2 = bcxeVar.a();
        if (a2 == null) {
            a2 = eslr.UNRECOGNIZED;
        }
        int ordinal = a2.ordinal();
        int i2 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? ordinal != 7 ? -1 : R.drawable.product_logo_microsoft_edge_color_36 : R.drawable.product_logo_opera_color_36 : R.drawable.product_logo_apple_safari_color_36 : R.drawable.product_logo_mozilla_firefox_color_36 : R.drawable.product_logo_chrome_color_36;
        if (n == byyvVar) {
            appCompatImageView.setImageResource(R.drawable.quantum_ic_tablet_android_white_36);
            appCompatImageView.setImageTintMode(PorterDuff.Mode.MULTIPLY);
        } else if (i2 != -1) {
            appCompatImageView.setImageResource(i2);
            appCompatImageView.setImageTintMode(PorterDuff.Mode.DST);
        } else {
            appCompatImageView.setImageResource(R.drawable.quantum_ic_desktop_windows_white_36);
            appCompatImageView.setImageTintMode(PorterDuff.Mode.MULTIPLY);
        }
        TextView textView4 = (TextView) view.findViewById(R.id.paired_desktop_list_item_connection_time);
        long m = bsrtVar.m();
        if (m == 0) {
            Context context2 = this.f;
            textView4.setText(context2.getString(R.string.paired_desktops_last_connection_time, context2.getString(R.string.paired_desktops_last_connection_time_unknown)));
        } else {
            textView4.setText(this.f.getString(R.string.paired_desktops_last_connection_time, this.l.d(m)));
        }
        View findViewById = view.findViewById(R.id.delete_paired_desktop_button);
        findViewById.setContentDescription(this.f.getResources().getString(R.string.delete_paired_desktop_button_content_description, textView3.getText()));
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: dbrb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                final dbri dbriVar = dbri.this;
                dbriVar.a.c("Bugle.Ditto.Pairing.Computers.SignOut");
                ehft ehftVar = new ehft(dbriVar.f);
                ehftVar.n(dbriVar.f.getResources().getString(R.string.delete_paired_desktop_dialog_title));
                String string4 = dbriVar.f.getResources().getString(R.string.delete_paired_desktop_positive_button_text);
                final bcxe bcxeVar2 = bcxeVar;
                ehftVar.u(string4, new elbb(dbriVar.e, "DittoWelcome.confirm_signout", new DialogInterface.OnClickListener() { // from class: dbqy
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        dbri dbriVar2 = dbri.this;
                        dbriVar2.a.c("Bugle.Ditto.Pairing.Computers.SignOut.Confirm");
                        dbriVar2.m(Collections.singletonList(bcxeVar2));
                    }
                }));
                ehftVar.p(dbriVar.f.getResources().getString(R.string.delete_paired_desktop_negative_button_text), new elbb(dbriVar.e, "DittoWelcome.cancel_signout", new DialogInterface.OnClickListener() { // from class: dbqz
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        dialogInterface.dismiss();
                    }
                }));
                ehftVar.a();
            }
        });
        if (this.v) {
            findViewById.setVisibility(8);
            view.setVisibility(8);
        }
    }

    final void m(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fcek a = bzar.a(((bcxe) it.next()).a.q());
            ((bzea) this.r.b()).r(a.c, 11);
            this.n.a(this.o.a(a));
        }
    }
}
