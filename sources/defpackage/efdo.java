package defpackage;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efdo implements efbi {
    @Override // defpackage.efbi
    public final /* bridge */ /* synthetic */ Object a(efbh efbhVar) {
        ParcelFileDescriptor b = efdu.b(efbhVar);
        return new AssetFileDescriptor(b, 0L, b.getStatSize());
    }
}
