package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmg {
    public final hne a = new hne(new dmo[16]);

    public final void a(Throwable th) {
        hne hneVar = this.a;
        int i = hneVar.b;
        ffrf[] ffrfVarArr = new ffrf[i];
        for (int i2 = 0; i2 < i; i2++) {
            ffrfVarArr[i2] = ((dmo) hneVar.a[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            ffrfVarArr[i3].h(th);
        }
        if (this.a.b == 0) {
            return;
        }
        dwv.d("uncancelled requests present");
    }
}
