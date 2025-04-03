package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aosd {
    public final ResolvedRecipient a;
    final /* synthetic */ aosg b;
    private final Instant c;

    public aosd(aosg aosgVar, ResolvedRecipient resolvedRecipient, Instant instant) {
        this.b = aosgVar;
        this.a = resolvedRecipient;
        this.c = instant;
    }

    public final String toString() {
        ResolvedRecipient resolvedRecipient = this.a;
        aosg aosgVar = this.b;
        return resolvedRecipient.x(false) + " " + aosgVar.c(this.c);
    }
}
