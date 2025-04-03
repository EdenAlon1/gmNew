package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oav extends nzh {
    private String a;

    public oav(oaj oajVar) {
        super(oajVar);
    }

    @Override // defpackage.nzh
    public final void a(Context context, AttributeSet attributeSet) {
        super.a(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, obp.a);
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
        return obj != null && (obj instanceof oav) && super.equals(obj) && ffkj.e(this.a, ((oav) obj).a);
    }

    public final String g() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    @Override // defpackage.nzh
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
