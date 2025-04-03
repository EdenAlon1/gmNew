package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class elnu {
    public static final elnu a = new elnq(5);
    public static final elnu b = new elnq(3);
    public static final elnu c = new elnq(4);
    public static final elnu d = new elnq(7);
    public static final elnu e = new elnq(8);

    public abstract String a();

    public abstract int b();

    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putString("__error__", elnt.a(b()));
        if (!a().isEmpty()) {
            bundle.putString("__error_details__", a());
        }
        return bundle;
    }

    public final String toString() {
        return String.format("%s, %s", elnt.a(b()), a());
    }
}
