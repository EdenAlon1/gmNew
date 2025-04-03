package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qth implements qtm {
    final /* synthetic */ ParcelFileDescriptorRewinder a;
    final /* synthetic */ qxd b;

    public qth(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, qxd qxdVar) {
        this.a = parcelFileDescriptorRewinder;
        this.b = qxdVar;
    }

    @Override // defpackage.qtm
    public final int a(ImageHeaderParser imageHeaderParser) {
        ree reeVar;
        try {
            reeVar = new ree(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
            try {
                int a = imageHeaderParser.a(reeVar, this.b);
                reeVar.b();
                this.a.a();
                return a;
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
