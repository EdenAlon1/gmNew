package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bbc {
    public abstract int a();

    public abstract Range b();

    public abstract Size c();

    public abstract aua d();

    public abstract bdp e();

    public final bgr f(bdp bdpVar) {
        bgq h = bgr.h(c());
        bbp bbpVar = (bbp) h;
        bbpVar.a = d();
        bbpVar.b = bdpVar;
        if (b() != null) {
            h.b(b());
        }
        return h.a();
    }

    public abstract bgu g();

    public abstract List h();
}
