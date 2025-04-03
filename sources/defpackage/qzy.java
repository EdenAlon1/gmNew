package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qzy implements rao {
    private final qzv a;

    public qzy(qzv qzvVar) {
        this.a = qzvVar;
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ ran a(Object obj, int i, int i2, qtu qtuVar) {
        File file = (File) obj;
        return new ran(new rjn(file), new qzu(file, this.a));
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
