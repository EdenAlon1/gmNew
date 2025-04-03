package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qpk extends qol {
    private static final Object m = new Object();
    private final Object n;
    private qoq o;
    private final Bitmap.Config p;

    public qpk(String str, qoq qoqVar, Bitmap.Config config, qop qopVar) {
        super(str, qopVar);
        this.n = new Object();
        this.k = new qoa(1000, 2, 2.0f);
        this.o = qoqVar;
        this.p = config;
    }

    @Override // defpackage.qol
    protected final qor b(qoh qohVar) {
        qor qorVar;
        synchronized (m) {
            try {
                try {
                    byte[] bArr = qohVar.b;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inPreferredConfig = this.p;
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    qorVar = decodeByteArray == null ? new qor(new qoj(qohVar)) : new qor(decodeByteArray, qpg.b(qohVar));
                } catch (OutOfMemoryError e) {
                    qox.b("Caught OOM for %d byte image, url=%s", Integer.valueOf(qohVar.b.length), this.b);
                    return new qor(new qoj(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qorVar;
    }

    @Override // defpackage.qol
    public final void e() {
        super.e();
        synchronized (this.n) {
            this.o = null;
        }
    }

    @Override // defpackage.qol
    protected final /* bridge */ /* synthetic */ void f(Object obj) {
        qoq qoqVar;
        Bitmap bitmap = (Bitmap) obj;
        synchronized (this.n) {
            qoqVar = this.o;
        }
        if (qoqVar != null) {
            qoqVar.a(bitmap);
        }
    }

    @Override // defpackage.qol
    public final int k() {
        return 1;
    }
}
