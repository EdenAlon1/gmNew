package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ray implements rap {
    private final Resources a;

    public ray(Resources resources) {
        this.a = resources;
    }

    @Override // defpackage.rap
    public final rao b(rax raxVar) {
        return new rbb(this.a, raxVar.a(Uri.class, AssetFileDescriptor.class));
    }
}
