package defpackage;

import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahoz {
    public static final cskc a = cskc.g("BuglePlacesApiHelper", "PlacesApiHelper");
    public static final Object b = new Object();
    public final Optional e;
    public final errl f;
    public final ffbr g;
    public final ffbr h;
    public volatile ahow i;
    public WeakReference c = new WeakReference(null);
    public final Object d = new Object();
    public volatile List j = new ArrayList();

    public ahoz(Optional optional, errl errlVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.e = optional;
        this.f = errlVar;
        this.g = ffbrVar;
        this.h = ffbrVar2;
    }

    public final void a() {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((ahow) it.next()).a();
        }
        this.j.clear();
    }
}
