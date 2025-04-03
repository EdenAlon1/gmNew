package defpackage;

import android.util.Size;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bgv {
    public abstract Size a();

    public abstract Size b();

    public abstract Size c();

    public abstract Map d();

    public abstract Map e();

    public abstract Map f();

    public abstract Map g();

    public final Size h(int i) {
        return (Size) d().get(Integer.valueOf(i));
    }
}
