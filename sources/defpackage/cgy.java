package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgy {
    public boolean a;
    public CarText b;
    public CarIcon c;
    public cia d;
    public CarColor e;
    public int f;
    public int g;

    public cgy() {
        this.a = true;
        this.e = CarColor.DEFAULT;
        this.f = 1;
        this.g = 0;
    }

    public cgy(Action action) {
        this.a = true;
        CarColor carColor = CarColor.DEFAULT;
        this.e = carColor;
        this.f = 1;
        this.g = 0;
        action.getClass();
        this.f = action.getType();
        this.c = action.getIcon();
        this.b = action.getTitle();
        this.d = action.getOnClickDelegate();
        CarColor backgroundColor = action.getBackgroundColor();
        this.e = backgroundColor != null ? backgroundColor : carColor;
        this.g = action.getFlags();
        this.a = action.isEnabled();
    }
}
