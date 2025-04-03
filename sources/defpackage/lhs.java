package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lhs extends lht {
    public final TextView a;
    public boolean b = true;
    private final lhq c;

    public lhs(TextView textView) {
        this.a = textView;
        this.c = new lhq(textView);
    }

    public final TransformationMethod a(TransformationMethod transformationMethod) {
        return this.b ? ((transformationMethod instanceof lhy) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new lhy(transformationMethod) : transformationMethod instanceof lhy ? ((lhy) transformationMethod).a : transformationMethod;
    }

    public final void b() {
        this.a.setTransformationMethod(a(this.a.getTransformationMethod()));
    }

    public final InputFilter[] c(InputFilter[] inputFilterArr) {
        int length;
        if (this.b) {
            int length2 = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter != this.c) {
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length2);
            inputFilterArr2[length2] = this.c;
            return inputFilterArr2;
        }
        SparseArray sparseArray = new SparseArray(1);
        int i = 0;
        while (true) {
            length = inputFilterArr.length;
            if (i >= length) {
                break;
            }
            InputFilter inputFilter2 = inputFilterArr[i];
            if (inputFilter2 instanceof lhq) {
                sparseArray.put(i, inputFilter2);
            }
            i++;
        }
        if (sparseArray.size() != 0) {
            InputFilter[] inputFilterArr3 = new InputFilter[length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr3[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr3;
        }
        return inputFilterArr;
    }
}
