package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbax {
    public static int a(int i) {
        return i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Alert.DURATION_SHOW_INDEFINITELY;
    }

    public static List b(int i) {
        return i == 0 ? Collections.EMPTY_LIST : new ArrayList(1);
    }
}
