package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxze extends cxzf implements cxyg, cxzg {
    public static final entd a = entd.c("BugleBanners");
    public final cxyt e;
    public final Map f;
    public final cxzh g;
    public final ffbr h;
    public final cxyw i;
    public ConversationIdType j;
    public ViewGroup k;
    public cxyq o;
    public cxyl p;
    private final Map r;
    public final HashMap b = new LinkedHashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public int l = 0;
    public boolean m = false;
    public boolean n = false;

    /* compiled from: PG */
    public final class a implements ellf {
    }

    /* compiled from: PG */
    public abstract class b implements ellf {
        public abstract int a();

        public abstract int b();
    }

    /* compiled from: PG */
    public final class c implements ellf {
    }

    /* compiled from: PG */
    public final class d implements ellf {
    }

    public cxze(cxyt cxytVar, Map map, cxzh cxzhVar, Map map2, ffbr ffbrVar, cxyx cxyxVar) {
        this.j = bdgq.a;
        this.e = cxytVar;
        this.r = map2;
        cxyw b2 = cxyw.b(cxyxVar.d);
        this.i = b2 == null ? cxyw.UNKNOWN : b2;
        this.f = map;
        this.g = cxzhVar;
        this.h = ffbrVar;
        this.j = bdgq.b(cxyxVar.c);
    }

    public static String c(cxyl cxylVar) {
        return cxylVar != null ? ((cxxy) cxylVar.d()).a : "UnknownBannerKey";
    }

    private final boolean i(cxyl cxylVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            if (entry.getKey() != cxylVar) {
                cxyi a2 = ((cxyk) entry.getValue()).a();
                if (((cxyk) entry.getValue()).c() && !((cxxz) a2).d) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cxyg
    public final void a(cxyl cxylVar, boolean z) {
        entd entdVar = a;
        ensz enszVar = (ensz) entdVar.h();
        enszVar.Y(cxyo.a, c(cxylVar));
        ensn ensnVar = cxyo.b;
        Boolean valueOf = Boolean.valueOf(z);
        enszVar.Y(ensnVar, valueOf);
        ((ensz) enszVar.h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer", "setEligibility", 304, "BannersFragmentPeer.java")).q("Banner eligibility set");
        if (!this.b.containsKey(cxylVar)) {
            this.c.put(cxylVar, valueOf);
            return;
        }
        cxyk cxykVar = (cxyk) this.b.get(cxylVar);
        cxykVar.getClass();
        int i = true != z ? 3 : 2;
        cxyj b2 = cxykVar.b();
        ((cxya) b2).b = i;
        this.b.put(cxylVar, b2.a());
        if (this.n) {
            ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer", "setEligibility", 320, "BannersFragmentPeer.java")).q("Banner animation in progress, won't attempt banner show/dismiss");
        } else if (h(cxylVar)) {
            d();
        } else {
            f();
        }
    }

    public final cxyn b() {
        cxyn cxynVar = (cxyn) this.r.get(this.i);
        cxynVar.getClass();
        return cxynVar;
    }

    public final void d() {
        this.n = true;
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer", "dismissCurrentBanner", 460, "BannersFragmentPeer.java")).t("Dismissing current banner: %s", c(this.p));
        cxyq cxyqVar = this.o;
        cxyqVar.getClass();
        cxyqVar.c(new cxzd(this), b().a());
    }

    @Override // defpackage.cxzg
    public final void e(int i) {
        this.l = i;
        if (this.k != null) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer", "onSetTopPadding", 169, "BannersFragmentPeer.java")).r("Setting banners padding: %d", this.l);
            ViewGroup viewGroup = this.k;
            viewGroup.setPadding(viewGroup.getPaddingLeft(), this.l, this.k.getPaddingRight(), this.k.getPaddingBottom());
        }
    }

    public final void f() {
        if (g()) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer", "selectBannerToShow", 395, "BannersFragmentPeer.java")).t("Banner %s is currently showing, can't show another banner", c(this.p));
            return;
        }
        for (Map.Entry entry : this.b.entrySet()) {
            cxyk cxykVar = (cxyk) entry.getValue();
            int d2 = cxykVar.d();
            cxyi a2 = cxykVar.a();
            String c2 = c((cxyl) entry.getKey());
            if (d2 == 1) {
                return;
            }
            boolean z = false;
            boolean z2 = i((cxyl) entry.getKey()) && !((cxxz) a2).c;
            if (cxykVar.c() && !((cxxz) a2).b) {
                z = true;
            }
            if (d2 != 3 && !z2 && !z) {
                cxyl cxylVar = (cxyl) entry.getKey();
                this.p = cxylVar;
                cxyk cxykVar2 = (cxyk) this.b.get(cxylVar);
                cxykVar2.getClass();
                cxyj b2 = cxykVar2.b();
                b2.b(true);
                cxyk a3 = b2.a();
                HashMap hashMap = this.b;
                cxyl cxylVar2 = this.p;
                cxylVar2.getClass();
                hashMap.put(cxylVar2, a3);
                cxyq e = ((cxyl) entry.getKey()).e();
                this.o = e;
                e.a(this.k);
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer", "selectBannerToShow", 428, "BannersFragmentPeer.java")).t("Showing banner: %s", c(this.p));
                this.k.getViewTreeObserver().addOnGlobalLayoutListener(new cxzc(this, entry));
                return;
            }
            if (d2 == 2) {
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer", "selectBannerToShow", 414, "BannersFragmentPeer.java")).J("Banner %s is eligible, but wont show (dontShowAfterAnotherBanner=%b, dontShowAgain=%b)", c2, Boolean.valueOf(z2), Boolean.valueOf(z));
            }
        }
    }

    public final boolean g() {
        return (this.p == null || this.o == null) ? false : true;
    }

    public final boolean h(cxyl cxylVar) {
        if (this.p != null && this.b.containsKey(cxylVar)) {
            String c2 = c(cxylVar);
            cxyk cxykVar = (cxyk) this.b.get(cxylVar);
            if (cxykVar == null) {
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer", "shouldDismissBanner", 339, "BannersFragmentPeer.java")).t("ShouldDismissBanner: No selection params found for banner %s", c2);
                return false;
            }
            cxyl cxylVar2 = this.p;
            if (cxylVar2 == cxylVar && g()) {
                if (cxykVar.d() != 3) {
                    return false;
                }
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer", "shouldDismissBanner", 347, "BannersFragmentPeer.java")).t("ShouldDismissBanner: banner %s going from eligible to ineligible", c2);
                return true;
            }
            if (cxykVar.d() != 2) {
                return false;
            }
            cxyi a2 = cxykVar.a();
            cxyk cxykVar2 = (cxyk) this.b.get(cxylVar2);
            cxykVar2.getClass();
            cxxz cxxzVar = (cxxz) a2;
            boolean z = cxxzVar.a < ((cxxz) cxykVar2.a()).a;
            boolean z2 = cxxzVar.c || !i(cxylVar);
            boolean z3 = cxxzVar.b || !cxykVar.c();
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer", "shouldDismissBanner", 372, "BannersFragmentPeer.java")).K("ShouldDismissBanner: banner %s, higherPriorityThanCurrent=%b, canShowAfterCurrentBanner=%b, canShowAgain=%b", c2, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
            if (z && z2 && z3) {
                return true;
            }
        }
        return false;
    }
}
