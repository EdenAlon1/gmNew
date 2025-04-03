package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cisx extends ciwm {
    private final ciwn a;
    private final Intent b;
    private final boolean c;
    private final int d;

    public cisx(ciwn ciwnVar, Intent intent, boolean z, int i) {
        this.a = ciwnVar;
        if (intent == null) {
            throw new NullPointerException("Null activityIntent");
        }
        this.b = intent;
        this.c = z;
        this.d = i;
    }

    @Override // defpackage.ciwm
    public final int a() {
        return this.d;
    }

    @Override // defpackage.ciwm
    public final Intent b() {
        return this.b;
    }

    @Override // defpackage.ciwm
    public final ciwn c() {
        return this.a;
    }

    @Override // defpackage.ciwm
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ciwm) {
            ciwm ciwmVar = (ciwm) obj;
            if (this.a.equals(ciwmVar.c()) && this.b.equals(ciwmVar.b()) && this.c == ciwmVar.d() && this.d == ciwmVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d;
    }

    public final String toString() {
        Intent intent = this.b;
        return "NotificationInteractionActivityInfo{notificationInteractionInfo=" + this.a.toString() + ", activityIntent=" + intent.toString() + ", shouldAddParentStack=" + this.c + ", requestCode=" + this.d + "}";
    }
}
