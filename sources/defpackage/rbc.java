package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rbc implements rap {
    private final Context a;

    public rbc(Context context) {
        this.a = context;
    }

    @Override // defpackage.rap
    public final rao b(rax raxVar) {
        return new rbe(this.a, raxVar.a(Integer.class, AssetFileDescriptor.class));
    }
}
