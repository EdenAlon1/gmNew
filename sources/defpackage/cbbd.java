package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbbd extends cbbk {
    public final byte[] a;
    public final ctap b;

    public cbbd(String str, byte[] bArr, int i, cqoh cqohVar, ctap ctapVar) {
        super(str, i, cqohVar);
        this.a = bArr;
        this.b = ctapVar;
    }

    @Override // defpackage.cbcc
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.cbbk
    public final Bitmap d() {
        o();
        try {
            csix.h();
            byte[] bArr = this.a;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        } finally {
            r();
        }
    }

    @Override // defpackage.cbbk
    public final Bitmap e() {
        return null;
    }

    @Override // defpackage.cbbk
    public final Drawable f(Resources resources) {
        return null;
    }

    @Override // defpackage.cbbk
    public final boolean i() {
        return false;
    }

    @Override // defpackage.cbbk
    public final byte[] j() {
        o();
        try {
            byte[] bArr = this.a;
            return Arrays.copyOf(bArr, bArr.length);
        } finally {
            r();
        }
    }

    @Override // defpackage.cbcc
    public final boolean k() {
        return true;
    }

    @Override // defpackage.cbcc
    public final cbbn l() {
        csix.k(true);
        return new cbbc(this);
    }

    @Override // defpackage.cbcc
    protected final void b() {
    }
}
