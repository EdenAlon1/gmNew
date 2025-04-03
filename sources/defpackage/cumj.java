package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cumj {
    public final cujo a;
    public final cukx b;
    public final erdy c;
    public final Integer d;
    public final boolean e;
    public final MessageIdType f;
    public final ConversationIdType g;
    public final int h;
    public final boolean i;
    public final String j;
    public final erer k;
    public final cula l;
    public final String m;
    public final cuvb n;
    public final cuva o;
    public final cuvc p;
    private final cukp q;

    public /* synthetic */ cumj(cujo cujoVar, cukp cukpVar, cukx cukxVar, erdy erdyVar, Integer num, boolean z, int i) {
        cujoVar.getClass();
        cukpVar.getClass();
        cukxVar.getClass();
        erdyVar.getClass();
        this.a = cujoVar;
        this.q = cukpVar;
        this.b = cukxVar;
        this.c = erdyVar;
        num = (i & 16) != 0 ? null : num;
        this.d = num;
        this.e = z & ((i & 32) == 0);
        if (cukxVar == cukx.a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (erdyVar == erdy.UNKNOWN_DETECTION_TRIGGER_TYPE) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (erdyVar == erdy.RECLASSIFICATION) {
            if (num == null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else if (num != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f = cujoVar.g;
        this.n = cujoVar.n;
        this.g = cujoVar.h;
        this.o = cujoVar.o;
        this.h = cujoVar.j;
        this.i = cujoVar.k;
        this.j = cujoVar.l;
        this.p = cujoVar.p;
        this.k = cukpVar.a;
        this.l = cukpVar.b;
        this.m = cukpVar.c;
    }

    public final Object a(ffgu ffguVar) {
        return this.a.d(ffguVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cumj)) {
            return false;
        }
        cumj cumjVar = (cumj) obj;
        return ffkj.e(this.a, cumjVar.a) && ffkj.e(this.q, cumjVar.q) && this.b == cumjVar.b && this.c == cumjVar.c && ffkj.e(this.d, cumjVar.d) && this.e == cumjVar.e;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + this.q.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        Integer num = this.d;
        return (((hashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "VerdictEnforcementParams(incomingParams=" + this.a + ", checkResult=" + this.q + ", classificationSource=" + this.b + ", trigger=" + this.c + ", reclassificationIndex=" + this.d + ", ignoreUserReplyCount=" + this.e + ")";
    }
}
