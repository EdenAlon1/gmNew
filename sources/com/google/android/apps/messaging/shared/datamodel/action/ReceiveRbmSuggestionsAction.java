package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.bars;
import defpackage.bart;
import defpackage.bdgq;
import defpackage.bdhb;
import defpackage.bdhg;
import defpackage.bdmq;
import defpackage.cbgf;
import defpackage.cqoh;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ReceiveRbmSuggestionsAction extends Action<Void> implements Parcelable {
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final cqoh g;
    private final cbgf h;
    private final ffbr i;
    private final ffbr j;
    private static final cskc a = cskc.g("Bugle", "ReceiveRbmSuggestionsAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bars();

    /* compiled from: PG */
    public interface a {
        bart ii();
    }

    public ReceiveRbmSuggestionsAction(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, cqoh cqohVar, cbgf cbgfVar, ffbr ffbrVar6, ffbr ffbrVar7, Bundle bundle) {
        super(bundle, eogt.RECEIVE_CONVERSATION_SUGGESTIONS_ACTION);
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = cqohVar;
        this.h = cbgfVar;
        this.i = ffbrVar6;
        this.j = ffbrVar7;
    }

    private static boolean H(ConversationSuggestion conversationSuggestion) {
        return conversationSuggestion.getSuggestionType() == 5 && !TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT));
    }

    private static boolean I(ConversationSuggestion conversationSuggestion) {
        return (conversationSuggestion.getSuggestionType() != 1 || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT)) || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI))) ? false : true;
    }

    private static boolean J(ConversationSuggestion conversationSuggestion) {
        return (conversationSuggestion.getSuggestionType() != 11 || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT)) || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_OPEN_URL_APPLICATION)) || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
    
        if (r7 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e0, code lost:
    
        r3.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x005e, code lost:
    
        if (r7.equals(com.android.vcard.VCardConstants.PARAM_TYPE_VIDEO) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007d, code lost:
    
        if (r7.length() <= 100) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00de, code lost:
    
        if (r7 != false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r13, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r14) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.ReceiveRbmSuggestionsAction.h(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType):void");
    }

    private static boolean k(ConversationSuggestion conversationSuggestion) {
        return conversationSuggestion.getSuggestionType() == 4 && !TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT));
    }

    private static boolean l(ConversationSuggestion conversationSuggestion) {
        if (!TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT)) && conversationSuggestion.getSuggestionType() == 3) {
            if (!TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY))) {
                return true;
            }
            if (!TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LAT)) && !TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG))) {
                return true;
            }
        }
        return false;
    }

    private static boolean m(ConversationSuggestion conversationSuggestion) {
        return (conversationSuggestion.getSuggestionType() != 2 || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT)) || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER))) ? false : true;
    }

    private static boolean n(ConversationSuggestion conversationSuggestion) {
        return conversationSuggestion.getSuggestionType() == 0 && !TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ReceiveRbmSuggestionsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        ekzz f = eleg.f("ReceiveRbmSuggestionsAction.executeAction");
        try {
            bdhg b = bdhg.b(this.t.f(), RcsIntents.EXTRA_TARGET_RCS_MESSAGE_ID);
            if (b.i()) {
                a.r("Couldn't add RBM bot suggestions to conversation: empty RCS message ID");
            } else {
                MessageCoreData x = ((bdmq) this.e.b()).x(b);
                if (x == null) {
                    csjb e = a.e();
                    e.I("Adding RBM suggestion with target RCS message ID not yet found.");
                    e.A("targetRcsMessageId", b);
                    e.r();
                    h(bdhb.a, bdgq.a);
                } else {
                    h(x.B(), x.z());
                }
            }
            f.close();
            return null;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReceiveConversationSuggestions.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ReceiveRbmSuggestionsAction(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, cqoh cqohVar, cbgf cbgfVar, ffbr ffbrVar6, ffbr ffbrVar7, Parcel parcel) {
        super(parcel, eogt.RECEIVE_CONVERSATION_SUGGESTIONS_ACTION);
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = cqohVar;
        this.h = cbgfVar;
        this.i = ffbrVar6;
        this.j = ffbrVar7;
    }
}
