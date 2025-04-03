package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.settings.ConversationSettingsOptionItemView;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoProperty;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vzw extends vk {
    public bcum a;
    final /* synthetic */ vzn d;

    public vzw(vzn vznVar) {
        this.d = vznVar;
    }

    final engw F(bcum bcumVar) {
        if (bcumVar == null) {
            int i = engw.d;
            return enou.a;
        }
        ParticipantsTable.BindData a = bcumVar.a().a();
        boolean m = this.d.e.m();
        if (a != null && bdqv.d(a)) {
            BusinessInfoData businessInfoData = (BusinessInfoData) this.d.f.orElse(null);
            ArrayList arrayList = new ArrayList(bcul.a());
            if (!m) {
                arrayList.remove(bcul.SETTING_NOTIFICATION);
            }
            arrayList.remove(bcul.SETTING_XMS_MODE);
            arrayList.remove(bcul.SETTING_SECURITY_KEY);
            arrayList.remove(bcul.SETTING_SPAM_REPORTING);
            if (businessInfoData != null) {
                BusinessInfoProperty privacyPolicyUrl = businessInfoData.getPrivacyPolicyUrl();
                if (privacyPolicyUrl == null || TextUtils.isEmpty(privacyPolicyUrl.getValue())) {
                    bcun.a.r("Can't add privacy policy setting: business doesn't have it.");
                } else {
                    arrayList.add(bcul.SETTING_PRIVACY_POLICY);
                }
                BusinessInfoProperty termsAndConditionsUrl = businessInfoData.getTermsAndConditionsUrl();
                if (termsAndConditionsUrl != null && !TextUtils.isEmpty(termsAndConditionsUrl.getValue())) {
                    arrayList.add(bcul.SETTING_TERMS_OF_SERVICE);
                }
            }
            arrayList.add(bcul.SETTING_LEARN_MORE_BUSINESS_MESSAGING);
            return engw.n(arrayList);
        }
        boolean z = this.d.c.c;
        boolean z2 = false;
        if (a != null && bcumVar.b().k() == 0) {
            z2 = true;
        }
        boolean j = bcumVar.j();
        ArrayList arrayList2 = new ArrayList(bcul.a());
        if (z2) {
            arrayList2.remove(bcul.SETTING_SPAM_REPORTING);
        } else {
            arrayList2.remove(bcul.SETTING_XMS_MODE);
            arrayList2.remove(bcul.SETTING_BLOCKED);
            arrayList2.remove(bcul.SETTING_SECURITY_KEY);
        }
        if (!z) {
            arrayList2.remove(bcul.SETTING_XMS_MODE);
            arrayList2.remove(bcul.SETTING_SECURITY_KEY);
        }
        if (!j) {
            arrayList2.remove(bcul.SETTING_SECURITY_KEY);
        }
        if (!m) {
            arrayList2.remove(bcul.SETTING_NOTIFICATION);
        }
        return engw.n(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(ConversationSettingsOptionItemView conversationSettingsOptionItemView, int i) {
        conversationSettingsOptionItemView.d.b(this.a, (bcul) m().get(i));
        conversationSettingsOptionItemView.a.setText(conversationSettingsOptionItemView.d.b);
        conversationSettingsOptionItemView.a.setContentDescription(conversationSettingsOptionItemView.d.b);
        String str = conversationSettingsOptionItemView.d.c;
        if (TextUtils.isEmpty(str)) {
            conversationSettingsOptionItemView.b.setVisibility(8);
        } else {
            conversationSettingsOptionItemView.b.setVisibility(0);
            conversationSettingsOptionItemView.b.setText(str);
        }
        if (conversationSettingsOptionItemView.d.e) {
            conversationSettingsOptionItemView.c.setVisibility(0);
            conversationSettingsOptionItemView.c.setChecked(conversationSettingsOptionItemView.d.f);
        } else {
            conversationSettingsOptionItemView.c.setVisibility(8);
        }
        boolean z = conversationSettingsOptionItemView.d.g;
        if (z != conversationSettingsOptionItemView.isEnabled()) {
            conversationSettingsOptionItemView.a.setEnabled(z);
            conversationSettingsOptionItemView.b.setEnabled(z);
            conversationSettingsOptionItemView.c.setEnabled(z);
            conversationSettingsOptionItemView.setAlpha(true != z ? 0.5f : 1.0f);
            conversationSettingsOptionItemView.setEnabled(z);
        }
        boolean z2 = conversationSettingsOptionItemView.d.i;
        if (z2 != (conversationSettingsOptionItemView.getVisibility() == 0)) {
            conversationSettingsOptionItemView.setVisibility(true == z2 ? 0 : 8);
        }
    }

    @Override // defpackage.vk
    public final int a() {
        if (this.a == null) {
            return 0;
        }
        return m().size();
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return R.layout.conversation_settings_option_item_view;
    }

    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        return new vzv(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }

    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        G(((vzv) wrVar).s, i);
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        return 2131624160L;
    }

    final engw m() {
        return F(this.a);
    }
}
