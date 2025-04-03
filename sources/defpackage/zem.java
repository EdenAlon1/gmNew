package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zem implements dnal, abqq {
    private static final ecda a = new ecda("GlideLoadLatency");
    private final ecrj b;
    private final ConcurrentHashMap c;

    public zem(ecrj ecrjVar) {
        ecrjVar.getClass();
        this.b = ecrjVar;
        this.c = new ConcurrentHashMap();
    }

    @Override // defpackage.dnal
    public final void b(qwp qwpVar, Object obj) {
        if ((obj instanceof Uri) && this.c.containsKey(obj)) {
            this.b.f((ecri) this.c.remove(obj), a, null, ecrh.ERROR);
        }
    }

    @Override // defpackage.dnal
    public final void c(Uri uri) {
        if (uri != null) {
            this.c.put(uri, this.b.d());
        }
    }

    @Override // defpackage.abqq, java.lang.AutoCloseable
    public final void close() {
        for (Object obj : this.c.values()) {
            obj.getClass();
            this.b.f((ecri) obj, a, null, ecrh.CANCEL);
        }
        this.c.clear();
    }

    @Override // defpackage.dnal
    public final void d(Drawable drawable, Object obj) {
        if ((obj instanceof Uri) && this.c.containsKey(obj)) {
            this.b.f((ecri) this.c.remove(obj), a, null, ecrh.SUCCESS);
        }
    }

    @Override // defpackage.dnal
    public final /* synthetic */ void a(Uri uri, int i, int i2) {
    }
}
