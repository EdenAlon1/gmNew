package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiwx extends eixm {
    private final boolean a;
    private final boolean b;
    private final Intent c;

    public eiwx(boolean z, boolean z2, Intent intent) {
        this.a = z;
        this.b = z2;
        this.c = intent;
    }

    @Override // defpackage.eixm
    public final Intent a() {
        return this.c;
    }

    @Override // defpackage.eixm
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.eixm
    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        Intent intent;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eixm) {
            eixm eixmVar = (eixm) obj;
            if (this.a == eixmVar.c() && this.b == eixmVar.b() && ((intent = this.c) != null ? intent.equals(eixmVar.a()) : eixmVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.c;
        return (intent == null ? 0 : intent.hashCode()) ^ (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237)) * 1000003);
    }

    public final String toString() {
        return "ValidationResult{isValid=" + this.a + ", clearState=" + this.b + ", getIntentToMeet=" + String.valueOf(this.c) + "}";
    }
}
