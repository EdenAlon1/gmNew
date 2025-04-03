package androidx.compose.ui.input.pointer;

import defpackage.ffkj;
import defpackage.hvh;
import defpackage.imf;
import defpackage.ivp;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends ivp<imf> {
    private final Object a;
    private final Object b;
    private final Object[] c;
    private final PointerInputEventHandler d;

    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i) {
        this.a = 1 == (i & 1) ? null : obj;
        this.b = (i & 2) != 0 ? null : obj2;
        this.c = (i & 4) != 0 ? null : objArr;
        this.d = pointerInputEventHandler;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new imf(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        imf imfVar = (imf) hvhVar;
        Object obj = imfVar.a;
        Object obj2 = this.a;
        boolean z = !ffkj.e(obj, obj2);
        imfVar.a = obj2;
        Object obj3 = imfVar.b;
        Object obj4 = this.b;
        boolean z2 = !ffkj.e(obj3, obj4);
        imfVar.b = obj4;
        Object[] objArr = imfVar.c;
        boolean z3 = z | z2;
        Object[] objArr2 = this.c;
        if (objArr != null && objArr2 == null) {
            z3 = true;
        }
        if (objArr == null && objArr2 != null) {
            z3 = true;
        }
        boolean z4 = (objArr == null || objArr2 == null || Arrays.equals(objArr2, objArr)) ? z3 : true;
        PointerInputEventHandler pointerInputEventHandler = this.d;
        imfVar.c = objArr2;
        if (imfVar.e.getClass() != pointerInputEventHandler.getClass() || z4) {
            imfVar.q();
        }
        imfVar.e = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!ffkj.e(this.a, suspendPointerInputElement.a) || !ffkj.e(this.b, suspendPointerInputElement.b)) {
            return false;
        }
        Object[] objArr = this.c;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.c;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.c != null) {
            return false;
        }
        return this.d == suspendPointerInputElement.d;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.b;
        int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
        int i = hashCode * 31;
        Object[] objArr = this.c;
        return ((((i + hashCode2) * 31) + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31) + this.d.hashCode();
    }
}
