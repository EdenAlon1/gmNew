package defpackage;

import android.content.res.AssetManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qyu implements rap, qys {
    private final AssetManager a;

    public qyu(AssetManager assetManager) {
        this.a = assetManager;
    }

    @Override // defpackage.qys
    public final qud a(AssetManager assetManager, String str) {
        return new qur(assetManager, str);
    }

    @Override // defpackage.rap
    public final rao b(rax raxVar) {
        return new qyv(this.a, this);
    }
}
