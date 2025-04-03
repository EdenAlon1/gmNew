package defpackage;

import android.animation.TypeEvaluator;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egyx implements TypeEvaluator {
    public static final Integer a(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        int i = intValue >> 24;
        int i2 = intValue >> 16;
        int i3 = intValue >> 8;
        int i4 = intValue & PrivateKeyType.INVALID;
        int intValue2 = num2.intValue();
        int i5 = intValue2 >> 24;
        int i6 = intValue2 >> 16;
        int i7 = intValue2 >> 8;
        int i8 = intValue2 & PrivateKeyType.INVALID;
        float pow = (float) Math.pow((i2 & PrivateKeyType.INVALID) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow((i3 & PrivateKeyType.INVALID) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow(i4 / 255.0f, 2.2d);
        float pow4 = (float) Math.pow((i6 & PrivateKeyType.INVALID) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow((i7 & PrivateKeyType.INVALID) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow(i8 / 255.0f, 2.2d);
        float pow7 = (float) Math.pow(pow + ((pow4 - pow) * f), 0.45454545454545453d);
        float pow8 = (float) Math.pow(pow2 + ((pow5 - pow2) * f), 0.45454545454545453d);
        float pow9 = (float) Math.pow(pow3 + ((pow6 - pow3) * f), 0.45454545454545453d);
        float f2 = (i & PrivateKeyType.INVALID) / 255.0f;
        return Integer.valueOf((Math.round((f2 + (f * (((i5 & PrivateKeyType.INVALID) / 255.0f) - f2))) * 255.0f) << 24) | (Math.round(pow7 * 255.0f) << 16) | (Math.round(pow8 * 255.0f) << 8) | Math.round(pow9 * 255.0f));
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return a(f, (Integer) obj, (Integer) obj2);
    }
}
