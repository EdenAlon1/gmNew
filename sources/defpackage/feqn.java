package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feqn {
    static final fdxi a = new fdxi("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", null);
    final Long b;
    final Boolean c;
    final Integer d;
    final Integer e;
    final fetv f;
    final fene g;

    public feqn(Map map, boolean z) {
        boolean z2;
        long j;
        fetv fetvVar;
        fene feneVar;
        this.b = feok.d(map, "timeout");
        this.c = feok.a(map, "waitForReady");
        Integer c = feok.c(map, "maxResponseMessageBytes");
        this.d = c;
        if (c != null) {
            emxf.f(c.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", c);
        }
        Integer c2 = feok.c(map, "maxRequestMessageBytes");
        this.e = c2;
        if (c2 != null) {
            emxf.f(c2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", c2);
        }
        Map i = z ? feok.i(map, "retryPolicy") : null;
        if (i == null) {
            j = 0;
            fetvVar = null;
            z2 = true;
        } else {
            Integer c3 = feok.c(i, "maxAttempts");
            c3.getClass();
            int intValue = c3.intValue();
            emxf.d(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, 5);
            Long d = feok.d(i, "initialBackoff");
            d.getClass();
            long longValue = d.longValue();
            emxf.e(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
            Long d2 = feok.d(i, "maxBackoff");
            d2.getClass();
            z2 = true;
            long longValue2 = d2.longValue();
            emxf.e(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
            Double b = feok.b(i, "backoffMultiplier");
            b.getClass();
            double doubleValue = b.doubleValue();
            j = 0;
            emxf.f(doubleValue > eobe.a, "backoffMultiplier must be greater than 0: %s", b);
            Long d3 = feok.d(i, "perAttemptRecvTimeout");
            emxf.f(d3 == null || d3.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", d3);
            Set a2 = fevi.a(i, "retryableStatusCodes");
            emyw.b(a2 != null, "%s is required in retry policy", "retryableStatusCodes");
            emyw.b(!a2.contains(Status.Code.OK), "%s must not contain OK", "retryableStatusCodes");
            emxf.b((d3 == null && a2.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            fetvVar = new fetv(min, longValue, longValue2, doubleValue, d3, a2);
        }
        this.f = fetvVar;
        Map i2 = z ? feok.i(map, "hedgingPolicy") : null;
        if (i2 == null) {
            feneVar = null;
        } else {
            Integer c4 = feok.c(i2, "maxAttempts");
            c4.getClass();
            int intValue2 = c4.intValue();
            emxf.d(intValue2 >= 2 ? z2 : false, "maxAttempts must be greater than 1: %s", intValue2);
            int min2 = Math.min(intValue2, 5);
            Long d4 = feok.d(i2, "hedgingDelay");
            d4.getClass();
            long longValue3 = d4.longValue();
            emxf.e(longValue3 >= j ? z2 : false, "hedgingDelay must not be negative: %s", longValue3);
            Set a3 = fevi.a(i2, "nonFatalStatusCodes");
            if (a3 == null) {
                a3 = DesugarCollections.unmodifiableSet(EnumSet.noneOf(Status.Code.class));
            } else {
                emyw.b(!a3.contains(Status.Code.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            feneVar = new fene(min2, longValue3, a3);
        }
        this.g = feneVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof feqn)) {
            return false;
        }
        feqn feqnVar = (feqn) obj;
        return emxb.a(this.b, feqnVar.b) && emxb.a(this.c, feqnVar.c) && emxb.a(this.d, feqnVar.d) && emxb.a(this.e, feqnVar.e) && emxb.a(this.f, feqnVar.f) && emxb.a(this.g, feqnVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("timeoutNanos", this.b);
        b.b("waitForReady", this.c);
        b.b("maxInboundMessageSize", this.d);
        b.b("maxOutboundMessageSize", this.e);
        b.b("retryPolicy", this.f);
        b.b("hedgingPolicy", this.g);
        return b.toString();
    }
}
