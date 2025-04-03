package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class reb implements qwv, qwq {
    private final Resources a;
    private final qwv b;

    private reb(Resources resources, qwv qwvVar) {
        rkf.f(resources);
        this.a = resources;
        rkf.f(qwvVar);
        this.b = qwvVar;
    }

    public static qwv f(Resources resources, qwv qwvVar) {
        if (qwvVar == null) {
            return null;
        }
        return new reb(resources, qwvVar);
    }

    @Override // defpackage.qwv
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.qwv
    public final Class b() {
        return BitmapDrawable.class;
    }

    @Override // defpackage.qwv
    public final /* bridge */ /* synthetic */ Object c() {
        return new BitmapDrawable(this.a, (Bitmap) this.b.c());
    }

    @Override // defpackage.qwq
    public final void d() {
        qwv qwvVar = this.b;
        if (qwvVar instanceof qwq) {
            ((qwq) qwvVar).d();
        }
    }

    @Override // defpackage.qwv
    public final void e() {
        this.b.e();
    }
}
