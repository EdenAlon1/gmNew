package defpackage;

import android.content.ContentValues;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjpb extends cjpg {
    public final long a;
    public final UUID b;
    public final cjow c;
    public final cjoq d;
    public final cjov e;
    public final ContentValues f;

    public cjpb(long j, UUID uuid, cjow cjowVar, cjoq cjoqVar, cjov cjovVar, ContentValues contentValues) {
        cjoqVar.getClass();
        cjovVar.getClass();
        contentValues.getClass();
        this.a = j;
        this.b = uuid;
        this.c = cjowVar;
        this.d = cjoqVar;
        this.e = cjovVar;
        this.f = contentValues;
    }

    public static /* synthetic */ cjpb a(cjpb cjpbVar, cjov cjovVar) {
        return new cjpb(cjpbVar.a, cjpbVar.b, cjpbVar.c, cjpbVar.d, cjovVar, cjpbVar.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjpb)) {
            return false;
        }
        cjpb cjpbVar = (cjpb) obj;
        return this.a == cjpbVar.a && ffkj.e(this.b, cjpbVar.b) && ffkj.e(this.c, cjpbVar.c) && ffkj.e(this.d, cjpbVar.d) && ffkj.e(this.e, cjpbVar.e) && ffkj.e(this.f, cjpbVar.f);
    }

    public final int hashCode() {
        long j = this.a;
        return (((((((((((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "BugleData(xMessageId=" + this.a + ", persistenceId=" + this.b + ", parsedSmsData=" + this.c + ", conversationData=" + this.d + ", messageState=" + this.e + ", messageValues=" + this.f + ")";
    }
}
