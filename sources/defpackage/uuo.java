package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uuo implements ejlr<MessageIdType, Void> {
    final /* synthetic */ uuy a;

    public uuo(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void c(Object obj, Object obj2) {
        ura uraVar = this.a.aB.c;
        enip keySet = ((enhk) uraVar.k).keySet();
        uraVar.d.getClass();
        int i = 0;
        while (true) {
            mz mzVar = uraVar.d;
            if (i >= mzVar.g) {
                return;
            }
            if (keySet.contains(((bcse) mzVar.e(i)).u())) {
                uraVar.q(i);
            }
            i++;
        }
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        csjy.p("Bugle", th, "Error: reminder fired in conversation. ".concat(String.valueOf(String.valueOf(this.a.ap))));
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
