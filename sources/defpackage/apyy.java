package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apyy extends apyz {
    public final apxz a;
    private final MessageId b;
    private final apyv c;
    private final cmrx d;
    private final fjay e;
    private final apyw f;

    public apyy(MessageId messageId, apyv apyvVar, cmrx cmrxVar, fjay fjayVar, apxz apxzVar) {
        messageId.getClass();
        apyvVar.getClass();
        cmrxVar.getClass();
        this.b = messageId;
        this.c = apyvVar;
        this.d = cmrxVar;
        this.e = fjayVar;
        this.a = apxzVar;
        this.f = apyw.b;
    }

    @Override // defpackage.apyz
    public final MessageId a() {
        return this.b;
    }

    @Override // defpackage.apyz
    public final apyv b() {
        return this.c;
    }

    @Override // defpackage.apyz
    public final apyw c() {
        return this.f;
    }

    @Override // defpackage.apyz
    public final cmrx d() {
        return this.d;
    }

    @Override // defpackage.apyz
    public final fjay e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apyy)) {
            return false;
        }
        apyy apyyVar = (apyy) obj;
        return ffkj.e(this.b, apyyVar.b) && ffkj.e(this.c, apyyVar.c) && this.d == apyyVar.d && ffkj.e(this.e, apyyVar.e) && ffkj.e(this.a, apyyVar.a);
    }

    public final int hashCode() {
        int hashCode = (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        apxz apxzVar = this.a;
        return (hashCode * 31) + (apxzVar == null ? 0 : apxzVar.hashCode());
    }

    public final String toString() {
        return "ReactionRemoveInfo(reactedMessageId=" + this.b + ", reaction=" + this.c + ", surface=" + this.d + ", traceId=" + this.e + ", removedReactionMetadata=" + this.a + ")";
    }
}
