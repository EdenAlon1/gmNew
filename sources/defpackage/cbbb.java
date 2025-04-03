package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbbb extends cbbk {
    private final byte[] a;

    public cbbb(String str, byte[] bArr, cqoh cqohVar) {
        super(str, 1, cqohVar);
        this.a = bArr;
    }

    @Override // defpackage.cbcc
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.cbbk
    public final Bitmap d() {
        throw new cbbj();
    }

    @Override // defpackage.cbbk
    public final Bitmap e() {
        return null;
    }

    @Override // defpackage.cbbk
    public final Drawable f(Resources resources) {
        throw new cbbj();
    }

    @Override // defpackage.cbcc
    public final boolean h() {
        return true;
    }

    @Override // defpackage.cbbk
    public final boolean i() {
        return false;
    }

    @Override // defpackage.cbbk
    public final byte[] j() {
        return this.a;
    }

    @Override // defpackage.cbcc
    protected final void b() {
    }
}
