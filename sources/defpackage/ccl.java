package defpackage;

import android.os.Trace;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ccl implements cck {
    private final bqc a;

    public ccl(bqc bqcVar) {
        this.a = bqcVar;
    }

    @Override // defpackage.cck
    public final ata a(lkr lkrVar, atl atlVar, axx axxVar) {
        lkrVar.getClass();
        atlVar.getClass();
        ozg.a("CX:bindToLifecycle-UseCaseGroup");
        bpx bpxVar = this.a.b;
        try {
            bpxVar.e();
            bpxVar.b(1);
            atz atzVar = atz.a;
            atzVar.getClass();
            atz atzVar2 = atz.a;
            atzVar2.getClass();
            axy axyVar = axxVar.a;
            List list = axxVar.c;
            axv[] axvVarArr = (axv[]) axxVar.b.toArray(new axv[0]);
            return bpx.d(bpxVar, lkrVar, atlVar, atzVar, atzVar2, axyVar, list, (axv[]) Arrays.copyOf(axvVarArr, axvVarArr.length));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.cck
    public final ati b(atl atlVar) {
        atlVar.getClass();
        return this.a.b.a(atlVar);
    }

    @Override // defpackage.cck
    public final void c(axv... axvVarArr) {
        axv[] axvVarArr2 = (axv[]) Arrays.copyOf(axvVarArr, axvVarArr.length);
        axvVarArr2.getClass();
        ozg.a("CX:unbind");
        bpx bpxVar = this.a.b;
        try {
            biw.b();
            bpxVar.e();
            LifecycleCameraRepository lifecycleCameraRepository = bpxVar.d;
            List g = ffdx.g(Arrays.copyOf(axvVarArr2, axvVarArr2.length));
            synchronized (lifecycleCameraRepository.c) {
                Iterator it = lifecycleCameraRepository.d.keySet().iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) lifecycleCameraRepository.d.get((bpy) it.next());
                    boolean isEmpty = lifecycleCamera.d().isEmpty();
                    synchronized (lifecycleCamera.a) {
                        ArrayList arrayList = new ArrayList(g);
                        arrayList.retainAll(lifecycleCamera.c.d());
                        lifecycleCamera.c.g(arrayList);
                    }
                    if (!isEmpty && lifecycleCamera.d().isEmpty()) {
                        lifecycleCameraRepository.d(lifecycleCamera.a());
                    }
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.cck
    public final void d() {
        this.a.a();
    }

    @Override // defpackage.cck
    public final boolean e(atl atlVar) {
        return this.a.b(atlVar);
    }
}
