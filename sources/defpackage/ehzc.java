package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehzc extends eibs {
    private final eibr a;
    private final String b;
    private final Instant c;
    private final String d;

    public ehzc(eibr eibrVar, String str, Instant instant, String str2) {
        this.a = eibrVar;
        this.b = str;
        this.c = instant;
        this.d = str2;
    }

    @Override // defpackage.eibs
    public final eibr a() {
        return this.a;
    }

    @Override // defpackage.eibs
    public final Instant b() {
        return this.c;
    }

    @Override // defpackage.eibs
    public final String c() {
        return this.b;
    }

    @Override // defpackage.eibs
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eibs) {
            eibs eibsVar = (eibs) obj;
            if (this.a.equals(eibsVar.a()) && this.b.equals(eibsVar.c()) && this.c.equals(eibsVar.b()) && this.d.equals(eibsVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Instant instant = this.c;
        return "MessageReceipt{type=" + this.a.toString() + ", messageId=" + this.b + ", timestamp=" + instant.toString() + ", status=" + this.d + "}";
    }
}
