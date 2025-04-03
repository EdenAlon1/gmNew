package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxg {
    public static final hvi a(hvi hviVar, float f, float f2, idh idhVar) {
        boolean z;
        int i;
        if (idhVar != null) {
            i = 0;
            z = true;
        } else {
            z = false;
            i = 3;
        }
        return ((Float.compare(f, 0.0f) <= 0 || Float.compare(f2, 0.0f) <= 0) && !z) ? hviVar : icf.a(hviVar, new hxf(f, f2, i, idhVar, z));
    }
}
