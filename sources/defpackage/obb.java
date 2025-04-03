package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class obb extends nzh {
    public String a;

    public obb(oaj oajVar) {
        super(oajVar);
    }

    @Override // defpackage.nzh
    public final void a(Context context, AttributeSet attributeSet) {
        super.a(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, obp.b);
        obtainAttributes.getClass();
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.a = string;
        }
        obtainAttributes.recycle();
    }

    @Override // defpackage.nzh
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof obb) && super.equals(obj) && ffkj.e(this.a, ((obb) obj).a);
    }

    @Override // defpackage.nzh
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.nzh
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        String str = this.a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        return sb.toString();
    }
}
