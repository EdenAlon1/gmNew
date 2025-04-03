package defpackage;

import com.google.android.gms.time.dto.ParcelableDuration;
import com.google.android.gms.time.dto.ParcelableInstant;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhts {
    public final ParcelableDuration a;
    public final ParcelableInstant b;
    public final dhsh c;
    public final engw d;
    public final engw e;

    public dhts(ParcelableDuration parcelableDuration, ParcelableInstant parcelableInstant, dhsh dhshVar, List list, List list2) {
        this.a = parcelableDuration;
        this.b = parcelableInstant;
        this.c = dhshVar;
        this.e = engw.n(list);
        this.d = engw.n(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhts)) {
            return false;
        }
        dhts dhtsVar = (dhts) obj;
        return Objects.equals(this.a, dhtsVar.a) && Objects.equals(this.b, dhtsVar.b) && Objects.equals(this.c, dhtsVar.c) && Objects.equals(this.d, dhtsVar.d) && Objects.equals(this.e, dhtsVar.e);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e);
    }

    public final String toString() {
        engw engwVar = this.e;
        engw engwVar2 = this.d;
        dhsh dhshVar = this.c;
        ParcelableInstant parcelableInstant = this.b;
        return "InternalTimeSignal{estimatedError=" + this.a.toString() + ", currentTime=" + parcelableInstant.toString() + ", acquisitionTicks=" + dhshVar.toString() + ", futureUnixEpochClockAdjustments=" + String.valueOf(engwVar2) + ", pastUnixEpochClockAdjustments=" + String.valueOf(engwVar) + "}";
    }
}
