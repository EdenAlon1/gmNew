package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehxk extends ehxl {
    private final int a;
    private final CopyOnWriteArrayList b;

    public ehxk(int i, CopyOnWriteArrayList copyOnWriteArrayList) {
        this.a = i;
        this.b = copyOnWriteArrayList;
    }

    @Override // defpackage.ehxl
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ehxl
    public final CopyOnWriteArrayList b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehxl) {
            ehxl ehxlVar = (ehxl) obj;
            if (this.a == ehxlVar.a() && this.b.equals(ehxlVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "EventObserverList{subscribedKey=" + this.a + ", listeners=" + this.b.toString() + "}";
    }
}
