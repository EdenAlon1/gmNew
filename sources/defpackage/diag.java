package defpackage;

import android.os.Looper;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class diag implements dfqp {
    public static final diag a = new diag(new diaf());
    private final Looper b;

    public diag(diaf diafVar) {
        this.b = diafVar.a;
    }

    public final dfqz a() {
        Looper looper = this.b;
        if (looper == null) {
            return dfqz.a;
        }
        dfqy dfqyVar = new dfqy();
        dfqyVar.b(looper);
        return dfqyVar.a();
    }

    public final boolean equals(Object obj) {
        return obj instanceof diag;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass()});
    }
}
