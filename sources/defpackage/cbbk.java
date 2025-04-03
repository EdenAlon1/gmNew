package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cbbk extends cbcc {
    public final int d;

    public cbbk(String str, int i, cqoh cqohVar) {
        super(str, cqohVar);
        this.d = i;
    }

    public int c() {
        return this.d;
    }

    public abstract Bitmap d();

    public abstract Bitmap e();

    public abstract Drawable f(Resources resources);

    public abstract boolean i();

    public abstract byte[] j();
}
