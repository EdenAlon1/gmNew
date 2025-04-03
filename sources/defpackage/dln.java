package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dln implements drd {
    final /* synthetic */ dlq a;
    final /* synthetic */ dlu b;

    public dln(dlq dlqVar, dlu dluVar) {
        this.a = dlqVar;
        this.b = dluVar;
    }

    @Override // defpackage.drd
    public final float a(float f) {
        float b = this.a.a.b(f);
        float a = b - this.a.a.a();
        dkw.a(this.b, b);
        return a;
    }
}
