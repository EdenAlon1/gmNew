package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pcd extends pce {
    final Matrix a;
    final ArrayList b;
    float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    final Matrix j;
    int k;
    public int[] l;
    public String m;

    public pcd() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.m = null;
    }

    public final void a() {
        this.j.reset();
        this.j.postTranslate(-this.d, -this.e);
        this.j.postScale(this.f, this.g);
        this.j.postRotate(this.c, 0.0f, 0.0f);
        this.j.postTranslate(this.h + this.d, this.i + this.e);
    }

    @Override // defpackage.pce
    public final boolean b() {
        for (int i = 0; i < this.b.size(); i++) {
            if (((pce) this.b.get(i)).b()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pce
    public final boolean c(int[] iArr) {
        boolean z = false;
        for (int i = 0; i < this.b.size(); i++) {
            z |= ((pce) this.b.get(i)).c(iArr);
        }
        return z;
    }

    public String getGroupName() {
        return this.m;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            a();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            a();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            a();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            a();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            a();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            a();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            a();
        }
    }

    public pcd(pcd pcdVar, cmh cmhVar) {
        pcf pcbVar;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.m = null;
        this.c = pcdVar.c;
        this.d = pcdVar.d;
        this.e = pcdVar.e;
        this.f = pcdVar.f;
        this.g = pcdVar.g;
        this.h = pcdVar.h;
        this.i = pcdVar.i;
        int[] iArr = pcdVar.l;
        this.l = null;
        String str = pcdVar.m;
        this.m = str;
        int i = pcdVar.k;
        this.k = 0;
        if (str != null) {
            cmhVar.put(str, this);
        }
        matrix.set(pcdVar.j);
        ArrayList arrayList = pcdVar.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof pcd) {
                this.b.add(new pcd((pcd) obj, cmhVar));
            } else {
                if (obj instanceof pcc) {
                    pcbVar = new pcc((pcc) obj);
                } else if (obj instanceof pcb) {
                    pcbVar = new pcb((pcb) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(pcbVar);
                Object obj2 = pcbVar.n;
                if (obj2 != null) {
                    cmhVar.put(obj2, pcbVar);
                }
            }
        }
    }
}
