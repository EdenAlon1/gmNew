package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.label.ui.recategorize.ChangeCategoryCallbackInput;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class ahjq extends ChangeCategoryCallbackInput {
    public final String a;
    public final SuperSortLabel b;

    public ahjq(String str, SuperSortLabel superSortLabel) {
        if (str == null) {
            throw new NullPointerException("Null messageId");
        }
        this.a = str;
        if (superSortLabel == null) {
            throw new NullPointerException("Null label");
        }
        this.b = superSortLabel;
    }

    @Override // com.google.android.apps.messaging.label.ui.recategorize.ChangeCategoryCallbackInput
    public final SuperSortLabel a() {
        return this.b;
    }

    @Override // com.google.android.apps.messaging.label.ui.recategorize.ChangeCategoryCallbackInput
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ChangeCategoryCallbackInput) {
            ChangeCategoryCallbackInput changeCategoryCallbackInput = (ChangeCategoryCallbackInput) obj;
            if (this.a.equals(changeCategoryCallbackInput.b()) && this.b.equals(changeCategoryCallbackInput.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ChangeCategoryCallbackInput{messageId=" + this.a + ", label=" + this.b.toString() + "}";
    }
}
