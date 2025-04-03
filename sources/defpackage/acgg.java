package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgg implements SensorEventListener {
    public static final cskc a = cskc.g("Bugle", "BugleAcceleratorSensorListener");
    public double b;
    public long c;
    public int d;
    public double e;
    public long f;
    public final Sensor g;
    public final SensorManager h;
    public ListenableFuture j;
    public final errl k;
    private final cqoh l;
    final Set i = new HashSet();
    private final float[] m = new float[3];
    private final acgk n = acgk.a();
    private final ArrayDeque o = new ArrayDeque();
    private long p = 0;

    public acgg(Context context, cqoh cqohVar, errl errlVar) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.h = sensorManager;
        this.g = sensorManager.getDefaultSensor(1);
        this.l = cqohVar;
        this.k = errlVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.m;
        float f = (fArr2[0] * 0.8f) + (fArr[0] * 0.19999999f);
        fArr2[0] = f;
        float f2 = (fArr2[1] * 0.8f) + (fArr[1] * 0.19999999f);
        fArr2[1] = f2;
        float f3 = (fArr2[2] * 0.8f) + (fArr[2] * 0.19999999f);
        fArr2[2] = f3;
        fArr[0] = fArr[0] - f;
        fArr[1] = fArr[1] - f2;
        fArr[2] = fArr[2] - f3;
        this.n.b(fArr);
        if (this.n.b > this.b) {
            long a2 = this.l.a();
            acgl acglVar = new acgl(acgk.a(), acgk.a());
            float[] fArr3 = this.m;
            acglVar.a.b(fArr);
            acglVar.b.b(fArr3);
            acglVar.c = a2;
            this.o.add(acglVar);
            long j = a2 - this.c;
            while (!this.o.isEmpty() && ((acgl) this.o.getFirst()).c < j) {
                this.o.removeFirst();
            }
            if (this.o.size() >= this.d) {
                acgl acglVar2 = (acgl) this.o.getFirst();
                acgl acglVar3 = (acgl) this.o.getLast();
                acgk acgkVar = acglVar2.b;
                acgk acgkVar2 = acglVar3.b;
                float[] fArr4 = acgkVar.a;
                float[] fArr5 = acgkVar2.a;
                boolean z = ((double) (((fArr4[0] * fArr5[0]) + (fArr4[1] * fArr5[1])) + (fArr4[2] * fArr5[2]))) / (acgkVar.b * acgkVar2.b) < this.e;
                this.o.clear();
                if (z) {
                    return;
                }
                long a3 = this.l.a();
                if (this.p + this.f <= a3) {
                    a.p("Shake detected");
                    Iterator it = this.i.iterator();
                    while (it.hasNext()) {
                        ((acgf) it.next()).g();
                    }
                    this.p = a3;
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
