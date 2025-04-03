package defpackage;

import android.app.Notification;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cetj extends cety {
    public final poj a;
    public final cevc b;
    public final int c;
    public final int d;
    public final long e;
    public final poa f;
    public final Notification g;
    public final eogt h;
    public final Duration i;
    public final boolean j;
    public final Optional k;

    public cetj(poj pojVar, cevc cevcVar, int i, int i2, long j, poa poaVar, Notification notification, eogt eogtVar, Duration duration, boolean z, Optional optional) {
        this.a = pojVar;
        this.b = cevcVar;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = poaVar;
        this.g = notification;
        this.h = eogtVar;
        this.i = duration;
        this.j = z;
        this.k = optional;
    }

    @Override // defpackage.cety
    public final int a() {
        return this.d;
    }

    @Override // defpackage.cety
    public final int b() {
        return this.c;
    }

    @Override // defpackage.cety
    public final long c() {
        return this.e;
    }

    @Override // defpackage.cety
    public final Notification d() {
        return this.g;
    }

    @Override // defpackage.cety
    public final poa e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        Notification notification;
        eogt eogtVar;
        Duration duration;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cety) {
            cety cetyVar = (cety) obj;
            poj pojVar = this.a;
            if (pojVar != null ? pojVar.equals(cetyVar.f()) : cetyVar.f() == null) {
                if (this.b.equals(cetyVar.g()) && this.c == cetyVar.b() && this.d == cetyVar.a() && this.e == cetyVar.c() && this.f.equals(cetyVar.e()) && ((notification = this.g) != null ? notification.equals(cetyVar.d()) : cetyVar.d() == null) && ((eogtVar = this.h) != null ? eogtVar.equals(cetyVar.h()) : cetyVar.h() == null) && ((duration = this.i) != null ? duration.equals(cetyVar.i()) : cetyVar.i() == null) && this.j == cetyVar.k() && this.k.equals(cetyVar.j())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cety
    public final poj f() {
        return this.a;
    }

    @Override // defpackage.cety
    public final cevc g() {
        return this.b;
    }

    @Override // defpackage.cety
    public final eogt h() {
        return this.h;
    }

    public final int hashCode() {
        poj pojVar = this.a;
        int hashCode = ((((((pojVar == null ? 0 : pojVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        int i = this.d;
        long j = this.e;
        int hashCode2 = ((((hashCode ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f.hashCode();
        Notification notification = this.g;
        int hashCode3 = ((hashCode2 * 1000003) ^ (notification == null ? 0 : notification.hashCode())) * 1000003;
        eogt eogtVar = this.h;
        int hashCode4 = (hashCode3 ^ (eogtVar == null ? 0 : eogtVar.hashCode())) * 1000003;
        Duration duration = this.i;
        return ((((hashCode4 ^ (duration != null ? duration.hashCode() : 0)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ this.k.hashCode();
    }

    @Override // defpackage.cety
    public final Duration i() {
        return this.i;
    }

    @Override // defpackage.cety
    public final Optional j() {
        return this.k;
    }

    @Override // defpackage.cety
    public final boolean k() {
        return this.j;
    }

    public final String toString() {
        Optional optional = this.k;
        Duration duration = this.i;
        eogt eogtVar = this.h;
        Notification notification = this.g;
        poa poaVar = this.f;
        cevc cevcVar = this.b;
        return "ExecutionParameters{constraints=" + String.valueOf(this.a) + ", keepAliveStrategy=" + String.valueOf(cevcVar) + ", maxRowsPerBatch=" + this.c + ", maxAttemptsPerItem=" + this.d + ", retryDelayMillis=" + this.e + ", retryBackoffPolicy=" + String.valueOf(poaVar) + ", foregroundServiceNotification=" + String.valueOf(notification) + ", legacyActionEnumForLogging=" + String.valueOf(eogtVar) + ", cadence=" + String.valueOf(duration) + ", optInForSchedulerMigration=" + this.j + ", foregroundServiceType=" + String.valueOf(optional) + "}";
    }
}
