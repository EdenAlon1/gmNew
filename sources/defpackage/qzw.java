package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qzw implements qzv {
    @Override // defpackage.qzv
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.qzv
    public final /* synthetic */ Object b(File file) {
        return new FileInputStream(file);
    }

    @Override // defpackage.qzv
    public final /* synthetic */ void c(Object obj) {
        ((InputStream) obj).close();
    }
}
