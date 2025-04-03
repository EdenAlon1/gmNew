package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqkt {
    public static final Size a(Size size, int i) {
        return i % 180 != 0 ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static final boolean b(Size size) {
        return size.getWidth() > 0 && size.getHeight() > 0;
    }
}
