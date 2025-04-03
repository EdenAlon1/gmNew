package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejdc extends efet {
    private static final enru b = enru.c("com/google/apps/tiktok/account/data/manager/AccountDataStoreIOExceptionHandler");
    public final ejep a;
    private final emxc c;
    private final ffbr d;
    private final Executor e;

    public ejdc(ejep ejepVar, emxc emxcVar, ffbr ffbrVar, Executor executor) {
        this.a = ejepVar;
        this.c = emxcVar;
        this.d = ffbrVar;
        this.e = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.efet
    public final ListenableFuture a(final IOException iOException, final efeu efeuVar) {
        if (!((Boolean) ((emxn) this.c).a).booleanValue()) {
            return erqt.h(iOException);
        }
        if (!(iOException instanceof FileNotFoundException) && !(iOException.getCause() instanceof FileNotFoundException) && !(iOException instanceof eygu) && !(iOException.getCause() instanceof eygu)) {
            return erqt.h(iOException);
        }
        ((enrr) ((enrr) ((enrr) b.i()).g(iOException)).h("com/google/apps/tiktok/account/data/manager/AccountDataStoreIOExceptionHandler", "handleReadException", (char) 127, "AccountDataStoreIOExceptionHandler.java")).q("AccountDataStore read failed. Trying to recover by resetting the store and wiping out all the account data.");
        engw b2 = this.a.b(false);
        int i = ((enou) b2).c;
        final int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            int parseInt = Integer.parseInt(((File) b2.get(i3)).getName());
            if (parseInt > i2) {
                i2 = parseInt;
            }
        }
        Set<cwon> set = (Set) this.d.b();
        ArrayList arrayList = new ArrayList(set.size());
        for (final cwon cwonVar : set) {
            cwonVar.getClass();
            arrayList.add(erqt.n(eldl.c(new erog() { // from class: ejcy
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    final cwon cwonVar2 = cwon.this;
                    return elfo.f(new Runnable() { // from class: cwom
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((csrf) cwon.this.a.b()).b("Bugle.Gaia.CorruptedPds.Counts");
                        }
                    }, erpp.a);
                }
            }), erpp.a));
        }
        return ernq.g(erny.g(erny.g(erqc.o(erqt.a(arrayList).a(new eroi(null), this.e)), eldl.d(new eroh() { // from class: ejcz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ejep ejepVar = ejdc.this.a;
                return ejepVar.c(ejepVar.b(true));
            }
        }), this.e), eldl.d(new eroh() { // from class: ejda
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ejdw ejdwVar = (ejdw) ejdx.a.createBuilder();
                int i4 = i2;
                int i5 = i4 == -1 ? 1 : i4 + 1;
                efeu efeuVar2 = efeu.this;
                ejdwVar.copyOnWrite();
                ejdx ejdxVar = (ejdx) ejdwVar.instance;
                ejdxVar.b = 1 | ejdxVar.b;
                ejdxVar.c = i5;
                return efeuVar2.a(erqt.i((ejdx) ejdwVar.build()));
            }
        }), this.e), IOException.class, eldl.d(new eroh() { // from class: ejdb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                IOException iOException2 = iOException;
                iOException2.addSuppressed((IOException) obj);
                throw iOException2;
            }
        }), erpp.a);
    }
}
