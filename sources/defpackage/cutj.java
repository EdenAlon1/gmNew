package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cutj extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ cutp c;
    final /* synthetic */ Uri d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cutj(cutp cutpVar, Uri uri, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = cutpVar;
        this.d = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cutj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ParcelFileDescriptor parcelFileDescriptor;
        ?? r0;
        Throwable th;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            r0 = this.a;
            try {
                ffci.b(obj);
                r0 = r0;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    ffig.a(r0, th);
                    throw th3;
                }
            }
        } else {
            ffci.b(obj);
            cutp cutpVar = this.c;
            Uri uri = this.d;
            if (cbgi.k(uri, cutpVar.b)) {
                ensk h = cutp.a.h();
                h.Y(ente.a, "BugleSpam");
                ((enrr) h.h("com/google/android/apps/messaging/shared/util/spam/spatula/HaasProxyImpl", "openImageFileDescriptor", 199, "HaasProxyImpl.kt")).q("Opening file from scratch space");
                parcelFileDescriptor = ParcelFileDescriptor.open(cbgi.i(uri, cutpVar.b), VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                parcelFileDescriptor.getClass();
            } else {
                parcelFileDescriptor = eepn.a(cutpVar.b, uri, "r", cutpVar.c(uri)).getParcelFileDescriptor();
                parcelFileDescriptor.getClass();
            }
            try {
                dlkb dlkbVar = (dlkb) this.c.c.b();
                this.a = parcelFileDescriptor;
                this.b = 1;
                Object a = dlkbVar.a(1, parcelFileDescriptor, this);
                if (a == ffhhVar) {
                    return ffhhVar;
                }
                r0 = parcelFileDescriptor;
                obj = a;
            } catch (Throwable th4) {
                r0 = parcelFileDescriptor;
                th = th4;
                throw th;
            }
        }
        dlka dlkaVar = (dlka) obj;
        ffig.a(r0, null);
        return dlkaVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cutj(this.c, this.d, ffguVar);
    }
}
