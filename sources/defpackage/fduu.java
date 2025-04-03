package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fduu implements emyl {
    private static final fduu a = new fduu();
    private final emyl b = new emyr(new fduw());

    public static boolean b(Context context) {
        return a.get().a(context);
    }

    public static boolean c(Context context) {
        return a.get().b(context);
    }

    @Override // defpackage.emyl
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fduv get() {
        return (fduv) ((emyr) this.b).a;
    }
}
