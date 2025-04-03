package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feew extends feey {
    final /* synthetic */ feey[] a;

    public feew(feey[] feeyVarArr) {
        this.a = feeyVarArr;
    }

    @Override // defpackage.feey
    public final Status a(int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            feey[] feeyVarArr = this.a;
            if (i2 >= feeyVarArr.length) {
                Iterator it = arrayList.iterator();
                Status status = (Status) it.next();
                while (it.hasNext()) {
                    Status status2 = (Status) it.next();
                    status = status.b(status2.getDescription());
                    Throwable th = status2.t;
                    if (th != null) {
                        Throwable th2 = status.t;
                        if (th2 != null) {
                            th2.addSuppressed(th);
                        } else {
                            status = status.d(th);
                        }
                    }
                }
                return status;
            }
            Status a = feeyVarArr[i2].a(i);
            if (a.f()) {
                return a;
            }
            arrayList.add(a);
            i2++;
        }
    }
}
