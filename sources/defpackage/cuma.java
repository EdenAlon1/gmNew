package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuma {
    private final Context a;
    private final ffbr b;

    public cuma(Context context, ffbr ffbrVar) {
        context.getClass();
        ffbrVar.getClass();
        this.a = context;
        this.b = ffbrVar;
    }

    public static final cula c(ConversationIdType conversationIdType, boolean z) {
        Integer num = (Integer) cubs.a.e();
        int intValue = num.intValue() - bdmq.c(conversationIdType);
        num.getClass();
        float intValue2 = num.intValue();
        return new cula(((float) Math.max(intValue / (intValue2 + intValue2), eobe.a)) + (true != z ? 0.5f : 0.0f));
    }

    public final String a() {
        return ((ctvb) this.b.b()).r();
    }

    public final String b() {
        String locale = ctid.c(this.a).toString();
        locale.getClass();
        return locale;
    }
}
