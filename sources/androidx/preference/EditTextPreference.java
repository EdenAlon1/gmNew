package androidx.preference;

import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.omp;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969507(0x7f0403a3, float:1.7547698E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = defpackage.kpq.b(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = defpackage.ooj.d
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = defpackage.kpq.h(r4, r2, r2, r2)
            if (r5 == 0) goto L2a
            omq r5 = defpackage.omq.a
            if (r5 != 0) goto L25
            omq r5 = new omq
            r5.<init>()
            defpackage.omq.a = r5
        L25:
            omq r5 = defpackage.omq.a
            r3.K(r5)
        L2a:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    protected final Parcelable e() {
        Parcelable e = super.e();
        if (this.v) {
            return e;
        }
        omp ompVar = new omp(e);
        ompVar.a = this.g;
        return ompVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(omp.class)) {
            super.g(parcelable);
            return;
        }
        omp ompVar = (omp) parcelable;
        super.g(ompVar.getSuperState());
        i(ompVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        i(u((String) obj));
    }

    public final void i(String str) {
        boolean j = j();
        this.g = str;
        Y(str);
        boolean j2 = j();
        if (j2 != j) {
            z(j2);
        }
        d();
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return TextUtils.isEmpty(this.g) || super.j();
    }
}
