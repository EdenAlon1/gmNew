package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbmj implements ejxi {
    final /* synthetic */ int a;
    final /* synthetic */ dbmk b;

    public dbmj(dbmk dbmkVar, int i) {
        this.a = i;
        this.b = dbmkVar;
    }

    @Override // defpackage.ejxi
    public final ejuj a() {
        return new ejtz("debug_tachyon_state_data_source");
    }

    @Override // defpackage.ejxi
    public final ListenableFuture b() {
        final dbmk dbmkVar = this.b;
        return dbmkVar.a(this.a).i(new eroh() { // from class: dbmi
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                chbu chbuVar = (chbu) obj;
                final elfl d = chbuVar.m().d();
                final elfl e = chbuVar.m().e();
                return elfo.m(d, e).a(eldl.m(new Callable() { // from class: dbmh
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        choc chocVar = (choc) erqt.q(elfl.this);
                        byte[] bArr = (byte[]) erqt.q(e);
                        int ordinal = chocVar.ordinal();
                        return ordinal != 0 ? ordinal != 1 ? (ordinal == 2 || ordinal == 3) ? "REGISTERED" : ordinal != 4 ? "" : "UNKNOWN" : true != Arrays.equals(bArr, new byte[0]) ? "WAITING_FOR_VERIFICATION" : "NOT REGISTERED" : "UNKNOWN";
                    }
                }), dbmk.this.c);
            }
        }, dbmkVar.c);
    }
}
