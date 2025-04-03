package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbmk {
    public final fazb a;
    public final ffbr b;
    public final errl c;
    public final errl d;

    public dbmk(fazb fazbVar, ffbr ffbrVar, errl errlVar, errl errlVar2) {
        this.a = fazbVar;
        this.b = ffbrVar;
        this.c = errlVar;
        this.d = errlVar2;
    }

    public final elfl a(final int i) {
        return elfo.g(new Callable() { // from class: dbme
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ((chco) dbmk.this.b.b()).g(i);
            }
        }, this.c).i(new eroh() { // from class: dbmf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((chbx) dbmk.this.a.b()).b((String) obj);
            }
        }, this.c);
    }
}
