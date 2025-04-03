package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aino implements aihs {
    public final ResolvedRecipient a;
    public final zeo b;

    public aino(ResolvedRecipient resolvedRecipient, zeo zeoVar) {
        this.a = resolvedRecipient;
        this.b = zeoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aino)) {
            return false;
        }
        aino ainoVar = (aino) obj;
        return ffkj.e(this.a, ainoVar.a) && ffkj.e(this.b, ainoVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ShowOrAddContact(recipient=" + this.a + ", layoutRect=" + this.b + ")";
    }

    public /* synthetic */ aino(ResolvedRecipient resolvedRecipient) {
        this(resolvedRecipient, new zeo(0, 0, 0, 0));
    }
}
