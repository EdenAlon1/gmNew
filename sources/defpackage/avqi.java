package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avqi implements avrk {
    public static final entd a = entd.c("BugleRcsCapabilities");
    private final enhk b;
    private final ffbr c;
    private final errm d;
    private final avlg e;

    public avqi(ffbr ffbrVar, Map map, avlg avlgVar, errm errmVar) {
        this.b = enhk.j(map);
        this.c = ffbrVar;
        this.e = avlgVar;
        this.d = errmVar;
    }

    private final eofx d() {
        avlg avlgVar = this.e;
        Object b = avlgVar.c.b();
        b.getClass();
        Duration ofMillis = Duration.ofMillis(((Number) b).longValue());
        ofMillis.getClass();
        return eofx.d(ofMillis, 2.0d, (int) ((Number) avlgVar.d.b()).longValue());
    }

    @Override // defpackage.avrk
    public final elfl a(final Iterable iterable) {
        Logger logger = eogi.a;
        eogf eogfVar = new eogf();
        eogfVar.b(this.d);
        eogfVar.b = new avqh();
        return elfl.g(eogfVar.a(eldl.b(new emyl() { // from class: avqc
            @Override // defpackage.emyl
            public final Object get() {
                return avqi.this.c().a(iterable);
            }
        }), d(), new avqd())).f(eofq.class, new eroh() { // from class: avqe
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                entd entdVar = avqi.a;
                return elfo.d(new avlo("RetryingFuture failed to fetch RCS capabilities for batch.", ((eofq) obj).getCause()));
            }
        }, this.d);
    }

    @Override // defpackage.avrk
    public final elfl b(final awui awuiVar) {
        Logger logger = eogi.a;
        eogf eogfVar = new eogf();
        eogfVar.b(this.d);
        eogfVar.b = new avqh();
        return elfl.g(eogfVar.a(eldl.b(new emyl() { // from class: avqf
            @Override // defpackage.emyl
            public final Object get() {
                return avqi.this.c().b(awuiVar);
            }
        }), d(), new avqd())).f(eofq.class, new eroh() { // from class: avqg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                entd entdVar = avqi.a;
                return elfo.d(new avlo("RetryingFuture failed to fetch RCS capabilities.", ((eofq) obj).getCause()));
            }
        }, this.d);
    }

    public final avrk c() {
        eqna d = ((crgh) this.c.b()).d();
        ffbr ffbrVar = (ffbr) this.b.get(d);
        d.name();
        ffbrVar.getClass();
        return (avrk) ffbrVar.b();
    }
}
