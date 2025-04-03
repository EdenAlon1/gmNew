package defpackage;

import j$.time.Instant;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajwc {
    public final UUID a;
    public final akdb b;
    public final akci c;
    public final Instant d;
    public final Instant e;
    public final akcd f;
    public final long g;
    public final Instant h;
    public final Instant i;
    public final akcz j;

    public ajwc(UUID uuid, akdb akdbVar, akci akciVar, Instant instant, Instant instant2, akcd akcdVar, long j, Instant instant3, Instant instant4, akcz akczVar) {
        akczVar.getClass();
        this.a = uuid;
        this.b = akdbVar;
        this.c = akciVar;
        this.d = instant;
        this.e = instant2;
        this.f = akcdVar;
        this.g = j;
        this.h = instant3;
        this.i = instant4;
        this.j = akczVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajwc)) {
            return false;
        }
        ajwc ajwcVar = (ajwc) obj;
        return ffkj.e(this.a, ajwcVar.a) && this.b == ajwcVar.b && this.c == ajwcVar.c && ffkj.e(this.d, ajwcVar.d) && ffkj.e(this.e, ajwcVar.e) && ffkj.e(this.f, ajwcVar.f) && this.g == ajwcVar.g && ffkj.e(this.h, ajwcVar.h) && ffkj.e(this.i, ajwcVar.i) && ffkj.e(this.j, ajwcVar.j);
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        Instant instant = this.e;
        int hashCode2 = ((hashCode * 31) + (instant == null ? 0 : instant.hashCode())) * 31;
        akcd akcdVar = this.f;
        int hashCode3 = akcdVar != null ? akcdVar.hashCode() : 0;
        long j = this.g;
        return ((((((((hashCode2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    public final String toString() {
        return "RestoreExecution(sessionId=" + this.a + ", feature=" + this.b + ", status=" + this.c + ", startTime=" + this.d + ", finishTime=" + this.e + ", backupDatabaseMetadata=" + this.f + ", initialMessagesVersion=" + this.g + ", statusTimestamp=" + this.h + ", lastAttachmentRequestTimestamp=" + this.i + ", persistedConfig=" + this.j + ")";
    }
}
