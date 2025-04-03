package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apqv implements ctbj {
    final /* synthetic */ apqw a;

    public apqv(apqw apqwVar) {
        this.a = apqwVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        final apqw apqwVar = this.a;
        apqwVar.e = ctbt.b(apqwVar.a.e.a(new ctbf() { // from class: apqu
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                final apqw apqwVar2 = apqw.this;
                return !((MessageIdType) obj).equals(apqwVar2.d) ? elfo.e(null) : elfo.f(new Runnable() { // from class: apqr
                    @Override // java.lang.Runnable
                    public final void run() {
                        apqw.this.b.c(new Supplier() { // from class: apqs
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return null;
                            }
                        }, "DownloadingSupplier::Notify");
                    }
                }, apqwVar2.c);
            }
        }, "FileTransferDataService::Register", "FileTransferDataService::Callback", "FileTransferDataService::Unregister"));
    }

    @Override // defpackage.ctbj
    public final void fO() {
        ctbx ctbxVar = this.a.e;
        ctbxVar.getClass();
        ctbxVar.a();
        this.a.e = null;
    }
}
