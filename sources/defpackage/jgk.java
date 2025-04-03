package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jgk extends ffkk implements ffjm {
    public static final jgk a = new jgk();

    public jgk() {
        super(2);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Matrix) obj2).set(((View) obj).getMatrix());
        return ffcu.a;
    }
}
