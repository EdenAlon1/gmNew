package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class edps implements Parcelable {
    public static edpr g(String str) {
        edlr edlrVar = new edlr();
        if (str == null) {
            throw new NullPointerException("Null photoReference");
        }
        edlrVar.a = str;
        edlrVar.d(0);
        edlrVar.c(0);
        edlrVar.b("");
        return edlrVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract edmn c();

    public abstract String d();

    public abstract String e();

    public abstract String f();
}
