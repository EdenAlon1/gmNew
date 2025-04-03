package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rbv implements rao {
    public static final qtt a = new qtt("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500, qtt.a);
    private final ram b;

    public rbv(ram ramVar) {
        this.b = ramVar;
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ ran a(Object obj, int i, int i2, qtu qtuVar) {
        ram ramVar = this.b;
        qzz qzzVar = (qzz) obj;
        if (ramVar != null) {
            qzz qzzVar2 = (qzz) ramVar.a(qzzVar, 0, 0);
            if (qzzVar2 == null) {
                this.b.b(qzzVar, 0, 0, qzzVar);
            } else {
                qzzVar = qzzVar2;
            }
        }
        return new ran(qzzVar, new qum(qzzVar, ((Integer) qtuVar.b(a)).intValue()));
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }

    public rbv() {
        this(null);
    }
}
