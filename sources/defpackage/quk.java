package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class quk extends qua {
    public quk(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.qud
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.qua
    protected final /* synthetic */ Object c(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }

    @Override // defpackage.qua
    protected final /* synthetic */ void f(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }
}
