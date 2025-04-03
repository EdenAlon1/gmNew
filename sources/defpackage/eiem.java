package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_IsComposingMessage;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiem extends eigc {
    private eigd a;
    private Optional b = Optional.empty();
    private Optional c = Optional.empty();

    @Override // defpackage.eigc
    public final IsComposingMessage a() {
        eigd eigdVar = this.a;
        if (eigdVar != null) {
            return new AutoValue_IsComposingMessage(eigdVar, this.b, this.c);
        }
        throw new IllegalStateException("Missing required properties: state");
    }

    @Override // defpackage.eigc
    public final void b(Duration duration) {
        this.b = Optional.of(duration);
    }

    @Override // defpackage.eigc
    public final void c(eigd eigdVar) {
        if (eigdVar == null) {
            throw new NullPointerException("Null state");
        }
        this.a = eigdVar;
    }

    @Override // defpackage.eigc
    public final void d(Instant instant) {
        this.c = Optional.of(instant);
    }
}
