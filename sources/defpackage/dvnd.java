package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvnd implements dvmt {
    public Map a;
    public boolean b;
    private final dvmt c;
    private ListenableFuture d;

    public dvnd(dvmt dvmtVar) {
        this.c = dvmtVar;
    }

    private final synchronized ListenableFuture g() {
        Map map = this.a;
        if (map != null) {
            return erqt.i(map);
        }
        ListenableFuture listenableFuture = this.d;
        if (listenableFuture != null) {
            return listenableFuture;
        }
        this.b = false;
        ListenableFuture c = this.c.c();
        this.d = c;
        erqt.r(c, new dvnc(this), erpp.a);
        return c;
    }

    private final synchronized void h() {
        this.a = null;
        this.b = true;
    }

    @Override // defpackage.dvmt
    public final ListenableFuture a() {
        h();
        return this.c.a();
    }

    @Override // defpackage.dvmt
    public final ListenableFuture b(Map map) {
        h();
        return this.c.b(map);
    }

    @Override // defpackage.dvmt
    public final ListenableFuture c() {
        return erny.f(g(), new emwl() { // from class: dvnb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return new HashMap((Map) obj);
            }
        }, erpp.a);
    }

    @Override // defpackage.dvmt
    public final ListenableFuture d(String str, eyhs eyhsVar) {
        h();
        return this.c.d(str, eyhsVar);
    }

    @Override // defpackage.dvmt
    public final ListenableFuture e(String str) {
        h();
        return this.c.e(str);
    }
}
