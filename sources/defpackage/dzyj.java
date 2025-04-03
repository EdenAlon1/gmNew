package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzyj {
    public static void a(TextView textView, int i) {
        Drawable textSelectHandleLeft;
        Drawable textSelectHandleRight;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                textSelectHandleLeft = textView.getTextSelectHandleLeft();
                textSelectHandleLeft.mutate().setColorFilter(i, PorterDuff.Mode.SRC_IN);
                textView.setTextSelectHandleLeft(textSelectHandleLeft);
                textSelectHandleRight = textView.getTextSelectHandleRight();
                textSelectHandleRight.mutate().setColorFilter(i, PorterDuff.Mode.SRC_IN);
                textView.setTextSelectHandleRight(textSelectHandleRight);
                return;
            }
            Field declaredField = TextView.class.getDeclaredField("mEditor");
            if (!declaredField.isAccessible()) {
                declaredField.setAccessible(true);
            }
            Object obj = declaredField.get(textView);
            Class<?> cls = obj.getClass();
            String[] strArr = {"mSelectHandleLeft", "mSelectHandleRight"};
            String[] strArr2 = {"mTextSelectHandleLeftRes", "mTextSelectHandleRightRes"};
            for (int i2 = 0; i2 < 2; i2++) {
                Field declaredField2 = cls.getDeclaredField(strArr[i2]);
                if (!declaredField2.isAccessible()) {
                    declaredField2.setAccessible(true);
                }
                Drawable drawable = (Drawable) declaredField2.get(obj);
                if (drawable == null) {
                    Field declaredField3 = TextView.class.getDeclaredField(strArr2[i2]);
                    if (!declaredField3.isAccessible()) {
                        declaredField3.setAccessible(true);
                    }
                    drawable = textView.getResources().getDrawable(declaredField3.getInt(textView));
                }
                if (drawable != null) {
                    Drawable mutate = drawable.mutate();
                    mutate.setColorFilter(i, PorterDuff.Mode.SRC_IN);
                    declaredField2.set(obj, mutate);
                }
            }
        } catch (IllegalAccessException e) {
            dyhr.c("SELECT_HANDLE_UTILS", "Illegal access exception ".concat(e.toString()));
        } catch (NoSuchFieldException e2) {
            dyhr.c("SELECT_HANDLE_UTILS", "No such field exception ".concat(e2.toString()));
        }
    }
}
