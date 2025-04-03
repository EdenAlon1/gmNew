package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csux {
    public static final ensn A;
    public static final ensn B;
    public static final ensn C;
    public static final ensn D;
    public static final ensn E;
    public static final ensn F;
    public static final ensn G;
    public static final ensn H;
    public static final ensn I;
    public static final ensn J;
    public static final ensn K;
    public static final ensn L;
    public static final ensn M;
    public static final ensn N;
    public static final ensn O;
    public static final ensn P;
    public static final ensn Q;
    public static final ensn R;
    public static final ensn S;
    public static final ensn T;
    public static final ensn U;
    public static final ensn V;
    public static final ensn W;
    public static final ensn X;
    public static final ensn Y;
    public static final ensn Z;
    public static final ensn aa;
    public static final ensn ab;
    public static final ensn g;
    public static final ensn h;
    public static final ensn i;
    public static final ensn j;
    public static final ensn k;
    public static final ensn l;
    public static final ensn m;
    public static final ensn n;

    @Deprecated
    public static final ensn o;
    public static final ensn p;
    public static final ensn q;
    public static final ensn r;
    public static final ensn s;
    public static final ensn t;
    public static final ensn u;
    public static final ensn v;
    public static final ensn w;
    public static final ensn x;
    public static final ensn y;
    public static final ensn z;

    @Deprecated
    public static final ensn a = new ensn("message_id", String.class, false, false);
    public static final ensn b = new ensn("message_id", MessageIdType.class, false, false);
    public static final ensn c = new ensn("message_id", MessageId.class, false, false);
    public static final ensn d = new ensn("x_message_id", Long.class, false, false);
    public static final ensn e = new ensn("rcs_message_id", String.class, false, false);
    public static final ensn f = new ensn("rcs_message_id", bdhg.class, false, false);

    static {
        new ensn("message_receipt_type", String.class, false, false);
        g = new ensn("traceId", fjay.class, false, false);
        h = new ensn("draft_id", UUID.class, false, false);
        i = new ensn("webId", String.class, false, false);
        j = new ensn("cmsId", String.class, false, false);
        k = new ensn("cmsCorrelationId", String.class, false, false);
        l = new ensn("cloudSyncId", String.class, false, false);
        m = new ensn("participant_id", String.class, false, false);
        n = new ensn("remote_user_id", CharSequence.class, false, false);
        o = new ensn("conversation_id", String.class, false, false);
        p = new ensn("conversation_id", ConversationIdType.class, false, false);
        q = new ensn("conversation_id", ConversationId.class, false, false);
        r = new ensn("thread_id_type", cpxu.class, false, false);
        s = new ensn("part_id", String.class, false, false);
        t = new ensn("sub_id", Integer.class, false, false);
        u = new ensn("icc_id", String.class, false, false);
        v = new ensn("self_identity_id", SelfIdentityId.class, false, false);
        w = new ensn("my_identity_token", azsu.class, false, false);
        x = new ensn("content_type", String.class, false, false);
        y = new ensn("message_protocol", String.class, false, false);
        z = new ensn("file_transfer_content_uri", String.class, false, false);
        A = new ensn("duration", Duration.class, false, false);
        B = new ensn("originalMessageId", MessageIdType.class, false, false);
        new csvj("display_name", String.class);
        C = new csvj("messaging_identity", aoku.class);
        D = new ensn("destination", String.class, false, false);
        E = new csvj("msisdn", String.class);
        F = new csvj("conversation_name", String.class);
        G = new ensn("conversation_join_state", String.class, false, false);
        H = new ensn("rcs_session_id", Long.class, false, false);
        I = new ensn("rcsFtSessionId", Long.class, false, false);
        J = new csvk("rcs_group_id", String.class);
        K = new ensn("rcs_conference_uri", CharSequence.class, false, false);
        L = new ensn("thread_id", Long.class, false, false);
        M = new ensn("sub_displayName", String.class, false, false);
        N = new ensn("mcc_mnc", String.class, false, false);
        new ensn("app_version", String.class, false, false);
        O = new ensn("class_name", String.class, false, false);
        P = new ensn("rcs_availability", String.class, false, false);
        new ensn("chat_session_service_result", String.class, false, false);
        Q = new ensn("log_prefix", String.class, false, false);
        R = new ensn("pcscf_host", String.class, false, false);
        S = new ensn("grpc_host", String.class, false, false);
        T = new ensn("grpc_port", Integer.class, false, false);
        U = new ensn("content_type", Integer.class, false, false);
        V = new ensn("annotation_id", String.class, false, false);
        new ensn("tile_id", Integer.class, false, false);
        W = new csvh();
        X = new csvi(Uri.class, new Function() { // from class: csuw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cskt.f((Uri) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        Y = new ensn("datagram_id", bdgr.class, false, false);
        Z = new csvj("rcs_provisioning_id", djrm.class);
        aa = new csvj("rcs_provisioning_id", String.class);
        ab = new ensn("destination_token", azcr.class, false, false);
        new ensn("group_token", azhq.class, false, false);
    }
}
