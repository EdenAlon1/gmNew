package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ala {
    private static final Size b = new Size(1920, 1080);
    private static final Size c = new Size(320, 240);
    private static final Size d = new Size(640, 480);
    private static final Object e = new Object();
    private static volatile ala f;
    private final DisplayManager g;
    public volatile Size a = null;
    private final arj h = new arj();
    private final ard i = new ard();

    private ala(Context context) {
        this.g = (DisplayManager) context.getSystemService("display");
    }

    public static ala d(Context context) {
        if (f == null) {
            synchronized (e) {
                if (f == null) {
                    f = new ala(context);
                }
            }
        }
        return f;
    }

    private static final Display e(Display[] displayArr, boolean z) {
        int i = -1;
        Display display = null;
        for (Display display2 : displayArr) {
            if (!z || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                if (point.x * point.y > i) {
                    i = point.x * point.y;
                    display = display2;
                }
            }
        }
        return display;
    }

    public final Size a() {
        Size b2;
        Point point = new Point();
        c(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (blz.a(size) < blz.a(c)) {
            size = this.i.a != null ? (Size) SmallDisplaySizeQuirk.a.get(Build.MODEL.toUpperCase(Locale.US)) : null;
            if (size == null) {
                size = d;
            }
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        int width = size.getWidth() * size.getHeight();
        Size size2 = b;
        if (width > size2.getWidth() * size2.getHeight()) {
            size = size2;
        }
        return (this.h.a == null || (b2 = ExtraCroppingQuirk.b(1)) == null || b2.getWidth() * b2.getHeight() <= size.getWidth() * size.getHeight()) ? size : b2;
    }

    final Size b() {
        if (this.a != null) {
            return this.a;
        }
        this.a = a();
        return this.a;
    }

    public final Display c(boolean z) {
        Display[] displays = this.g.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display e2 = e(displays, z);
        if (e2 == null && z) {
            e2 = e(displays, false);
        }
        if (e2 != null) {
            return e2;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }
}
