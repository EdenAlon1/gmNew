package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class culh {
    public final culf a;
    public final String b;
    public final MessageIdType c;
    public final ConversationIdType d;
    public final int e;
    public final boolean f;
    public final String g;
    public final cuvb h;
    public final cuva i;
    public final cuvc j;

    public culh(culf culfVar, String str) {
        this.a = culfVar;
        this.b = str;
        this.c = culfVar.a;
        this.h = culfVar.i;
        this.d = culfVar.b;
        this.i = culfVar.j;
        this.e = culfVar.c;
        this.f = culfVar.d;
        this.g = culfVar.f;
        this.j = culfVar.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof culh)) {
            return false;
        }
        culh culhVar = (culh) obj;
        return ffkj.e(this.a, culhVar.a) && ffkj.e(this.b, culhVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MessageWrapper(metadata=" + this.a + ", text=" + this.b + ")";
    }
}
