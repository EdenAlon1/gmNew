package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cwcd extends ffju implements ffjp {
    public cwcd(Object obj) {
        super(5, obj, cwcg.class, "transformToDialogUiData", "transformToDialogUiData(ZZLcom/google/android/apps/messaging/startchat/rcs/RcsGroupChatCapabilityCollector$GroupLimitExcludingSelf;Lcom/google/android/apps/messaging/startchat/rcs/RcsGroupChatCapabilityCollector$CombinedChipData;)Lcom/google/android/libraries/communications/ux/components/dialog/DialogUiData$Alert;", 4);
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        cwbw cwbwVar = (cwbw) obj3;
        cwbv cwbvVar = (cwbv) obj4;
        final cwcg cwcgVar = (cwcg) this.b;
        if (booleanValue && cwbwVar.a < cwbvVar.c.size()) {
            return cwcgVar.c((ChipData) ffdx.P(cwbvVar.c), cwbwVar.a);
        }
        if (!booleanValue && cwbwVar.b < cwbvVar.c.size()) {
            return cwcgVar.c((ChipData) ffdx.P(cwbvVar.c), cwbwVar.b);
        }
        if (!booleanValue && !cwbvVar.a.isEmpty()) {
            if (cwbvVar.a.size() > 1) {
                csjb e = cwcg.a.e();
                e.I("More than 1 non-Rcs contact were detected");
                e.r();
            }
            final ChipData chipData = (ChipData) cwbvVar.a.get(0);
            String string = cwcgVar.c.getString(R.string.create_new_group_message_v2);
            string.getClass();
            return cwcgVar.b(string, ffel.a, new ffix() { // from class: cwbo
                @Override // defpackage.ffix
                public final Object invoke() {
                    cwcg.this.k.f(true);
                    return ffcu.a;
                }
            }, new ffix() { // from class: cwbp
                @Override // defpackage.ffix
                public final Object invoke() {
                    cwcg.this.d.c(chipData);
                    return ffcu.a;
                }
            });
        }
        if (booleanValue2 || cwbvVar.b.isEmpty() || !cwbvVar.a.isEmpty()) {
            return null;
        }
        if (cwbvVar.b.size() > 1) {
            csjb e2 = cwcg.a.e();
            e2.I("More than 1 non-E2ee contact were detected");
            e2.r();
        }
        final ChipData chipData2 = (ChipData) cwbvVar.b.get(0);
        String a = crmi.a(cwcgVar.c);
        String string2 = cwcgVar.c.getString(R.string.contact_picker_downgrade_to_non_e2ee_group_alert_message_with_learn_more, chipData2.b, a);
        string2.getClass();
        final String str = (String) bzqa.b.e();
        str.getClass();
        a.getClass();
        return cwcgVar.b(string2, ffdx.b(new dltp(str, ffpc.Q(string2, a, 0, false, 6), ffpc.Q(string2, a, 0, false, 6) + a.length(), new ffji() { // from class: cwbs
            @Override // defpackage.ffji
            public final Object invoke(Object obj6) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                cwcgVar.c.startActivity(intent);
                return true;
            }
        }, 24)), new ffix() { // from class: cwbt
            @Override // defpackage.ffix
            public final Object invoke() {
                cwcg cwcgVar2 = cwcg.this;
                cwcgVar2.i.e("Bugle.Contact.Picker.Non.E2EE.Group.Alert.Click.Count", 0);
                cwcgVar2.l.f(true);
                return ffcu.a;
            }
        }, new ffix() { // from class: cwbu
            @Override // defpackage.ffix
            public final Object invoke() {
                cwcg cwcgVar2 = cwcg.this;
                cwcgVar2.i.e("Bugle.Contact.Picker.Non.E2EE.Group.Alert.Click.Count", 1);
                cwcgVar2.d.c(chipData2);
                return ffcu.a;
            }
        });
    }
}
