package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfyr {
    public final eoqz a;
    public final epjp b;
    public final fbqp c;
    public final fbqx d;
    public final int e;
    public final int f;
    public final long g;
    public final String h;
    public final engw i;
    public final engw j;
    private final String k;
    private final MessageIdType l;

    public cfyr(String str, eoqz eoqzVar, epjp epjpVar, fbqp fbqpVar, fbqx fbqxVar, int i, int i2, long j, String str2, engw engwVar, engw engwVar2, MessageIdType messageIdType) {
        this.k = str;
        this.a = eoqzVar;
        this.b = epjpVar;
        this.c = fbqpVar;
        this.d = fbqxVar;
        this.e = i;
        this.f = i2;
        this.g = j;
        this.h = str2;
        this.i = engwVar;
        this.j = engwVar2;
        this.l = messageIdType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfyr)) {
            return false;
        }
        cfyr cfyrVar = (cfyr) obj;
        return ffkj.e(this.k, cfyrVar.k) && this.a == cfyrVar.a && this.b == cfyrVar.b && this.c == cfyrVar.c && this.d == cfyrVar.d && this.e == cfyrVar.e && this.f == cfyrVar.f && this.g == cfyrVar.g && ffkj.e(this.h, cfyrVar.h) && ffkj.e(this.i, cfyrVar.i) && ffkj.e(this.j, cfyrVar.j) && ffkj.e(this.l, cfyrVar.l);
    }

    public final int hashCode() {
        int hashCode = (((((((this.k.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        long j = this.g;
        long j2 = j ^ (j >>> 32);
        return (((((((((((((hashCode * 31) + this.e) * 31) + this.f) * 31) + ((int) j2)) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.l.hashCode();
    }

    public final String toString() {
        return "SmartSuggestionEvent(id=" + this.k + ", eventType=" + this.a + ", replyMode=" + this.b + ", actionSource=" + this.c + ", rejectionReason=" + this.d + ", numOfItems=" + this.e + ", clickIndex=" + this.f + ", timestamp=" + this.g + ", impressionId=" + this.h + ", suggestionTypes=" + this.i + ", modelOutputLabels=" + this.j + ", messageId=" + this.l + ")";
    }
}
