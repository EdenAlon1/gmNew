package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdd implements jvj {
    final /* synthetic */ gde a;

    public gdd(gde gdeVar) {
        this.a = gdeVar;
    }

    @Override // defpackage.jvj
    public final int a(int i) {
        gde gdeVar = this.a;
        if (i < gdeVar.a) {
            return i;
        }
        if (i < gdeVar.b) {
            return i + 1;
        }
        int i2 = gdeVar.c;
        return i <= i2 ? i + 2 : i2 + 2;
    }

    @Override // defpackage.jvj
    public final int b(int i) {
        gde gdeVar = this.a;
        if (i <= gdeVar.a - 1) {
            return i;
        }
        if (i <= gdeVar.b - 1) {
            return i - 1;
        }
        int i2 = gdeVar.c;
        return i > i2 + 1 ? i2 : i - 2;
    }
}
