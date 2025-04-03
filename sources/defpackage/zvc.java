package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvc {
    public static final String a(ResolvedRecipient resolvedRecipient) {
        String n;
        aoku g = resolvedRecipient.g();
        String str = null;
        if (g != null && (n = g.n()) != null) {
            str = ffpc.ad(n, 4);
        }
        return str == null ? resolvedRecipient.x(true) : str;
    }
}
