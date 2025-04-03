package defpackage;

import android.view.DragEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxd {
    public static final long a(hww hwwVar) {
        DragEvent dragEvent = hwwVar.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }
}
