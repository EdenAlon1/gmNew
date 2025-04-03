package defpackage;

import androidx.car.app.model.CarIconSpan;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ClickableSpan;
import androidx.car.app.model.DistanceSpan;
import androidx.car.app.model.DurationSpan;
import androidx.car.app.model.ForegroundCarColorSpan;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjn {
    public static final cjn a = new cjn(Collections.EMPTY_LIST);
    public static final cjn b = new cjn(Arrays.asList(CarIconSpan.class, ClickableSpan.class, DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));
    public static final cjn c;
    public static final cjn d;
    public static final cjn e;
    private final HashSet f;

    static {
        new cjn(Arrays.asList(ClickableSpan.class, DistanceSpan.class, DurationSpan.class));
        c = new cjn(Arrays.asList(ForegroundCarColorSpan.class));
        d = new cjn(Arrays.asList(DistanceSpan.class, DurationSpan.class));
        e = new cjn(Arrays.asList(DistanceSpan.class, DurationSpan.class, CarIconSpan.class));
        new cjn(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));
        new cjn(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class, CarIconSpan.class));
    }

    private cjn(List list) {
        this.f = new HashSet(list);
    }

    private final void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class<?> cls = ((CarText.SpanWrapper) it.next()).getCarSpan().getClass();
            if (!this.f.contains(cls)) {
                throw new IllegalArgumentException("CarSpan type is not allowed: ".concat(String.valueOf(cls.getSimpleName())));
            }
        }
    }

    public final void a(CarText carText) {
        b(carText.getSpans());
        Iterator<List<CarText.SpanWrapper>> it = carText.getSpansForVariants().iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }
}
