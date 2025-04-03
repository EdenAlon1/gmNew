package defpackage;

import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.message.rbm.RbmSuggestionResponse;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import j$.util.DesugarArrays;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dkjs {
    UNKNOWN("unknown"),
    CPIM_MESSAGE("message/cpim"),
    TEXT_MESSAGE("text/plain"),
    DISPOSITION_NOTIFICATION("message/imdn+xml"),
    IS_COMPOSING_INDICATOR("application/im-iscomposing+xml"),
    HTTP_FT_PUSH("application/vnd.gsma.rcs-ft-http+xml"),
    CONVERSATION_SUGGESTIONS("application/vnd.gsma.botsuggestion.v1.0+json"),
    CONVERSATION_SUGGESTIONS_RESPONSE(RbmSuggestionResponse.CONTENT_TYPE),
    RBM_SPAM_REPORT("application/vnd.gsma.rcsspam-report+xml"),
    RBM_BOT_MESSAGE(RbmSpecificMessage.CONTENT_TYPE),
    CPM_GROUP_DATA(GroupManagementContentType.CONTENT_TYPE);

    public final String l;

    dkjs(String str) {
        this.l = str;
    }

    public static dkjs a(final String str) {
        return str == null ? UNKNOWN : (dkjs) DesugarArrays.stream(values()).filter(new Predicate() { // from class: dkjr
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
                dkjs dkjsVar = dkjs.UNKNOWN;
                return ((dkjs) obj).l.equals(emuz.c(str));
            }
        }).findFirst().orElse(UNKNOWN);
    }
}
