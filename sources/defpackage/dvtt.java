package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvtt {
    public final Rect a = new Rect();
    public final Rect b = new Rect();

    public dvtt() {
        a();
    }

    public final void a() {
        this.a.set(0, 0, 0, 0);
        this.b.set(0, 0, 1073741823, 1073741823);
    }

    public final boolean b() {
        if (Math.max(Math.min(this.a.right, this.b.right) - Math.max(this.a.left, this.b.left), 0) <= 0) {
            return false;
        }
        return Math.max(Math.min(this.a.bottom, this.b.bottom) - Math.max(this.a.top, this.b.top), 0) > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dvtt dvttVar = (dvtt) obj;
            if (this.a.equals(dvttVar.a) && this.b.equals(dvttVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
