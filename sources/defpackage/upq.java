package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.messagelist.ConversationStartRowView;
import com.google.android.apps.messaging.conversation.messagelist.ConversationStartView;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upq extends upz {
    private static final cskc d = cskc.g("Bugle", "BusinessInfoAdapter");
    public BusinessInfoData a;
    private boolean f;
    private ParticipantsTable.BindData g;

    public upq(czic czicVar, cqoh cqohVar) {
        super(czicVar, cqohVar);
    }

    public final void F(BusinessInfoData businessInfoData, ParticipantsTable.BindData bindData) {
        this.a = businessInfoData;
        this.g = bindData;
        boolean z = (businessInfoData == null || bindData == null) ? false : true;
        if (!z && !this.f) {
            d.q("Business info won't be available, and conversation start is not showing.");
            return;
        }
        if (!z) {
            d.m("Info will not be available but conversation start is showing..");
            y(0);
        } else if (this.f) {
            d.m("Info will be available and conversation start is showing");
            q(0);
        } else {
            d.m("Info will be available but conversation start not currently showing.");
            s(0);
        }
        this.f = z;
    }

    @Override // defpackage.vk
    public final int a() {
        return this.f ? 1 : 0;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        ConversationStartRowView conversationStartRowView = (ConversationStartRowView) ((uqe) wrVar).s;
        final BusinessInfoData businessInfoData = this.a;
        ParticipantsTable.BindData bindData = this.g;
        if (businessInfoData == null || bindData == null) {
            ConversationStartRowView.a.m("Business info or participant data not available to bind");
            return;
        }
        conversationStartRowView.d.f.setText(businessInfoData.getDescription());
        ContactIconView contactIconView = conversationStartRowView.d.e;
        csjb a = ConversationStartRowView.a.a();
        a.B("BusinessInfoData.isVerifiedSmsBrand", businessInfoData.isVerifiedBrand());
        a.r();
        contactIconView.l(businessInfoData.isVerifiedBrand() ? conversationStartRowView.c.c(csuu.j(businessInfoData.getLogoImageLocalUri()), byzi.VERIFICATION_VERIFIED) : conversationStartRowView.b.a(bindData), bindData.u(), bindData.T(), bindData.v(), bindData.U());
        final ConversationStartView conversationStartView = conversationStartRowView.d;
        if (businessInfoData.isVerifiedBrand()) {
            ConversationStartView.a.m("Updating for verified brand");
            conversationStartView.b();
            return;
        }
        if (businessInfoData.getVerificationStatus() != 2) {
            ConversationStartView.a.m("Removing verification for unverified brand");
            conversationStartView.a();
            return;
        }
        int verifiedBotPlatform = businessInfoData.getVerifiedBotPlatform();
        if (verifiedBotPlatform != 1) {
            if (verifiedBotPlatform != 2) {
                conversationStartView.a();
                return;
            }
            ConversationStartView.a.m("Adding verification for Vodafone brand");
            conversationStartView.h.setVisibility(0);
            conversationStartView.g.setVisibility(8);
            conversationStartView.i.setVisibility(8);
            conversationStartView.h.setOnClickListener(new View.OnClickListener() { // from class: uqg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConversationStartView conversationStartView2 = ConversationStartView.this;
                    altk altkVar = conversationStartView2.c;
                    BusinessInfoData businessInfoData2 = businessInfoData;
                    altkVar.aH(3, eorw.BIZINFO_SOURCE_CONVERSATION_START, businessInfoData2.getRbmBotId());
                    ((ddyc) conversationStartView2.d.b()).a(businessInfoData2, conversationStartView2.getContext(), (adtc) conversationStartView2.b.b());
                }
            });
            return;
        }
        ConversationStartView.a.m("Removing verification for Google known verified brand");
        if (!((Boolean) cful.l.e()).booleanValue()) {
            ConversationStartView.a.m("Updating verification for Google verified");
            conversationStartView.b();
        } else if (businessInfoData.containsLocalVerifierInfo()) {
            ConversationStartView.a.m("Updating verification for generalized verifier");
            conversationStartView.b();
        } else {
            ConversationStartView.a.m("Removing verification for generalized verifier");
            conversationStartView.a();
        }
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        return -4L;
    }

    @Override // defpackage.upz
    protected final int m(int i) {
        return R.layout.conversation_start_row_view;
    }
}
