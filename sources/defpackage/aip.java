package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aip implements ais {
    final /* synthetic */ air a;

    public aip(air airVar) {
        this.a = airVar;
    }

    @Override // defpackage.ais
    public final ListenableFuture a(TotalCaptureResult totalCaptureResult) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.i.iterator();
        while (it.hasNext()) {
            arrayList.add(((ais) it.next()).a(totalCaptureResult));
        }
        return bkj.f(bkj.a(arrayList), new afd() { // from class: aio
            @Override // defpackage.afd
            public final Object a(Object obj) {
                return Boolean.valueOf(((List) obj).contains(true));
            }
        }, bjb.a());
    }

    @Override // defpackage.ais
    public final void b() {
        Iterator it = this.a.i.iterator();
        while (it.hasNext()) {
            ((ais) it.next()).b();
        }
    }

    @Override // defpackage.ais
    public final boolean c() {
        Iterator it = this.a.i.iterator();
        while (it.hasNext()) {
            if (((ais) it.next()).c()) {
                return true;
            }
        }
        return false;
    }
}
