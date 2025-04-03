package defpackage;

import android.app.Activity;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eaam implements dzwt {
    final /* synthetic */ eaar a;

    public eaam(eaar eaarVar) {
        this.a = eaarVar;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [android.view.View, dzzi] */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.view.View, dzzi] */
    @Override // defpackage.dzwt
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        eaar eaarVar;
        View view;
        dzpb dzpbVar = (dzpb) obj;
        if (this.a.s || !dzpbVar.i().g() || (view = (eaarVar = this.a).a) == null) {
            return;
        }
        if (eaarVar.t == null) {
            eaarVar.t = new eadq(view.getContext());
            eaar eaarVar2 = this.a;
            eaarVar2.u = new dzxw(eaarVar2.t.a, dzpbVar);
            this.a.u.a();
        } else {
            dzxw dzxwVar = eaarVar.u;
            if (dzxwVar != null) {
                dzxwVar.b = dzpbVar;
                dzxwVar.a.b(dzpbVar);
            }
        }
        eaar eaarVar3 = this.a;
        eaarVar3.t.b.setText(eaarVar3.a.getResources().getString(R.string.sending_as_format, dzpbVar.i().c()));
        if (!this.a.a.o()) {
            eaar eaarVar4 = this.a;
            eaarVar4.a.q(eaarVar4.t);
        }
        erny.f(this.a.A.b(25), new emwl() { // from class: eaah
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                if (((Boolean) obj2).booleanValue()) {
                    final eaam eaamVar = eaam.this;
                    dyhr.a("ConvPresenter", "Adding info icon and tooltip to avatar status bar.");
                    eaar eaarVar5 = eaamVar.a;
                    eadq eadqVar = eaarVar5.t;
                    String string = eaarVar5.a.getResources().getString(R.string.info_icon_content_description);
                    eadqVar.d.setImageDrawable(ku.a(eadqVar.getContext(), R.drawable.gs_info_vd_theme_24));
                    eadqVar.c.setVisibility(8);
                    eadqVar.d.setVisibility(0);
                    eadqVar.d.setContentDescription(string);
                    ImageButton imageButton = eaamVar.a.t.d;
                    imageButton.setOnClickListener(new View.OnClickListener() { // from class: eaag
                        /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, dzzi] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            eadw eadwVar;
                            eaar eaarVar6 = eaam.this.a;
                            if (!eaarVar6.a.o() || (eadwVar = eaarVar6.w) == null) {
                                dyhr.a("ConvPresenter", "showInfoIconTooltip: tooltip is null or bottom status bar does not exist.");
                                return;
                            }
                            PopupWindow popupWindow = eadwVar.a.b;
                            if (popupWindow == null || !popupWindow.isShowing()) {
                                dyhr.a("ConvPresenter", "showInfoIconTooltip: Showing InfoIconTooltip");
                                final eadv eadvVar = eaarVar6.w.a;
                                eadvVar.b.setClippingEnabled(true);
                                eadvVar.b.setAnimationStyle(android.R.style.Animation.Dialog);
                                eadvVar.b.setBackgroundDrawable(new ColorDrawable(0));
                                eadvVar.b.setOutsideTouchable(eadvVar.c);
                                eadvVar.b.setFocusable(true);
                                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: eadu
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        eadv eadvVar2 = eadv.this;
                                        View view3 = eadvVar2.f;
                                        Activity activity = null;
                                        if (view3 != null) {
                                            Object a = dzyd.a(view3.getContext(), fdql.i());
                                            while (true) {
                                                if (!(a instanceof Activity)) {
                                                    if (!(a instanceof ContextWrapper)) {
                                                        break;
                                                    } else {
                                                        a = ((ContextWrapper) a).getBaseContext();
                                                    }
                                                } else {
                                                    activity = (Activity) a;
                                                    break;
                                                }
                                            }
                                        }
                                        if (activity == null || activity.isFinishing()) {
                                            return;
                                        }
                                        eadvVar2.d();
                                        eadvVar2.e();
                                        eadvVar2.b.showAtLocation(eadvVar2.f, 0, eadvVar2.a(), eadvVar2.b());
                                    }
                                });
                                eaau eaauVar = eaarVar6.e;
                                eaauVar.b.b(eaauVar.b(125).a());
                            }
                        }
                    });
                    dyhr.a("ConvPresenter", "Creating infoIconTooltip.");
                    LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(eaamVar.a.a.getContext()).inflate(R.layout.lt_tooltip_layout, (ViewGroup) null);
                    TextView textView = (TextView) linearLayout.findViewById(R.id.lt_tooltip_content_body);
                    if (fdql.a.get().w()) {
                        textView.setText(R.string.info_icon_tooltip_body_text_profile_image_shared);
                    } else {
                        textView.setText(R.string.info_icon_tooltip_body_text);
                    }
                    final eaar eaarVar6 = eaamVar.a;
                    textView.setVisibility(0);
                    MaterialButton materialButton = (MaterialButton) linearLayout.findViewById(R.id.lt_tooltip_content_footer);
                    materialButton.setText(R.string.info_icon_tooltip_footer_text);
                    materialButton.setVisibility(0);
                    materialButton.setOnClickListener(new View.OnClickListener() { // from class: dzzw
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            eaar eaarVar7 = eaar.this;
                            eaarVar7.d();
                            eaarVar7.c(fdql.a.get().k());
                            eaau eaauVar = eaarVar7.e;
                            eaauVar.b.b(eaauVar.b(125).a());
                        }
                    });
                    eaamVar.a.w = new eadw(linearLayout, imageButton);
                }
                return null;
            }
        }, dyhs.a());
    }
}
