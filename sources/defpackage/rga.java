package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rga implements rge {
    private final Bitmap.CompressFormat a = Bitmap.CompressFormat.JPEG;

    @Override // defpackage.rge
    public final qwv a(qwv qwvVar, qtu qtuVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) qwvVar.c()).compress(this.a, 100, byteArrayOutputStream);
        qwvVar.e();
        return new rey(byteArrayOutputStream.toByteArray());
    }
}
