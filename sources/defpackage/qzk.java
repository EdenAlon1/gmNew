package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qzk implements rao {
    @Override // defpackage.rao
    public final ran a(Object obj, int i, int i2, qtu qtuVar) {
        return new ran(new rjn(obj), new qzh(obj.toString()));
    }

    @Override // defpackage.rao
    public final boolean b(Object obj) {
        return obj.toString().startsWith("data:image");
    }
}
