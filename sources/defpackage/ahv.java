package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahv implements bcq {
    public final String a;
    public final apd b;
    public final asj c;
    public agj e;
    public final bit h;
    public final bfx j;
    private final bee k;
    public final Object d = new Object();
    public bit f = null;
    public bit g = null;
    public List i = null;

    public ahv(String str, apu apuVar) {
        ksw.h(str);
        this.a = str;
        apd a = apuVar.a(str);
        this.b = a;
        this.c = new asj(this);
        bfx a2 = aqy.a(a);
        this.j = a2;
        this.k = new ajv(str, a2);
        this.h = new bit(new ast(5, null));
    }

    @Override // defpackage.ati
    public final int a() {
        Integer num = (Integer) this.b.c(CameraCharacteristics.LENS_FACING);
        ksw.b(num != null, "Unable to get the lens facing of the camera.");
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 1;
        }
        if (intValue == 2) {
            return 2;
        }
        throw new IllegalArgumentException(a.f(intValue, "The given lens facing integer: ", " can not be recognized."));
    }

    @Override // defpackage.ati
    public final int b() {
        return c(0);
    }

    @Override // defpackage.ati
    public final int c(int i) {
        Integer num = (Integer) this.b.c(CameraCharacteristics.SENSOR_ORIENTATION);
        ksw.h(num);
        return bhp.a(bhp.b(i), num.intValue(), a() == 1);
    }

    final int d() {
        Integer num = (Integer) this.b.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        ksw.h(num);
        return num.intValue();
    }

    @Override // defpackage.bcq
    public final bee f() {
        return this.k;
    }

    @Override // defpackage.bcq
    public final bfx g() {
        return this.j;
    }

    @Override // defpackage.ati
    public final lld h() {
        synchronized (this.d) {
            agj agjVar = this.e;
            if (agjVar == null) {
                if (this.f == null) {
                    this.f = new bit(0);
                }
                return this.f;
            }
            bit bitVar = this.f;
            if (bitVar != null) {
                return bitVar;
            }
            return agjVar.f.b;
        }
    }

    @Override // defpackage.ati
    public final lld i() {
        synchronized (this.d) {
            agj agjVar = this.e;
            if (agjVar != null) {
                bit bitVar = this.g;
                if (bitVar != null) {
                    return bitVar;
                }
                return agjVar.e.d;
            }
            if (this.g == null) {
                anv a = anw.a(this.b);
                anx anxVar = new anx(a.a(), a.b());
                anxVar.d(1.0f);
                this.g = new bit(blb.e(anxVar));
            }
            return this.g;
        }
    }

    @Override // defpackage.bcq
    public final Object j() {
        return this.b.b.a;
    }

    @Override // defpackage.bcq
    public final String k() {
        return this.a;
    }

    @Override // defpackage.ati
    public final String l() {
        return d() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // defpackage.bcq
    public final List m(int i) {
        Size[] b = this.b.b().b(i);
        return b != null ? Arrays.asList(b) : Collections.EMPTY_LIST;
    }

    @Override // defpackage.bcq
    public final Set n() {
        return aqf.b(this.b).c();
    }

    @Override // defpackage.bcq
    public final Set o() {
        int[] iArr;
        try {
            iArr = this.b.b().b.a.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e) {
            avw.g("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e);
            iArr = null;
        }
        int[] iArr2 = iArr != null ? (int[]) iArr.clone() : null;
        if (iArr2 == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (int i : iArr2) {
            hashSet.add(Integer.valueOf(i));
        }
        return hashSet;
    }

    @Override // defpackage.bcq
    public final void p(Executor executor, bbt bbtVar) {
        synchronized (this.d) {
            agj agjVar = this.e;
            if (agjVar != null) {
                agjVar.q(executor, bbtVar);
                return;
            }
            if (this.i == null) {
                this.i = new ArrayList();
            }
            this.i.add(new Pair(bbtVar, executor));
        }
    }

    @Override // defpackage.bcq
    public final void q(final bbt bbtVar) {
        synchronized (this.d) {
            final agj agjVar = this.e;
            if (agjVar != null) {
                agjVar.b.execute(new Runnable() { // from class: aga
                    @Override // java.lang.Runnable
                    public final void run() {
                        agf agfVar = agj.this.l;
                        Set set = agfVar.a;
                        bbt bbtVar2 = bbtVar;
                        set.remove(bbtVar2);
                        agfVar.b.remove(bbtVar2);
                    }
                });
                return;
            }
            List list = this.i;
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Pair) it.next()).first == bbtVar) {
                    it.remove();
                }
            }
        }
    }

    @Override // defpackage.bcq
    public final boolean r() {
        int[] iArr = (int[]) this.b.c(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.bcq
    public final int s() {
        Integer num = (Integer) this.b.c(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        ksw.h(num);
        return num.intValue() != 1 ? 1 : 2;
    }

    @Override // defpackage.bcq
    public final /* synthetic */ bcq e() {
        return this;
    }
}
