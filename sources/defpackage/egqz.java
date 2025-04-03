package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.fragment.devicephotos.DevicePhotosFragment;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egqz extends egqb {
    private static final enru ar = enru.c("com/google/android/libraries/user/profile/photopicker/fragment/suggestiontabs/v2/SuggestionTabsV2Fragment");
    public dvxi ag;
    public emxc ah;
    public egcx ai;
    public String aj;
    public egqg ak;
    public MaterialToolbar al;
    public TabLayout am;
    public dwck an;
    public boolean ao = false;
    public egpx ap;
    public List aq;
    private dwck as;
    private pdb at;
    private ViewPager au;
    public egrf b;
    public egcw c;
    public dvyc d;
    public dvxy e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        this.aq = this.ak.a();
        if (B().getConfiguration().getLayoutDirection() != 0) {
            this.aq = enkr.f(this.aq);
        }
        if (egpx.a(this.m.getString("SuggestionTabsFragmentMode")) == egpx.ONLY_SHOW_DEVICE_PHOTOS) {
            i = true != fdrm.l() ? R.layout.photo_picker_suggestion_tabs_device_only : R.layout.photo_picker_suggestion_tabs_device_only_art_styles;
            i2 = 110514;
        } else {
            i = true != fdrm.l() ? R.layout.photo_picker_suggestion_tabs_fragment : R.layout.photo_picker_suggestion_tabs_fragment_art_styles;
            i2 = 110512;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        this.e.b(inflate, this.d.a(i2));
        kvo.r(inflate, Y(R.string.op3_change_profile_picture));
        if (fdrm.i()) {
            kvd.k(inflate, new kud() { // from class: egqr
                @Override // defpackage.kud
                public final kxh ey(View view, kxh kxhVar) {
                    kpt f = kxhVar.f(519);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    marginLayoutParams.leftMargin = f.b;
                    marginLayoutParams.bottomMargin = f.e;
                    marginLayoutParams.rightMargin = f.d;
                    marginLayoutParams.topMargin = f.c;
                    view.setLayoutParams(marginLayoutParams);
                    return kxh.a;
                }
            });
        }
        return inflate;
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        this.b.k(this);
        this.al = (MaterialToolbar) this.Q.findViewById(R.id.photo_picker_suggestion_tabs_toolbar);
        if (fdrm.q()) {
            this.al.w(G().getIntent().getIntExtra("photo_picker_suggestion_tabs_title_string", R.string.op3_change_profile_picture));
        }
        this.as = new dwck(this.e.b(this.al, this.d.a(92715)));
        this.al.t(new View.OnClickListener() { // from class: egqq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                egqz.this.b.l();
            }
        });
        dwck dwckVar = new dwck(this.as.a(Integer.valueOf(R.id.photo_picker_overflow_menu), this.d.a(89755)));
        this.an = dwckVar;
        dwckVar.a(Integer.valueOf(R.id.photo_picker_past_profile_photos_menu_item), this.d.a(89753));
        this.an.a(Integer.valueOf(R.id.photo_picker_help_menu_item), this.d.a(89747));
        this.an.a(Integer.valueOf(R.id.photo_picker_send_feedback_menu_item), this.d.a(89742));
        this.al.o(R.menu.photo_picker_common_menu);
        this.al.x = new zd() { // from class: egqs
            @Override // defpackage.zd
            public final boolean a(MenuItem menuItem) {
                egqz egqzVar = egqz.this;
                egqzVar.al.B();
                og ogVar = (og) menuItem;
                egqzVar.ag.b(dvxh.e(), egqzVar.an.b(Integer.valueOf(ogVar.a)));
                int i = ogVar.a;
                if (i == R.id.photo_picker_past_profile_photos_menu_item) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.valueOf(String.format("https://accounts.google.com/AccountChooser?Email=%s&continue=", egqzVar.ah.c())).concat(String.valueOf(Uri.encode("https://myaccount.google.com/profile-picture/past-photos?interop=standalone&opts=ppo")))));
                    if (!egqzVar.ai.a(intent)) {
                        return true;
                    }
                    egqzVar.aQ(intent);
                    return true;
                }
                if (i == R.id.photo_picker_help_menu_item) {
                    egqzVar.c.b(egqzVar.aj);
                    return false;
                }
                if (i != R.id.photo_picker_send_feedback_menu_item) {
                    return false;
                }
                egqzVar.c.a();
                return true;
            }
        };
        int i = 0;
        if (fdrm.q()) {
            this.al.h().findItem(R.id.photo_picker_past_profile_photos_menu_item).setVisible(false);
        } else {
            this.al.h().findItem(R.id.photo_picker_past_profile_photos_menu_item).setVisible(false);
        }
        egpx a = egpx.a(this.m.getString("SuggestionTabsFragmentMode"));
        this.ap = a;
        if (a == egpx.ONLY_SHOW_DEVICE_PHOTOS) {
            this.Q.findViewById(R.id.photo_picker_device_photos_grid).setPadding(0, 0, 0, 0);
            ((DevicePhotosFragment) I().g(R.id.photo_picker_suggestion_tabs_device_photos_only_fragment)).p();
            return;
        }
        ViewPager viewPager = (ViewPager) this.Q.findViewById(R.id.photo_picker_suggestion_tabs_pager);
        this.au = viewPager;
        viewPager.j(new egqy(this, I()));
        TabLayout tabLayout = (TabLayout) this.Q.findViewById(R.id.photo_picker_suggestion_tabs_tabs);
        this.am = tabLayout;
        tabLayout.u(this.au);
        if (fdrj.c()) {
            this.am.s(2);
        }
        ColorStateList colorStateList = this.am.l;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: egqo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                egqz.this.ao = true;
            }
        };
        for (egqf egqfVar : this.aq) {
            TabLayout tabLayout2 = this.am;
            final egqe e = egqfVar.e();
            ehrt d = tabLayout2.d(enjk.a(this.aq, new emxg() { // from class: egqt
                @Override // defpackage.emxg
                public final boolean a(Object obj) {
                    return ((egqf) obj).e() == egqe.this;
                }
            }));
            egqfVar.d().a(z(), d, colorStateList);
            this.e.b(d.i, this.d.a(egqfVar.b()));
            d.i.setOnClickListener(onClickListener);
        }
        this.am.f(new egqw(this));
        if (bundle == null) {
            int a2 = enjk.a(this.aq, new emxg() { // from class: egqp
                @Override // defpackage.emxg
                public final boolean a(Object obj) {
                    return ((egqf) obj).c() == egqz.this.ap;
                }
            });
            if (a2 == -1) {
                ((enrr) ((enrr) ar.j()).h("com/google/android/libraries/user/profile/photopicker/fragment/suggestiontabs/v2/SuggestionTabsV2Fragment", "onActivityCreated", 237, "SuggestionTabsV2Fragment.java")).t("attempted to start in mode %s, but the tab was missing.", this.ap);
            } else {
                i = a2;
            }
            TabLayout tabLayout3 = this.am;
            tabLayout3.m(tabLayout3.d(i));
        }
        this.at = new egqx(this);
    }

    @Override // defpackage.ea
    public final void am() {
        super.am();
        if (this.ap != egpx.ONLY_SHOW_DEVICE_PHOTOS) {
            this.au.i(this.at);
        }
    }

    @Override // defpackage.ea
    public final void ao() {
        super.ao();
        if (this.ap != egpx.ONLY_SHOW_DEVICE_PHOTOS) {
            this.au.d(this.at);
        }
    }

    @Override // defpackage.egqb, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.a) {
            return;
        }
        fazg.a(this);
    }
}
