package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.settings.BusinessTopActionView;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoProperty;
import com.google.android.material.tabs.TabLayout;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class waz implements waw {
    public ParticipantsTable.BindData a;
    public BusinessInfoData b;
    public wbe c;
    public wbf d;
    public final wat e;
    public final azze f;
    public final adtc g;
    public final crjr h;
    public final crjt i;
    public final crjv j;
    public final ejwl k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final wav o;
    public final aolr p;
    public final ejwd q = new ejwd<war>() { // from class: waz.1
        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            csjy.f("Bugle", "Failed to load InfoAndOptions data.");
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            int i;
            String string;
            Uri parse;
            war warVar = (war) obj;
            ParticipantsTable.BindData bindData = warVar.a;
            waz wazVar = waz.this;
            wazVar.a = bindData;
            wazVar.b = warVar.b;
            vzg vzgVar = (vzg) wazVar.e.I().h("conversation_settings_base_fragment");
            vzgVar.getClass();
            vzgVar.H().f = wazVar.b();
            wazVar.r.getClass();
            wazVar.s.getClass();
            wazVar.t.getClass();
            wazVar.u.getClass();
            wazVar.v.getClass();
            eg G = wazVar.e.G();
            G.getClass();
            Resources resources = G.getResources();
            ParticipantsTable.BindData bindData2 = wazVar.a;
            if (bindData2 != null) {
                wazVar.s.setText(((bdrt) wazVar.n.b()).a(bindData2, true));
                i = bdqo.a(bindData2).c;
                wazVar.r.i(wazVar.f.a(bindData2));
                wazVar.r.setImportantForAccessibility(4);
            } else {
                i = 3622735;
            }
            BusinessInfoData businessInfoData = wazVar.b;
            if (businessInfoData != null) {
                string = businessInfoData.getDescription();
                if (wazVar.a == null) {
                    wazVar.s.setText(businessInfoData.getName());
                    if (businessInfoData.getColor() != null) {
                        i = Color.parseColor(businessInfoData.getColor());
                    }
                }
                View view = wazVar.e.Q;
                view.getClass();
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.info_and_options_top_actions);
                LayoutInflater from = LayoutInflater.from(G);
                aoku a = wazVar.p.a(businessInfoData.getRbmBotId());
                BusinessInfoProperty primaryPhoneNumber = businessInfoData.getPrimaryPhoneNumber();
                if (primaryPhoneNumber != null) {
                    wazVar.c(wazVar.h.a(a, primaryPhoneNumber.getValue()), i, linearLayout, from);
                }
                BusinessInfoProperty primaryWebsite = businessInfoData.getPrimaryWebsite();
                if (primaryWebsite != null) {
                    wazVar.c(wazVar.j.a(a, primaryWebsite.getValue()), i, linearLayout, from);
                }
                BusinessInfoProperty primaryEmailAddress = businessInfoData.getPrimaryEmailAddress();
                if (primaryEmailAddress != null) {
                    wazVar.c(wazVar.i.a(a, primaryEmailAddress.getValue()), i, linearLayout, from);
                }
                TabLayout tabLayout = wazVar.u;
                tabLayout.f(new wba(wazVar));
                Resources resources2 = wazVar.e.G().getResources();
                String string2 = resources2.getString(R.string.info_and_options_activity_info_tab_title);
                String string3 = resources2.getString(R.string.info_and_options_activity_info_tab_content_description);
                String string4 = resources2.getString(R.string.info_and_options_activity_options_tab_title);
                ehrt e = tabLayout.e();
                e.f(string2);
                e.d(string3);
                tabLayout.h(e, true);
                ehrt e2 = tabLayout.e();
                e2.f(string4);
                tabLayout.g(e2);
            } else {
                wazVar.u.setVisibility(8);
                string = resources.getString(R.string.info_and_options_activity_loading_info);
            }
            if (TextUtils.isEmpty(string)) {
                wazVar.t.setVisibility(8);
            } else {
                wazVar.t.setText(string);
            }
            BusinessInfoData businessInfoData2 = wazVar.b;
            ImageView imageView = wazVar.v;
            imageView.setBackgroundColor(i);
            if (businessInfoData2 == null) {
                csjy.c("Bugle", "No business info, setting hero image view to plain color");
                return;
            }
            String heroImageLocalUri = businessInfoData2.getHeroImageLocalUri();
            String heroImageRemoteUrl = businessInfoData2.getHeroImageRemoteUrl();
            if (TextUtils.isEmpty(heroImageLocalUri)) {
                if (TextUtils.isEmpty(heroImageRemoteUrl) || !URLUtil.isValidUrl(heroImageRemoteUrl)) {
                    csjy.n("Bugle", "Business hero image remote url is invalid: ".concat(String.valueOf(heroImageRemoteUrl)));
                    return;
                }
                parse = Uri.parse(heroImageRemoteUrl);
            } else {
                if (!URLUtil.isValidUrl(heroImageLocalUri)) {
                    csjy.n("Bugle", "Business hero image local url is invalid: ".concat(String.valueOf(heroImageLocalUri)));
                    return;
                }
                parse = Uri.parse(heroImageLocalUri);
            }
            if (!csuu.w(parse)) {
                csjy.n("Bugle", "Can't set business hero image. Its URL is not for a local resource: ".concat(String.valueOf(heroImageRemoteUrl)));
            } else {
                imageView.setBackground(null);
                ((ekmz) wazVar.m.b()).e(parse).v(imageView);
            }
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void hB() {
        }
    };
    public ContactIconView r;
    public TextView s;
    public TextView t;
    public TabLayout u;
    public ImageView v;
    private final akvg w;
    private final ffbr x;

    public waz(ffbr ffbrVar, wat watVar, azze azzeVar, adtc adtcVar, crjr crjrVar, crjt crjtVar, crjv crjvVar, akvg akvgVar, ejwl ejwlVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, aolr aolrVar, wav wavVar) {
        this.m = ffbrVar;
        this.e = watVar;
        this.f = azzeVar;
        this.g = adtcVar;
        this.h = crjrVar;
        this.i = crjtVar;
        this.j = crjvVar;
        this.w = akvgVar;
        this.k = ejwlVar;
        this.l = ffbrVar2;
        this.x = ffbrVar3;
        this.n = ffbrVar4;
        this.p = aolrVar;
        this.o = wavVar;
    }

    @Override // defpackage.waw
    public final vzw a() {
        vzg vzgVar = (vzg) this.e.I().h("conversation_settings_base_fragment");
        vzgVar.getClass();
        return vzgVar.H().d;
    }

    public final Optional b() {
        return Optional.ofNullable(this.b);
    }

    public final void c(crjo crjoVar, int i, LinearLayout linearLayout, LayoutInflater layoutInflater) {
        if (((crjp) this.x.b()).d(crjoVar.e())) {
            BusinessTopActionView businessTopActionView = (BusinessTopActionView) layoutInflater.inflate(R.layout.business_top_action, (ViewGroup) linearLayout, false);
            businessTopActionView.a = crjoVar;
            TextView textView = (TextView) businessTopActionView.findViewById(R.id.business_top_action_text);
            if (textView == null) {
                csix.c("Can't configure top business action view: view text not found");
            } else {
                if (businessTopActionView.d.g()) {
                    i = ehdr.b(textView, R.attr.colorPrimaryBrandIcon);
                }
                textView.setTextColor(i);
                Context context = crjoVar.a;
                textView.setText(context.getResources().getString(crjoVar.d()));
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, crjoVar.f(i), (Drawable) null, (Drawable) null);
                Context context2 = crjoVar.a;
                businessTopActionView.setContentDescription(context2.getResources().getString(crjoVar.c()));
            }
            linearLayout.addView(businessTopActionView);
        }
    }

    public final void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.w.y(this.e.G(), str);
    }

    public final void e(ea eaVar) {
        cg cgVar = new cg(this.e.I());
        cgVar.E(R.id.info_and_options_tab_container, eaVar);
        cgVar.c();
    }
}
