package defpackage;

import android.widget.TableLayout;
import android.widget.TableRow;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egmo {
    public final TableLayout a;
    public final int b;

    public egmo(TableLayout tableLayout, int i) {
        this.a = tableLayout;
        this.b = i;
    }

    public static TableRow.LayoutParams a() {
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams();
        layoutParams.width = 0;
        layoutParams.weight = 1.0f;
        return layoutParams;
    }
}
