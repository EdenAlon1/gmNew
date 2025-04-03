package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtk implements qtl {
    final /* synthetic */ ParcelFileDescriptorRewinder a;
    final /* synthetic */ qxd b;

    public qtk(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, qxd qxdVar) {
        this.a = parcelFileDescriptorRewinder;
        this.b = qxdVar;
    }

    @Override // defpackage.qtl
    public final boolean a(ImageHeaderParser imageHeaderParser) {
        ree reeVar;
        try {
            reeVar = new ree(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
            try {
                boolean e = imageHeaderParser.e(reeVar, this.b);
                reeVar.b();
                this.a.a();
                return e;
            } catch (Throwable th) {
                th = th;
                if (reeVar != null) {
                    reeVar.b();
                }
                this.a.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            reeVar = null;
        }
    }
}
