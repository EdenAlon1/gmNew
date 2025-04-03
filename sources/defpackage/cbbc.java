package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbbc implements cbbn {
    final /* synthetic */ cbbd a;

    public cbbc(cbbd cbbdVar) {
        this.a = cbbdVar;
        cbbdVar.p();
    }

    @Override // defpackage.cbbn
    public final int a() {
        return 0;
    }

    @Override // defpackage.cbbn
    public final int b() {
        return 2;
    }

    @Override // defpackage.cbbn
    public final cbbl c() {
        return null;
    }

    @Override // defpackage.cbbn
    public final cbbo d() {
        return null;
    }

    @Override // defpackage.cbbn
    public final /* bridge */ /* synthetic */ cbcc e(List list) {
        csix.h();
        this.a.o();
        try {
            byte[] bArr = this.a.a;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            String f = f();
            cbbd cbbdVar = this.a;
            return new cbaw(f, decodeByteArray, cbbdVar.d, cbbdVar.i, cbbdVar.b);
        } finally {
            this.a.r();
            this.a.q();
        }
    }

    @Override // defpackage.cbbn
    public final String f() {
        return this.a.e;
    }
}
