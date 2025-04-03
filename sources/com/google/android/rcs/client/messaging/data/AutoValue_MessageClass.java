package com.google.android.rcs.client.messaging.data;

import defpackage.eigo;
import defpackage.eigp;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_MessageClass extends MessageClass {
    private final eigp b;
    private final eigo c;
    private final boolean d;
    private final boolean e;

    public AutoValue_MessageClass(eigp eigpVar, eigo eigoVar, boolean z, boolean z2) {
        this.b = eigpVar;
        this.c = eigoVar;
        this.d = z;
        this.e = z2;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageClass
    public final eigo a() {
        return this.c;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageClass
    public final eigp b() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageClass
    public final boolean c() {
        return this.e;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageClass
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageClass) {
            MessageClass messageClass = (MessageClass) obj;
            if (this.b.equals(messageClass.b()) && this.c.equals(messageClass.a()) && this.d == messageClass.d() && this.e == messageClass.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237);
    }

    public final String toString() {
        eigo eigoVar = this.c;
        return "MessageClass{messageSource=" + String.valueOf(this.b) + ", messagePriority=" + String.valueOf(eigoVar) + ", interworkingSupported=" + this.d + ", dispositionNotificationRequired=" + this.e + "}";
    }
}
