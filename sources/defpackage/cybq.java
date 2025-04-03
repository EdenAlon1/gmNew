package defpackage;

import android.content.Context;
import android.text.SpannableString;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cybq extends ffju implements ffjm {
    public cybq(Object obj) {
        super(2, obj, cybu.class, "loadContent", "loadContent(Lcom/google/android/apps/messaging/ui/conversation/banners2o/addcontact/dataservice2/AddContactBanner2LoadedData;)Lcom/google/android/apps/messaging/banner/api/FullBannerContent;", 4);
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        String string;
        String string2;
        String str;
        cycx cycxVar = (cycx) obj;
        final cybu cybuVar = (cybu) this.b;
        final ResolvedRecipient resolvedRecipient = cycxVar.a;
        if (resolvedRecipient == null || !cycxVar.b) {
            return null;
        }
        boolean z = aewg.j() && !cycxVar.c;
        cybuVar.h = z;
        if (z) {
            String string3 = cybuVar.a.getString(R.string.report_spam_banner_title, cybuVar.f.a(resolvedRecipient.g()));
            String string4 = cybuVar.a.getString(R.string.report_spam_banner_body);
            ssi ssiVar = new ssi(dmzz.cL);
            String string5 = cybuVar.a.getResources().getString(R.string.report_spam_banner_dismiss_button);
            string5.getClass();
            ssc sscVar = new ssc(string5, new ffix() { // from class: cybi
                @Override // defpackage.ffix
                public final Object invoke() {
                    cybu.this.c();
                    return ffcu.a;
                }
            });
            String string6 = cybuVar.a.getString(R.string.report_spam_banner_spam_button);
            string6.getClass();
            return new ssg("report_spam", string3, string4, ssiVar, sscVar, new ssc(string6, new ffix() { // from class: cybj
                @Override // defpackage.ffix
                public final Object invoke() {
                    cybu cybuVar2 = cybu.this;
                    cybuVar2.e(resolvedRecipient, cybuVar2.c);
                    return ffcu.a;
                }
            }), new ffix() { // from class: cybk
                @Override // defpackage.ffix
                public final Object invoke() {
                    cybu.this.d();
                    return ffcu.a;
                }
            }, new ffix() { // from class: cybl
                @Override // defpackage.ffix
                public final Object invoke() {
                    cybu.this.c();
                    return ffcu.a;
                }
            }, 320);
        }
        aqkh j = resolvedRecipient.j();
        if (cybu.f(j)) {
            Context context = cybuVar.a;
            SpannableString a = cybuVar.f.a(resolvedRecipient.g());
            if (aswb.a()) {
                j.getClass();
                String str2 = ((cjvk) j).g.e;
                str2.getClass();
                str = cuxh.a(str2);
            } else {
                j.getClass();
                str = ((cjvk) j).g.e;
                str.getClass();
            }
            string = context.getString(R.string.add_contact_banner_title_with_name, a, str);
            string.getClass();
        } else {
            string = cybuVar.a.getString(R.string.add_contact_banner_title_v2, cybuVar.f.a(resolvedRecipient.g()));
            string.getClass();
        }
        String str3 = string;
        if (cybu.f(j)) {
            string2 = cybuVar.a.getString(R.string.add_contact_banner_body_profile_disclosure);
            string2.getClass();
        } else {
            string2 = cybuVar.a.getString(R.string.add_contact_banner_body_v2);
            string2.getClass();
        }
        String str4 = string2;
        ssi ssiVar2 = new ssi(dmzz.cL);
        String string7 = cybuVar.a.getResources().getString(R.string.add_contact_banner_add_button);
        string7.getClass();
        ssc sscVar2 = new ssc(string7, new ffix() { // from class: cybm
            @Override // defpackage.ffix
            public final Object invoke() {
                ResolvedRecipient resolvedRecipient2 = resolvedRecipient;
                cybu cybuVar2 = cybu.this;
                axol.k(cybuVar2.b, null, new cybr(resolvedRecipient2, cybuVar2, null), 3);
                if (!((Boolean) cybw.b.e()).booleanValue()) {
                    ((altk) cybuVar2.g.b()).aw(4);
                }
                cybuVar2.i.a("add_contact", ssn.b);
                return ffcu.a;
            }
        });
        String string8 = cybuVar.a.getString(R.string.add_contact_banner_spam_button);
        string8.getClass();
        return new ssg("add_contact", str3, str4, ssiVar2, sscVar2, new ssc(string8, new ffix() { // from class: cybn
            @Override // defpackage.ffix
            public final Object invoke() {
                cybu cybuVar2 = cybu.this;
                cybuVar2.e(resolvedRecipient, cybuVar2.c);
                return ffcu.a;
            }
        }), new ffix() { // from class: cybo
            @Override // defpackage.ffix
            public final Object invoke() {
                cybu.this.d();
                return ffcu.a;
            }
        }, new ffix() { // from class: cybp
            @Override // defpackage.ffix
            public final Object invoke() {
                cybu.this.c();
                return ffcu.a;
            }
        }, 320);
    }
}
