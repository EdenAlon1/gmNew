package defpackage;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ame {
    public bdy a;
    public bgk b;
    public final amd c;
    public final Size d;
    public final agn e;
    private final arw f;
    private bgd g;

    public ame(apd apdVar, ala alaVar, agn agnVar) {
        Size size;
        arw arwVar = new arw();
        this.f = arwVar;
        Size size2 = null;
        this.g = null;
        this.c = new amd();
        this.e = agnVar;
        Size[] b = apdVar.b().b(34);
        if (b == null) {
            avw.c("MeteringRepeating", "Can not get output size list.");
            size = new Size(0, 0);
        } else {
            if (arwVar.c != null && RepeatingStreamConstraintForVideoRecordingQuirk.a()) {
                ArrayList arrayList = new ArrayList();
                for (Size size3 : b) {
                    if (arw.b.compare(size3, arw.a) >= 0) {
                        arrayList.add(size3);
                    }
                }
                b = (Size[]) arrayList.toArray(new Size[0]);
            }
            List asList = Arrays.asList(b);
            Collections.sort(asList, new Comparator() { // from class: amb
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Size size4 = (Size) obj;
                    Size size5 = (Size) obj2;
                    return Long.signum((size4.getWidth() * size4.getHeight()) - (size5.getWidth() * size5.getHeight()));
                }
            });
            Size b2 = alaVar.b();
            long min = Math.min(b2.getWidth() * b2.getHeight(), 307200L);
            int length = b.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Size size4 = b[i];
                long width = size4.getWidth() * size4.getHeight();
                if (width == min) {
                    size = size4;
                    break;
                } else if (width <= min) {
                    i++;
                    size2 = size4;
                } else if (size2 != null) {
                    size = size2;
                }
            }
            size = (Size) asList.get(0);
        }
        this.d = size;
        Objects.toString(size);
        avw.a("MeteringRepeating", "MeteringSession SurfaceTexture size: ".concat(String.valueOf(size)));
        this.b = a();
    }

    final bgk a() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = this.d;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        bgc a = bgc.a(this.c, this.d);
        a.t(1);
        bew bewVar = new bew(surface);
        this.a = bewVar;
        bkj.i(bewVar.c(), new amc(surface, surfaceTexture), bjb.a());
        a.m(this.a);
        bgd bgdVar = this.g;
        if (bgdVar != null) {
            bgdVar.b();
        }
        bgd bgdVar2 = new bgd(new bge() { // from class: ama
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.bge
            public final void a(bgk bgkVar) {
                ame ameVar = ame.this;
                ameVar.b = ameVar.a();
                final ahu ahuVar = ameVar.e.a;
                try {
                    if (((Boolean) kfg.a(new kfd() { // from class: agz
                        @Override // defpackage.kfd
                        public final Object a(kfb kfbVar) {
                            return ahu.this.i(kfbVar);
                        }
                    }).get()).booleanValue()) {
                        ame ameVar2 = ahuVar.t;
                        ahuVar.z(ahu.k(ameVar2), ameVar2.b, ameVar2.c, null, Collections.singletonList(bhj.METERING_REPEATING));
                    }
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e);
                }
            }
        });
        this.g = bgdVar2;
        a.f = bgdVar2;
        return a.b();
    }
}
