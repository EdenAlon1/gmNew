package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ivt {
    public hvh a;
    public int b;
    public hne c;
    public hne d;
    public boolean e;
    final /* synthetic */ ivu f;

    public ivt(ivu ivuVar, hvh hvhVar, int i, hne hneVar, hne hneVar2, boolean z) {
        this.f = ivuVar;
        this.a = hvhVar;
        this.b = i;
        this.c = hneVar;
        this.d = hneVar2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        hne hneVar = this.c;
        int i3 = this.b;
        return ivx.a((hvg) hneVar.a[i + i3], (hvg) this.d.a[i3 + i2]) != 0;
    }
}
