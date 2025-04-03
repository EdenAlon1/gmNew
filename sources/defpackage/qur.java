package defpackage;

import android.content.res.AssetManager;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qur extends qua {
    public qur(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.qud
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.qua
    protected final /* synthetic */ Object c(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    @Override // defpackage.qua
    protected final /* synthetic */ void f(Object obj) {
        ((InputStream) obj).close();
    }
}
