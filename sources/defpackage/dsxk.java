package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsxk {
    public final boolean a;
    public final ffix b;
    public final ViewGroup c;
    public final Consumer d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public dsjz k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    private final ffix p;
    private final boolean q;

    public dsxk(boolean z, ffix ffixVar, ViewGroup viewGroup, Consumer consumer, int i, boolean z2, boolean z3, boolean z4, boolean z5, dsjz dsjzVar, boolean z6, boolean z7, boolean z8) {
        this.a = z;
        this.p = null;
        this.b = ffixVar;
        this.c = viewGroup;
        this.d = consumer;
        this.e = i;
        this.f = z2;
        this.q = false;
        this.g = z3;
        this.h = z4;
        this.i = false;
        this.j = z5;
        this.k = dsjzVar;
        this.l = false;
        this.m = z6;
        this.n = z7;
        this.o = z8;
    }

    public final int a() {
        return ((Number) this.b.invoke()).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsxk)) {
            return false;
        }
        dsxk dsxkVar = (dsxk) obj;
        if (this.a != dsxkVar.a) {
            return false;
        }
        ffix ffixVar = dsxkVar.p;
        if (!ffkj.e(null, null) || !ffkj.e(this.b, dsxkVar.b) || !ffkj.e(this.c, dsxkVar.c) || !ffkj.e(this.d, dsxkVar.d) || this.e != dsxkVar.e || this.f != dsxkVar.f) {
            return false;
        }
        boolean z = dsxkVar.q;
        if (this.g != dsxkVar.g || this.h != dsxkVar.h) {
            return false;
        }
        boolean z2 = dsxkVar.i;
        if (this.j != dsxkVar.j || !ffkj.e(this.k, dsxkVar.k)) {
            return false;
        }
        boolean z3 = dsxkVar.l;
        return this.m == dsxkVar.m && this.n == dsxkVar.n && this.o == dsxkVar.o;
    }

    public final int hashCode() {
        int a = (((((dsxj.a(this.a) * 961) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        dsjz dsjzVar = this.k;
        int hashCode = dsjzVar == null ? 0 : dsjzVar.hashCode();
        int i = this.e;
        boolean z = this.f;
        int i2 = ((a * 31) + i) * 31;
        int a2 = dsxj.a(false);
        return ((((((((((((((((((((i2 + dsxj.a(z)) * 31) + a2) * 31) + dsxj.a(this.g)) * 31) + dsxj.a(this.h)) * 31) + dsxj.a(false)) * 31) + dsxj.a(this.j)) * 31) + hashCode) * 31) + dsxj.a(false)) * 31) + dsxj.a(this.m)) * 31) + dsxj.a(this.n)) * 31) + dsxj.a(this.o);
    }

    public final String toString() {
        return "RenderingStrategy(inSeparateWindow=" + this.a + ", minHeightProvider=null, maxHeightProvider=" + this.b + ", anchor=" + this.c + ", heightListener=" + this.d + ", elevationOnScrollPx=" + this.e + ", commitFragmentTransactionsImmediately=" + this.f + ", neverAllowStateLoss=false, ignoreComposeLayoutWithoutVisibleHeight=" + this.g + ", reattachRendererContainerOnRecreate=" + this.h + ", overrideScreenConfigurationOnScreenOpen=false, reopenOpenScreenOnRestore=" + this.j + ", colors=" + this.k + ", closeKeyboardAndInputOnClose=false, checkIfProxyActiveScreenHasChanged=" + this.m + ", detachScreensOnRestore=" + this.n + ", updateInputDisplayWhenOpeningShortcutDirectly=" + this.o + ")";
    }

    public /* synthetic */ dsxk(ffix ffixVar, ViewGroup viewGroup, Consumer consumer, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2) {
        this(1 == (i2 & 1), ffixVar, viewGroup, consumer, (i2 & 32) != 0 ? viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.renderer_elevation_default_value) : i, (!((i2 & 64) == 0)) | z, ((i2 & 256) == 0) & z2, (!((i2 & 512) == 0)) | z3, (!((i2 & 2048) == 0)) | z4, null, ((i2 & 16384) == 0) & z5, ((32768 & i2) == 0) & z6, (!((i2 & 65536) == 0)) | z7);
    }
}
