package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_SubjectExtension;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import com.google.android.rcs.client.messaging.data.SubjectExtension;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiev extends eihk {
    private Optional a = Optional.empty();
    private Optional b = Optional.empty();

    @Override // defpackage.eihk
    public final SubjectExtension a() {
        return new AutoValue_SubjectExtension(this.a, this.b);
    }

    @Override // defpackage.eihk
    public final void b(RcsDestinationId rcsDestinationId) {
        this.a = Optional.of(rcsDestinationId);
    }

    @Override // defpackage.eihk
    public final void c(Instant instant) {
        this.b = Optional.of(instant);
    }
}
