package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdvs implements emyl {
    private static final fdvs a = new fdvs();
    private final emyl b = new emyr(new fdvu());

    public static boolean b(Context context) {
        return a.get().a(context);
    }

    public static boolean c(Context context) {
        return a.get().b(context);
    }

    @Override // defpackage.emyl
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fdvt get() {
        return (fdvt) ((emyr) this.b).a;
    }
}
