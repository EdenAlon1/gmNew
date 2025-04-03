package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akvz {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/analytics/AnalyticsIdHelper");
    public final ffbr a;
    private final ffbr c;

    public akvz(ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.c = ffbrVar2;
    }

    public static String h(String str) {
        try {
            byte[] k = k(str, MessageDigest.getInstance("SHA-256"), 16);
            StringBuilder sb = new StringBuilder();
            for (byte b2 : k) {
                try {
                    sb.append(String.format("%02x", Byte.valueOf(b2)));
                } catch (UnsupportedEncodingException e) {
                    e = e;
                    ensk i = b.i();
                    i.Y(ente.a, "BugleDataModel");
                    ((enrr) ((enrr) ((enrr) ((enrr) i).g(e)).g(e)).h("com/google/android/apps/messaging/shared/analytics/AnalyticsIdHelper", "getSha256String", 178, "AnalyticsIdHelper.java")).q("Exception while getting SHA string for message");
                    return "";
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e2) {
            e = e2;
        }
    }

    public static final long i(String str, String str2, long j, String str3, bdhg bdhgVar) {
        return j(str + str2 + j + str3 + bdhg.e(bdhgVar));
    }

    private static long j(String str) {
        try {
            return ByteBuffer.wrap(k(str, MessageDigest.getInstance("SHA-1"), 8)).getLong();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            ensk i = b.i();
            i.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) ((enrr) ((enrr) i).g(e)).g(e)).h("com/google/android/apps/messaging/shared/analytics/AnalyticsIdHelper", "getSha1Value", 167, "AnalyticsIdHelper.java")).q("Exception while getting SHA value for message");
            return -1L;
        }
    }

    private static byte[] k(String str, MessageDigest messageDigest, int i) {
        messageDigest.reset();
        messageDigest.update(str.getBytes("UTF-8"));
        byte[] digest = messageDigest.digest();
        if (digest.length < i) {
            return digest;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(digest, 0, bArr, 0, i);
        return bArr;
    }

    public final long a(ConversationId conversationId) {
        return c(conversationId.b());
    }

    public final long b(ConversationIdType conversationIdType) {
        return c(conversationIdType.b() ? null : conversationIdType.a());
    }

    public final long c(String str) {
        if (str == null) {
            return -1L;
        }
        return j(str.concat(String.valueOf(((akxh) this.a.b()).a())));
    }

    public final long d(MessageCoreData messageCoreData) {
        return messageCoreData.cK() ? e(messageCoreData) : f();
    }

    public final long e(MessageCoreData messageCoreData) {
        Uri u = messageCoreData.u();
        return i(u != null ? u.toString() : null, messageCoreData.at(), messageCoreData.o(), messageCoreData.ai(), messageCoreData.E());
    }

    public final long f() {
        return ((csjj) this.c.b()).a.nextLong();
    }

    public final String g() {
        return ((akxh) this.a.b()).a();
    }
}
