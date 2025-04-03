package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adtk implements adtc {
    public static final cskc a = cskc.g("Bugle", "HelpAndFeedbackIntentsImpl");
    public final Context b;
    public final ctbe c;
    public final cgag d;
    private final crjx e;
    private final ejar f;

    public adtk(Context context, ctbe ctbeVar, cgag cgagVar, crjx crjxVar, ejar ejarVar) {
        this.b = context;
        this.c = ctbeVar;
        this.e = crjxVar;
        this.f = ejarVar;
        this.d = cgagVar;
    }

    public static Intent k(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    public static Bitmap l(Context context) {
        Activity g = ddzb.g(context);
        if (g == null) {
            return null;
        }
        return dgho.a(g);
    }

    private final FeedbackOptions m(Context context, String str, String str2) {
        Bitmap l = l(context);
        dghp n = n(context, str2);
        n.d(this.d, false);
        if (l != null) {
            n.a = l;
        }
        if (str != null) {
            n.d = str;
        } else {
            String str3 = (String) cful.m.e();
            if (!TextUtils.isEmpty(str3)) {
                n.d = str3;
            }
        }
        a.p("Sending feedback...");
        return n.a();
    }

    private static final dghp n(Context context, String str) {
        dghp dghpVar = new dghp(context);
        dght dghtVar = new dght();
        dghtVar.b();
        dghpVar.f = dghtVar.a();
        if (str != null) {
            dghpVar.c = str;
        }
        return dghpVar;
    }

    @Override // defpackage.adtc
    public final dhre a(adtb adtbVar) {
        adsy adsyVar = (adsy) adtbVar;
        List list = (List) Collection.EL.stream(adsyVar.a).map(new Function() { // from class: adtd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((adtw) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: adte
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((elfl) obj);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: adtf
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
        HashMap hashMap = new HashMap();
        hashMap.put("share_with_partner_consent", adsyVar.b.a());
        list.add(elfo.e(hashMap));
        list.add(elfo.e(adsyVar.d));
        enhd enhdVar = new enhd();
        enhdVar.g((Map) Collection.EL.stream(adsyVar.a).collect(endq.a(new Function() { // from class: adtg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((adtw) obj).h();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: adth
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                adtw adtwVar = (adtw) obj;
                cskc cskcVar = adtk.a;
                return adtwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })));
        enhdVar.k("CONSENT", adsyVar.b);
        enhdVar.k("EXTRA", new cgas(adsyVar.d));
        this.d.c(enhdVar.c());
        final dghp n = n(this.b, null);
        n.d(this.d, false);
        adsyVar.e.ifPresent(new Consumer() { // from class: adti
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                dghp dghpVar = n;
                dghpVar.c = adtk.this.b.getString(R.string.report_issue_description);
                dghpVar.e((String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Bitmap bitmap = adsyVar.c;
        if (bitmap != null) {
            n.a = bitmap;
        }
        a.p("Sending feedback...");
        return adsz.b(this.b, n.a());
    }

    @Override // defpackage.adtc
    public final dhre b(Context context, String str, String str2) {
        return adsz.b(context, m(context, str, str2));
    }

    @Override // defpackage.adtc
    public final elfl c(Context context, String str, eisx eisxVar) {
        return d(context, str, eisxVar, null);
    }

    @Override // defpackage.adtc
    public final elfl d(final Context context, final String str, eisx eisxVar, final cfzm cfzmVar) {
        return elfl.g(this.f.b(eisxVar)).i(new eroh() { // from class: adtj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                String str2 = (String) obj;
                if (ActivityManager.isUserAMonkey()) {
                    return elfo.e(null);
                }
                String str3 = str;
                Context context2 = context;
                adtk adtkVar = adtk.this;
                Uri parse = Uri.parse("https://support.google.com/nexus/topic/6089061/?hl=%locale%");
                Intent k = adtk.k(adtkVar.c.a());
                Intent k2 = adtk.k(adtkVar.c.b());
                Intent intent = new Intent(context2, (Class<?>) LicenseMenuActivity.class);
                Resources resources = context2.getResources();
                ThemeSettings themeSettings = new ThemeSettings();
                themeSettings.a = adtkVar.j();
                GoogleHelp googleHelp = new GoogleHelp(str3);
                googleHelp.q = parse;
                googleHelp.b(0, resources.getString(R.string.menu_privacy_policy), k);
                googleHelp.b(1, resources.getString(R.string.menu_terms_of_service), k2);
                googleHelp.b(2, resources.getString(R.string.menu_license), intent);
                googleHelp.s = themeSettings;
                dghp dghpVar = new dghp(context2);
                dght dghtVar = new dght();
                dghtVar.b();
                dghpVar.f = dghtVar.a();
                Bitmap l = adtk.l(context2);
                if (l != null) {
                    dghpVar.a = l;
                }
                if (str2 != null) {
                    dghpVar.b = str2;
                }
                cfzm cfzmVar2 = cfzmVar;
                if (cfzmVar2 != null) {
                    adtkVar.d.c(enhk.l("ConversationPsd", cfzmVar2));
                }
                dghpVar.d(adtkVar.d, true);
                googleHelp.c(dghpVar.a(), context2.getCacheDir());
                Intent a2 = googleHelp.a();
                Activity g = ddzb.g(context2);
                if (g == null) {
                    adtk.a.r("Supplied context was not an Activity, cannot launch help");
                    return elfo.e(null);
                }
                adsz.a(g, a2);
                return elfo.e(null);
            }
        }, erpp.a);
    }

    @Override // defpackage.adtc
    public final void e(Context context, String str) {
        if (ActivityManager.isUserAMonkey()) {
            return;
        }
        context.getClass();
        ctbe ctbeVar = this.c;
        Uri parse = Uri.parse("https://support.google.com/nexus/topic/6089061/?hl=%locale%");
        Intent k = k(ctbeVar.a());
        Intent k2 = k(this.c.b());
        Intent intent = new Intent(context, (Class<?>) LicenseMenuActivity.class);
        Resources resources = context.getResources();
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = j();
        GoogleHelp googleHelp = new GoogleHelp(str);
        googleHelp.q = parse;
        googleHelp.b(0, resources.getString(R.string.menu_privacy_policy), k);
        googleHelp.b(1, resources.getString(R.string.menu_terms_of_service), k2);
        googleHelp.b(2, resources.getString(R.string.menu_license), intent);
        googleHelp.s = themeSettings;
        dghp dghpVar = new dghp(context);
        dght dghtVar = new dght();
        dghtVar.b();
        dghpVar.f = dghtVar.a();
        Bitmap l = l(context);
        if (l != null) {
            dghpVar.a = l;
        }
        dghpVar.d(this.d, true);
        googleHelp.c(dghpVar.a(), context.getCacheDir());
        Intent a2 = googleHelp.a();
        Activity g = ddzb.g(context);
        if (g == null) {
            a.r("Supplied context was not an Activity, cannot launch help");
        } else {
            adsz.a(g, a2);
        }
    }

    @Override // defpackage.adtc
    public final void f(Activity activity, String str) {
        String str2 = (String) ctjd.x.e();
        if (ActivityManager.isUserAMonkey()) {
            return;
        }
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = j();
        FeedbackOptions m = m(activity, null, null);
        GoogleHelp googleHelp = new GoogleHelp(str);
        googleHelp.q = Uri.parse(str2);
        googleHelp.s = themeSettings;
        googleHelp.c(m, activity.getCacheDir());
        adsz.a(activity, googleHelp.a());
    }

    @Override // defpackage.adtc
    public final void g(Context context) {
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = j();
        dghp dghpVar = new dghp(context);
        dghpVar.e = themeSettings;
        dghpVar.d(this.d, false);
        Activity g = ddzb.g(context);
        Bitmap a2 = g == null ? null : dgho.a(g);
        if (a2 != null) {
            dghpVar.a = a2;
        }
        adsz.b(context, dghpVar.a());
    }

    @Override // defpackage.adtc
    public final void h(Activity activity) {
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = j();
        GoogleHelp googleHelp = new GoogleHelp("rcs_chat");
        googleHelp.s = themeSettings;
        InProductHelp inProductHelp = new InProductHelp(googleHelp, null, null, 0, null, 0, null);
        inProductHelp.c = "https://support.google.com/messages?p=rcs_chats_faq";
        new dgno(activity).d(inProductHelp);
    }

    @Override // defpackage.adtc
    public final dhre i(Context context, boolean z) {
        Bitmap l = l(context);
        dghp dghpVar = new dghp(context);
        if (z) {
            enhd enhdVar = new enhd();
            enhdVar.k("gemini_feedback", "true");
            enhk c = enhdVar.c();
            enhd enhdVar2 = new enhd();
            enhdVar2.k("gemini_feedback", new cgas(c));
            this.d.c(enhdVar2.c());
            dghpVar.d(this.d, true);
        }
        if (l != null) {
            dghpVar.a = l;
        }
        dghpVar.d = "com.google.android.apps.messaging.GENAI_FEATURES";
        dghpVar.g = "magic_compose";
        a.p("Sending feedback...");
        return adsz.b(context, dghpVar.a());
    }

    final int j() {
        int a2 = this.e.a();
        if (a2 != 1) {
            return a2 != 2 ? 3 : 2;
        }
        return 0;
    }
}
