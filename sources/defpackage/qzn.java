package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qzn implements rap, qzp {
    private final Context a;

    public qzn(Context context) {
        this.a = context;
    }

    @Override // defpackage.qzp
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.rap
    public final rao b(rax raxVar) {
        return new qzq(this.a, this);
    }

    @Override // defpackage.qzp
    public final /* synthetic */ Object c(Resources.Theme theme, Resources resources, int i) {
        return resources.openRawResource(i);
    }

    @Override // defpackage.qzp
    public final /* synthetic */ void d(Object obj) {
        ((InputStream) obj).close();
    }
}
