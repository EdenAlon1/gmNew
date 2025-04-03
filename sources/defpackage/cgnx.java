package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgnx implements dubz {
    private static Boolean c() {
        return Boolean.valueOf(ctjd.d());
    }

    @Override // defpackage.dubz
    public final boolean a(ezib ezibVar) {
        if (ezibVar.equals(ezib.GDD_BUGLE_EMOJIFY)) {
            return c().booleanValue();
        }
        return false;
    }

    @Override // defpackage.dubz
    public final /* bridge */ /* synthetic */ ListenableFuture b(ezib ezibVar) {
        return ezibVar == ezib.GDD_BUGLE_EMOJIFY ? elfo.e(c()) : elfo.e(false);
    }
}
