package com.google.android.ims.rcsservice.chatsession.message;

import android.text.TextUtils;
import android.util.Xml;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponse;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.dktf;
import defpackage.dkty;
import defpackage.dkug;
import defpackage.evko;
import defpackage.evkt;
import defpackage.evkw;
import defpackage.evkx;
import defpackage.evla;
import java.io.StringWriter;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ConversationSuggestionResponseSerializer {
    private static final String ATTR_POST_BACK_ENCODING = "encoding";
    private static final String NAMESPACE = "";
    private static final String TAG_POST_BACK_DATA = "postbackdata";
    private static final String TAG_REPLY_TEXT = "text";
    private static final String TAG_RESPONSE = "response";
    private static final String TAG_RESPONSE_ROOT = "imSuggestion";
    private static final String TAG_TARGET_MESSAGE_ID = "messageid";

    /* compiled from: PG */
    /* renamed from: com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer$1, reason: invalid class name */
    public class AnonymousClass1 {
        final /* synthetic */ ConversationSuggestion val$suggestion;

        public AnonymousClass1(ConversationSuggestion conversationSuggestion) {
            this.val$suggestion = conversationSuggestion;
        }

        public evkt serialize(ConversationSuggestion conversationSuggestion, Type type, evla evlaVar) {
            evkw evkwVar = new evkw();
            String propertyValue = this.val$suggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT);
            if (TextUtils.isEmpty(propertyValue)) {
                propertyValue = this.val$suggestion.getPropertyValue("text");
            }
            if (!TextUtils.isEmpty(propertyValue)) {
                evkwVar.f(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT, propertyValue);
            }
            String postBackData = this.val$suggestion.getPostBackData();
            if (!TextUtils.isEmpty(postBackData)) {
                evkw evkwVar2 = new evkw();
                evkwVar2.f(GroupManagementRequest.DATA_TAG, postBackData);
                evkwVar.e("postback", evkwVar2);
            }
            String typeIdentifier = ConversationSuggestionResponseSerializer.getTypeIdentifier(this.val$suggestion);
            if (typeIdentifier == null) {
                throw new evkx("Invalid suggestion type");
            }
            evkw evkwVar3 = new evkw();
            evkwVar3.e(typeIdentifier, evkwVar);
            evkw evkwVar4 = new evkw();
            evkwVar4.e("response", evkwVar3);
            return evkwVar4;
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$ims$rcsservice$chatsession$message$ConversationSuggestionResponse$ConversationSuggestionResponseType;

        static {
            int[] iArr = new int[ConversationSuggestionResponse.ConversationSuggestionResponseType.values().length];
            $SwitchMap$com$google$android$ims$rcsservice$chatsession$message$ConversationSuggestionResponse$ConversationSuggestionResponseType = iArr;
            try {
                iArr[ConversationSuggestionResponse.ConversationSuggestionResponseType.REPLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$ims$rcsservice$chatsession$message$ConversationSuggestionResponse$ConversationSuggestionResponseType[ConversationSuggestionResponse.ConversationSuggestionResponseType.ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static String getTypeIdentifier(ConversationSuggestion conversationSuggestion) {
        switch (conversationSuggestion.getSuggestionType()) {
            case 0:
                return "reply";
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 11:
                return GroupManagementRequest.ACTION_TAG;
            case 6:
            case 7:
            default:
                dkty.g("Unsupported suggestion type: %s", Integer.valueOf(conversationSuggestion.getSuggestionType()));
                return null;
        }
    }

    public static String serializeToJson(ConversationSuggestion conversationSuggestion) {
        evko evkoVar = new evko();
        evkoVar.c(ConversationSuggestion.class, new AnonymousClass1(conversationSuggestion));
        try {
            return evkoVar.a().k(conversationSuggestion);
        } catch (evkx e) {
            dkty.i(e, "Unable to serialize JSON from suggestion response: %s", conversationSuggestion);
            return null;
        }
    }

    public static String serializeToXml(String str, String str2, String str3, String str4) {
        StringWriter stringWriter;
        try {
            stringWriter = new StringWriter();
            try {
                dktf dktfVar = new dktf();
                dktfVar.a = stringWriter;
                dktfVar.startDocument(Xml.Encoding.UTF_8.toString(), true);
                dktfVar.startTag(NAMESPACE, TAG_RESPONSE_ROOT);
                dktfVar.startTag(NAMESPACE, TAG_TARGET_MESSAGE_ID);
                dktfVar.text(str);
                dktfVar.endTag(NAMESPACE, TAG_TARGET_MESSAGE_ID);
                dktfVar.startTag(NAMESPACE, "response");
                if (!TextUtils.isEmpty(str2)) {
                    dktfVar.startTag(NAMESPACE, "text");
                    dktfVar.text(str2);
                    dktfVar.endTag(NAMESPACE, "text");
                }
                dktfVar.startTag(NAMESPACE, TAG_POST_BACK_DATA);
                dktfVar.attribute(NAMESPACE, ATTR_POST_BACK_ENCODING, str4);
                dktfVar.text(str3);
                dktfVar.endTag(NAMESPACE, TAG_POST_BACK_DATA);
                dktfVar.endTag(NAMESPACE, "response");
                dktfVar.endTag(NAMESPACE, TAG_RESPONSE_ROOT);
                dktfVar.flush();
                String stringWriter2 = stringWriter.toString();
                dkug.a(stringWriter);
                return stringWriter2;
            } catch (Throwable th) {
                th = th;
                dkug.a(stringWriter);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            stringWriter = null;
        }
    }

    public static String getTypeIdentifier(ConversationSuggestionResponse.ConversationSuggestionResponseType conversationSuggestionResponseType) {
        ConversationSuggestionResponse.ConversationSuggestionResponseType conversationSuggestionResponseType2 = ConversationSuggestionResponse.ConversationSuggestionResponseType.UNKNOWN;
        int ordinal = conversationSuggestionResponseType.ordinal();
        if (ordinal == 1) {
            return "reply";
        }
        if (ordinal != 2) {
            dkty.g("Unsupported suggestion response type: %s", conversationSuggestionResponseType);
            return null;
        }
        return GroupManagementRequest.ACTION_TAG;
    }
}
