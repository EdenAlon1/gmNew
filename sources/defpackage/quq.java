package defpackage;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class quq implements que {
    @Override // defpackage.que
    public final /* synthetic */ quf a(Object obj) {
        return new ParcelFileDescriptorRewinder((ParcelFileDescriptor) obj);
    }

    @Override // defpackage.que
    public final Class b() {
        return ParcelFileDescriptor.class;
    }
}
