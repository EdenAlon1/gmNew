package defpackage;

import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eirq {
    public wf a;
    public wo b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final /* synthetic */ SpannedGridLayoutManager i;

    public eirq(SpannedGridLayoutManager spannedGridLayoutManager) {
        this.i = spannedGridLayoutManager;
    }

    public final boolean a() {
        int i;
        if (this.f) {
            i = this.i.a.c(this.c);
            this.c = i;
        } else {
            eirr eirrVar = this.i.a;
            int i2 = this.c;
            int a = eirrVar.a(i2);
            while (i2 > 0 && eirrVar.a(i2) == a) {
                i2--;
            }
            i = eirrVar.a(i2) == a ? -1 : i2;
            this.c = i;
        }
        return this.i.a.f(i);
    }
}
