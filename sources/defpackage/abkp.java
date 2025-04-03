package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.SpamSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.protectionandsafety.ProtectionSafetySettingsActivity;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abkp implements abke {
    public final Context a;
    public final aigz b;
    public final ffsk c;
    public final abkc d;

    public abkp(Context context, abkc abkcVar, aigz aigzVar, ffsk ffskVar) {
        context.getClass();
        aigzVar.getClass();
        ffskVar.getClass();
        this.a = context;
        this.d = abkcVar;
        this.b = aigzVar;
        this.c = ffskVar;
    }

    private final List e(String str, String str2) {
        int Q = ffpc.Q(str, str2, 0, false, 6);
        return ffdx.b(new dlto(dlus.h, Q, Q + str2.length(), str2, new ffji() { // from class: abkg
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Class<?> cls;
                Intent intent = new Intent();
                abkp abkpVar = abkp.this;
                abkc abkcVar = abkpVar.d;
                if (((Optional) abkcVar.a.b()).isPresent()) {
                    cls = ProtectionSafetySettingsActivity.class;
                } else {
                    cls = SpamSettingsActivity.class;
                }
                Intent addFlags = intent.setClass(abkpVar.a, cls).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                addFlags.getClass();
                eldl.p(abkpVar.a, addFlags);
                return true;
            }
        }));
    }

    private final List f(String str, String str2) {
        int Q = ffpc.Q(str, str2, 0, false, 6);
        return ffdx.b(new dlto(dlus.h, Q, Q + str2.length(), str2, new ffji() { // from class: abkj
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                final abkp abkpVar = abkp.this;
                abkpVar.b.h(new aikw(new appw() { // from class: abkf
                    @Override // defpackage.appw
                    public final /* synthetic */ engw a() {
                        int i = engw.d;
                        return enou.a;
                    }

                    @Override // defpackage.appw, defpackage.appj
                    public final /* synthetic */ String b() {
                        return "text/plain";
                    }

                    @Override // defpackage.appw
                    public final String c() {
                        return abkp.this.a.getString(R.string.spatula_trust_flow_message_content_v2);
                    }
                }));
                return true;
            }
        }));
    }

    private final void g(List list, final abkd abkdVar) {
        if (abkdVar.c) {
            return;
        }
        String string = this.a.getString(R.string.spatula_screen_help_content_blocking);
        string.getClass();
        list.add(new dnlz(string, null, null, null, null, null, new dnlf(dmzz.ah), new ffix() { // from class: abkn
            @Override // defpackage.ffix
            public final Object invoke() {
                abkd.this.a.invoke();
                abkp abkpVar = this;
                axol.k(abkpVar.c, null, new abko(abkpVar, null), 3);
                return ffcu.a;
            }
        }, 62));
    }

    @Override // defpackage.abke
    public final abks a(ffix ffixVar, ffix ffixVar2) {
        String string = this.a.getString(R.string.spatula_screen_settings_link);
        string.getClass();
        String string2 = this.a.getString(R.string.spatula_screen_forwarding_subtitle, string);
        string2.getClass();
        String string3 = this.a.getString(R.string.spatula_screen_receiving_infolist_text3_trust_flow_link);
        string3.getClass();
        String string4 = this.a.getString(R.string.spatula_screen_forwarding_infolist_text3, string3);
        string4.getClass();
        Context context = this.a;
        dmzz dmzzVar = dmzz.F;
        String string5 = context.getString(R.string.spatula_screen_forwarding_headline);
        string5.getClass();
        List e = e(string2, string);
        String string6 = this.a.getString(R.string.spatula_screen_forwarding_intro);
        string6.getClass();
        String string7 = this.a.getString(R.string.spatula_screen_forwarding_infolist_text1);
        string7.getClass();
        String string8 = this.a.getString(R.string.spatula_screen_forwarding_infolist_text2);
        string8.getClass();
        List g = ffdx.g(new dnhh(string7, dmzz.dq, (List) null, false, 28), new dnhh(string8, dmzz.C, (List) null, false, 28), new dnhh(string4, dmzz.eA, f(string4, string3), false, 20));
        String string9 = this.a.getString(R.string.spatula_screen_help_content_sharing);
        string9.getClass();
        return new abks(dmzzVar, string5, string2, e, string6, g, ffdx.b(new dnlz(string9, null, null, null, null, null, new dnlf(dmzz.ah), new ffix() { // from class: abkk
            @Override // defpackage.ffix
            public final Object invoke() {
                abkp.this.d();
                return ffcu.a;
            }
        }, 62)), ffixVar, ffixVar2, null);
    }

    @Override // defpackage.abke
    public final abks b(abkd abkdVar) {
        String string = this.a.getString(R.string.spatula_screen_settings_link);
        string.getClass();
        String string2 = this.a.getString(R.string.spatula_screen_receiving_subtitle, string);
        string2.getClass();
        String string3 = this.a.getString(R.string.spatula_screen_receiving_infolist_text3_trust_flow_link);
        string3.getClass();
        String string4 = this.a.getString(R.string.spatula_screen_receiving_infolist_text3, string3);
        string4.getClass();
        Context context = this.a;
        dmzz dmzzVar = dmzz.F;
        String string5 = context.getString(R.string.spatula_screen_receiving_headline);
        string5.getClass();
        List e = e(string2, string);
        String string6 = this.a.getString(R.string.spatula_screen_intro);
        string6.getClass();
        String string7 = this.a.getString(R.string.spatula_screen_receiving_infolist_text1);
        string7.getClass();
        String string8 = this.a.getString(R.string.spatula_screen_receiving_infolist_text2);
        string8.getClass();
        List g = ffdx.g(new dnhh(string7, dmzz.dq, (List) null, false, 28), new dnhh(string8, dmzz.C, (List) null, false, 28), new dnhh(string4, dmzz.eA, f(string4, string3), false, 20));
        fffs fffsVar = new fffs((byte[]) null);
        String string9 = this.a.getString(R.string.spatula_screen_help_content_sharing);
        string9.getClass();
        fffsVar.add(new dnlz(string9, null, null, null, null, null, new dnlf(dmzz.ah), new ffix() { // from class: abkh
            @Override // defpackage.ffix
            public final Object invoke() {
                abkp.this.d();
                return ffcu.a;
            }
        }, 62));
        g(fffsVar, abkdVar);
        List a = ffdx.a(fffsVar);
        String string10 = this.a.getString(R.string.spatula_screen_receiving_bottomsheet_title);
        string10.getClass();
        String string11 = this.a.getString(R.string.spatula_screen_receiving_bottomsheet_body);
        string11.getClass();
        abkq abkqVar = new abkq(string10, string11, new ffix() { // from class: abki
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        });
        Context context2 = this.a;
        dmzz dmzzVar2 = dmzz.cQ;
        String string12 = context2.getString(R.string.spatula_screen_receiving_bottomsheet_continue_button_text);
        string12.getClass();
        String string13 = this.a.getString(R.string.spatula_screen_receiving_bottomsheet_back_button_text);
        ffix ffixVar = abkdVar.b;
        ffix ffixVar2 = abkdVar.a;
        string13.getClass();
        return new abks(dmzzVar, string5, string2, e, string6, g, a, ffixVar2, ffixVar, new abkr(abkqVar, dmzzVar2, string12, string13, abkdVar.a, abkdVar.b));
    }

    @Override // defpackage.abke
    public final abks c(abkd abkdVar) {
        String string = this.a.getString(R.string.spatula_screen_settings_link);
        string.getClass();
        String string2 = this.a.getString(R.string.spatula_screen_sending_subtitle, string);
        string2.getClass();
        String string3 = this.a.getString(R.string.spatula_screen_receiving_infolist_text3_trust_flow_link);
        string3.getClass();
        String string4 = this.a.getString(R.string.spatula_screen_sending_infolist_text3, string3);
        string4.getClass();
        Context context = this.a;
        dmzz dmzzVar = dmzz.F;
        String string5 = context.getString(R.string.spatula_screen_sending_headline);
        string5.getClass();
        List e = e(string2, string);
        String string6 = this.a.getString(R.string.spatula_screen_intro);
        string6.getClass();
        String string7 = this.a.getString(R.string.spatula_screen_sending_infolist_text1);
        string7.getClass();
        String string8 = this.a.getString(R.string.spatula_screen_sending_infolist_text2);
        string8.getClass();
        List g = ffdx.g(new dnhh(string7, dmzz.dq, (List) null, false, 28), new dnhh(string8, dmzz.C, (List) null, false, 28), new dnhh(string4, dmzz.eA, f(string4, string3), false, 20));
        fffs fffsVar = new fffs((byte[]) null);
        String string9 = this.a.getString(R.string.spatula_screen_help_content_sharing);
        string9.getClass();
        fffsVar.add(new dnlz(string9, null, null, null, null, null, new dnlf(dmzz.ah), new ffix() { // from class: abkl
            @Override // defpackage.ffix
            public final Object invoke() {
                abkp.this.d();
                return ffcu.a;
            }
        }, 62));
        g(fffsVar, abkdVar);
        List a = ffdx.a(fffsVar);
        String string10 = this.a.getString(R.string.spatula_screen_sending_bottomsheet_title);
        string10.getClass();
        String string11 = this.a.getString(R.string.spatula_screen_sending_bottomsheet_body);
        string11.getClass();
        abkq abkqVar = new abkq(string10, string11, new ffix() { // from class: abkm
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        });
        Context context2 = this.a;
        dmzz dmzzVar2 = dmzz.dm;
        String string12 = context2.getString(R.string.spatula_screen_sending_bottomsheet_continue_button_text);
        string12.getClass();
        String string13 = this.a.getString(R.string.spatula_screen_sending_bottomsheet_back_button_text);
        ffix ffixVar = abkdVar.b;
        ffix ffixVar2 = abkdVar.a;
        string13.getClass();
        return new abks(dmzzVar, string5, string2, e, string6, g, a, ffixVar2, ffixVar, new abkr(abkqVar, dmzzVar2, string12, string13, abkdVar.a, abkdVar.b));
    }

    public final void d() {
        Uri parse = Uri.parse("https://support.google.com/families?p=gff_help_find");
        parse.getClass();
        this.b.h(new aile(parse));
    }
}
