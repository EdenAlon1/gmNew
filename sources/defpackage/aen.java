package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aen extends adu {
    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        Uri uri = (Uri) obj;
        uri.getClass();
        Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
        putExtra.getClass();
        return putExtra;
    }

    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        return Boolean.valueOf(i == -1);
    }

    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ adt c(Context context, Object obj) {
        ((Uri) obj).getClass();
        return null;
    }
}
