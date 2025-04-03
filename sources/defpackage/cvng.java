package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvng implements cvmu {
    public final Context a;
    public final ffsk b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final fgcm g;
    public final String h;
    public final String i;
    public final List j;
    public dnem k;
    public String l;
    private final avak m;
    private final String n;
    private dnmk o;
    private abhz p;

    public cvng(Context context, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, avak avakVar) {
        context.getClass();
        ffskVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.a = context;
        this.b = ffskVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.m = avakVar;
        fgcm a = fgdm.a(null);
        this.g = a;
        String a2 = crmi.a(context);
        a2.getClass();
        this.n = a2;
        String string = context.getString(R.string.unsubscribe_bottomsheet_spam_2024_11_26);
        string.getClass();
        this.h = string;
        String string2 = context.getString(R.string.unsubscribe_bottomsheet_other_2024_11_26);
        string2.getClass();
        this.i = string2;
        this.j = ffdx.g(context.getString(R.string.unsubscribe_bottomsheet_unwanted_2024_11_26), context.getString(R.string.unsubscribe_bottomsheet_noisy_2024_11_26), context.getString(R.string.unsubscribe_bottomsheet_uninterested_2024_11_26), string, string2);
        String string3 = context.getString(R.string.report_spam_checkbox_title_2024_11_26);
        string3.getClass();
        this.k = new dnem(string3, null, null, false, false, null, null, 0, 254);
        String string4 = context.getString(R.string.other_reason_text_field_hint);
        string4.getClass();
        this.o = new dnmk(string4, "", new ffix() { // from class: cvmx
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, new ffji() { // from class: cvmy
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((String) obj).getClass();
                return ffcu.a;
            }
        }, new dnmj(avakVar.a()));
        this.l = "";
        String string5 = context.getString(R.string.unsubscribe_bottomsheet_title_2024_11_26);
        string5.getClass();
        ffel ffelVar = ffel.a;
        this.p = new abhz(string5, "", ffelVar, a, ffelVar, null, this.k, null, this.o, null, true, true, new ffix() { // from class: abhy
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        });
    }

    private final String e() {
        String string = this.a.getString(R.string.unsubscribe_bottomsheet_spam_2024_11_26);
        string.getClass();
        if (this.k.d) {
            Integer num = (Integer) this.g.c();
            int indexOf = this.j.indexOf(string);
            if (num != null && num.intValue() == indexOf) {
                String string2 = this.a.getString(R.string.unsubscribe_and_report_confirm_button_label);
                string2.getClass();
                return string2;
            }
        }
        String string3 = this.a.getString(R.string.unsubscribe_confirm_button_label);
        string3.getClass();
        return string3;
    }

    @Override // defpackage.cvmu
    public final abhz a(final ajiy ajiyVar, final ResolvedRecipient resolvedRecipient, final ConversationId conversationId, final cuea cueaVar) {
        String string;
        ajiyVar.getClass();
        resolvedRecipient.getClass();
        cueaVar.getClass();
        boolean z = false;
        String string2 = resolvedRecipient.D() ? this.a.getString(R.string.rbm_report_spam_checkbox_body_2024_11_26, this.n) : this.a.getString(R.string.xms_report_spam_checkbox_body_2024_11_26, this.n);
        string2.getClass();
        Object e = cudz.d.e();
        e.getClass();
        this.k = dnem.a(this.k, null, string2, ffdx.b(new dltp((String) e, ffpc.Q(string2, this.n, 0, false, 6), ffpc.Q(string2, this.n, 0, false, 6) + this.n.length(), new ffji() { // from class: cvmz
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                aigz aigzVar = (aigz) cvng.this.c.b();
                Object e2 = cudz.e.e();
                e2.getClass();
                aigzVar.h(new aikx((String) e2, null, 2));
                return true;
            }
        }, 24)), false, new ffix() { // from class: cvna
            @Override // defpackage.ffix
            public final Object invoke() {
                cvng.this.b(ajiyVar, !r0.k.d);
                return ffcu.a;
            }
        }, null, 217);
        this.o = dnmk.a(this.o, null, new ffix() { // from class: cvnc
            @Override // defpackage.ffix
            public final Object invoke() {
                cvng.this.c(ajiyVar, "", true);
                return ffcu.a;
            }
        }, new ffji() { // from class: cvnd
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                cvng.this.c(ajiyVar, str, true);
                return ffcu.a;
            }
        }, 51);
        abhz abhzVar = this.p;
        String string3 = this.a.getString(R.string.unsubscribe_bottomsheet_title_2024_11_26);
        string3.getClass();
        if (resolvedRecipient.D()) {
            string = this.a.getString(R.string.rbm_unsubscribe_bottomsheet_body_2024_11_26, this.n);
            string.getClass();
        } else {
            string = this.a.getString(R.string.xms_unsubscribe_bottomsheet_body_2024_11_26, this.n);
            string.getClass();
        }
        String str = string;
        String string4 = resolvedRecipient.D() ? this.a.getString(R.string.rbm_unsubscribe_bottomsheet_body_2024_11_26, this.n) : this.a.getString(R.string.xms_unsubscribe_bottomsheet_body_2024_11_26, this.n);
        string4.getClass();
        Object e2 = cudz.d.e();
        e2.getClass();
        List b = ffdx.b(new dltp((String) e2, ffpc.Q(string4, this.n, 0, false, 6), ffpc.Q(string4, this.n, 0, false, 6) + this.n.length(), new ffji() { // from class: cvmv
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                aigz aigzVar = (aigz) cvng.this.c.b();
                Object e3 = cudz.e.e();
                e3.getClass();
                aigzVar.h(new aikx((String) e3, null, 2));
                return true;
            }
        }, 24));
        List list = this.j;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        final int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                ffdx.l();
            }
            String str2 = (String) obj;
            str2.getClass();
            Integer num = (Integer) this.g.c();
            arrayList.add(new dnia(str2, null, (num != null && i == num.intValue()) ? true : z, new ffix() { // from class: cvne
                @Override // defpackage.ffix
                public final Object invoke() {
                    cvng cvngVar = cvng.this;
                    cvngVar.g.f(Integer.valueOf(i));
                    String string5 = cvngVar.a.getString(R.string.unsubscribe_bottomsheet_spam_2024_11_26);
                    string5.getClass();
                    boolean z2 = false;
                    if (((Boolean) cudz.i.e()).booleanValue()) {
                        Integer num2 = (Integer) cvngVar.g.c();
                        int indexOf = cvngVar.j.indexOf(string5);
                        if (num2 != null && num2.intValue() == indexOf) {
                            z2 = true;
                        }
                    }
                    cvngVar.b(ajiyVar, z2);
                    return ffcu.a;
                }
            }));
            i = i2;
            z = false;
        }
        this.p = abhz.d(abhzVar, string3, str, b, null, arrayList, Integer.valueOf(this.j.indexOf(this.h)), this.k, Integer.valueOf(this.j.indexOf(this.i)), this.o, new doas(e(), new ffix() { // from class: cvmw
            @Override // defpackage.ffix
            public final Object invoke() {
                String str3;
                cuex cuexVar;
                cvng cvngVar = cvng.this;
                int i3 = 2;
                ((cued) cvngVar.f.b()).c(2);
                Integer num2 = (Integer) cvngVar.g.c();
                if (num2 == null) {
                    str3 = null;
                } else {
                    Integer num3 = (Integer) cvngVar.g.c();
                    str3 = (num3 != null && num3.intValue() == cvngVar.j.indexOf(cvngVar.i)) ? cvngVar.l : (String) cvngVar.j.get(num2.intValue());
                }
                String str4 = str3;
                Integer num4 = (Integer) cvngVar.g.c();
                if (num4 == null) {
                    cuexVar = cuex.UNSUBSCRIBE_REASON_UNSPECIFIED;
                } else {
                    Object obj2 = cvngVar.j.get(num4.intValue());
                    obj2.getClass();
                    String str5 = (String) obj2;
                    cuexVar = ffkj.e(str5, cvngVar.a.getString(R.string.unsubscribe_bottomsheet_unwanted_2024_11_26)) ? cuex.NOT_SIGNED_UP : ffkj.e(str5, cvngVar.a.getString(R.string.unsubscribe_bottomsheet_noisy_2024_11_26)) ? cuex.TOO_MANY_MESSAGES : ffkj.e(str5, cvngVar.a.getString(R.string.unsubscribe_bottomsheet_uninterested_2024_11_26)) ? cuex.NO_INTEREST : ffkj.e(str5, cvngVar.a.getString(R.string.unsubscribe_bottomsheet_spam_2024_11_26)) ? cuex.SPAM : ffkj.e(str5, cvngVar.a.getString(R.string.unsubscribe_bottomsheet_other_2024_11_26)) ? cuex.OTHER : cuex.UNSUBSCRIBE_REASON_UNSPECIFIED;
                }
                cuex cuexVar2 = cuexVar;
                boolean z2 = false;
                if (cvngVar.k.d) {
                    Integer num5 = (Integer) cvngVar.g.c();
                    int indexOf = cvngVar.j.indexOf(cvngVar.h);
                    if (num5 != null && num5.intValue() == indexOf) {
                        z2 = true;
                    }
                }
                cued cuedVar = (cued) cvngVar.f.b();
                cuexVar2.getClass();
                int ordinal = cuexVar2.ordinal();
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        i3 = 3;
                    } else if (ordinal == 3) {
                        i3 = 4;
                    } else if (ordinal == 4) {
                        i3 = 5;
                    } else if (ordinal == 5) {
                        i3 = 6;
                    }
                }
                cuedVar.b("Bugle.Spam.ChatbotUnsubscribe.Reason.Counts", i3);
                if (z2) {
                    ((cued) cvngVar.f.b()).c(3);
                }
                ajiy ajiyVar2 = ajiyVar;
                axol.m(cvngVar.b, new cvnf(cvngVar, conversationId, cuexVar2, str4, z2, cueaVar, resolvedRecipient, null));
                ajiyVar2.a();
                return ffcu.a;
            }
        }), false, false, new ffix() { // from class: cvnb
            @Override // defpackage.ffix
            public final Object invoke() {
                cvng cvngVar = cvng.this;
                ((cued) cvngVar.f.b()).c(4);
                ajiy ajiyVar2 = ajiyVar;
                ajiyVar2.a();
                cvngVar.c(ajiyVar2, "", false);
                cvngVar.g.f(null);
                return ffcu.a;
            }
        }, 7176);
        ((cued) this.f.b()).c(1);
        return this.p;
    }

    public final void b(ajiy ajiyVar, boolean z) {
        this.k = dnem.a(this.k, null, null, null, z, null, null, 247);
        abhz abhzVar = this.p;
        doas doasVar = abhzVar.j;
        abhz d = abhz.d(abhzVar, null, null, null, null, null, null, this.k, null, null, doasVar != null ? doas.a(doasVar, e(), null, 6) : null, false, false, null, 15807);
        this.p = d;
        ajiyVar.b(d);
    }

    public final void c(ajiy ajiyVar, String str, boolean z) {
        this.l = str;
        dnmk a = dnmk.a(this.o, str, null, null, 61);
        this.o = a;
        abhz d = abhz.d(this.p, null, null, null, null, null, null, null, null, a, null, false, false, null, 16127);
        this.p = d;
        if (z) {
            ajiyVar.b(d);
        }
    }
}
