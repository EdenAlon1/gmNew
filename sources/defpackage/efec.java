package defpackage;

import android.net.Uri;
import android.os.Process;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efec implements efbi {
    public efcf[] a;
    private final eyhs b;

    public efec(eyhs eyhsVar) {
        this.b = eyhsVar;
    }

    @Override // defpackage.efbi
    public final /* synthetic */ Object a(efbh efbhVar) {
        AtomicLong atomicLong = efeb.a;
        String str = ".mobstore_tmp-" + Process.myPid() + "-" + Thread.currentThread().getId() + "-" + System.currentTimeMillis() + "-" + efeb.a.getAndIncrement();
        Uri uri = efbhVar.f;
        Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
        List a = efbhVar.a(efbhVar.b.g(build));
        efcf[] efcfVarArr = this.a;
        if (efcfVarArr != null) {
            for (int i = 0; i <= 0; i++) {
                efcfVarArr[i].a(a);
            }
        }
        try {
            OutputStream outputStream = (OutputStream) a.get(0);
            try {
                this.b.writeTo(outputStream);
                efcf[] efcfVarArr2 = this.a;
                if (efcfVarArr2 != null) {
                    for (int i2 = 0; i2 <= 0; i2++) {
                        efcfVarArr2[i2].b();
                    }
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                efbhVar.b.m(build, efbhVar.f);
                return null;
            } finally {
            }
        } catch (Exception e) {
            try {
                efbhVar.b.l(build);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }
}
