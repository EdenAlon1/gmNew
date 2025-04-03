package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ikh {
    public final hne d = new hne(new ikg[16]);
    public final cok e = new cok(10);

    public boolean c(cno cnoVar, ioc iocVar, ikd ikdVar, boolean z) {
        hne hneVar = this.d;
        Object[] objArr = hneVar.a;
        int i = hneVar.b;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((ikg) objArr[i2]).c(cnoVar, iocVar, ikdVar, z) || z2;
        }
        return z2;
    }

    public final void f() {
        int i = this.d.b;
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            hne hneVar = this.d;
            if (((ikg) hneVar.a[i]).b.a == 0) {
                hneVar.c(i);
            }
        }
    }
}
