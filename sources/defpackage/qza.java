package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qza implements qyy {
    @Override // defpackage.qyy
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.qyy
    public final /* synthetic */ Object b(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }
}
