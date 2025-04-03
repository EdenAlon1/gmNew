package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fita extends firl implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    public final firn d;

    protected fita(firn firnVar) {
        this.d = firnVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long c = ((firl) obj).c();
        long c2 = c();
        if (c2 == c) {
            return 0;
        }
        return c2 < c ? -1 : 1;
    }

    @Override // defpackage.firl
    public final firn d() {
        return this.d;
    }

    @Override // defpackage.firl
    public final boolean f() {
        return true;
    }

    public final String toString() {
        return "DurationField[" + this.d.m + "]";
    }
}
