package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbau extends cbbm {
    private final Context b;

    public cbau(Context context) {
        this.b = context;
    }

    @Override // defpackage.cbbm
    protected final cbbl b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? new cbbl(5, "VCardCache") : new cbca("EmojiImageCache", this.b) : new cbca("AvatarImageCache", this.b) : new cbca(10240, "DefaultImageCache", this.b);
    }
}
