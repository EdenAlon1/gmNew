package defpackage;

import android.content.Context;
import android.view.GestureDetector;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdm {
    public final int a;
    public int b;
    public int c;
    public final boolean d = true;
    public final boolean e = true;
    public float f;
    public float g;
    public float h;
    public float i;
    public long j;
    public boolean k;
    public float l;
    public float m;
    public float n;
    public int o;
    public final GestureDetector p;
    public boolean q;
    public final cbz r;
    private final Context s;

    public cdm(Context context, int i, cbz cbzVar) {
        this.s = context;
        this.a = i;
        this.r = cbzVar;
        this.p = new GestureDetector(context, new cdl(this));
    }

    public final float a() {
        if (!b()) {
            float f = this.g;
            if (f > 0.0f) {
                return this.f / f;
            }
            return 1.0f;
        }
        boolean z = true;
        if (!this.q ? this.f <= this.g : this.f >= this.g) {
            z = false;
        }
        float abs = Math.abs(1.0f - (this.f / this.g)) * 0.5f;
        if (this.g <= this.a) {
            return 1.0f;
        }
        return z ? abs + 1.0f : 1.0f - abs;
    }

    public final boolean b() {
        return this.o != 0;
    }
}
