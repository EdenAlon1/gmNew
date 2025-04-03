package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rec implements qtw {
    private final rdl a;

    public rec(rdl rdlVar) {
        this.a = rdlVar;
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ qwv a(Object obj, int i, int i2, qtu qtuVar) {
        rdl rdlVar = this.a;
        return rdlVar.a(new rdy((ParcelFileDescriptor) obj, rdlVar.g, rdlVar.f), i, i2, qtuVar, rdl.e);
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ boolean b(Object obj, qtu qtuVar) {
        return (!("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) || "HONOR".equalsIgnoreCase(Build.MANUFACTURER)) || ((ParcelFileDescriptor) obj).getStatSize() <= 536870912) && ParcelFileDescriptorRewinder.d();
    }
}
