package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apyx extends apyz {
    private final MessageId a;
    private final apyv b;
    private final cmrx c;
    private final fjay d;
    private final apyw e;

    public apyx(MessageId messageId, apyv apyvVar, cmrx cmrxVar, fjay fjayVar) {
        messageId.getClass();
        apyvVar.getClass();
        cmrxVar.getClass();
        this.a = messageId;
        this.b = apyvVar;
        this.c = cmrxVar;
        this.d = fjayVar;
        this.e = apyw.a;
    }

    @Override // defpackage.apyz
    public final MessageId a() {
        return this.a;
    }

    @Override // defpackage.apyz
    public final apyv b() {
        return this.b;
    }

    @Override // defpackage.apyz
    public final apyw c() {
        return this.e;
    }

    @Override // defpackage.apyz
    public final cmrx d() {
        return this.c;
    }

    @Override // defpackage.apyz
    public final fjay e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apyx)) {
            return false;
        }
        apyx apyxVar = (apyx) obj;
        return ffkj.e(this.a, apyxVar.a) && ffkj.e(this.b, apyxVar.b) && this.c == apyxVar.c && ffkj.e(this.d, apyxVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ReactionAddInfo(reactedMessageId=" + this.a + ", reaction=" + this.b + ", surface=" + this.c + ", traceId=" + this.d + ")";
    }
}
