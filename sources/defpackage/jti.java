package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jti implements jth {
    private static final Typeface c(String str, jsy jsyVar, int i) {
        Typeface create;
        if (jss.b(i, 0) && ffkj.e(jsyVar, jsy.e) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        create = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), jsyVar.i, jss.b(i, 1));
        return create;
    }

    @Override // defpackage.jth
    public final Typeface a(jsy jsyVar, int i) {
        return c(null, jsyVar, i);
    }

    @Override // defpackage.jth
    public final Typeface b(jta jtaVar, jsy jsyVar, int i) {
        return c(jtaVar.d, jsyVar, i);
    }
}
