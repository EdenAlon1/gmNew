package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dile {
    public final dima a;

    public dile(dima dimaVar) {
        this.a = dimaVar;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof dile) && this.a.equals(((dile) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "SipDialogId: ".concat(this.a.toString());
    }
}
