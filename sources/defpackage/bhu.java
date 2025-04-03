package defpackage;

import android.util.Size;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhu implements Comparator {
    private boolean a;

    public bhu(boolean z) {
        this.a = z;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.a ? -signum : signum;
    }

    public bhu() {
        this(false);
    }
}
