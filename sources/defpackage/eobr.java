package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eobr extends eobs {
    public eobr(Object obj, Object obj2) {
        super(obj, obj2);
    }

    @Override // defpackage.eobs
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.eobs
    public final Object b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eobs)) {
            return false;
        }
        eobs eobsVar = (eobs) obj;
        eobsVar.c();
        return this.a.equals(eobsVar.a()) && this.b.equals(eobsVar.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        Object obj = this.b;
        return "<" + this.a.toString() + " -> " + obj.toString() + ">";
    }

    @Override // defpackage.eobs
    public final void c() {
    }
}
