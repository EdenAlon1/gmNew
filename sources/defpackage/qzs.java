package defpackage;

import android.os.ParcelFileDescriptor;
import com.android.vcard.VCardConfig;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qzs implements qzv {
    @Override // defpackage.qzv
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.qzv
    public final /* bridge */ /* synthetic */ Object b(File file) {
        return ParcelFileDescriptor.open(file, VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
    }

    @Override // defpackage.qzv
    public final /* synthetic */ void c(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }
}
