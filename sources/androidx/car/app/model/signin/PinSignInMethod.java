package androidx.car.app.model.signin;

import androidx.car.app.model.CarText;
import defpackage.cfs;
import defpackage.cju;
import j$.util.Objects;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class PinSignInMethod implements cju {
    private static final int MAX_PIN_LENGTH = 12;
    private final CarText mPinCode;

    private PinSignInMethod() {
        this.mPinCode = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PinSignInMethod) {
            return Objects.equals(this.mPinCode, ((PinSignInMethod) obj).mPinCode);
        }
        return false;
    }

    public CarText getPinCode() {
        CarText carText = this.mPinCode;
        carText.getClass();
        return carText;
    }

    public int hashCode() {
        return Objects.hash(this.mPinCode);
    }

    public PinSignInMethod(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length();
        if (length == 0) {
            throw new IllegalArgumentException("PIN must not be empty");
        }
        if (length > 12) {
            throw new IllegalArgumentException("PIN must not be longer than 12 characters");
        }
        this.mPinCode = CarText.create(charSequence);
    }
}
