package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qzl implements rap, qzp {
    private final Context a;

    public qzl(Context context) {
        this.a = context;
    }

    @Override // defpackage.qzp
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.rap
    public final rao b(rax raxVar) {
        return new qzq(this.a, this);
    }

    @Override // defpackage.qzp
    public final /* synthetic */ Object c(Resources.Theme theme, Resources resources, int i) {
        return resources.openRawResourceFd(i);
    }

    @Override // defpackage.qzp
    public final /* synthetic */ void d(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }
}
