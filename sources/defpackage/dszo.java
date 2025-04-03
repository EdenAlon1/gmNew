package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dszo extends dszq {
    public final int a;

    public dszo(int i) {
        this.a = i;
    }

    @Override // defpackage.dszq
    public final int a(Context context) {
        context.getClass();
        return context.getColor(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dszo) && this.a == ((dszo) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Resource(resource=" + this.a + ")";
    }
}
